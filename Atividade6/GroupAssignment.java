import java.time.LocalDate;

class GroupAssignment extends Assignment {
    
      private String teamMates;

  public String message() {
    if(!isPending()) {
    	return "Group Assignment " + this.description + "done" + " - call " + teamMates;
    } else if((!isPending()) && daysLeft() < 0) {
    	return "Group Assignment " + this.description + "late" + " - call " + teamMates;
    }
    return "Group Assignment " + this.description + "due in" + daysLeft() + " - call " + teamMates;

  }

  public GroupAssignment(LocalDate dueDate, String description, String teamMates) {
    super(dueDate, description);
    this.teamMates = teamMates;
  }

  
}