class Conjunto {
    int position;
    int elements[];
    
    Conjunto (int size) {
        this.elements = new int[size];
        this.position = 0;
    }

    void insertElement (int element) {
        int set[] = getSet();
        if (!checkElement(element)){
            set[position++] = element;
        }
    }

    boolean checkElement (int element) {
        int counter = this.getPosition();
        int set[] = this.getSet();
        boolean belongsTo = false;
        while (!belongsTo && counter >= 0) {
            if (element == set[counter]){
                belongsTo = true;
                return belongsTo;
            } else {
                counter--;
            }
        }
        return belongsTo;
    }

    boolean checkSubSet (Conjunto set){
        int counterSet = this.getPosition();
        int counterOtherSet = set.getPosition();
        int counter = -1;
        int set1[] = this.getSet();
        int set2[] = set.getSet();
        if (set2.length > this.getSet().length){
            return false;
        } else {
            while (counterOtherSet >= 0){
                while (counterSet >= 0){
                    if (set2[counterOtherSet] == set1[counterSet]) {
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

    void setUnion(Conjunto set) {
        Conjunto aux_set;
        aux_set = new Conjunto(this.getPosition() + set.getPosition());
        int set1[] = this.getSet();
        int set2[] = set.getSet();
        int counter = 0;

        while (counter < this.getPosition()) {
            aux_set.insertElement(set1[counter]);
            counter++;
        }
        
        counter = 0;
        
        while (counter < set.getPosition()) {
            aux_set.insertElement(set2[counter]);
            counter++;
        }

        this.elements = aux_set.getSet();
    }

    void setIntersection(){

    }

    int getPosition (){
        return this.position;
    }

    int[] getSet (){
        return this.elements;
    }

    void teste (){
        for (int i : this.elements){
            System.out.println(i);
        }
    }

}