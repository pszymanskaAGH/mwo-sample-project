package pl.edu.agh.mwo;

public class App {
    public static void main(String[] args) {

        // path to file
        String pathToFile = "json/pit.json";

        // read the json from file to String
        JsonReaderFromFile reader = new JsonReaderFromFile(pathToFile);
        reader.readJsonFromFile();

        // create PitStopAgregator
        PitStopAgregator pitStopAgregator = new PitStopAgregator(reader.getJson());

        System.out.println(pitStopAgregator.countPitStops());
        System.out.println(pitStopAgregator.getTheLongestPitStopWithDriverNumber());
    }
}
