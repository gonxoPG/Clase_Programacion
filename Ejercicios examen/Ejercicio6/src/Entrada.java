import java.io.*;

public class Entrada {
    public static void main(String[] args) {

        int mediaAlta = 0;
        String nombreAlto = null;
        String linea;

        File file = new File("src/resources/alumnos.txt");
        FileReader fileReader;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            while ((linea = bufferedReader.readLine()) != null){
                linea = linea.replaceAll(" ", "");

                if (Integer.parseInt(linea.split(",")[3]) > mediaAlta){
                        mediaAlta = Integer.parseInt(linea.split(",")[3]);
                        nombreAlto = linea.split(",")[0] + " " + linea.split(",")[1];
                }
            }
            System.out.printf("El alumno con la nota mas alta es %s con una nota de %d", nombreAlto, mediaAlta);

        } catch (FileNotFoundException e) {
            System.out.println("Error en el archivo");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }catch (NullPointerException e){
                System.out.println("Cerrado en nulo");
            }
        }
    }
}
