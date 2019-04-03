class Teste {
    public static void main(String args[]){
        Quadrado q1 = new Quadrado(3);
        Quadrado q2 = new Quadrado(4);
        
        Circulo c1 = new Circulo(1);
        Circulo c2 = new Circulo(2);

        double area;
        //Q1
        area = q1.calcularArea();
        q1.desenhar();
        q1.mover(1, 2);
        q1.colorir("Vermelho");
        q1.desenhar();
        System.out.println("Mover x: " + q1.getEixoX() + " Mover y: " + q1.getEixoY());
        System.out.println(area);
        
        //Q2
        area = q2.calcularArea();
        q2.desenhar();
        q2.mover(3, 2);
        System.out.println("Mover x: " + q2.getEixoX() + " Mover y: " + q2.getEixoY());
        System.out.println(area);
        
        //C1
        area = c1.calcularArea();
        c1.desenhar();
        c1.mover(1, 2);
        System.out.println("Mover x: " + c1.getEixoX() + " Mover y: " + c1.getEixoY());
        System.out.println(area);
        
        //C2
        area = c2.calcularArea();
        c2.desenhar();
        c2.mover(1, 2);
        System.out.println("Mover x: " + c2.getEixoX() + " Mover y: " + c2.getEixoY());
        System.out.println(area);
    }
}