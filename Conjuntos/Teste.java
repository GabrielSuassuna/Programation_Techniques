class Teste {
    public static void main(String[] args) {
        Conjunto c1, c2;
        c1 = new Conjunto(5);
        c2 = new Conjunto(5);
        c1.insertElement(1);
        c1.insertElement(2);
        c1.insertElement(3);
        c1.insertElement(4);
        c1.insertElement(5);
        c2.insertElement(6);
        c2.insertElement(7);
        c2.insertElement(8);
        c2.insertElement(9);
        c2.insertElement(10);
        c1.setUnion(c2);
        c1.teste();
    }
}