package Enum;

import javax.crypto.Mac;

public class Test {
    enum  Machine{
        AUTO("truck"), MEDICAL("scanner");
        private String type;
        private Machine(String type){
            this.type = type;
        }
        private void setType(String type){
            this.type = type;
        }
        private String getType() {
            return type;
        }
        public static void main (String [] agrs){
            Machine.AUTO.setType("Sedna");
            for(Machine p: Machine.values()){
                System.out.println(p+":"+ p.getType());
            }
        }
    }

}
