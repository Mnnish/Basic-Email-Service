package com.emailservice.Email.Service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emailservice.Email.Service.Service.EmailService;

import jakarta.mail.MessagingException;

@RestController  // Make sure this import is correct
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;


    @PostMapping("/send-html")
    public String sendHtmlEmail(@RequestParam String to,
                                @RequestParam String subject,
                                @RequestParam String name,
                                @RequestParam String email,
                                @RequestParam String message) {
        try {
            emailService.sendHtmlEmail(to, subject, name, email, message);
            return "HTML Email sent successfully!";
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Failed to send email.";
        }
    }
}
