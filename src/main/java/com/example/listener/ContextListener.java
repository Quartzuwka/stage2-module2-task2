package com.example.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;

@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LocalDateTime initTime = LocalDateTime.now();

        sce.getServletContext().setAttribute("servletTimeInit", initTime);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
