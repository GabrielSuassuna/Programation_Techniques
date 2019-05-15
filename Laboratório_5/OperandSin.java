import java.lang.Math;
class OperandSin extends OperandDecorator {
    OperandSin(double value){
        super(value);
    }

    double operation(){
        this.setValue(Math.sin(this.getValue()));
		return this.getValue();
	}
}