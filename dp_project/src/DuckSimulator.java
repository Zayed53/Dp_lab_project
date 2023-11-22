public class DuckSimulator {
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createADuck("MallardDuck");
        Quackable redheadDuck = duckFactory.createADuck("RedheadDuck");
        Quackable duckCall = duckFactory.createADuck("DuckCall");
        Quackable rubberDuck =duckFactory.createADuck("RubberDuck");
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);


        Flock flockOfMallards = new Flock();

        Quackable mallardOne =duckFactory.createADuck("MallardDuck");
        Quackable mallardTwo = duckFactory.createADuck("MallardDuck");
        Quackable mallardThree = duckFactory.createADuck("MallardDuck");
        Quackable mallardFour = duckFactory.createADuck("MallardDuck");
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        flockOfDucks.add(flockOfMallards);
        System.out.println("\nDuck Simulator");

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);


        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " +QuackCounter.numberOfQuack() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
