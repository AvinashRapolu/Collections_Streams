public class Fees
{
    private float fee;
    private String date;

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Fees{" +
                "fee=" + fee +
                ", date='" + date + '\'' +
                '}';
    }
}
