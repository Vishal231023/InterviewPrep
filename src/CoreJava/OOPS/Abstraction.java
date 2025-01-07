package CoreJava.OOPS;

public interface Abstraction {
    public static void main(String[] args) {
        ATM atm = new MyATM();
        atm.checkBalance();
        atm.withdrawMoney();
        ATM iciciAtm = new ICICI();
        iciciAtm.withdrawMoney();
        iciciAtm.checkBalance();

    }
}
abstract class ATM{
    abstract void withdrawMoney();
    abstract void checkBalance();
}

class MyATM extends ATM{

    @Override
    void withdrawMoney() {
        System.out.println("Money Withdrawan from ATM");
    }

    @Override
    void checkBalance() {
        System.out.println("Balance checked from ATM");
    }
}
class ICICI extends ATM{

    @Override
    void withdrawMoney() {
        System.out.println("Money Withdrawan from ICICI");
    }

    @Override
    void checkBalance() {
        System.out.println("Balance checked from ICICI");
    }
}
