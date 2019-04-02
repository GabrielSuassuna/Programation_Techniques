abstract class Figura {
    String tipo;
    float[] centro = new float[2];

    Figura(String tipo, float[] centro){
        this.tipo = tipo;
        this.centro = centro;
    }

    public String desenhar() {
        return "Sou um "+ this.tipo;
    }

    public void mover(float dx, float dy){
        float valor_x = this.centro[0];
        float valor_y = this.centro[1];
        this.centro[0] = valor_x + dx;
        this.centro[1] = valor_y + dy;
    }
}