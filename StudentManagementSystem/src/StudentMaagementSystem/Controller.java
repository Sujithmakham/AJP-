package StudentMaagementSystem;



public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Update student info
    public void setStudentName(String name) { model.setName(name); }
    public void setStudentUniversity(String university) { model.setUniversity(university); }

    // Display student info
    public void updateView() { view.displayStudent(model); }
}
