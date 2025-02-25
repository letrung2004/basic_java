package org.example;

import org.hibernate.Session;
import org.hibernate.query.Query;
import pojo.Category;
import pojo.Product;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static List<Product> filterByName(Session session, String... a) {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Product> query = builder.createQuery(Product.class);
        Root root = query.from(Product.class);
        query = query.select(root);

        List<Predicate> predicates = new ArrayList<>();
        for (String s : a) {
            predicates.add(builder.like(root.get("name"), "%" + s + "%"));
        }

        query = query.where(builder.or(predicates.toArray(new Predicate[0])));
        Query q = session.createQuery(query);

        return q.getResultList();
    }

    public static List<Product> filterByPrice(Session session, BigDecimal minPrice, BigDecimal maxPrice) {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Product> query = builder.createQuery(Product.class);
        Root root = query.from(Product.class);
        query = query.select(root);

//        Predicate pMin = builder.greaterThanOrEqualTo(root.get("price").as(BigDecimal.class), minPrice);
//        Predicate pMax = builder.lessThanOrEqualTo(root.get("price").as(BigDecimal.class), maxPrice);

        Predicate pEqual = builder.between(root.get("price").as(BigDecimal.class), minPrice, maxPrice);

        query = query.where(pEqual);
        Query q = session.createQuery(query);
        return q.getResultList();
    }

    public static List<Product> filterByCategory(Session session, Category category) {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Product> query = builder.createQuery(Product.class);
        Root root = query.from(Product.class);
        query = query.select(root);

        Predicate p = builder.equal(root.get("category"), category);
        query = query.where(p);
        Query q = session.createQuery(query);

        return q.getResultList();
    }

    public static void main(String[] args) {
        Session session = HibernateUtils.getSessionFactory().openSession();
//        Tìm kiếm theo teen
//        List<Product> p = filterByName(session,"iPhone");
//        p.forEach(pro->System.out.println(pro.getName()));

//        Tim kiem theo gia
//        List<Product> p1 = filterByPrice(session,new BigDecimal(20000000), new BigDecimal(30000000));
//        p1.forEach(pro->System.out.println(pro.getName()));

        //        Tim kiem theo danh muc
//        Category category1 = session.get(Category.class, 1);
//        List<Product> p2 = filterByCategory(session,category1);
//        p2.forEach(pro->System.out.println(pro.getName()));

//        thong ke
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
//
//        Root<Product> pRoot = query.from(Product.class);
//        Root<Category> cRoot = query.from(Category.class);
//
//        query.where((builder.equal(pRoot.get("category"), cRoot.get("id"))));
//
//        query = query.multiselect(cRoot.get("name").as(String.class),
//                builder.count(pRoot.get("id")),
//                builder.max(pRoot.get("price").as(BigDecimal.class))
//        );
//        query = query.groupBy(cRoot.get("name").as(String.class));
//
//        Query q = session.createQuery(query);
//        List<Object[]> list = q.getResultList();
//        list.forEach(l -> System.out.printf("%s- count: %d - max: %.2f \n", l[0], l[1], l[2]));

//        thống kê tổng sản phẩm
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> query = b.createQuery(Object[].class);
        Root<Product> r = query.from(Product.class);
        query.multiselect(
                b.count(r.get("id")), 
                b.max(r.get("price").as(BigDecimal.class)),
                b.avg(r.get("price").as(BigDecimal.class))
        );

        Query<Object[]> q = session.createQuery(query);
        Object[] results = q.getSingleResult();


        System.out.println("Số lượng: " + results[0]);
        System.out.println("Giá cao nhất: " + results[1]);
        System.out.println("Trung bình: " + results[2]);


        session.close();
    }
}