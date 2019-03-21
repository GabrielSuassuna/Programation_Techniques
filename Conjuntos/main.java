class main{
    public static void main(String args[]){
        Object[] arr1 = {1,2,3};
        //Object[] arr2 = {1,2,3,4,5};
        //Object[] arr3 = {2,4,6,8,10};

        Conjunto dezNat = new Conjunto(arr1);
        //Conjunto cincoNat = new Conjunto(arr2);
        Conjunto cincoPar = new Conjunto();
        Conjunto teste;

        cincoPar = dezNat.potencia();
        for (int i = 0; i < cincoPar.getTamanho(); i++){
            teste = (Conjunto)cincoPar.getElement(i);
            System.out.print("{");
            for (int in = 0; in < teste.getTamanho(); in++){
                System.out.print(teste.getElement(in));
            }
            System.out.println("}");
        }

        
    }
}