package VisitorPattern.Element;

import VisitorPattern.Visitor.Visitor;

/**
 * Created by Ado on 2018-01-05.
 */
public interface Element {

    public double accept(Visitor visitor);

}
