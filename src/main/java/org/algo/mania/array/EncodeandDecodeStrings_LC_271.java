package org.algo.mania.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeandDecodeStrings_LC_271 {
    public static void main(String[] args) {
        EncodeandDecodeStrings_LC_271 b1 = new EncodeandDecodeStrings_LC_271();
//        List<String> list = Arrays.asList("leet", "#c#ode");
       List<String> list = Arrays.asList("algo","mania","love","you");
//        List<String> list = Arrays.asList("");

        System.out.println("input : "+ list);
        String encode = b1.encode(list);
        System.out.println( "encoded " +  encode);
        List<String> decode = b1.decode(encode);
        System.out.println("decoded " +decode);


    }

    public List<String> decode(String encode) {
        List<String> ans=new ArrayList<>();

        int i=0;

        while (i<encode.length()){
            int j=i;
            while (encode.charAt(j)!='#'){
                j++;
            }

            int len=Integer.valueOf(encode.substring(i,j));
            i=j+1+len;
            ans.add(encode.substring(j+1,i));

        }

        return ans;
    }


    public String encode(List<String> list) {

        StringBuilder ans=new StringBuilder();

        for (String str: list){
            ans.append(str.length()).append("#").append(str);
        }

        return ans.toString();
    }


}
