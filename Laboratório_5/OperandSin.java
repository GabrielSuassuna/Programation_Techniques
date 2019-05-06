import java.lang.Math;
class OperandSin extends OperandDecorator {
    OperandSin(double value){
        super(value);
    }

    double operation(){
		return Math.sin(this.getValue());
	}
}