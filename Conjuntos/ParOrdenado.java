class ParOrdenado{
    Object element1;
    Object element2;

    ParOrdenado(Object element1, Object element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public String toString() {
        return "[" + this.element1 + "," + this.element2 + "]";
    }
}