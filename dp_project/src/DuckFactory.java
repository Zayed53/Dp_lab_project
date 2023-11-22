public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
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
