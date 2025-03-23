package designPattern.creationalDesignPattern.classes.FactoryDesignpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected List<Module>modules=new ArrayList<>();
    
    public Course(){
        this.createCource();
    }

    protected abstract void createCource();

}
