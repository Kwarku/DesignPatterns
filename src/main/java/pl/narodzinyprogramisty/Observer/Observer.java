package pl.narodzinyprogramisty.Observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
