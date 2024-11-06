//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     MyClass myClass1 = new MyClass("Baiel" , "Karybaev",19,"KFC");
     MyClass myClass2 = new MyClass("Kanchoro" ,21,new String[]{"oop","method","loop"});

        System.out.println(myClass1.getInfoFirstUser());
        System.out.println("----===----===----\n");
        System.out.println(myClass2.getInfoSecondUser());
    }
}