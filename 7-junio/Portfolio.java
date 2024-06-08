import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio(){
        projects = new ArrayList<>();
    }
    

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    //método para agregar un proyecto
    public void addProject(Project project){
        projects.add(project);
    }
    //Método para calcular el costo total del portafolio
    public double getPortfolioCost(){
        double totalCost = 0.0;
        for(Project project: projects){
            totalCost += project.getInitialCost();
        }
        return totalCost;
    }
    //método para mostrar todos los proyectos y el costo
    public void showPortfolio(){
        for(Project project : projects){
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Costo total: " + getPortfolioCost());
    }


}
