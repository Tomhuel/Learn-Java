package es.tomhuel.service;

import java.io.*;

public class FileService {

    /**
     * Add content to a file in the specified path. If the file doesn't exists, it's created automatically
     *
     * @param path File's path
     */
    public void createFile(String path) {
        this.createFile(path, "");
    }

    /**
     * Add content to a file in the specified path. If the file doesn't exists, it's created automatically
     *
     * @param path    File's path
     * @param content File's content
     */
    public void createFile(String path, String content) {
        this.createFile(path, content, true);
    }

    /**
     * Add content to a file in the specified path. If the file doesn't exists, it's created automatically
     *
     * @param path    File's path
     * @param content File's content
     * @param concat  Concat current content with the previous content?
     */
    public void createFile(String path, String content, boolean concat) {
        File file = new File(path);
        try {
            FileWriter writer = new FileWriter(file, concat); // We can use FileWriter to write the content too, but buffer it's more efficient.
            BufferedWriter buffer = new BufferedWriter(writer);
            if (content.isEmpty()) {
                buffer.append(content);
            }
            buffer.close();
            System.out.println("File created succesfully!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * A newer way to use try - catch since Java 7
     *
     * @param path    File's path
     * @param content File's content
     * @param concat  Concat current content with the previous content?
     */
    private void createFileModernTry(String path, String content, boolean concat) {
        File file = new File(path);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(file, concat))) {
            if (content.isEmpty()) {
                buffer.append(content);
            }
            // buffer.close() execute automatically after the try keys end (at line 65)
            System.out.println("File created succesfully!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public String readFile(String path) {
        StringBuilder content = new StringBuilder();
        File file = new File(path);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return content.toString();
    }
}
