import java.util.List;
import java.util.ArrayList;
class Operator extends Expression implements Observable{
	private List<Observer> observers = new ArrayList<Observer>();
	private char op;
	private Expression right, left;

	Operator(Expression left, char op, Expression right){
		this.op = op;
		this.right = right;
		this.left = left;
	}

	double operation(){
		if(this.op == '*'){
			double result;
			result = left.operation() * right.operation();
			this.notifyObservers(result);
			return result;
		}
		else{
			double result;
			result = left.operation() / right.operation();
			this.notifyObservers(result);
			return result;
		}
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers(double result) {
		for (Observer ob : observers) {
			ob.update(result);
		}
	}

	Expression[] getChild(int i){return null;}
	void add(Expression e){}
	void remove(Expression e){}
}