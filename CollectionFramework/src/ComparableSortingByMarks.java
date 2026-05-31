import java.util.*;
public class ComparableSortingByMarks {
    static class Student implements Comparable<Student>{
        int marks;
        String name;

        Student(int marks,String name){
            this.marks=marks;
            this.name=name;
        }

        public int compareTo(Student other){
            return this.marks - other.marks;
        }

    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(12, "Rahul"));
        list.add(new Student(11, "Ravi"));
        list.add(new Student(31,"Rashmi"));

        Collections.sort(list);

        for(Student ele:list){
            System.out.println(ele.marks +" "+ ele.name);
        }


    }
}
