package XianChengChuangJian;

/**
 * Created by KPL on 2018/7/27.
 */
public class Test1 {
    public static void main(String[] args){
        Method1 m1 = new Method1("线程1");
        Method1 m2 = new Method1("线程2");
        m1.start();
        m2.start();
    }
}
