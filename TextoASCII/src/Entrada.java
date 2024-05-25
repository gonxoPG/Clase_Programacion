import java.io.*;

public class Entrada {
    public static void main(String[] args) {

        File file = new File("src/documentos/texto.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int codigo = -1;

            while ((codigo = fileReader.read()) != -1){
                System.out.println(codigo);
            }

        }catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }catch (IOException e){
            System.out.println("Error en la lectura");
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }catch (NullPointerException e){
                System.out.println("Cerrado a nulo");
            }
        }
    }
}

