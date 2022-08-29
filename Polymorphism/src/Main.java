public class Main {
    public static void main(String[] args) {
       // these outputs show method overriding
       Cow c = new Cow();
       c.sleepArea();
       c.sleepArea(" at night");
       Bird b = new Bird();
       b.sleepArea();


    }
}