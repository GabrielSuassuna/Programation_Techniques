class Quadrado extends Figura implements Colorido{
    double lado;

    Quadrado(double lado){
        super("Quadrado");
        this.lado = lado;
    }

    double calcularArea() {
        return this.lado*this.lado;
    }

    public void colorir(String cor) {
        super.tipo = "Quadrado " + cor;
        super.colorido = true;
    }
}