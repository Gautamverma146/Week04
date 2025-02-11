package com.titWeek04Day01GautamGenerics.System.Problem05ResumeScreeningApp;




import java.util.ArrayList;
import java.util.List;

// Abstract class JobRole
abstract class JobRole {
    private String candidateName;
    private String experience;

    public JobRole(String candidateName, String experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getExperience() {
        return experience;
    }

    public abstract void displayRoleRequirements();
}

// Concrete job roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String experience) {
        super(candidateName, experience);
    }

    @Override
    public void displayRoleRequirements() {
        System.out.println(getCandidateName() + " with " + getExperience() + " experience is being screened for Software Engineer role.");
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, String experience) {
        super(candidateName, experience);
    }

    @Override
    public void displayRoleRequirements() {
        System.out.println(getCandidateName() + " with " + getExperience() + " experience is being screened for Data Scientist role.");
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, String experience) {
        super(candidateName, experience);
    }

    @Override
    public void displayRoleRequirements() {
        System.out.println(getCandidateName() + " with " + getExperience() + " experience is being screened for Product Manager role.");
    }
}

// Generic class Resume<T extends JobRole>
class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }
}

// Screening system with wildcard method
class ScreeningPipeline {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayRoleRequirements();
        }
    }
}

public class ResumeScreeningApp {
    public static void main(String[] args) {
        // Software Engineer resumes
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        softwareEngineerResumes.addResume(new SoftwareEngineer("Mukesh", "5 years"));
        softwareEngineerResumes.addResume(new SoftwareEngineer("Rahul", "3 years"));

        // Data Scientist resumes
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        dataScientistResumes.addResume(new DataScientist("Gautam", "4 years"));
        dataScientistResumes.addResume(new DataScientist("Verma", "2 years"));

        // Product Manager resumes
        Resume<ProductManager> productManagerResumes = new Resume<>();
        productManagerResumes.addResume(new ProductManager("Nitish", "7 years"));

        System.out.println("Screening Resumes:");
        ScreeningPipeline.screenResumes(softwareEngineerResumes.getResumes());
        ScreeningPipeline.screenResumes(dataScientistResumes.getResumes());
        ScreeningPipeline.screenResumes(productManagerResumes.getResumes());
    }
}
