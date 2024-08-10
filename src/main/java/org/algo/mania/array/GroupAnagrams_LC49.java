package org.algo.mania.array;

import java.util.*;



public class GroupAnagrams_LC49 {

    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams_LC49 anagramsLc493=new GroupAnagrams_LC49();
        List<List<String>> lists = anagramsLc493.groupAnagrams(strs);
       // List<List<String>> lists1 = anagramsLc493.groupAnagramsV2(strs);
        System.out.println(lists);
      //  System.out.println(lists1);

    }


    private List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map=new HashMap<>();

        for (String s: strs){

            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortString=String.valueOf(charArray);

            if(!map.containsKey(sortString)){
                map.put(sortString,new ArrayList<>());
            }

            map.get(sortString).add(s);

        }

        return new ArrayList<>(map.values());
    }

}

