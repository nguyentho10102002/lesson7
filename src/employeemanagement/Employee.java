package employeemanagement;
import java.util.Scanner;
public class  Employee {

    //Tạo lớp Employee chứa thông tin: tên, giới tính, ngày sinh, địa chỉ
//Viết đầy đủ các hàm getter setter, constructor không tham số, constructor đầy đủ tham số
//Tạo them 2 lớp: Officer, Worker kế thừa lớp Employee.
//Lớp Officer: department, level
//Lớp Worker: factory.
        protected String name;
        protected String gender;
        protected String birthday;
        protected String address;

        public Employee() {

        }

        public Employee(String name, String gender, String birthday, String address) {
            this.name = name;
            this.gender = gender;
            this.birthday = birthday;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public void getinfor(){
            Scanner input = new Scanner(System.in);
            System.out.println("Name: ");
            name = input.nextLine();
            System.out.println("Gender: ");
            gender = input.nextLine();
            System.out.println("Birthday: ");
            birthday = input.nextLine();
            System.out.println("Address: ");
            address = input.nextLine();
        }
        public void showInfor(){
            System.out.println(toString());
        }
        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

