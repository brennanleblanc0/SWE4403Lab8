package ca.brennanleblanc.SWE4403Lab8.E02;

public class FactSegment extends Segment {
    @Override
    public void accept(Visitor v) {
        v.visitFactSegment(this);
    }
}
