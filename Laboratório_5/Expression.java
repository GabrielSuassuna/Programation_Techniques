abstract class Expression{
	abstract double operation();
	Expression[] getChild(int i){return null;}
	void add(Expression e){}
	void remove(Expression e){}
}
