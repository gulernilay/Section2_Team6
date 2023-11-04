public class CourseInformationx {

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getTheory() {
        return theory;
    }

    public void setTheory(Integer theory) {
        this.theory = theory;
    }

    public Integer getLab() {
        return lab;
    }

    public void setLab(Integer lab) {
        this.lab = lab;
    }

    public Integer getLocalCredits() {
        return localCredits;
    }

    public void setLocalCredits(Integer localCredits) {
        this.localCredits = localCredits;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public CourseInformationx(String courseName, String code, Integer theory, Integer lab, Integer localCredits, Integer ects) {
        this.courseName = courseName;
        this.code = code;
        this.theory = theory;
        this.lab = lab;
        this.localCredits = localCredits;
        this.ects = ects;
    }

    private String courseName;
    private String code;
    private Integer theory;
    private Integer lab;
    private Integer localCredits;
    private Integer ects;
    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Code: " + code + ", Theory: " + theory + ", Lab: " + lab + ", Local Credits: " + localCredits + ", ECTS: " + ects;
    }

}