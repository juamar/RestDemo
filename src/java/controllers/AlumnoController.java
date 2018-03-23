/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import model.pojos.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author JuanIgnacio
 */
@Controller
@EnableWebMvc
public class AlumnoController
{    
    @RequestMapping(value = "/api/alumnos", method = RequestMethod.GET)
    public @ResponseBody List<Alumno> alumnos() throws Exception
    {
        ArrayList<Alumno> l = new ArrayList<>();
        l.add(new Alumno(1,"Juan","Avendaño"));
        l.add(new Alumno(1,"pp","Montoya"));
        return l;
    }
  
}
