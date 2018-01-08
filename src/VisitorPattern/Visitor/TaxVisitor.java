package VisitorPattern.Visitor;



import VisitorPattern.Element.LiqourElement;
import VisitorPattern.Element.NecessityElement;
import VisitorPattern.Element.TobaccoElement;

/**
 * Created by Ado on 2018-01-05.
 */
public class TaxVisitor implements Visitor {

    public TaxVisitor() {

    }


    public double visit(LiqourElement liqourItem) {
        System.out.println("Liqour item: Price with Tax");
        System.out.println("Tax: " + (liqourItem.getPrice() * .18) + " +" + " Item: " + liqourItem.getPrice());
        return (liqourItem.getPrice() * .18) + liqourItem.getPrice();
    }

    public double visit(TobaccoElement tobaccoItem) {
        System.out.println("Tobacco item: Price with Tax" + "\n");
        System.out.println("Tax: " + (tobaccoItem.getPrice() * .30) + " +" + " Item: " + tobaccoItem.getPrice());
        return (tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice();
    }

    public double visit(NecessityElement necessityItem) {
        System.out.println("Necessity item: Price with Tax");
        System.out.println("Tax: " + (necessityItem.getPrice() * .0) + " +" + " Item: " + necessityItem.getPrice());
        return (necessityItem.getPrice() * .0) + necessityItem.getPrice();
    }
}
