class Operator extends Expression{
	char op;
	Expression right, left;

	Operator(Expression left, char op, Expression right){
		this.op = op;
		this.right = right;
		this.left = left;
	}

	double operation(){
		if(this.op == '*'){
			return left.operation() * right.operation();
		}
		else{
			return left.operation() / right.operation();
		}
	}

	Expression[] getChild(int i){return null;}
	void add(Expression e){}
	void remove(Expression e){}


}