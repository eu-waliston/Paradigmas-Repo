import java.time.LocalDate;

public class Assignment {

    protected LocalDate dueDate;
    protected String description;
    protected boolean pending;
    protected LocalDate submitDate;

    public Assignment(LocalDate dueDate, String description) {
        this.dueDate = dueDate;
        this.description = description;
        this.submitDate = null;
        this.pending = true;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isPending() {
        return this.pending;
    }


    public void complete(LocalDate date) {
        this.submitDate = date;
        this.pending = false;
    }


    public int daysLeft() {
        return dueDate.compareTo(LocalDate.now());
    }

    private String status(String statusSMG) {


        if (!isPending()) {
            return "Group Assignment " + this.description + "done" + " - call ";
        } else if ((!isPending()) && daysLeft() < 0) {
            return "Group Assignment " + this.description + "late" + " - call ";
        } else if ((!isPending()) && daysLeft() > 0) {
            return "Group Assignment " + this.description + "due in" + daysLeft() + " - call ";
        }

        return statusSMG;
    }

    public String message() {
        return "Assignment " + this.description + " is " + this.status(description);
    }

    @Override
    public String toString() {
        //pt 1 teste
        return "Assignment [dueDate=" + dueDate + ", description=" + description + ", pending=" + pending + ", submitDate="
                + submitDate + "]";
    }

    public String AssignmentList() {
      this.getDescription().toString();
        return "";
    }
}
