package VisitorPattern.Visitor;

import VisitorPattern.Element.LiqourElement;
import VisitorPattern.Element.NecessityElement;
import VisitorPattern.Element.TobaccoElement;

/**
 * Created by Ado on 2018-01-05.
 */
public interface Visitor {

    public double visit(LiqourElement liqourElementItem);
    public double visit(TobaccoElement tobaccoItem);
    public double visit(NecessityElement necessityItem);

}
