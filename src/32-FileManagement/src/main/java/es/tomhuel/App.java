package es.tomhuel;

import es.tomhuel.service.FileService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String filepath = "/Users/tomasnahuelantelarizzo/Code/Courses/Learn-Java/src/32-FileManagement/src/main/resources/file.txt";
        writeFile(filepath);
        readFile(filepath);
    }

    public static void readFile(String filepath) {
        FileService service = new FileService();
        String content = service.readFile(filepath);
        System.out.println(content);
    }

    public static void writeFile(String filepath) {
        FileService service = new FileService();
        service.createFile(filepath, "Este es el autentico bocata\n");
    }
}
