package Quiz.Interface;

public class Method3 {

    public static void main(String[] args) {
        //lambda expression
        MyInterface myInterface = () -> System.out.println("Hello Method3");
        myInterface.sayHello();
    }
}
