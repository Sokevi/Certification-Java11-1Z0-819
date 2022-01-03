package dataflow;

public class Main {
    public static  void main(String... strings){
        for (var i = 0; i<10;i++){
            switch (i%5){
                case 2:
                    i *= i;
                    break;
                case 3:
                    i ++;
                    break;
                case 1:
                case4:
                    i++;
                    continue;
                default:
                    break;
            }
            System.out.println(i +" ");
            i++;
        }
    }
}
