import java.util.Scanner;;

public class GradeCalculator
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

System.out.println("Enter the number of subjects:");
int numSubjects=sc.nextInt();

int[] marks = new int[numSubjects];
int totalMarks=0;
for(int i=0; i<numSubjects; i++)
{
System.out.println("Enter marks of Subject" +(i+1));
marks[i] = sc.nextInt();
totalMarks +=marks[i];
}

double averagePercentage= (double) totalMarks/numSubjects;

String grade;
if(averagePercentage >=90){
grade = "A";
}
else if(averagePercentage >= 80)
{
grade = "B";
}
else if(averagePercentage >= 70)
{
grade = "C";
}
else if(averagePercentage >= 60)
{
grade = "D";
}
else if(averagePercentage >= 50)
{
grade = "E";
}
else 
{
grade = "F";
}

System.out.println("\nResults:");
System.out.println("TotalMarks:"+totalMarks);
System.out.printf("Average Percentage: %.2f%%\n",averagePercentage);
System.out.println("Grade:"+grade);

sc.close();
}
}


