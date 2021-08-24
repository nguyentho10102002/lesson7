package studentmanagement;
import java.util.Scanner;
public class main{
     public static void main(String[] args) {

        //sinh viên 1

        Student sv1 = new Student( 1 ," Nguyễn Văn Thọ " ," Công nghệ thông tin ",8,9 );

        //sinh viên 2

        Student sv2 = new Student(2, " Nguyễn Văn Phúc "," Quản trị kinh doanh ", 7, 8 );


        //sinh viên 3

        Student sv3 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID 3 : ");
        sv3.setId(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 3 : ");
        sv3.setName(sc.nextLine());
        System.out.println("Nhập chuyên ngành của sv3 : ");
        sv3.setMajor(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết : ");
        sv3.setTheoryScore(sc.nextFloat());
        System.out.println("Nhập điểm thực hành : ");
        sv3.setPraticeScore(sc.nextFloat());
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        System.out.printf("%6s %10s %30s %10s %10s %10s \n"," Mã SV ","   Họ tên "," Chuyên môn ",
                "   Điểm LT","    Điểm TH     ", "   Điểm TB     ");
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
     }
}