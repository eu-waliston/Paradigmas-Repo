import java.util.ArrayList;
import java.lang.Math;

public class ListOfTeamMates {

  public static void main(String[] args) {
    String[] names = {"John", "Jade", "Michael", "Allen", "Vitor", "Tiago"};
    ArrayList<TeamMate> list = new ArrayList<TeamMate>();
    boolean online = false;

    for (int i = 0; i < names.length; i++) {

      if (i % 2 == 0) {
        online = true;
      } else {
        online = false;
      }
      list.add(new TeamMate(Integer.toString(i), names[i], online));
    }
    
    System.out.println("ID - NOME - STATUS");

    for (TeamMate item : list) {
        String getOnline = "";
        if (item.getOnline()) {
            getOnline = "Online";
        } else {
            getOnline = "Desconectado";
        }

        System.out.println(item.getUserId() + " - " + item.getName() + " - " + getOnline);
    }
    
  }
}