package com.eservicos.demo1.eservicos.web.controllers;
import com.eservicos.demo1.eservicos.core.enums.Icone;
import com.eservicos.demo1.eservicos.core.models.Servico;
import com.eservicos.demo1.eservicos.core.repository.SevicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin/servicos")

public class sercvico {

    @Autowired
    private  SevicoRepository serviceRepository;

    @GetMapping
    public ModelAndView buscarTodos() {
        var modelAndView = new ModelAndView("admin/servico/lista");
        modelAndView.addObject("servicos", serviceRepository.findAll());
        return modelAndView;
    }
    @GetMapping("/cadastrar")
    public ModelAndView cadastrar(){
        var modelAndView = new ModelAndView("admin/servico/form");
        modelAndView.addObject("servico",new Servico());
        return modelAndView;
    }

    @PostMapping("/cadastrar")
    public String cadastrar(Servico servico){
        serviceRepository.save(servico);
        return "redirect:/admin/servicos";
    }

    @GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id){
        var modelAndView = new ModelAndView("admin/servico/form");
        modelAndView.addObject("servico",serviceRepository.getById(id));
        return modelAndView;
    }

    @PostMapping("/{id}/editar")
    public String editar(@PathVariable Long id, Servico servico) {
        serviceRepository.save(servico);
        return "redirect:/admin/servicos";
    }

    @GetMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id){
        serviceRepository.deleteById(id);
        return "redirect:/admin/servicos";
    }

    @ModelAttribute("icones")
    public Icone[] getIcones() {
        return Icone.values();
    }
    

}
