package XianChengChuangJian;

/**
 * Created by KPL on 2018/7/27.
 */
public class Method1 extends Thread{
    private String name;
    public Method1(String name){
        this.name = name;
    }
    public void run() {   //重写run方法，run方法的方法体就是现场执行体
        System.out.println(name + "线程启动啦");
    }
}
