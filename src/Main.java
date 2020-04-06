import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.dao.CompanyDAO;
import org.dao.PracticingDAO;
import org.dao.ProjectDAO;
import org.domain.Company;
import org.domain.Project;
import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
       // launch(args);
        CompanyDAO dao = new CompanyDAO();
        List<Company> companyList = dao.getAllCompanies();
        for (Company e: companyList) {
            System.out.println(e.toString());
        }

        Project project = new Project();
        project.setName("Hola");
        project.setDuration(420);
        project.setSchedule("Lunes a viernes VALOR PRUEBAA");
        project.setGeneralDescription("NILL");
        project.setGeneralPurpose("NILL");
        project.setNameResponsable("NILL");
        project.setChargeResponsable("NILL");
        project.setEmailResponsable("NILL");

        ArrayList<String> activities = new ArrayList<>();
        activities.add("Primera actividad");
        activities.add("Segunda actividad");
        activities.add("Tercera actividad");

        ArrayList<String> responsabilities = new ArrayList<>();
        responsabilities.add("R1");
        responsabilities.add("R2");
        responsabilities.add("R3");

        ArrayList<String> objetives = new ArrayList<>();
        objetives.add("O1");
        objetives.add("O2");
        objetives.add("O3");

        ArrayList<String> methodologies = new ArrayList<>();
        methodologies.add("SCRUM");
        methodologies.add("Waterfall");
        methodologies.add("RAD");

        ArrayList<String> resources = new ArrayList<>();
        resources.add("Recurso 1");
        resources.add("Recurso 2");
        resources.add("Recurso 3");

        project.setActivities(activities);
        project.setResponsibilities(responsabilities);
        project.setMediateObjectives(objetives);
        project.setMethodologies(methodologies);
        project.setResources(resources);

        Company company = new Company();
        company.setId(15);
        project.setCompany(company);

        ProjectDAO projectDAO = new ProjectDAO();
        PracticingDAO practicingDAO = new PracticingDAO();

        projectDAO.addProject(project);
        practicingDAO.assignProject(44, 16);
        projectDAO.removeProjectByID(16);




    }
}