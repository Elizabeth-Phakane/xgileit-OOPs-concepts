public class highCohesion {

    private String email;
    private String password;


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
}
