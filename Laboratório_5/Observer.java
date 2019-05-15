public class Observer {
    String message;
    int rule;

    Observer(String message, int rule){
        this.rule = rule;
        this.message = message;
    }

    public void update(double result){
        if (rule == 1){
            if (result > 0){
                System.out.println(this.message);
            }
        } else {
            if (result <= 0){
                System.out.print(this.message);
            }
        }
    }
}