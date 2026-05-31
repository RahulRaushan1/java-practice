import java.util.*;
class Student implements Comparable<Student>{
    int marks;
    String name;

    Student(int marks,String name){
        this.marks=marks;
        this.name=name;
    }

    public int compareTo(Student other){
        return this.name.compareTo(other.name) ;
    }


}
public class ComparableSortingByName{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(12,"Rahul"));
        list.add(new Student(113,"Raju"));
        list.add(new Student(32,"Ravi"));
        Collections.sort(list);

        for(Student ele: list){
            System.out.println(ele.marks + " " + ele.name);
        }

    }
}