import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner si =new Scanner(System.in);
        Scanner ss= new Scanner(System.in);
        Scanner sf=new Scanner(System.in);
        List<Students> studentsList = new ArrayList<>();
        List<Subjects> subjectsList=new ArrayList<>();
        List<Marks> markss=new ArrayList<>();
        List<Fees> feesList=new ArrayList<>();

        System.out.println("number of Students");
        int stu= si.nextInt();

        for (int i = 1; i <= stu ; i++) {
            Students st =new Students();
            System.out.println("roolno");   st.setRollNo(ss.nextLine());
            System.out.println("name");     st.setName(ss.nextLine());
            System.out.println("branch");   st.setBranch(ss.nextLine());
            System.out.println("year");     st.setYear(ss.nextLine());
            Fees fees=new Fees();
            System.out.println("fees");    fees.setFee(sf.nextFloat());
            System.out.println("fee Date");    fees.setDate(ss.nextLine());
            feesList.add(fees);
            studentsList.add(st);
        }
        System.out.println("number of subjects");
        int sub= si.nextInt();
        for (int i = 1; i <= sub ; i++) {
            Subjects su = new Subjects();
            System.out.print("Subject id : "); su.setSubjectNo(ss.nextLine());
            System.out.print("Subject Name : "); su.setSubjectName(ss.nextLine());
            subjectsList.add(su);
        }
        for(Students students: studentsList) {
            System.out.println("roolno : " + students.getRollNo() + " name : " + students.getName() + " branch : " + students.getBranch() + " year : " + students.getYear());

            for (Subjects subjects : subjectsList) {
                Marks marks = new Marks();
                System.out.println(subjects + "marks");
                marks.setMarks(si.nextInt());
                markss.add(marks);
                subjects.setMarksList(markss);
            }
        }
        for(Students students: studentsList)
        {
            System.out.println("roolno : "+students.getRollNo()+" name : "+ students.getName()+ " branch : "+ students.getBranch()+" year : "+ students.getYear());
            for(Fees fees: feesList)
            {
                if(studentsList.indexOf(students)==feesList.indexOf(fees))
                System.out.println("roolno : "+students.getRollNo()+" fee : "+ fees.getFee()+" date : "+ fees.getDate());
            }

            for (Subjects subjects : subjectsList) {

                    System.out.print("subject " + subjects.getSubjectName());
                    for(Marks marks: markss){
                        System.out.print(" marks"+ marks.getMarks()+"/n");
                    }

            }




        }
//        studentsList.forEach(s -> {
//            subjectsList.forEach(a ->{
//
//            });
//        });

    }
}
