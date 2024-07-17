package programmers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadData {
    private ReadData() {}

    public static final ReadData INSTANCE = new ReadData();
    public static final String ROOT = "src";
    public static final String ROOT_PROGRAMMERS = ROOT + File.separator + "programmers" + File.separator;
    public static final String dataFileName = "data.txt";

    public List<String> readFileContents(String packageName) {
        try {
            return Files.readAllLines(Paths.get(ROOT_PROGRAMMERS + packageName + File.separator + dataFileName));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
