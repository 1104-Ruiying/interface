package transpotation;

public interface Transpotation {

    public abstract double getPrice(); //抽象方法

    public default String getName(){
     return  this.getClass().getSimpleName(); //
    }
}
