import java.util.Scanner;

public class gradeaverage{
  public static void main(String [] args){
    String temp;
    Assignment assign1 = new Assignment();
    Assignment assign2 = new Assignment();
    Assignment assign3 = new Assignment();
    Scanner io = new Scanner(System.in);
    
    System.out.print("Enter assignment : ");
    assign1.name = io.nextLine();
    System.out.print("Enter grade : ");
    temp = io.nextLine();
    assign1.grade = Integer.parseInt(temp);
    
    System.out.print("Enter assignment : ");
    assign2.name = io.nextLine();
    System.out.print("Enter grade : ");
    temp = io.nextLine();
    assign2.grade = Integer.parseInt(temp);
    
    System.out.print("Enter assignment : ");
    assign3.name = io.nextLine();
    System.out.print("Enter grade : ");
    temp = io.nextLine();
    assign3.grade = Integer.parseInt(temp);
    
    int sum = assign1.grade + assign2.grade + assign3.grade;
    int average = sum/3;
    System.out.println("AVERAGE GRADE = " + average);
  }
}

class Assignment{
  public int grade;
  public String name;
}
