package human_kind;

public class Human {
    protected String type = "Human";
    protected String name;
    public Human(String name){
        this.name = name;
    }
    public Human(){

    }

    public String getType(){
        return this.type;
    }
    public String getName() {
        return name;
    }
}