/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasingleton;

/**
 *
 * @author jcortes
 */
public class JavaSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuracion configura_1 = Configuracion.getInstancia();
        Configuracion configura_2 = Configuracion.getInstancia();

        configura_1.setUsuarios(5);
        System.out.println(configura_2.getUsuarios());
        System.out.println(configura_1.getUsuarios());
    }
    
}
