public class User {
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String branch;

    public User(int id, String name, String lastname, String email, String password, String branch) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.branch = branch;
    }

    public User(){

    }

    public int getId() {
        System.out.print("id: ");
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        System.out.print("İsim: ");
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastname() {
        System.out.print("Last Name: ");
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        System.out.print("Email: ");
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        System.out.print("Password: ");
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBranch() {
        System.out.print("Branch: ");
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void add(){

    }

}
