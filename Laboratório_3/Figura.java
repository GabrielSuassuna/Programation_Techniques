abstract class Figura {
    String tipo;
    float dx, dy;
    boolean colorido;

    Figura(String tipo){
        this.tipo = tipo;
        this.dx = 0;
        this.dy = 0;
        this.colorido = false;
    }

    void desenhar() {
        System.out.println(this);
    }

    public String toString() {
        return this.tipo;
    }
    void mover(float dx, float dy){
        this.dx += dx;
        this.dy += dy;
    }

    abstract double calcularArea();

    float getEixoX(){
        return this.dx;
    }

    float getEixoY(){
        return this.dy;
    }

    float ehColorido(){
        return this.colorido;
    }
}