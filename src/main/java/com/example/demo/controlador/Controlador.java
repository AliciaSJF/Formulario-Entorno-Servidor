package com.example.demo.controlador;


import com.example.demo.modelo.Colecciones;
import com.example.demo.modelo.Formulario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Map;

@Controller
@RequestMapping("saludos")
public class Controlador {


    @GetMapping("devuelve-formulario-objeto")
    public String devuelveFormularioObjeto(Model modelo,
                                           Formulario formulario) {
        //Recuperamos colecciones
        Map<String, String> paises = Colecciones.devolverPais();
        Map<String, String> generos = Colecciones.devolverGenero();
        Map<String, String> aficiones = Colecciones.devolverAficiones();
        Map<String, String> musicas = Colecciones.devolverMusicas();

        //Fijamos valores por defecto para los campos del formulario
        //Formulario formulario = new Formulario();
        //Podemos pasarlo como parametro o instanciarlo
        formulario.setNombre("Alicia");
        formulario.setPais("E");
        //List<String> colores = new ArrayList<>(){{add("rojo");add("naranja"); add("verde");}};
        formulario.setMusicas(Arrays.asList("E", "P"));
        formulario.setDescripcion("Hola a todos");
        formulario.setAficiones(Arrays.asList("C", "V"));
        formulario.setGenero("O");

        //Pasamos datos al formulario a través del modelo
        modelo.addAttribute("listapaises", paises);
        modelo.addAttribute("listageneros", generos);
        modelo.addAttribute("listaaficiones", aficiones);
        modelo.addAttribute("listamusicas", musicas);
        modelo.addAttribute("formulario", formulario);

        return ("form");
    }

    @PostMapping("recibe-parametros-objeto")
    public String recibeParametrosObjeto(Model modelo, Formulario formulario,
                                         BindingResult resultadoVinculacionParametros) {
        //Tratamiento de errores
        String msgForm;
        if (resultadoVinculacionParametros.hasErrors()) {
            msgForm = "el formulario tiene errores";
        } else {
            msgForm = "el formulario no tiene errores";
        }
        System.out.println(resultadoVinculacionParametros.toString());
        //Recuperamos colecciones
        Map<String, String> paises = Colecciones.devolverPais();
        Map<String, String> generos = Colecciones.devolverGenero();
        Map<String, String> aficiones = Colecciones.devolverAficiones();
        Map<String, String> musicas = Colecciones.devolverMusicas();

        /*modelo.addAttribute("DatosForm", Colecciones.devolverGenero());
        modelo.addAttribute("DatosForm",Colecciones.devolverPais());
        modelo.addAttribute("DatosForm",Colecciones.devolverMusicas());
        modelo.addAttribute("DatosForm",Colecciones.devolverAficiones());*/

        modelo.addAttribute("mensaje", msgForm);
        modelo.addAttribute("listapaises", paises);
        modelo.addAttribute("listageneros", generos);
        modelo.addAttribute("listaaficiones", aficiones);
        modelo.addAttribute("listamusicas", musicas);
        modelo.addAttribute("formulario", formulario);

        return "form";
    }

}
