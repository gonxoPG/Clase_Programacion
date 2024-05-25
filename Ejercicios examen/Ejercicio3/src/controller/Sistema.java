package controller;

import model.Usuario;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Usuario> listaUsuarios;

    public Sistema() {
        listaUsuarios = new ArrayList<>();
    }

    public void altaUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public boolean loginUsuario(String correo, String contraseña){

        for (Usuario item :listaUsuarios){

            if (correo.equalsIgnoreCase(item.getCorreo()) && contraseña.equalsIgnoreCase(item.getContraseña())){
                return true;
            }
        }

        return false;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
