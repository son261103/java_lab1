import java.util.Scanner;

public class person {
     private String name;
     private String address;
     private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Nhập tên của bạn: ");
        name = sc.nextLine();
        System.out.println("Nhập địa chỉ của bạn: ");
        address = sc.nextLine();
        System.out.println("Nhập lương: ");
        salary = sc.nextInt();
    }
    void output(){
        System.out.println("Chào bạn " + this.name);
        System.out.println("Địa chỉ của bạn là "+ this.address);
        System.out.println("Mực lương bạn nhận được là " + this.salary);
    }
}
