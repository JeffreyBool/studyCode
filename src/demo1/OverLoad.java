package demo1;

public class OverLoad {

    public static void main(String[] args) {
        /*
          Java 特有重载方式,可以根据参数个数自动调用不同的方法.如果一个都没有找到就编译报错.
         */

        System.out.println(sum(10,20));

        System.out.println(sum(10,20,30));

        System.out.println(sum(10,20,30,40));
    }

    /**
     * 两次参数方法
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a,int b)
    {
        return a + b;
    }

    /**
     * 三个参数方法
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int sum(int a,int b,int c)
    {
        return a +b +c;
    }

    /**
     * 四个参数方法
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static int sum(int a, int b,int c,int d)
    {
        return a+b+c+d;
    }
}
