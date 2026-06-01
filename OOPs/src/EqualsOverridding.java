public class EqualsOverridding {
    static class Student{
        int id;

        Student(int id){
            this.id =id;
        }

        public boolean equals(Object obj){
//            Student s= (Student) obj;
//            return this.id==s.id;
            return true;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);

        System.out.println(s1.equals(s2));// always return true because i override equals method
        System.out.println(s1.hashCode()==s2.hashCode());

    }
}
