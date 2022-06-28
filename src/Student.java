public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
    this.name = name;
    this.stuNo = stuNo;
    this.classes = classes;
    this.c1 = c1;
    this.c2 = c2;
    this.c3 = c3;
    double average = 0.0;
    this.isPass = false;
    }

    void addBulkExamNote(double noteVerbal1,double noteWritten1, double noteVerbal2,double noteWritten2,double noteVerbal3,double noteWritten3) {
        if (noteVerbal1 >= 0 && noteVerbal1 <= 100) {
            this.c1.noteVerbal = noteVerbal1;
        }
        if (noteVerbal2 >= 0 && noteVerbal2 <= 100) {
            this.c2.noteVerbal = noteVerbal2;
        }
        if (noteVerbal3 >= 0 && noteVerbal3 <= 100) {
            this.c3.noteVerbal = noteVerbal3;
        }
        if (noteWritten1 >= 0 && noteWritten1 <= 100) {
            this.c1.noteWritten = noteWritten1;
        }
        if (noteWritten2 >= 0 && noteWritten2 <= 100) {
            this.c2.noteWritten = noteWritten2;
        }
        if (noteWritten3 >= 0 && noteWritten3 <= 100) {
            this.c3.noteVerbal = noteWritten3;
        }
    }
    void isPass(){
        this.average = ((this.c1.noteVerbal*0.80) + (this.c1.noteWritten*0.20)
                + (this.c2.noteVerbal*0.70) + (this.c2.noteWritten*0.30)
                + (this.c3.noteVerbal*0.50) + (this.c3.noteWritten*0.50))/3;
        if(this.average > 55){
            System.out.println("Sınıfı Geçtiniz.");
            this.isPass=true;
        }else{
            System.out.println("Sınıfta Kaldınız");
            this.isPass=false;
        }
        printNote();
    }

    void printNote(){

            System.out.println(this.c1.name + "Notu :" + ((this.c1.noteVerbal*0.80) + (this.c1.noteWritten*0.20)));
            System.out.println(this.c2.name + "Notu :" + ((this.c2.noteVerbal*0.80) + (this.c2.noteWritten*0.20)));
            System.out.println(this.c3.name + "Notu :" + ((this.c3.noteVerbal*0.80) + (this.c3.noteWritten*0.20)));
            System.out.println("-------------------------");
        }
}
