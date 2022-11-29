public class nhanVienFull extends Admin {
    private String name;
    private int age;
    private String gender;
    private double heso;

    public nhanVienFull(String username, String password) {
        super(username, password);
    }

    public nhanVienFull(String username, String password, String name, int age, String gender, double heso) {
        super(username, password);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.heso = heso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }
    public double tinhLuong(){
        return heso * 500000;
    }

    @Override
    public String toString() {
        return "nhanVienFull{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", heso=" + heso +
                '}';
    }
}
