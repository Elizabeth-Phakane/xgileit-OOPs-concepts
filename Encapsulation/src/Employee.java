public class Employee {

    //setting the fields to private so that they can not be used in any other class except this one
    private String name ;
    private  int age ;

    //getters and setters to encapsulate the fields

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }



}
