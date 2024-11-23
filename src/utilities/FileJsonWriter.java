package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileJsonWriter {
    /**
     * Writes the provided list of data into a JSON file at the specified path.
     * @param partFile     The path of the file where the JSON data will be written<br>
     *                     (Format: "src/database/xxx.json")
     * @param dataFile     The list of data written to the JSON file<br>
     *                     If {@code data is NULL}, no action is performed
     * @param <E>          The type of elements in the list of data
     * @throws IOException If an I/O error occurs while writing to the file
     */
    public <E> void writeJsonFile(String partFile, List<E> dataFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        if (dataFile != null) {
            mapper.writeValue(new File(partFile), dataFile);
        }
    }
}