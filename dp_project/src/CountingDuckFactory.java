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

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createADuck(String duck){
        Quackable returnedduck=null;
        if(duck=="MallardDuck"){
            returnedduck=createMallardDuck();
        }else if(duck=="RubberDuck"){
            returnedduck=createRubberDuck();
        }else if(duck=="DuckCall"){
            returnedduck=createDuckCall();
        }else if(duck=="RedheadDuck"){
            returnedduck=createRedheadDuck();
        }else{
            returnedduck=createRedheadDuck();
        }
        return returnedduck;
    }
}
