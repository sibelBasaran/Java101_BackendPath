package Classes.OğrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Kakashi Sensei","445","Math");
        Teacher t2 = new Teacher("Uchiha Sensei","550","FZK");
        Teacher t3 = new Teacher("Gaara Sensei","660","KMY");

        Course math = new Course("Matematik","101","Math");
        math.addTeacher(t1);
        Course mathS = new Course("Matematik","101","Math");
        mathS.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course fzkS = new Course("Fizik","102","FZK");
        fzkS.addTeacher(t2);

        Course kimya = new Course("Kimya","105","KMY");
        kimya.addTeacher(t3);
        Course kmyS = new Course("Kimya","105","KMY");
        kmyS.addTeacher(t3);

        Student s1 = new Student("Uzumaki Naruto","3","2",math,fizik,kimya,mathS,fzkS,kmyS);
        s1.addBulkExamNote(100,80,70,80,75,90);
        System.out.println(s1.name);
        s1.isPass();
        Student s2 = new Student("Uchiha Sasuke","2","2",math,fizik,kimya,mathS,fzkS,kmyS);
        s2.addBulkExamNote(90,80,70,80,60,30);
        System.out.println(s2.name);
        s2.isPass();

    }
}
