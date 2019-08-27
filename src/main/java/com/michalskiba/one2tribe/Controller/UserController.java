package com.michalskiba.one2tribe.Controller;

import com.michalskiba.one2tribe.Model.User;
import com.michalskiba.one2tribe.Repository.UserRepository;
import com.michalskiba.one2tribe.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import java.util.List;

@Controller
@ResponseBody
public class UserController implements ErrorController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GET
    @RequestMapping(value = "/list")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @POST
    @Produces(value = "text/html")
    @RequestMapping(value = "/add/{name}")
    public User saveBeer(@PathVariable String name) throws Exception{
        return userService.saveBeer(name);
    }

    @Override
    @RequestMapping(value = "/error")
    @ResponseBody
    public String getErrorPath() {
        return "Podaj wartość name";
    }
}
