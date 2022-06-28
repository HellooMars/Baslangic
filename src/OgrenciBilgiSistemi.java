public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","90505");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Kül Yutmaz","BIO","0022");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);



        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50,45,55,77);
        s1.isPass();

        Student s2 = new Student("Ayşe", "128", "3",tarih,fizik,biyo);
        s2.addBulkExamNote(88,33,94,44,22,88);
        s2.isPass();


    }
}
