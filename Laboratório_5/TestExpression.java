class TesteExpression{
	public static void main(String arg[]){
		Observer ob1 = new Observer("Valor maior que zero", 1);
		Observer ob2 = new Observer("Valor menor ou igual a zero", 2);
		Operator exp1 = new Operator(new Operand(4), '*', new Operand(5));
		Operator exp2 = new Operator(exp1, '/', new Operand(6));
		Operator exp3 = new Operator(exp2, '*', new OperandSin(7));
		exp3.registerObserver(ob1);
		exp3.registerObserver(ob2);

		System.out.println(exp3.operation());
	}
}