public class Student {
    private String name;
    private String id;
    private String dept;
    public Student(String name,String id,String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Department : "+dept);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Abdullah Al Mahmud","221-15-5658","CSE");
        s1.display();
    }
}
