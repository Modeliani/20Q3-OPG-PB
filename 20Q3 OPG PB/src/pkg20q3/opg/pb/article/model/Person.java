package pkg20q3.opg.pb.article.model;

public class Person {
    protected String name;
    protected String residence;

    public Person(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", residence=" + residence + '}';
    }
}
