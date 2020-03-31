public class CreditCalcSrevice {
    public float calculate(long payment, float ypercent, int time) {
        float mpercent = ypercent/100/12;
        float i1 = 1 + mpercent;
        float i2 = (float) Math.pow(i1, time) - 1;
        float i3 = mpercent + mpercent/i2;
        return payment * i3;

    }
}
