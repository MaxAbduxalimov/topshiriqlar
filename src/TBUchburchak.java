public class TBUchburchak {
    public TBUchburchak() {
    }

    public void perimetrVaYuza(int a, int b) {
        float P = (float) (a + b + Math.sqrt(a * a + b * b));
        float S = (a * b) / 2;
        System.out.println("P = " + P + "\nS = " + S);
    }

    public void perimetrVaYuza(long a, long b) {
        float P = (float) (a + b + Math.sqrt(a * a + b * b));
        float S = (a * b) / 2;
        System.out.println("P = " + P + "\nS = " + S);
    }

    public void perimetrVaYuza(float a, float b) {
        float P = (float) (a + b + Math.sqrt(a * a + b * b));
        float S = (a * b) / 2;
        System.out.println("P = " + P + "\nS = " + S);
    }

    public void perimetrVaYuza(double a, double b) {
        float P = (float) (a + b + Math.sqrt(a * a + b * b));
        float S = (float) ((a * b) / 2);
        System.out.println("P = " + P + "\nS = " + S);
    }

}
