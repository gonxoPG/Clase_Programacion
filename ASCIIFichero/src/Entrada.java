import java.io.*;

public class Entrada {
    public static void main(String[] args) {

        File file = new File("src/documentos/texto.txt");
        File file2 = new File("src/documentos/codigos.txt");

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file2);
            int codigo = -1;

            while ((codigo = fileReader.read()) != -1){
                System.out.println(codigo);
                fileWriter.write(codigo+" ");
                    if (codigo == 13){
                        fileWriter.write(13);
                    }
            }

        }catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }catch (IOException e){
            System.out.println("Error en la lectura");
        }finally {
            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }catch (NullPointerException e){
                System.out.println("Cerrado a nulo");
            }
        }
    }
}
