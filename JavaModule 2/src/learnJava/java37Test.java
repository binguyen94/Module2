package learnJava;

public class java37Test {
    public static void main(String[] args) {
        java37Date day1 = new java37Date(11,11,1994);
        java37Date day2 = new java37Date(12,12,1995);
        java37Date day3 = new java37Date(11,12,1994);

        java37Class class1 = new java37Class("12a1","Chuyên Toán");
        java37Class class2 = new java37Class("12a2","Chuyên Văn");
        java37Class class3 = new java37Class("12a3","Chuyên Hóa");

        java37Student student1 = new java37Student("A101","Nguyễn Thiện Nhân",day1,7.5,class1);
        java37Student student2 = new java37Student("A102","Nguyễn Thiện Trọng",day2,6.5,class2);
        java37Student student3 = new java37Student("A103","Nguyễn Thiện Đức",day3,4.5,class3);

        System.out.println("Tên khoa:");
        System.out.println("-Sinh viên 1: " + student1.getNameFaculty());
        System.out.println("-Sinh viên 2: " + student2.getNameFaculty());
        System.out.println("-Sinh viên 3: " + student3.getNameFaculty());

        System.out.println("\nKiểm tra sinh viên thi đạt:" );
        System.out.println("-Sinh viên 1: " + student1.checkPassClass());
        System.out.println("-Sinh viên 2: " + student2.checkPassClass());
        System.out.println("-Sinh viên 3: " + student3.checkPassClass());

        System.out.println("\nKiểm tra cùng ngay sinh:");
        System.out.println("-Sinh viên 1 vs sinh viên 2 : " + student1.checkSameDateBorn(student2));
        System.out.println("-Sinh viên 1 vs sinh viên 3 : " + student1.checkSameDateBorn(student3));
    }
}
