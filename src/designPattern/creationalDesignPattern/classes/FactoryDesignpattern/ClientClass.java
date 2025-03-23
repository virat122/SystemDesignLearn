package designPattern.creationalDesignPattern.classes.FactoryDesignpattern;

public class ClientClass
{
    public static void main(String[] args) {
        Course hldcource=CourceFactory.getCource("HLD");
        Course lldCource=CourceFactory.getCource("LLD");

        assert hldcource!=null;
        System.out.println("hld moddules");
        System.out.println(hldcource.modules);

        assert lldCource!=null;
        System.out.println("lld moddules");
        System.out.println(lldCource.modules);
    }
}
