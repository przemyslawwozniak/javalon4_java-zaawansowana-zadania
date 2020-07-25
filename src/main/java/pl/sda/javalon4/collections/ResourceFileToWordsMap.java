package pl.sda.javalon4.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ResourceFileToWordsMap {

    public static void main(String[] args) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        try (InputStream resource = classloader.getResourceAsStream("news.txt")) {
            List<String> lines =
                    new BufferedReader(new InputStreamReader(resource,
                            StandardCharsets.UTF_8)).lines().collect(Collectors.toList());

            Map<String, Integer> wordCountMap = new HashMap<>();

            for(String line : lines){
                for(String word : line.split(" ")) {
                    if(wordCountMap.containsKey(word))
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    else
                        wordCountMap.put(word, 1);
                    /*
                    wordCountMap.put(word,
                            wordCountMap.containsKey(word) ? //czy mapa zawiera slowo
                                    wordCountMap.get(word) + 1 //to sie dzieje jesli jest true
                                    : 1);   //to sie dzieje jest jest false
                    */
                }
            }

            System.out.println(wordCountMap);
        }
        catch(IOException ex) {
            System.err.println("Cannot open text file: " + ex);
        }
    }

}
