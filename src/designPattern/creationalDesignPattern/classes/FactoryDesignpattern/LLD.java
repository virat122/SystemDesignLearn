package designPattern.creationalDesignPattern.classes.FactoryDesignpattern;

public class LLD extends Course{
    @Override
    protected void createCource() {
        modules.add(new IntroModule());
        modules.add(new ExamModule());
    }
}
