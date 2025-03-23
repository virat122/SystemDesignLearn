package designPattern.creationalDesignPattern.classes.FactoryDesignpattern;

public class CourceFactory {
    public  static Course getCource(String courseType){
        switch(courseType) {
            case  "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default : {
                return null;
            }
        }
    }
}
