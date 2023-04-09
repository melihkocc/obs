import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
public class Student {
    String name;
    String no;
    Course c1;
    Course c2;
    Course c3;


    Student(String name,String no,Course c1,Course c2,Course c3){
        this.name = name;
        this.no = no;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    void sinavAndSozlu(double sinav1, double sinav2, double sinav3, double sozlu1, double sozlu2, double sozlu3){
        if((c1.sinav<=100) && (c1.sinav>=0)){c1.sinav = sinav1;}
        if((c2.sinav<=100) && (c2.sinav>=0)){c2.sinav = sinav2;}
        if((c3.sinav<=100) && (c3.sinav>=0)){c3.sinav = sinav3;}
        if((c1.sozlu<=100) && (c1.sozlu>=0)){c1.sozlu = sozlu1;}
        if((c2.sozlu<=100) && (c2.sozlu>=0)){c2.sozlu = sozlu2;}
        if((c3.sozlu<=100) && (c3.sozlu>=0)){c3.sozlu = sozlu3;}
        c1.finalNote = (sinav1*0.8)+(sozlu1*0.2);
        c2.finalNote = (sinav2*0.8)+(sozlu2*0.2);
        c3.finalNote = (sinav3*0.8)+(sozlu3*0.2);
        if((c1.sinav>100) || (c2.sinav>100) || (c3.sinav>100) || (c1.sozlu>100) || (c2.sozlu>100) || (c3.sozlu>100) || (c1.sinav<0) || (c2.sinav<0) || (c3.sinav<0) || (c1.sozlu<0) || (c2.sozlu<0) || (c3.sozlu<0)){
            c1.finalNote = -1;
            c2.finalNote = -1;
            c3.finalNote = -1;
        }
    }

    double calculateAverage(){
        double average = (c1.finalNote+c2.finalNote+c3.finalNote)/3;
        return average;
    }

    void printStudent(){
        System.out.println("-----------------------------");
        System.out.println("Name: "+this.name);
        System.out.println("No: "+this.no);
        System.out.println(c1.name+" Notu: "+c1.finalNote);
        System.out.println(c2.name+" Notu: "+c2.finalNote);
        System.out.println(c3.name+" Notu: "+c3.finalNote);

    }

    void isPass(){
        if(calculateAverage()>=50){
            System.out.println("-----------------------------");
            System.out.println("Ortalamanız: "+calculateAverage());
            System.out.println("Sınıfı Geçtiniz...");
        }
        else if(calculateAverage()<50 && calculateAverage()>0){
            System.out.println("-----------------------------");
            System.out.println("Ortalamanız: "+calculateAverage());
            System.out.println("Sınıfta Kaldınız!!!");
        }
        else if(calculateAverage()==-1){
            System.out.println("-----------------------------");
            System.out.println("Geçersiz Değerler Girdiniz");
        }
        else{
            System.out.println("-----------------------------");
            System.out.println("Geçersiz Değerler Girdiniz!!!");
        }
    }

    

}
