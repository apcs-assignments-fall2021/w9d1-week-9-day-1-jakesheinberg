public class country {

    private int population;
    private String name;


public country(int p, String n){
    population=p;
    name=n;
}

    public int getPopulation() {
        return population;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void increasePop(int x){
        this.population+=x;
    }

    public void decreasePop(int x){
    this.population-=x;
    }
}

