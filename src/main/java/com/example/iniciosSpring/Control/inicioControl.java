package com.example.iniciosSpring.Control;

import com.example.iniciosSpring.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class inicioControl {
    @GetMapping("/inicio")
    public String index(Model model){

        model.addAttribute("titulo","Bienvenidos a las clases de spring ");

        return "inicio";
    }
    @GetMapping("/inicio1")
    public ModelAndView index1(ModelAndView mv){

        mv.addObject("titulo","Bienvenidos a las clases de spring desde ModelAndView ");
        mv.setViewName("inicio");
        return mv;
    }

    @GetMapping("/person")
    public String persona(Model model){

        Usuario usu = new Usuario();

        usu.setCodigo("ABCD1234");
        usu.setNombre("Esteban");
        usu.setApellido("Ruiz");

        model.addAttribute("titulo","DATOS DE USUARIO");
        model.addAttribute("usuario",usu);

        return "persona";
    }
    @GetMapping("/person1")
    public String persona1(Model model){

        List<Usuario> lstusu = new ArrayList<>();

        lstusu.add(new Usuario("ANDRES","GFGD947","NOVOA"));
        lstusu.add(new Usuario("ANDREA","HDG321","RODRIGUEZ"));
        lstusu.add(new Usuario("DANIELA","HFJ789","MARTINEZ"));
        lstusu.add(new Usuario("CAMILA","HJD434","SANCHEZ"));

        model.addAttribute("titulo","DATOS DE USUARIO");
        model.addAttribute("list",lstusu);

        return "persona";
    }

}
