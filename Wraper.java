import java.util.*;
class Wrapper
{
    private int i;
    Wrapper () {}
    Wrapper (int i) {
        this.i=i;
    }
    public int getValue(){
        return i;
    }
    public void setValue(int i){
        this.i=i;
    }
    @Override
    public String toString(){
        return Integer.toString(i);
    }
    }
    public class WrapTest
    {
        public static void main(String[]a args){
            Wrapper j=new Wrapper(10);
            System.out.println(j);
        }
    }
