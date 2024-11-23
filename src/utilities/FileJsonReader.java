package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class FileJsonReader {
    /**
     * <p>
     * Return {@code Data} from {@code JSON File}.<br>
     * if {@code Data} is {@code NULL or Empty}, then return {@code Empty Optional}
     * </p>
     *
     * @param partFile The path to the JSON file to read<br>
     *                 (Format: "src/database/xxx.json")
     * @param type     The class type of the data to deserialize<br>
     *                 (ex: String[].class)
     * @param <E>      The type of the elements in the returned array
     * @return An {@code Optional<E[]>} containing the JSON data, or {@code Empty Optional}
     * @throws IOException If an I/O error occurs during file reading
     */
    public <E> Optional<E[]> readJsonFile(String partFile, Class<E[]> type) throws IOException {
        Optional<E[]> jsonData;
        ObjectMapper mapper = new ObjectMapper();
        E[] data = mapper.readValue(new File(partFile), type);
        jsonData = Optional.ofNullable(data);
        return jsonData;
    }
}