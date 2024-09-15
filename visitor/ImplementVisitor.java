public class ImplementVisitor implements visitor{
    @Override public double getCostToHpPavillion(HpPavillion hp){
        return hp.cost;
    }
    @Override public double getCostToDellXps(DellXps dell){
        return dell.cost;
    }
    @Override public double getPriceToHpPavillion(HpPavillion hp){
        return hp.price;
    }
    @Override public double getPriceToDellXps(DellXps dell){
        return dell.price;
    }
}
