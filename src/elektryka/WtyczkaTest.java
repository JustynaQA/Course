package elektryka;

public class WtyczkaTest {
    public static void main(String[] args) {
        Gnazko gnazko = new Gnazko();
        WtyczkaDoLampki wtyczkaDoLampki = new WtyczkaDoLampki();
        WtyczlaDoLapusia wtyczlaDoLapusia = new WtyczlaDoLapusia();
        WtyczkaInna wtyczkaInna = new WtyczkaInna();

        gnazko.Wlacz(wtyczkaDoLampki);
        gnazko.Wlacz(wtyczlaDoLapusia);
//        gnazko.Wlacz(wtyczkaInna);
    }
}
