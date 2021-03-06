package com.deividsandoval.forum.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


@Service
@AllArgsConstructor
public class MailContentBuilder {
    private final TemplateEngine templateEngine;

    String build(String message) {
        Context ctx = new Context();

        ctx.setVariable("message", message);

        return templateEngine.process("emailTemplate", ctx);
    }
}
