package ca.brennanleblanc.SWE4403Lab8.E02;

public class Demo {
    public static void main(String[] args) {
        WavFile wav = WavFile.read("file");

        wav.filter(0);
        wav.filter(1);
        wav.filter(2);
        wav.filter(3);
    }
}
