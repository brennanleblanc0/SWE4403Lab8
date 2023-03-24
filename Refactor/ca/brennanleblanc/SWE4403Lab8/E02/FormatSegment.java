package ca.brennanleblanc.SWE4403Lab8.E02;

public class FormatSegment extends Segment {
    @Override
    public void accept(Visitor v) {
        v.visitFormatSegment(this);
    }
}
