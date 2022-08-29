public class Cow extends Animal{
    //method overriding
    public void sleepArea(){
        System.out.println("Sleeps in a Kraal");
    }
    //method overloading
    public void sleepArea(String time){
        System.out.println("Sleeps in a Kraal" + time);
    }

}
