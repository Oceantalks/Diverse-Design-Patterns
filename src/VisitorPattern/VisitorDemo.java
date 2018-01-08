package VisitorPattern;

import VisitorPattern.Element.LiqourElement;
import VisitorPattern.Element.NecessityElement;
import VisitorPattern.Element.TobaccoElement;
import VisitorPattern.Visitor.TaxVisitor;

/**
 * Created by Ado on 2018-01-05.
 */
public class VisitorDemo {

    public static void main(String[] args) {
        TaxVisitor calc = new TaxVisitor();

        NecessityElement milk = new NecessityElement(14.89);
        LiqourElement gin = new LiqourElement(189.90);
        TobaccoElement cigar = new TobaccoElement(239.00);

        System.out.println(milk.accept(calc) + "\n");
        System.out.println(gin.accept(calc) + "\n");
        System.out.println(cigar.accept(calc) + "\n");
    }

}
