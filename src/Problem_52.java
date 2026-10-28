public class student {
    int id;
    String name;

    student(){
        this(0,"unknown");
    }

    student(int id){
        this(id,"unknown");
    }

    student(int id, String name){
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}

public class Problem_52 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student(10);
        student s3 = new student(11, "souren");

        s1.show();
        s2.show();
        s3.show();
    }
    
}