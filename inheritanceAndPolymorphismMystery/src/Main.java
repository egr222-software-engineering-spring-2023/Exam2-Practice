public class Main {

    public static void main(String[] args) {
        Kurt   var1 = new Jerry();
        Chris  var2 = new Chris();
        Kurt   var3 = new Eddie();
        Kurt   var4 = new Chris();
        Object var5 = new Jerry();

        System.out.println("var1.a()");
        var1.a();
        System.out.println("var1.c()");
        var1.c();
        System.out.println("var2.a()");
        var2.a();
        System.out.println("var2.b()");
        var2.b();
        System.out.println("var3.a()");
        var3.a();
        System.out.println("var3.b()");
//        var3.b(); // compiler error
        System.out.println("var4.a()");
        var4.a();
        System.out.println("var5.a()");
//        var5.a(); // compiler error

        System.out.println("((Chris) var5).a()");
//        ((Chris) var5).a(); // runtime error - throws an exception because Jerry cannot be cast to Chris
        System.out.println("((Jerry) var1).a()");
        ((Jerry) var1).a();
        System.out.println("((Jerry) var4).a()");
        ((Jerry) var4).a();
        System.out.println("((Chris) var3).b()");
//        ((Chris) var3).b(); // runtime error - throws an exception because Eddie cannot be cast to Chris
        System.out.println("((Eddie) var3).b()");
        ((Eddie) var3).b();
        System.out.println("((Jerry) var4).c()");
        ((Jerry) var4).c();
        System.out.println("((Kurt) var5).c()");
        ((Kurt) var5).c();
    }
}
