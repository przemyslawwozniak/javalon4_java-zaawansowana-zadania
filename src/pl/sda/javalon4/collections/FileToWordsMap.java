package pl.sda.javalon4.collections;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileToWordsMap {

    public static void main(String[] args) {
        try {
            String path = "C:\\Users\\przwo\\Desktop\\news.txt";
            List<String> lines = Files.readAllLines(new File(path).toPath());

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
