package CollectionAnagram;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println("Твой ответ:");
        System.out.println(new Main().findAnagrams(readFile()));
    }

    private static String readFile() throws URISyntaxException, IOException {
        Path path = Paths.get(Objects.requireNonNull(Main.class.getClassLoader().getResource("CollectionAnagram/input.txt")).toURI());

        Stream<String> lines = Files.lines(path);
        String data = lines.collect(Collectors.joining("\n"));
        lines.close();

        return data;
    }

    private List<List<String>> findAnagrams(String text) {
        Map <String, SortedSet<String>> answer = new HashMap<>();

        var cleanedText = text
                .replaceAll("[^а-яА-Я ]", " ")
                .replaceAll("( )+", " ")
                .toLowerCase();

        String[] words = cleanedText.split(" ");

        for (String word : words) {
            var key = createKey(word);
            SortedSet<String> anagramGroup = answer.getOrDefault(key, new TreeSet<>());
            anagramGroup.add(word);
            answer.put(key, anagramGroup);
        }

        Comparator<Set<String>> ListSizeComparator = Comparator.comparing(Set::size);
        return answer
                .values()
                .stream()
                .sorted(ListSizeComparator.reversed())
                .limit(3)
                .map(ArrayList::new)
                .collect(Collectors.toList());

    }

    private String createKey(String word) {
        var chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
