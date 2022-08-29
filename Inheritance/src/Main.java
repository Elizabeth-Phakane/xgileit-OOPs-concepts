public class Main {
    public static void main(String[] args) {
        
        //Object 1 and 2 are used to show hierarchical inheritance
        B obj1 = new B();
        obj1.displayA();
        obj1.displayB();

        D obj2 = new D();
        obj2.displayA();
        obj2.displayD();

        //Object 3 is used to show multi level inheritance
        C obj3 = new C();
        obj3.displayA();
        obj3.displayB();
        obj3.displayC();



    }
}