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

    public int numberOfQuack(){
        return quackCount;
    }
}
