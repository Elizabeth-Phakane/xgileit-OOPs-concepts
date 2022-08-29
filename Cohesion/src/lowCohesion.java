public class lowCohesion {

//logging in onto your email only requires your email and password, the rest is irrelevant

    private String email;
    private String password;

    private  String address;//irrelevant
    private int age;//irrelevant

    public void login(String email, String password){
        this.email = email;
        this.password =password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword() {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //irrelevant
    public String displayAddress() {
      return address;
    }


}
