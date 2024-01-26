package com.ajith.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExamples {
//    //create new string
//    String str = "Ajith";
//    String str2 = "Ajith";
//
//    //the above strings share the common memory space
//
//    String str3 = new String ("one.two.three");
//    //this will create new memory space
//
//
//
List<String> words = Arrays.asList ( "$easy$","$problem$");
String separator = "$";
       public List <String> splitWordsBySeparator(List<String> words, String separator) {
           List<String> result = new ArrayList <> ();
           for(String word : words)
           {
               String [] parts = word.split("\\Q"+separator+"\\E");
               for (String part : parts) {
                   if (!part.isEmpty()) { // Filter out empty strings
                       result.add(part);
                   }
               }
           }
        return result;
       }



    public  void print(){
     List <String> str =  splitWordsBySeparator ( words , separator );
        System.out.println (str );
       }
}
