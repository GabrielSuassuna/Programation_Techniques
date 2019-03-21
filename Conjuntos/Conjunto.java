class Conjunto{
    Object[] elements = {null};
    int position;

    Conjunto(Object[] elements){
        this.elements = elements;
        this.position = elements.length;
    }

    Conjunto(){
        this.position = 0;
    }

    int getTamanho(){
        // Retorna a cardinalidade do conjunto
        return this.position;
    }

    Object[] getElements(){
        // Retorna o array de elementsentos do conjunto
        return this.elements;
    }

    Object getElement(int index){
        // Retorna o elementsento de indice index do conjunto
        // Caso nao o encontre, retorna null

        if(index >= this.position) return null;
        return this.elements[index];
    }

    void tableDouble(){
        // Dobra o tamanho do array de elementsentos
        Object[] doubleArray = new Object[this.elements.length*2];
        for(int cont = 0; cont < this.elements.length; cont ++){
            doubleArray[cont] = this.elements[cont];
        }
        this.elements = doubleArray;
    }

    void tableHalve(){
        // Corta pela metade o array de elementsentos
        Object[] halveArray = new Object[this.elements.length/2];
        for(int cont = 0; cont < halveArray.length; cont ++){
            halveArray[cont] = this.elements[cont];
        }
        this.elements = halveArray;
    }

    void addElement(Object new_elements){
        // Adiciona um elementsento novo no conjunto caso este já não esteja no mesmo
        // Caso seja necessário, é feito o tableDoubling antes da adição 

        if (this.buscaElements(new_elements) == -1){
            if(this.position >= this.elements.length) this.tableDouble();
            
            this.elements[this.position] = new_elements;
            this.position += 1;
        }
        
    }

    int buscaElements(Object set){
        // Realiza a busca por um elementsento no conjunto
        // Caso ele esteja no conjunto, é retornado o índice do elementsento
        // Caso o elementsento não esteja no conjunto, retorna-se -1

        for(int cont = 0; cont < this.elements.length; cont ++){
            if(set.equals(this.elements[cont])) return cont;
        }
        return -1;
    }

    boolean subconjunto(Conjunto otherSet){
        for(int cont = 0; cont < this.position; cont++){
            if(otherSet.buscaElements(this.elements[cont]) == -1) return false;
        }
        return true;
    }

    Conjunto uniao(Conjunto otherSet){
        Conjunto set = new Conjunto(this.getElements());

        for(int cont = 0; cont < otherSet.getTamanho(); cont ++){
            set.addElement(otherSet.getElement(cont));
        }

        return set;
    }

    Conjunto intersecao(Conjunto otherSet){
        Conjunto set = new Conjunto();

        for(int cont = 0; cont < this.position; cont ++){
            Object auxSet = this.getElement(cont);
            if(otherSet.buscaElements(auxSet) != -1){
                set.addElement(auxSet);
            }
        }

        return set;
    }

    Conjunto produtoCartesiano(Conjunto otherSet){
        Conjunto set = new Conjunto();
        ParOrdenado parOrdenado;

        for(int cont = 0; cont < this.position; cont ++){
            for(int cont2 = 0; cont2 < otherSet.getTamanho(); cont2++){
                parOrdenado = new ParOrdenado(this.elements[cont], otherSet.getElement(cont2));
                set.addElement(parOrdenado);
            }
        }
        
        return set;
    }

}