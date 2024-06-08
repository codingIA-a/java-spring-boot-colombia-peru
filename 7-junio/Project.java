public class Project{
    String name;
    String description;
    double initialCost;

    public double getInitialCost() {
        return initialCost;
    }
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }
    public Project() {
    }
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //método elevatorPitch
    public String elevatorPitch(){
        return  name + " ("+ initialCost + " ):" + description ;
    }
}