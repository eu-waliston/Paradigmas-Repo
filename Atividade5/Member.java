public class Member {

    private String name;
    private String userId;
    private String course;
    private String room;
    private String building;

    public Member() {
    }

    public Member(String name, String userId, String course, String room, String building) {
        this.name = name;
        this.userId = userId;
        this.course = course;
        this.room = room;
        this.building = building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }




    public String getContactInfo() {

        return "Member{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", course='" + course + '\'' +
                ", room='" + room + '\'' +
                ", building='" + building + '\'' +
                '}';
    }
}
