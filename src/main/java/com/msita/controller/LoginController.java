package com.msita.controller;

import com.msita.form.LoginForm;
import com.msita.javabean.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(final Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("loginForm") final LoginForm loginForm,
                        final Model model) {
        final String username = loginForm.getUsername();
        final String password = loginForm.getPassword();
        if (username != null && "123456".equals(password)) {
            model.addAttribute("username", username);
            return "/welcome";
        }
        model.addAttribute("errorMessage", "Id or password is invalid");
        return "/login";
    }

    @RequestMapping(value = "/login2", method = RequestMethod.GET)
    public String login2() {
        return "login2";
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    public String login(final Model model, final HttpServletRequest request) {
        final String username = request.getParameter("username");
        final String password = request.getParameter("password");
        if (username != null && "123456".equals(password)) {
            model.addAttribute("username", username);
            return "/welcome";
        }
        model.addAttribute("errorMessage", "Id or password is invalid");
        return "/login2";
    }

    @RequestMapping(value = "/login3", method = RequestMethod.POST)
    public String login(final Model model,
                        @RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password) {
        if (username != null && "123456".equals(password)) {
            model.addAttribute("username", username);
            return "/welcome";
        }
        model.addAttribute("errorMessage2", "Id or password is invalid");
        return "/login2";
    }

    @RequestMapping(value = "/login4", method = RequestMethod.POST)
    public String login(final Model model, final Login login) {
        if (login.getUsername() != null && "123456".equals(login.getPassword())) {
            model.addAttribute("username", login.getUsername());
            return "/welcome";
        }
        model.addAttribute("errorMessage3", "Id or password is invalid");
        return "/login2";
    }
}
