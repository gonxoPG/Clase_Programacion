import java.io.*;

public class Entrada {
    public static void main(String[] args) {
        File file = new File("src/documentos/codigo.txt");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            int codigo = -1;
            String texto;
            String[] frase;

            while ((texto = bufferedReader.readLine()) != null){
                frase = texto.split(" ");


                for (String s : frase){
                    System.out.print((char) Integer.parseInt(s));
                }
            }

            // revisar Notion último método escritura

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            } catch (NullPointerException e){
                System.out.println("Cerrado en nulo");
            }
        }
    }
}
