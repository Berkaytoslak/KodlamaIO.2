public class Instructor extends User{

    public Instructor(int id, String name, String lastname, String email, String password, String branch) {
        super(id, name, lastname, email, password, branch);
    }
    public Instructor(){

    }
    public void add(){
        setId(1);
        setName("Engin");
        setLastname("Demiroğ");
        setEmail("engin@gmail.com");
        setPassword("1234");
        setBranch("Instructor");
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getLastname());
        System.out.println(getEmail());
        System.out.println(getPassword());
        System.out.println(getBranch());
    }

}
