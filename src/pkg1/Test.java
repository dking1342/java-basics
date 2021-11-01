package pkg1;

public class Test {

    String name;
    Test(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}