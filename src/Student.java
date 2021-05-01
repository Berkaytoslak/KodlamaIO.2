public class Student extends User{

    public Student(int id, String name, String lastname, String email, String password, String branch) {
        super(id, name, lastname, email, password, branch);
    }
    public Student(){

    }
    public void add(){
        setId(1);
        setName("Berkay");
        setLastname("Toslak");
        setEmail("berkay@gmail.com");
        setPassword("123");
        setBranch("Student");
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getLastname());
        System.out.println(getEmail());
        System.out.println(getPassword());
        System.out.println(getBranch());
    }

}
