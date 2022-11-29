public class nhanVienPart extends Admin {
    private String name;
    private int age;
    private String gender;
    private int soBuoi;

    public nhanVienPart(String username, String password) {
        super(username, password);
    }

    public nhanVienPart(String username, String password, String name, int age, String gender, int soBuoi) {
        super(username, password);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.soBuoi = soBuoi;
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

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }
    public double tinhLuong(){
        return soBuoi * 200000;
    }

    @Override
    public String toString() {
        return "nhanVienPart{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", soBuoi=" + soBuoi +
                '}';
    }
}
