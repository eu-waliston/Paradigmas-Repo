public class TeamMate {
  private String userId;
  private String name;
  private boolean online = false;

  public TeamMate(String userId, String name, boolean online) {
    this.userId = userId;
    this.name = name;
    this.online = online;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setOnline(boolean online) {
    this.online = online;
  }

  public boolean getOnline() {
    return this.online;
  }

}