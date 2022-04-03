package com.codingdojo.kenny.controladores;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorHopper {
	@RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper cambios";
        String itemName = "tiras led";
        double price = 15.75;
        String description = "Led potencia 700W blanca";
        String vendor = "Tienda Electrotodo";
    
    	// ¡Tu código aquí! Agrega valores al modelo de vista que se representará
        
        model.addAttribute("name", name);
        model.addAttribute("itemName",itemName);
        model.addAttribute("price",price);
        model.addAttribute("description", description);
        model.addAttribute("vendor",vendor);
    
        return "index.jsp";
    }

}
