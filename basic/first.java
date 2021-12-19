public class first{
   public static void main(String[] args) {
        System.out.println("Hello World");
        second.method();
        System.out.println(second.allClicks);
        second s=new second();
        s.f();
    }
}
class second{

    static int allClicks;    // 类变量 默认初始化为0

    String str = "hello world";  // 实例变量
    //类方法
    public static void method() {
        int i =0;  // 局部变量 需要初始化
        System.out.println(i);
    }
    //示例方法
    public void f(){
      System.out.println(str);
    }
}