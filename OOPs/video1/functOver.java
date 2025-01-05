package OOPs.video1;

class Student{
    String name;
    int age;
    public void kid(){
        System.out.println("NO args");
        System.out.println(this.name+ " "+ this.age);
    }
    public void kid(String name, int age){
        System.out.println("2 Agruments ");
        System.out.print(name +" ");
        System.out.println(age);
    }
//copy function
    Student(Student s1 ){
        this.name=s1.name;
        this.age=s1.age;
    }

    Student (){

    }

//Function overload.....function name same ho sakte hai par arguments alag hone
    public void std(String name){
        System.out.println(name);
    }
    public void std(int age){
        System.out.println(age);
    }
    public void std(String name,int age){
        System.out.println(name + " "+ age);
    }


}
public class functOver {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="pipi";
        s1.age=44;
        s1.kid();
        s1.kid("suvv",22);

        Student s2=new Student();
        System.out.println();
        s2.name="sggfsji";
        s2.age=44;
        s2.kid();
        s2.kid("gddg",22);

        Student s3=new Student(s2);
        System.out.println();
        s3.kid();
        s3.kid("sambar",15);

    }
}
