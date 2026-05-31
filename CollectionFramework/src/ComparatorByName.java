import java.util.*;

public class ComparatorByName {

    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

//        @Override
//        public String toString() {
//            return name + " - " + marks;
//        }
    }

    static class StudentNameComparator implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }
    static class StudentMarksComparator implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.marks - s2.marks;
        }
    }


    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Rohit", 85));
        list.add(new Student("Aditya", 95));
        list.add(new Student("Karan", 75));

        System.out.println("Before Sorting:");
        for(Student ele: list){
            System.out.println(ele.marks + " " + ele.name);
        }

        list.sort(new StudentNameComparator());
        //Collections.sort(list,new StudentNameComparator());

        System.out.println("After Sorting By Name:");
        for(Student ele: list){
            System.out.println(ele.marks + " " + ele.name);
        }

        //Collections.sort(list, new StudentMarksComparator());
        list.sort(new StudentMarksComparator());



        System.out.println("After Sorting By Marks:");
        for(Student ele: list){
            System.out.println(ele.marks + " " + ele.name);
        }

    }
}