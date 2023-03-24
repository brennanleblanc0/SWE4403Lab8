package ca.brennanleblanc.SWE4403Lab8.E02;

public class ReduceNoiseVisitor implements Visitor {
    @Override
    public void visitFactSegment(FactSegment fs) {
        System.out.println("Reducing noise on FactSegment");
    }

    @Override
    public void visitFormatSegment(FormatSegment fs) {
        System.out.println("Reducing noise on FormatSegment");
    }
}
