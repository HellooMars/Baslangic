public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double noteVerbal;
    double noteWritten;

    Course(String name,String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int noteVerbal = 0;
        int noteWritten = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
        this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }

    }

    void printTeacher(){
        this.teacher.print();

    }

}