package pl.edu.agh.mwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReaderFromFile {
    private String filePath;
    private String json;

    public JsonReaderFromFile(String filePath) {
        this.filePath = filePath;
        this.readJsonFromFile();
    }

    void readJsonFromFile() {
        try {
            this.json = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace(); // Or handle it better in production
        }
    }

    public String getJson() {
        return json;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void printJson() {
        System.out.println(this.json);
    }
}
