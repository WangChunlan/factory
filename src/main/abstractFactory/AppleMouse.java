package main.abstractFactory;

public class AppleMouse implements IMouse {
    @Override
    public void createIMouse() {
        System.out.println("Apple Mouse");
    }
}
