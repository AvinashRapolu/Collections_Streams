import java.util.ArrayList;
import java.util.List;

public class Subjects {

    private String subjectNo;
    private String subjectName;
    private List<Marks> marksList;

    public List<Marks> getMarksList() {
        return marksList;
    }

    public void setMarksList(List<Marks> marksList) {
        this.marksList = marksList;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjectNo='" + subjectNo + '\'' +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
