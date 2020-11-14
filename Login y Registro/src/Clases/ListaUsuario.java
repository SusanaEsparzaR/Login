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
public class ListaUsuario {
    private static Vector<Usuarios> datos = new Vector<Usuarios>();
	public static void agregar(Usuarios obj) {
		datos.addElement(obj);
	}
	public static void eliminar(int pos) {
		datos.removeElementAt(pos);
	}
	public static Vector mostrar(){
		return datos;
	}
}
