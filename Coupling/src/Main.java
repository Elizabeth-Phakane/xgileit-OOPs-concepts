public class Main {
    public static void main(String[] args) {

        //output of tight coupling
        tightCoupling t = new tightCoupling(12.3,14);
        System.out.println(t.rectangleArea);

        //output of lose coupling
        loseCoupling l = new loseCoupling(14,15.9);
        System.out.println(l.getRectangleArea());

    }
}