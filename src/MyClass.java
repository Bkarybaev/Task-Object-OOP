import java.util.Arrays;

public class MyClass {
    String name;
    String surName;
    int age;
    String[] lessons;
    String food;

    public MyClass(String name, String surName, int age,String food) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.food = food;
    }

    public MyClass(String name, int age , String[] lessons){
        this.name = name;
        this.age = age;
        this.lessons = lessons;
    }

    public String getInfoFirstUser(){
        return String.format("""
                Name      : %s
                Sure Name : %s
                Age       : %d
                live Food : %s
                """,name,surName,age,food);
    }

    public String getInfoSecondUser(){
        return String.format("""
                Name      : %s
                Age       : %d
                Lessons   : %s
                """,name,age, Arrays.toString(lessons));
    }


}
