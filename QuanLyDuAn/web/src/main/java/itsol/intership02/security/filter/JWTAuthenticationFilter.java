package itsol.intership02.security.filter;

import itsol.intership02.security.manager.authentication.TokenAuthenticationService;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class JWTAuthenticationFilter extends GenericFilterBean {

    private ApplicationContext applicationContext;


    public JWTAuthenticationFilter(ApplicationContext applicationContext){
        this.applicationContext  = applicationContext;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        Authentication authentication = new TokenAuthenticationService().getAuthentication((HttpServletRequest) servletRequest,applicationContext);

        SecurityContextHolder.getContext().setAuthentication(authentication);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
