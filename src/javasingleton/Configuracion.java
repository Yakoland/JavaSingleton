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
public class Configuracion {
    private static Configuracion conf;
    private int usuarios;

    // el contructor lo volvemos privado para que no se puedan crear
    // objetos o no tengan acceso a crear una instancia
    private Configuracion(){

    }
    // creamos un metodo que sino esta creado la instancia cree el objeto de la clase
    // si ya esta creada devuelve esa instancia
    public static Configuracion getInstancia(){
        if(conf == null){
            conf = new Configuracion();
        }
        return conf;
    }
    public int getUsuarios(){
            return usuarios;
    }
    public void setUsuarios(int usu){
        usuarios = usu;
    }
}
