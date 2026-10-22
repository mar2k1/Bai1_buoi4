package src;

public class User {
    private String username;
    private String password;
    public int birthDay;

    // ham khoi tao
    public User(String username, String password, int birthDay) {
        this.username = username;
        this.password = password;
        this.birthDay = birthDay;
    }

    public String getInfo() {
        return "username: " + this.username + "|" + " birthDay: " + this.birthDay;
    }
}
