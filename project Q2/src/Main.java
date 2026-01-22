import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student first = new Student();
        Student second = new Student();
        System.out.println("Student 1: Enter ID, name, major");
        first.setID(sc.next());
        sc.nextLine();
        //first.setName(sc.nextLine());
        //first.setMajor(sc.next());
        System.out.println("Student 2: Enter ID, name, major");
        second.setID(sc.next());
        //second.setName(sc.nextLine());
        //second.setMajor(sc.next());
        System.out.print (first.sameYear(second) ?
                "Same year, " : "Different year, ");
        System.out.print (first.sameLevel(second) ?
                "same level, " : "different level, ");
        System.out.print (first.sameFaculty(second) ?
                "same faculty" : "different faculty");
    }
    /*ปัญหาคือ ตอน input name มันมีนามสกุลด้วย แต่โจทย์ไม่ได้บอกว่าต้องรับมั้ย
    หรือคนกรอกจะกรอกนามสกุลมาด้วยทุกครั้งมั้ย หรือจะเป็นสาขาเลย
    แถมใช้ nextLine() รับมาไม่ได้เพราะตัวอย่างมันไม่ได้เคาะบรรทัดเลย
    สรุปตอนนี้ที่ทำไว้คือ object Student เก็บมาแค่ ID ไม่สนไม่บันทึกชื่อกับสาขาที่กรอกมาเลย
    โปรแกรมเวิร์กตามตัวอย่าง แต่ถ้าเอาจริง/ไปเทสเรียกอย่างอื่นก็ไม่ได้ เพราะหลังบ้านยังไม่ได้*/
}