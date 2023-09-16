package Classes.OğrenciBilgiSistemi;

public class Student {
    Course matS;
    Course fizikS;
    Course kimyaS;

    Course mat;
    Course fizik;
    Course kimya;

    double average = 0;
    boolean isPass = false;
    String name,stuNo;
    String classes;

    public Student(String name, String stuNo, String classes, Course mat, Course fizik, Course kimya, Course fizikS, Course matS, Course kimyaS){
        this.name=name;
        this.classes=classes;
        this.stuNo=stuNo;

        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;

        this.matS=matS;
        this.fizikS=fizikS;
        this.kimyaS=kimyaS;


    }
    void addBulkExamNote(int mat,int fzk,int kmy,int mS,int fS,int kS){
        if(mat>=0 && mat<=100){
            this.mat.note=mat;
            this.matS.note=mS;
        }
        if(fzk>=0 && fzk<=100){
            this.fizik.note=fzk;
            this.fizikS.note=fS;
        }
        if(kmy>=0 && kmy<=100){
            this.kimya.note=kmy;
            this.kimyaS.note=kS;
        }
    }
    void isPass() {
        this.average=(((this.mat.note + this.fizik.note + this.kimya.note)/3.0)*0.8) + (((this.matS.note + this.fizikS.note + this.kimyaS.note)/3.0)*0.2);
        if(this.average>55){
            System.out.println("Sınıfı geçti.");
            this.isPass=true;
        }else{
            System.out.println("Sınıfta kaldı.");
            this.isPass=false;


        }
        printNote();
    }
    void printNote() {
        System.out.println(this.mat.name + "Notu:" + (this.mat.note*0.8 + this.matS.note*0.2));
        System.out.println(this.fizik.name + "Notu:" + (this.fizik.note*0.8 + this.fizikS.note*0.2));
        System.out.println(this.kimya.name + "Notu:" +(this.kimya.note * 0.8 + this.fizikS.note * 0.2));
        System.out.println("Ortalama: " + this.average);
        System.out.println("=========================");
    }
}
