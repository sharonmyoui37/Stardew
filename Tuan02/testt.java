class testt {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.printf(Math.round(x * 100.0 / 1.609) / 100.0);
    }
}