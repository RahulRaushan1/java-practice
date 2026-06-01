public class ObjectClassDemo {
    static class Student{
       int age;
       String name;

       Student(int age,String name){
           this.age=age;
           this.name=name;
       }

       public String toString(){
           return name + " "+age;
       }
    }
    public static void main(String[] args) {
        Student s = new Student(22,"Rahul");
        Student s1 = new Student(23,"Ravi");
        System.out.println(s1  +"  "+ s);
    }
}
