package com.example.demo.modelo;


import java.util.*;

public class Colecciones {
    private static final Map<String,String> paisesA = new LinkedHashMap<>();
    static{
        paisesA.put("G","Grecia");
        paisesA.put("I","Italia");
        paisesA.put("P","Portugal");
        paisesA.put("E", "España");
    }
    private static final Map<String,String> generos = new LinkedHashMap<>();
    static{
        generos.put("F","Femenino");
        generos.put("M","Masculino");
        generos.put("O","Otro");
    }
    private static final Map<String,String> aficiones= new LinkedHashMap<>();
    static{
        aficiones.put("C","Cine");
        aficiones.put("V","Viajar");
        aficiones.put("L","Leer");
        aficiones.put("P","Patinar");
    }
    private static final Map<String,String> musicas = new LinkedHashMap<>();
    static {
        musicas.put("E","Electronica");
        musicas.put("F","Funky");
        musicas.put("P","Pop");
        musicas.put("R","Rock");
        musicas.put("T","Trap");
    }

    public static Map<String, String> devolverPais(){
        return paisesA;

    }
    public static Map<String, String> devolverGenero(){
        return generos;

    }
    public static Map<String, String> devolverAficiones(){
        return aficiones;

    }
    public static Map<String, String> devolverMusicas(){
        return musicas;

    }

}
