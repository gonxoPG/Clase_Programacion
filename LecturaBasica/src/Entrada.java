import java.io.*;

public class Entrada {
    public static void main(String[] args) {

        File file = new File("src/documentos/texto.txt");
        BufferedReader bufferedReader = null;



        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            String linea = null;

            while ((linea = bufferedReader.readLine()) != null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }catch (IOException e){
            System.out.println("Error en la lectura");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }catch (NullPointerException e){
                System.out.println("Cerrado a nulo");
            }
        }



    }
}
