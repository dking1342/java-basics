public class MyMultiGenClass <T, V> {

    T x;
    V y;

    MyMultiGenClass(T x, V y){
        this.x = x;
        this.y = y;
    }

    public V getSecondValue(){
        return y;
    }
}