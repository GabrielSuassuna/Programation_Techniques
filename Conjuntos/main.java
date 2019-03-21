class main{
    public static void main(String args[]){
        Object[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        Object[] arr2 = {1,2,3,4,5};
        //Object[] arr3 = {2,4,6,8,10};

        Conjunto dezNat = new Conjunto(arr1);
        Conjunto cincoNat = new Conjunto(arr2);
        //Conjunto cincoPar = new Conjunto(arr3);

        dezNat = dezNat.produtoCartesiano(cincoNat);
        for (int i = 0; i < 50; i++){
            System.out.println(dezNat.getElement(i));
        }
    }
}