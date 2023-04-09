class Teacher{
    String name;
    String telno;
    String branch;

    Teacher(String name,String telno, String branch){
        this.name = name;
        this.telno = telno;
        this.branch = branch;
    }

    void printTeacher(){
        System.out.println("************************");
        System.out.println("Adı: "+this.name);
        System.out.println("Telno: "+this.telno);
        System.out.println("Branch: "+this.branch);
    }
}