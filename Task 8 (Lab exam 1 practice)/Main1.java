import java.util.Scanner;
class Course{
    String courseName;
    String[] name = new String[100];
    double[] marks = new double[100];
    int count = 0;
    Course(String courseName){
        this.courseName = courseName;
    }
    void addStudent(String name, double marks){
        this.name[count] = name;
        this.marks[count] = marks;
        count++;
    }
    void getHighestScore(){
        int index = 0;

        for(int i = 0; i < count;++i){
            if(marks[i] > marks[index]){
                index = i;
            }
        }
        System.out.println("Highest Score: " + name[index]);
    }
    void countTopGrade(double threshold){
        int total = 0;
        for(int i = 0; i < count; ++i){
            if(marks[i] >=threshold){
                total++;
            }
        }
        System.out.println("Number if A+:" + total);
    }

}
class Main1{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        String courseName = sc.next();
        Course course = new Course(courseName);

        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            String name = sc.next();
            double marks = sc.nextDouble();
            course.addStudent(name, marks);
        }
        course.getHighestScore();
        double th = sc.nextDouble();
        course.countTopGrade(th);
    }
}
