class TesteExpression{
	public static void main(String arg[]){
		Operator exp1 = new Operator(new Operand(4), '*', new Operand(5));
        Operator exp2 = new Operator(exp1, '/', new Operand(6));
        Operator exp3 = new Operator(new OperandCos(2), '*', new OperandSin(7));

		System.out.println(exp3.operation());
	}
}