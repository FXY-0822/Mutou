class OutClass {        //外部类
    private static String field_Static = "外围类：静态变量";
    private String field_Common = "外围类：普通变量";   //外部类的属性

    public void method4InnerClassLocal() {//外部类的方法

        String localField = "局部变量";     //局部变量
        final String localFieldFinal = "局部变量(final)";

        class InnerClassLocal {         //局部内部类
            public void localClassM() {         //局部内部类的方法
                System.out.println(localFieldFinal);        //打印局部变量
                System.out.println(field_Common);       //打印外部类属性
                System.out.println(field_Static);      // 打印外部类属性

            }
        }
        //上面是属性
        InnerClassLocal _local_in_c = new InnerClassLocal();
        _local_in_c.localClassM();      //下面是操作
    }

}
public class InnerClassTest1 {
    public static void main(String[] args) {

        System.out.println("===↓↓↓局部内部类===================");
        OutClass oc = new OutClass();
        oc.method4InnerClassLocal();

    }
}