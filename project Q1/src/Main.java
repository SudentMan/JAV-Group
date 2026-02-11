public static void main(String[] args) {
    Expo exp = new Expo(7, 1);
    exp.printValue();
    Sine s = new Sine(7, Math.PI/4);
    s.printValue();
    Cosine cs = new Cosine(7, 1);
    cs.printValue();

    System.out.println("\n---ADDITION---");
    Taylor[] taylorArr = new Taylor[3];
    taylorArr[0] = new Expo(7, 1);
    taylorArr[1] = new Sine(7, Math.PI/4);
    taylorArr[2] = new Cosine(7, 1);
    for (Taylor t : taylorArr) {
        t.printValue();
    }

}