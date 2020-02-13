package DesignPattern.FactoryPattern.Practise1;

public class FurnitureFactory  {
    public FurnitureAbstractFactory getFactory(MaterialType materialType){
        switch (materialType){
            case WOOD:
            case PLASTIC:return new PlasticFactory();
            default: throw new NullPointerException("cannot create factory");
        }
    }

}
