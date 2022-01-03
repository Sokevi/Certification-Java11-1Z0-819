package stringStringBuilder;

public class TestClass {

    public static void main(String... strings){
        StringBuilder txt1 = new StringBuilder("PPQRRRSTT");
        int i=0;
        a: while (i <txt1.length()){
            char x = txt1.charAt(i);
            int j = 0;
            i++;
            b: while (j< txt1.length()){
                char y = txt1.charAt(j);
                if(i !=j && y ==x){
                    txt1.deleteCharAt(j);
                     continue a;
                     //break b;
                }
                j++;
            }
        }
        System.out.println(txt1);
    }
}

