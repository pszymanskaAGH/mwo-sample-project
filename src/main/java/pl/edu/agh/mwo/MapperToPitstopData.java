package pl.edu.agh.mwo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class MapperToPitstopData {

    public static List<PitstopData> mapperToPitstopData(String jsonInString)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonInString, new TypeReference<>() {});
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
