package tutorials.functional;

public class MainFunctional {
    public static void main(String[] args) {
        Demo demo = (message, user) -> System.out.println(message.concat(" ").concat(user));

        // without lambda
        Demo demo1 = new DemoImpl(){
            @Override
            public void demonstrate(String message, String user) {
                super.demonstrate(message, user);
            }
        };

        demo.demonstrate("Me again", "with lambda");
        demo1.demonstrate("Me again", " without lambda");
    }
}
