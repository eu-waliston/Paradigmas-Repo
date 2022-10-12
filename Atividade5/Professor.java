public class Professor  extends Member{

  public Professor() {
  }

  public Professor(String name, String userId, String course, String room, String building) {
    super(name, userId, course, room, building);
  }



  public String getContactInfo() {
    return "{" +
      "class='Professor'" +
      ", name='" + getName() + "'" +
      ", userId='" + getUserId() + "'" +
      ", room='" + getRoom() + "'" +
      ", building='" + getBuilding() + "'" +
      "}";
  }

  public String professoresID() {
    return "Professor{" +
            "userId='" + getUserId() + '\'' +
            '}';
  }

}


