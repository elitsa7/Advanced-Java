package AdvancedLab.StreamsFilesDirectories;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        List <String> sortedLines = Files.readAllLines(Paths.get(path))
                .stream()
                .sorted()
                .collect(Collectors.toList());

        Path output = Path.of("sortedLines.txt");
        Files.write(output, sortedLines, StandardOpenOption.WRITE);
    }
}
