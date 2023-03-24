package ca.brennanleblanc.SWE4403Lab8.E02;

public class NormalizeVisitor implements Visitor {
    @Override
    public void visitFactSegment(FactSegment fs) {
        System.out.println("Normalizing FactSegment");
    }

    @Override
    public void visitFormatSegment(FormatSegment fs) {
        System.out.println("Normalizing FormatSegment");
    }
}
