class Teste {
    public static void main(String[] args) {
        Conjunto c1, c2;
        c1 = new Conjunto(10);
        c2 = new Conjunto(10);
        c1.insertElement(239);
        c1.insertElement(39);
        c1.insertElement(12);
        c1.insertElement(2349);
        c1.insertElement(29);
        c2.insertElement(39);
        c2.insertElement(12);
        c2.insertElement(2349);
        c2.insertElement(29);
        if (c1.checkSubSet(c2)){
            System.out.println("c2 é subconjunto de c1");
        }
        if (!c2.checkSubSet(c1)){
            System.out.println("c1 não é subconjunto de c2");
        }
    }
}