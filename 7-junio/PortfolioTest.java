public class PortfolioTest {
    public static void main(String[] args) {
        //crear proyectos
        Project project1 = new Project("Proyecto Alpha","Este es el Proyecto Alpha" , 100.0);
        Project project2 = new Project("Project Beta","Este es el Project Beta", 225.2);

        //crear portfolio para añadir proyectos
        Portfolio portfolio1 = new Portfolio();

        portfolio1.addProject(project1);
        portfolio1.addProject(project2);

        portfolio1.showPortfolio();
    }
}
