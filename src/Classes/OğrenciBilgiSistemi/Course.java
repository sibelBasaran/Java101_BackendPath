package Classes.OğrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int matS;
    int fzkS;
    int kmyS;
    public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.matS=0;
        this.fzkS=0;
        this.kmyS=0;

    }
    void addTeacher(Teacher courseTeacher){
        this.courseTeacher = courseTeacher;
        if(courseTeacher.branch.equals(this.prefix)){
            this.courseTeacher = courseTeacher;
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }
    void printTeacherInfo(){
        this.courseTeacher.print();
    }

}
