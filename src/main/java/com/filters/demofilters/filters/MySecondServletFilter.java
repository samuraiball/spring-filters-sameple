package com.filters.demofilters.filters;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import java.io.IOException;

@Order(2)
public class MySecondServletFilter implements Filter {
    @Override
    public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain filterChain
    ) throws IOException, ServletException {
        System.out.println("Servlet filter 2");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
