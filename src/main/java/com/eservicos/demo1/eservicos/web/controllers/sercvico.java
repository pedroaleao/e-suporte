package com.eservicos.demo1.eservicos.web.controllers;
import com.eservicos.demo1.eservicos.core.models.Servico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin/servicos")

public class sercvico {

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar(){
        var modelAndView = new ModelAndView("admin/servico/form");
        modelAndView.addObject("servico",new Servico());
        return modelAndView;
    }


}
