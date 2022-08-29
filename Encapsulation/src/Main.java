public class Main {
    public static void main(String[] args) {
    /*to avoid this initialization below we use encapsulation through getters and setters
        Employee e = new Employee();
        e.age =  34;
        e.name = "Christina";
        System.out.println(e.name);
     */

        Employee e = new Employee();
        e.setAge(34);
        e.setName("linda");
        System.out.println( e.getAge());
        System.out.println(e.getName()) ;


    }
}