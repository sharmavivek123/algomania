package org.algo.mania.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidAnagram_LC_242 {
    public static void main(String[] args) {
        ValidAnagram_LC_242 validAnagram24=new ValidAnagram_LC_242();
        //System.out.println(validAnagram24.isAnagram("anagram","nagaram"));
        System.out.println(validAnagram24.isAnagramV2("anagram","nagaram"));
    }

    private boolean isAnagramV2(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        int[] ints=new int[26];

        for (int i=0;i<s.length();i++){
            ints[s.charAt(i)-'a']++;
            ints[t.charAt(i)-'a']--;

        }
        for (int i=0;i<ints.length;i++){
            if(ints[i]!=0){
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        Map<Character,Integer> map=new HashMap<>();

        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) +1 );
        }

        System.out.println(map);

        for (int j=0;j<t.length();j++){
            Integer itemp = map.get(t.charAt(j));

            if(itemp==null){
                return false;
            }
            map.put(t.charAt(j),itemp-1);
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for (Map.Entry<Character, Integer> entry: entries){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(value<0){
                return false;
            }
        }

        return true;

    }

}
