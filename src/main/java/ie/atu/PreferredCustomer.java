package ie.atu;

public class PreferredCustomer extends Customer {

    private boolean zeroPercent;
    private boolean fivePercent;
    private boolean sixPercent;
    private boolean sevenPercent;
    private boolean tenPercent;

    public PreferredCustomer() {
    }

    public PreferredCustomer(String name, String address, String number, String customerNumber, boolean mailingList, boolean zeroPercent, boolean fivePercent, boolean sixPercent, boolean sevenPercent, boolean tenPercent) {
        super(name, address, number, customerNumber, mailingList);
        this.zeroPercent = zeroPercent;
        this.fivePercent = fivePercent;
        this.sixPercent = sixPercent;
        this.sevenPercent = sevenPercent;
        this.tenPercent = tenPercent;
    }

    public boolean isFivePercent() {
        return fivePercent;
    }

    public void setFivePercent(boolean fivePercent) {
        this.fivePercent = fivePercent;
    }

    public boolean isSixPercent() {
        return sixPercent;
    }

    public void setSixPercent(boolean sixPercent) {
        this.sixPercent = sixPercent;
    }

    public boolean isSevenPercent() {
        return sevenPercent;
    }

    public void setSevenPercent(boolean sevenPercent) {
        this.sevenPercent = sevenPercent;
    }

    public boolean isTenPercent() {
        return tenPercent;
    }

    public void setTenPercent(boolean tenPercent) {
        this.tenPercent = tenPercent;
    }

    public boolean isZeroPercent() {
        return zeroPercent;
    }

    public void setZeroPercent(boolean zeroPercent) {
        this.zeroPercent = zeroPercent;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ZeroPercent: " + zeroPercent + '\n' +
                "FivePercent: " + fivePercent + '\n' +
                "SixPercent: " + sixPercent + '\n' +
                "SevenPercent: " + sevenPercent + '\n' +
                "TenPercent: " + tenPercent + '\n';
    }
}
