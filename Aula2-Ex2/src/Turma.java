class Turma{
    private int numero;
    private String professor;
    private int vagas;
    private Aluno[] alunos;
    private int qtdadeAlunos;

    public Turma(int nro,String nomeProf,int vagas){
        if (nro<=0 || nomeProf.length() < 2 || vagas <=0){
            throw new IllegalArgumentException("Valor inválido");
        }
        this.numero = nro;
        this.professor = nomeProf;
        this.vagas = vagas;
        this.alunos = new Aluno[vagas];
        this.qtdadeAlunos = 0;
    }
    public void novoAluno(Aluno aluno){
        if (qtdadeAlunos == vagas){
            throw new IllegalStateException("Turma cheia!");
        }
        alunos[qtdadeAlunos] = aluno;
        qtdadeAlunos++;
    }

    public Aluno getAluno(long matricula){
        for(Aluno a : alunos){
            if(a.getMatricula() == matricula){
                return a;
            }
        }
        throw new IllegalArgumentException("Aluno nao encontrado");
    }

    public void setNotaAluno(long matricula, int n_nota, float nota){
        this.getAluno(matricula).setNota(n_nota, nota);
    }

    public Aluno[] getTodosAlunos(){
        return this.alunos.clone();
    }

    private int getExistingLength(){
        int alunosLength = 0;
        for(Aluno a: alunos){
            if(a != null){
                alunosLength++;
                continue;
            }
            break;
        }
        return alunosLength;
    }

    public Aluno[] getAlunosAprovados(){
        int idx = 0;
        System.out.println(getExistingLength());
        Aluno[] reprovados = new Aluno[getExistingLength()];
        for(int i = 0; i < getExistingLength(); i++){
            if(!alunos[i].aprovado()){
                reprovados[idx] = alunos[i];
                idx++;
            }
        }
        return reprovados;
    }

    public Aluno[] getAlunosReprovados(){
        int idx = 0;
        System.out.println(getExistingLength());
        Aluno[] aprovados = new Aluno[getExistingLength()];
        for(int i = 0; i < getExistingLength(); i++){
            if(alunos[i].aprovado()){
                aprovados[idx] = alunos[i];
                idx++;
            }
        }
        return aprovados;
    }



}