package hostels_fees;

public class fees_collection {
    private double fees;
    private double mess_fees;
    private double room_fees;
    private long reg_number;

    public double getRoom_fees() {
        return room_fees;
    }

    public void setReg_number(long reg_number) {
        this.reg_number = reg_number;
    }

    public long getReg_number() {
        return reg_number;
    }

    public void setRoom_fees(double room_fees) {
        this.room_fees = room_fees;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getMess_fees() {
        return mess_fees;
    }

    public void setMess_fees(double mess_fees) {
        this.mess_fees = mess_fees;
    }

    public long computing_total_fees() {
        fees = room_fees + mess_fees;
        return reg_number;
    }
}