/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodedados;

import java.util.Random;

/**
 *
 * @author estudiantes
 */
public class Dado {

    int nùmero;
    void lanzar(){
    Random miGenerador= new Random();
    nùmero=miGenerador.nextInt(5)+1;
}
}
