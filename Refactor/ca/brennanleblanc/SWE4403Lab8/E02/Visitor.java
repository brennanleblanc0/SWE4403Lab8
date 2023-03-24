package ca.brennanleblanc.SWE4403Lab8.E02;

public interface Visitor {
    public void visitFactSegment(FactSegment fs);
    public void visitFormatSegment(FormatSegment fs);
}
