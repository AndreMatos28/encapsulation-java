package system;

public class Bank {

    private String holder;
    private int number;
    private double deposit;


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getDeposit() {
        return deposit;
    }



    public Bank(String holder, int number, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        sumDeposit(initialDeposit);
    }

    public Bank(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public void sumDeposit(double deposit){
        this.deposit += deposit;
    }

    public void withdrawDeposit(double deposit){
        this.deposit -= deposit + 5;
    }

    @Override
    public String toString() {
        return "account "
                + number
                + ", "
                + "Holder: "
                + holder
                + ", "
                + "Balance: $"
                + " "
                + deposit                ;
    }
}
