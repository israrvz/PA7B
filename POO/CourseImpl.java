import javax.swing.JOptionPane;
public class CourseImpl{
  public static void main(String[] args) {

Course curso1 =new Course();
curso1.setCourseName("English");

curso1.addStudent("Israel Ramos");
curso1.addStudent("Maria");
curso1.addStudent("Lucero");

String [] studentDeIngles= curso1.getStudents();
String students ="";
for (int i = 0; i < curso1.getNumberOfStudents(); i ++){
students += studentDeIngles[i]+"\n";
}
JOptionPane.showMessageDialog(null, students);

Course curso2 = new Course();
curso2.setCourseName("Matematicas");

curso2.addStudent("Ismael");
curso2.addStudent("Diana");
curso2.addStudent("Daniel");

JOptionPane.showMessageDialog(null,
curso1.getCourseName());
JOptionPane.showMessageDialog(null,
curso2.getCourseName());
  }
}
