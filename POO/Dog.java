public class Dog{
  //Properties or attributes
  String color;
  String eyeColor;
  Double height;
  Double length;
  Double weight;

  //Methods o behaviors

    public String sit(){
      return "estoy sentado";
    }
    //System.out.println("Estoy sentado");


  public void bark(){
    System.out.println("wauff wauff wauff");
  }
  public void layDown(String name){
    System.out.println(name + " Estoy recostado");
  }
  public void eat(){
    System.out.println("I am eating ");
  }
  public void sleep(){
    System.out.println("zzzzzZZZZ");
  }


}
