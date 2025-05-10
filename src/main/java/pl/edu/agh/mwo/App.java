package pl.edu.agh.mwo;

public class App {
    public static void main(String[] args) {

        // Sprawdzenie czy argument został przekazany
        if (args.length < 1) {
            System.out.println("Użycie: java -jar program.jar <ścieżka_do_pliku_json>");
            return;
        }

        String pathToFile = args[0]; // pierwszy argument z linii komend

        // read the json from file to String
        JsonReaderFromFile reader = new JsonReaderFromFile(pathToFile);
        reader.readJsonFromFile();

        // create PitStopAgregator
        PitStopAgregator pitStopAgregator = new PitStopAgregator(reader.getJson());

        // print results
        System.out.println(pitStopAgregator.countPitStops());
        System.out.println(pitStopAgregator.getTheLongestPitStopWithDriverNumber());
        System.out.println(pitStopAgregator.getAveragePitStopDuration());
    }
}
