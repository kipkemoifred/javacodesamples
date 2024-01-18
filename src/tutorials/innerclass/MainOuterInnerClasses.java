package tutorials.innerclass;

//public class InnerClass {
    class OuterClass {
        int x = 10;

        class InnerClass1 {
            int y = 5;
        }
    }



// Outputs 15 (5 + 10)
//}
public class MainOuterInnerClasses{
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass1 myInner = myOuter.new InnerClass1();
        System.out.println(myInner.y + myOuter.x);
    }
}
