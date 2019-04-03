class Circulo extends Figura{
    double raio;

    Circulo(double raio){
        super("Circulo");
        this.raio = raio;
    }

    double calcularArea() {
        return this.raio*this.raio*3.14159265359;
    }
}