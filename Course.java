import java.net.SocketTimeoutException;

class Course{
    Teacher courseTeacher;
    String name;
    String code;    
    String prefix;
    double sinav;
    double sozlu;
    double finalNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }


    void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            t = this.courseTeacher;
            System.out.println("Öğretmen Eklendi");
        }
        else if(this.prefix!=t.branch){
            System.out.println(t.name+" Öğretmen bu derse eklenemez!!!");
        }
    }

    void showTeacher(Teacher t){
        System.out.println(t.name+"= "+this.name);
    }


    }
