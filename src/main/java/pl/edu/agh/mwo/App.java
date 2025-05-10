package pl.edu.agh.mwo;

public class App {
    public static void main(String[] args) {
        String pathToFile = "json/pit.json"; // adjust if needed

        JsonReaderFromFile reader = new JsonReaderFromFile(pathToFile);
        reader.readJsonFromFile();

        String json = reader.getJson();
        System.out.println("Loaded JSON content:");
        System.out.println(json);
    }
}
