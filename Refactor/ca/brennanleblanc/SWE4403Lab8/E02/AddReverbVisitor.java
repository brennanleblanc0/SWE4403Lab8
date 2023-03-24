package ca.brennanleblanc.SWE4403Lab8.E02;

public class AddReverbVisitor implements Visitor {
    @Override
    public void visitFactSegment(FactSegment fs) {
        System.out.println("Adding reverb to FactSegment");
    }

    @Override
    public void visitFormatSegment(FormatSegment fs) {
        System.out.println("Adding reverb to FormatSegment");
    }
}
