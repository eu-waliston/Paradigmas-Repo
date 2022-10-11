import java.util.ArrayList;

public class Laboratory extends  Professor {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;

    public Laboratory() {
    }

    public Laboratory(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.professors = new ArrayList<Professor>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMember(Student s) {
        this.students.add(s);
    }

    public void addMember(Professor p) {
        this.professors.add(p);
    }

    public ArrayList<String> getContactInfos() {

        for(int i = 0; i < students.size(); i ++) {
                System.out.println(students.get(i).getContactInfo());
        }
        for(int j = 0; j < professors.size(); j ++) {
            System.out.println(professors.get(j).getContactInfo());
        }
        return null;
    }

    public boolean userExists(String userId) {
        professoresID().toString();
        return true;
    }

   public int countMembers() {
        // COMPLETE-ME
        // Retorne o total de membros do laboratório (estudantes e professores)
       int numbers = students.size() + professors.size();
      return numbers;
   }


}