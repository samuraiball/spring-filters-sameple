package com.filters.demofilters.filters;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(1)
public class MyFirstServletFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain filterChain
    ) throws IOException, ServletException {
        System.out.println("Servlet Filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
