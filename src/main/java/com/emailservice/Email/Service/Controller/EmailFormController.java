package com.emailservice.Email.Service.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmailFormController {

    @GetMapping("/send-email")  // This will render the Thymeleaf form
    public String showEmailForm() {
        return "email-form";  // Maps to src/main/resources/templates/email-form.html
    }
}