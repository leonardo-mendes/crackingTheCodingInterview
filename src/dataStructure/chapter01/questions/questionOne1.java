package dataStructure.chapter01.questions;

import dataStructure.chapter01.implArray.ArrayListImpl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class questionOne1 {

    public static void main(final String[] args) {
        // Implement an algorithm to determine if a string has all unique characters.
        // Example: #44, #177, #132
        check(List.of("#44", "#177", "#132"));

    }

    private static void check(List<String> strings) {
        strings.forEach(word -> { // o(W)
            if(word.length() > 1){
                Map<String, Integer> mapControl = new HashMap<>();
                for(int i = 0; i < word.length(); i++){ // o(L)
                    if(mapControl.get(String.valueOf(word.charAt(i))) == null){
                        mapControl.put(String.valueOf(word.charAt(i)), 1);
                    } else {
                        Integer oldValue = mapControl.get(String.valueOf(word.charAt(i)));
                        mapControl.replace(String.valueOf(word.charAt(i)), oldValue + 1);
                    }
                }

                mapControl.keySet().stream().forEach(letter -> { // o(K)
                    if(mapControl.get(letter) != null && mapControl.get(letter) > 1){
                        return true;
                    }
                });

                if(new HashSet<>(mapControl.values()).size() == 1){
                    System.out.println(String.format("The %s word does not contains duplicated chars.", word));
                }
            }
            else {
                System.out.println(String.format("The %s word does not contains duplicated chars.", word));
            }
        });
    }

    private static Boolean bookSolution(List<String> strings) {
        for (int i = 0; i < strings.size(); i++){
            boolean[] charControl = new boolean[strings.get(i).length()];
            for (int j = 0; j < strings.get(j).length(); j++){
                int val = strings.get(i).charAt(j);
                if(charControl[val]){
                    return false;
                }
                charControl[val] = true;
            }
        }
        return true;
    }
}
