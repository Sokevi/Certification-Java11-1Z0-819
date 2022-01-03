package CodingGameCode;

import java.util.*;
public class RomainToNumber {
    public static void main(String args[]) {
   
         String value =  "XXIV";
       
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
       
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
       
        int tot = 0 ;
        for(int i = 0 ; i < value.length(); i++ ){
           
            if(i < value. length()-1 && hash.get(value.charAt(i)) < hash.get(value.charAt(i+1))){
                            tot = tot + (hash.get(value.charAt(i+1)) - hash.get(value.charAt(i)) );
                            i++;
            }
            else{
                tot = tot + hash.get(value.charAt(i));
            }
        }
       
        System.out.println(tot);

       
       
       
    }
}
