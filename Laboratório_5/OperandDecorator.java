abstract class OperandDecorator extends Expression{
    private double value;

	OperandDecorator(double value){
		this.value = value;
	}

    abstract double operation();
    
    double getValue() {
        return this.value;
    }
}