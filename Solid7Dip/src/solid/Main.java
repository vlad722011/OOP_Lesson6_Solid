package solid;

import solid.dip.PrintReport;
import solid.dip.Report;
import solid.dip.ViewReport;

public class Main {
    public static void main(String[] args) {
        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
    }
}
