import java.lang.Math;
class OperandCos extends OperandDecorator {
    OperandCos(double value){
        super(value);
    }

    double operation(){
		return Math.cos(this.getValue());
	}
}