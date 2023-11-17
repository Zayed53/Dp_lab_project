public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    public void createADuck(String duck){
        if(duck=="MallardDuck"){
            createDuckCall();
        }else if(duck=="RubberDuck"){
            createRubberDuck();
        }else if(duck=="DuckCall"){
            createDuckCall();
        }else{
            System.out.println("No such duck");
        }
    }
}
