package assingment;

public class user {
	String name;
	String email;
	String gender;
	
	private String username;
    private String password;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
