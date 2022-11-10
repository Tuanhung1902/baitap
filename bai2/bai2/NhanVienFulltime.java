package bai2;

public class NhanVienFulltime extends NhanVien{
    private double heso;

    public NhanVienFulltime(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
    }

    public NhanVienFulltime(double heso) {
        this.heso = heso;
    }

    public NhanVienFulltime() {
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    @Override
    public double getSalary() {
        return heso * 5000000;
    }
}
