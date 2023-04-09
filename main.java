public class main {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher("Ali Tatar", "123132", "MAT");
        t1.printTeacher();

        Course mat = new Course("Matematik", "101", "MAT");
        mat.addTeacher(t1);
        mat.showTeacher(t1);


        Teacher t2 = new Teacher("Esra Yılmaz", "123456", "FZK");
        t2.printTeacher();

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        fizik.showTeacher(t2);

        
        Teacher t3 = new Teacher("Ayşe Korkmaz", "123456", "TRH");
        t3.printTeacher();

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t3);
        tarih.showTeacher(t3);

        Student std1 = new Student("Melih", "436", mat, fizik, tarih);
        std1.sinavAndSozlu(100, 40, 30, 30, 30, 30);
        std1.calculateAverage();
        std1.printStudent();
        std1.isPass();
        
        
    }
}
