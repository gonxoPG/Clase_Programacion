import java.io.*;

public class Entrada {
    public static void main(String[] args) {

        File file = new File("src/documentos/texto.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        int recuentoLetras = 0;
        int recuentoLineas = 0;


        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String linea = null;

            while ((linea = bufferedReader.readLine()) != null){
                System.out.println(linea);
                recuentoLetras += linea.length()+1; // +1 si quiero contar los saltos de línea
                recuentoLineas++;
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
        System.out.println();
        System.out.println("El recuento de letras es de "+recuentoLetras+"\n");
        System.out.println("El número de oraciones es de "+recuentoLineas);

    }
}

