package com.filters.demofilters.filters;

import javax.servlet.*;
import java.io.IOException;

public class MySecurityFilter extends GenericFilter {

    @Override
    public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain filterChain
    ) throws IOException, ServletException {
        System.out.println("Security filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
