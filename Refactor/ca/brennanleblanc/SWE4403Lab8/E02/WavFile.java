package ca.brennanleblanc.SWE4403Lab8.E02;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    public static WavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        var wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());

        return wavFile;
    }

    public void filter(int operation) {
        Visitor v;
        switch (operation) {
            case 0:
                v = new ReduceNoiseVisitor();
                break;
            case 1:
                v = new AddReverbVisitor();
                break;
            case 2:
                v = new NormalizeVisitor();
                break;
            default:
                return;
        }
        
        for (var segment : segments) {
            segment.accept(v);
        }
    }
}
