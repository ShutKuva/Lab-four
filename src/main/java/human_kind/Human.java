package human_kind;

public class Human {
    private Class<?> type = Human.class;
    private String name;
    public Human(String name){
        this.name = name;
    }
    public Human(){

    }

    public Class<?> getType(){
        return this.type;
    }
    public String getName() {
        return name;
    }

    protected void setType(Class<?> type) {
        this.type = type;
    }
    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name + " status " + this.type;
    }
}