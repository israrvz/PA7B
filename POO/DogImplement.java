import javax.swing.JOptionPane;
public class DogImplement {
  public static void main(String[] args) {
    Dog fido = new Dog();
    fido.color="black";
    fido.eyeColor="blue";
    fido.height=.50d;
    fido.weight=.30d;

    Dog chilaquil =new Dog();
    chilaquil.color="brown";
    chilaquil.eyeColor="green";
    chilaquil.height=.78d;
    chilaquil.weight=25.0d;


JOptionPane.showMessageDialog(null,"FID 0 es color: "+fido.color);
fido.sit();
fido.layDown();
fido.sleep();

JOptionPane.showMessageDialog(null,"FID 0 es color: "+chilaquil.color);
  }
}
