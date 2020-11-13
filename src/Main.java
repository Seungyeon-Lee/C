//import ex_kotlin_to_java_package_level;

public class Main
{
    public static void main(String[] args)
    {
        /*
        // 197
        System.out.println(File1Kt.getA());
        File1Kt.func();
        File1Kt.extension(100);

        MyKotlin.func2();

        // 198
        KotlinClass kotlin = new KotlinClass();
        // kotlin.setNum(16);
        // System.out.println(kotlin.getNum());

        kotlin.setter(16);
        System.out.println(kotlin.getter());

        // 199
        System.out.println(KotlinObject.INSTANCE.getNum());
        KotlinObject.INSTANCE.setNum(0);
        KotlinObject.INSTANCE.hello();
         */

        KotlinClass2.Companion.setNum(30);
        System.out.println(KotlinClass2.Companion.getNum());
        KotlinClass2.Companion.hello();
    }
}
