class Operand extends Expression{
	private double value;

	Operand(double value){
		this.value = value;
	}

	double operation(){
		return value;
	}
}