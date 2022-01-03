package secure;

public class Secret {
    private final String[] names;

    public Secret (String[] names){
        this.names = names;
    }
    public String[] getNames(){
        return names;
    }
}
