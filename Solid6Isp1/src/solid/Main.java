package solid;

import solid.isp.InternetPaymentService;
import solid.isp.TerminalPaymentService;

public class Main {
    public static void main(String[] args) throws Exception {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payCreditCard(10);
        internetService.payPhoneNumber(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
    }
}
