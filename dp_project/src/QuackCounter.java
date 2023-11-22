public class QuackCounter implements Quackable{
    Quackable duck;

    public static int quackCount;

    public QuackCounter(Quackable duck){
        this.duck=duck;
    }
    @Override
    public void quack() {
        duck.quack();
        quackCount++;
    }

    public static int numberOfQuack(){
        return quackCount;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
