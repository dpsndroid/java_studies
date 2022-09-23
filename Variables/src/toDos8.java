import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> myTest = new ArrayList<String>();
    myTest.add("Porsche");
    myTest.add("Lamborghini");
    myTest.add("Ferrari");
    myTest.add("fusca");
    System.out.println(myTest);
    System.out.println(myTest.indexOf("fusca"));
    myTest.remove("fusca");
    System.out.println(myTest);
  }
  
}