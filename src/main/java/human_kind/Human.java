package human_kind;

public class Human {
    private String type = "Human";
    private String name;
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

    protected void setType(String type) {
        this.type = type;
    }
    protected void setName(String name) {
        this.name = name;
    }
}