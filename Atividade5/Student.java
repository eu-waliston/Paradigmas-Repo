import java.util.Objects;

public class Student extends Member {

  public String getContactInfo() {
    return "{" +
      "class='Student'" +
      ", name='" + getName() + "'" +
      ", userId='" + getUserId() + "'" +
      "}";
  }

  String studentsID() {
    if(Objects.equals(this.getUserId(), getUserId())) {
      System.out.println("ID" + this.getUserId());
    } else {
      System.out.println("Usuario não encontrado!!!");
    }

    return getUserId();
  }


}