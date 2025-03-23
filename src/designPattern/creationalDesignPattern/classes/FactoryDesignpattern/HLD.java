package designPattern.creationalDesignPattern.classes.FactoryDesignpattern;

public class HLD extends  Course{
    @Override
    protected void createCource() {
        modules.add(new ExcerciseModule());
        modules.add(new IntroModule());
    }
}
