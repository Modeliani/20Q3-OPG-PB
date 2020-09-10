package pkg20q3.opg.pb.article.model;

public class Staff extends Person {
    private Function function;

    public Staff(String name, String residence, Function function) {
        super(name, residence);
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Staff{" + "function=" + function + ", name='" + name + '\'' + ", residence='" + residence + '\'' + '}';
    }
}
