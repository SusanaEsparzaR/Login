/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Vector;

/**
 *
 * @author susan
 */
public class Usuarios {
	private String nick;
	private String contrasenia;
	private String rango;
        private String nombre;
        private String edad;
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	
	public static Vector mostrar() {
		return ListaUsuario.mostrar();
	}

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }
        
        public static int verificarUsuarioNuevo(String usuario){
            Vector lista = mostrar();
            Usuarios obj;
            for(int i=0; i < lista.size(); i++){
                obj = (Usuarios) lista.elementAt(i);
                if(obj.getNick().equalsIgnoreCase(usuario)){
                    return i;
                }
            }
            return -1;
        }
        
        public static int verificarLogueo(String usuario, String contrasenia){
            Vector lista = mostrar();
            Usuarios obj;
            for(int i =0; i < lista.size(); i++){
                obj = (Usuarios)lista.elementAt(i);
                if(obj.getNick().equalsIgnoreCase(usuario) && obj.getContrasenia().equalsIgnoreCase(contrasenia));
                return i;
            }
            return -1;
        }
        
        public static String buscarUsuario(String usuario){
            Vector lista = mostrar();
            Usuarios obj;
            for(int i=0; i <lista.size(); i++){
                obj = (Usuarios)lista.elementAt(i);
                if(obj.getNick().equalsIgnoreCase(usuario)){
                    String nombre = obj.getNombre();
                    return nombre;
                }
            }
            return usuario;
        }
}