public class MyGen <T> {

    T x;

    MyGen(T x){
        this.x = x;
    }

    public T getValue() {
        return x;
    }
}