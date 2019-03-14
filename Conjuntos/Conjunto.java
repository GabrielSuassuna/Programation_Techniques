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

    boolean checkSubSet (int set[]){
        if (set.length > this.elements.length){
            return false;
        } else {
            for (int i : set) {
                for (int j : this.elements) {
                    if (i != j) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    void teste (){
        System.out.println(this.position);
        for (int i : this.elements){
            System.out.println(i);
        }
    }

}