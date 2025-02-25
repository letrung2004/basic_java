package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import pojo.*;

import java.util.Properties;

public class HibernateUtils {
    private final static SessionFactory FACTORY;

    static {
        Configuration cfg = new Configuration();

        Properties props = new Properties();
        cfg.setProperties(props);
        props.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
        props.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
        props.put(Environment.URL,"jdbc:mysql://localhost:3306/saledb");
        props.put(Environment.USER,"root");
        props.put(Environment.PASS,"1234");
        props.put(Environment.SHOW_SQL,"true");

        cfg.addAnnotatedClass(Category.class);
        cfg.addAnnotatedClass(Product.class);
        cfg.addAnnotatedClass(Tag.class);
        cfg.addAnnotatedClass(User.class);
        cfg.addAnnotatedClass(SaleOrder.class);
        cfg.addAnnotatedClass(OrderDetail.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties()).build();
        FACTORY = cfg.buildSessionFactory(serviceRegistry);

    }

    public static SessionFactory getSessionFactory() {
        return FACTORY;
    }
}
