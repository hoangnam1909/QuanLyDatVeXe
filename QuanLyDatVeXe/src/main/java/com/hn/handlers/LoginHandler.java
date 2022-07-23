/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.handlers;

import com.hn.pojo.User;
import com.hn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author duonghuuthanh
 */
@Component
public class LoginHandler implements AuthenticationSuccessHandler {
    @Autowired
    private UserService userDetailsService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response, Authentication a) throws IOException, ServletException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = this.userDetailsService.getByUsername(authentication.getName());
        request.getSession().setAttribute("currentUser", user);

        String redirectUrl = request.getContextPath();
        switch (user.getUserRole()) {
            case User.ADMIN:
                redirectUrl = "admin";
                break;
            case User.STAFF:
                redirectUrl = "employer";
                break;
            case User.DRIVER:
                redirectUrl = "candidate";
                break;
        }

        response.sendRedirect(redirectUrl);
    }

}
