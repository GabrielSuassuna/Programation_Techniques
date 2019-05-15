import java.lang.Math;
class OperandCos extends OperandDecorator {
    OperandCos(double value){
        super(value);
    }

    double operation(){
        this.setValue(Math.cos(this.getValue()));
		return this.getValue();
	}
}