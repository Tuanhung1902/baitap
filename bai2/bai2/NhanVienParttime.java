package bai2;

public class NhanVienParttime extends NhanVien{
    private int sobuoi;

    public NhanVienParttime(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
    }

    public NhanVienParttime(String name, int age, String gender, double salary, int sobuoi) {
        super(name, age, gender, salary);
        this.sobuoi = sobuoi;
    }

    public NhanVienParttime() {
    }

    public int getSobuoi() {
        return sobuoi;
    }

    public void setSobuoi(int sobuoi) {
        this.sobuoi = sobuoi;
    }

    @Override
    public double getSalary() {
        return sobuoi * 200000;
    }
}
