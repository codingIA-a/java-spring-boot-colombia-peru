public class TestProject {
    public static void main(String[] args){
        Project project1 = new Project();
        Project project2 = new Project("proyecto 2");
        Project project3 = new Project("proyecto3", "Este es el proyecto 3");

        project1.setName("proyecto 1");
        project1.setDescription("Este es el proyecto 1");
        project2.setDescription("Este es el proyecto 2");

        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
    }
}
