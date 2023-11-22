public class RedheadDuck implements Quackable, QuackObservable{
    Observable observable;

    public RedheadDuck(){
        this.observable=new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Sharp Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
