package main.abstractFactory;

public class DellMouse implements IMouse {
    @Override
    public void createIMouse() {
        System.out.println("Dell mouse");
    }
}
