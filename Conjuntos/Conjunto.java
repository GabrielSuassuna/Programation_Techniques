class Conjunto {
    int position;
    int elements[];
    
    Conjunto (int size) {
        this.elements = new int[size];
        this.position = 0;
    }

    void insertElement (int element) {
        if (!checkElement(element)){
            this.elements[position++] = element;
        }
    }

    boolean checkElement (int element) {
        int counter = this.position;
        boolean belongsTo = false;
        while (!belongsTo && counter >= 0) {
            if (element == this.elements[counter]){
                belongsTo = true;
                return belongsTo;
            } else {
                counter--;
            }
        }
        return belongsTo;
    }

    boolean checkSubSet (Conjunto set){
        int counterSet = this.position;
        int counterOtherSet = set.getPosition();
        int counter = -1    ;
        int setElements[] = set.getSet(); 
        if (setElements.length > this.elements.length){
            return false;
        } else {
            while (counterOtherSet >= 0){
                while (counterSet >= 0){
                    if (setElements[counterOtherSet] == this.elements[counterSet]) {
                        counter++;
                    }
                    counterSet--;
                }
                counterOtherSet--;
                counterSet = set.getPosition();
            }
        }
        if (counter == set.getPosition()){
            return true;
        } else{
            return false;
        }
    }

    void setUnion (Conjunto set) {
    }

    int getPosition (){
        return this.position;
    }

    int[] getSet (){
        return this.elements;
    }

    void teste (){
        System.out.println(this.position);
        for (int i : this.elements){
            System.out.println(i);
        }
    }

}