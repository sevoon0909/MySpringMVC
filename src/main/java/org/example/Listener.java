package org.example;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        WebApplicationContext context = ContextLoaderListener.getCurrentWebApplicationContext();
        MM mm = (MM)context.getBean("mm");
        System.out.println("@@"+mm);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
