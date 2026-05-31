import java.util.*;
class Student1 implements Comparable<Student1>{
    int marks;
    String name;

    Student1(int marks,String name){
        this.marks=marks;
        this.name=name;
    }

    public int compareTo(Student1 other){
        return this.marks - other.marks;
    }

}

public class ComparableSortingByMarks {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(12, "Rahul"));
        list.add(new Student1(11, "Ravi"));
        list.add(new Student1(31,"Rashmi"));

        Collections.sort(list);

        for(Student1 ele:list){
            System.out.println(ele.marks +" "+ ele.name);
        }


    }
}
