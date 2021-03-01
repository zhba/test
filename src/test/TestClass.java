package test;

public class TestClass {

    private String name;

    public TestClass (){
        System.out.println("Class object created!");
    }

    public void hello(){
        System.out.printf("Hello has been called!");
        name = "Hello";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
