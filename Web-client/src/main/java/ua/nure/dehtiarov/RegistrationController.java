package ua.nure.dehtiarov;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.nure.dehtiarov.rest.myapi.RestServer;
import ua.nure.dehtiarov.rest.myapi.controller.UserAccountController;
import ua.nure.dehtiarov.rest.myapi.entity.User;
import ua.nure.dehtiarov.rest.myapi.impl.DefaultRestServer;

/**
 * Created by dehtiarov on 12/20/2015.
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {

    private final RestServer restServer = new DefaultRestServer();

    @RequestMapping(method = RequestMethod.POST)
    public String addUser(ModelMap model, @RequestParam(value = "email") String email,
                          @RequestParam(value = "name") String name,
                          @RequestParam(value = "password") String password) {
        UserAccountController userAccountController = restServer.getUserController();
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setName(name);
        model.addAttribute("user", user);
        if (userAccountController.registerNewUser(user)) {
            return "redirect:/login/";
        }
        model.addAttribute("error", "Sorry, user with this email/pass is already exist");
        return "register";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String registerPage(ModelMap model) {
        model.addAttribute("user", new User());
        return "register";
    }

}
