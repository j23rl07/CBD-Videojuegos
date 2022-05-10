/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CBD.videojuego.videojuego;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jaime
 */
@Controller
@RequestMapping("/videojuegos")
public class VideojuegoController {
    
    private VideojuegoService videojuegoService;
    
    @GetMapping()
    public String FindGenerosPlataforma(Model model){
        Iterable<GxP> gxp = videojuegoService.GenerosPlataforma();
        model.addAttribute("generosPlataforma", gxp);
        
        return "videojuegos";
    }
    
}
