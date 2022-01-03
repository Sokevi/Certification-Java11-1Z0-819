package Enum;

public enum SeasonWithDescribe {
    WINTER("ça caille"),
    PRINTER("ça peut aller"),
    SUMMER("chaud");

    String description;

    private SeasonWithDescribe(String description){
        this.description =description;
    }

    public void  getDescription(){
        System.out.println(String.valueOf(this.description));
    }
}
