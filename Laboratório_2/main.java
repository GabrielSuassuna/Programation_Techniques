class main{
    public static void main(String args[]){
        Object[] list1 = new Object[50];
        Object[] list2 = {1,2,3,4,5,6,7,8,9,10};
        Object[] list3 = {2,4,6,8,10};
        Object[] list4 = {1,3,5,7,9};
        Object[] list5 = {1,2,3,5,7,11,13,17,19,23};

        for (int i = 0; i < 50; i++){
            list1[i] = i;
        }
        
        Conjunto universe = new Conjunto(list1);
        Conjunto naturais10 = new Conjunto(list2);//1
        Conjunto pares5 = new Conjunto(list3);//2
        Conjunto impares5 = new Conjunto(list4);//3
        Conjunto primos10 = new Conjunto(list5);//4
        Conjunto uniao;
        Conjunto intersecao;
        Conjunto diferenca;
        Conjunto complementoA;
        Conjunto complementoB;
        Conjunto uniaoComplemento;
        Conjunto intersecaoComplemento;
        Conjunto complementoUniao;
        Conjunto complementoIntersecao;

        System.out.println(primos10.subconjunto(primos10));
        System.out.println(naturais10.buscaElements(pares5));
        System.out.println(naturais10.buscaElements(impares5));
        System.out.println(naturais10.buscaElements(primos10));
        uniao = pares5.uniao(impares5);
        System.out.println(naturais10.subconjunto(uniao));
        intersecao = naturais10.intersecao(pares5);
        System.out.println(intersecao.getTamanho());
        diferenca = naturais10.diferenca(pares5);
        System.out.println(diferenca.getTamanho());

        //Lei de Morgan
        complementoA = universe.diferenca(naturais10);
        complementoB = universe.diferenca(primos10);
        uniao = naturais10.uniao(primos10);
        intersecao = naturais10.intersecao(primos10);
        uniaoComplemento = complementoA.uniao(complementoB);
        intersecaoComplemento = complementoA.intersecao(complementoB);
        complementoUniao = universe.diferenca(uniao);
        complementoIntersecao = universe.diferenca(intersecao);
        System.out.println(uniaoComplemento.subconjunto(complementoIntersecao));
        System.out.println(intersecaoComplemento.subconjunto(complementoUniao));
    }
}