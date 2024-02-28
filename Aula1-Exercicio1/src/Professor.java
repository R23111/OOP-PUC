import java.util.ArrayList;

public class Professor {
    private String nome;
    private int anosExperiencia;

    public static ArrayList<Professor> Professores = new ArrayList<>();

    public static void printProfessores(boolean comCategoria){
        for(Professor p: Professores){
            if (comCategoria)
                System.out.println(p.toString()+" Categoria:"+p.classifica());
            else
                System.out.println(p.toString());
        }
    }

    public Professor(String nome, int anosExperiencia) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        Professores.add(this);
    }

    public String getNome() {
        return nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String classifica(){
        // Nova sintaxe do Java 14-15 em diante
        return switch(anosExperiencia){
            case 0,1,2,3,4,5 -> "Assistente";
            case 6,7,8,9,10 -> "Adjunto";
            default -> "Titular";
        };
    }

    @Override
    public String toString() {
        return "Professor: " + nome + ", anos de experiencia:" + anosExperiencia;
    }
}