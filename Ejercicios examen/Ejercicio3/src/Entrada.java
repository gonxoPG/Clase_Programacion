import controller.Sistema;
import model.Usuario;

public class Entrada {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Usuario usuario1 = new Usuario("Gonzalo", "correo1@correo.com", "abc");
        Usuario usuario2 = new Usuario("Ana", "correo2@correo.com", "bcd");
        Usuario usuario3 = new Usuario("Borja", "correo3@correo.com", "cdf");

        sistema.altaUsuario(usuario1);
        sistema.altaUsuario(usuario2);
        sistema.altaUsuario(usuario3);

        for (Usuario item :sistema.getListaUsuarios()){
            item.mostrarDatos();
        }

        if(sistema.loginUsuario("correo4@correo.com", "efg")){
            System.out.println("Login realizado correctamente");
        }else {
            System.out.println("Login erróneo");
        }

        if (sistema.loginUsuario("correo1@correo.com","abc")){
            System.out.println("Login correcto");
        }else{
            System.out.println("Login erróneo");
        }


    }
}
