package com.company;

/**
 * Created by a50445 on 06-07-2017.
 */
public class Turma {

    ////////////////////////////////
    /// Atributos e propriedades ///
    ////////////////////////////////

    private int id;                 // nº interno da turma
    private String nomeTurma;       // Nome da turma
    private String professorDt;     // Diretor de turma
    private int nAlunos;            // Número de alunos na turma
    private String alunoDelegado;   // Delegado de turma
    private String subDelegado;     // Subdelegado de turma
    private int anoLetivo;          // Ano letivo em vigor
    private String ciclo;           // Nível de ensino da turma: 1º, 2º, 3º ciclo ou secundário
    private String curso;           // Regular, profissional, vocacional, etc
    private String turnoDiurno;     // Diurno ou noturno

    //////////////
    // Métodos  //
    //////////////

    /////////////////////////
    /// Getters & Setters ///
    /////////////////////////

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNomeTurma()
    {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma)
    {
        this.nomeTurma = nomeTurma;
    }

    public String getProfessorDt()
    {
        return professorDt;
    }

    public void setProfessorDt(String professorDt)
    {
        this.professorDt = professorDt;
    }

    public int getnAlunos()
    {
        return nAlunos;
    }

    public void setnAlunos(int nAlunos)
    {
        this.nAlunos = nAlunos;
    }

    public String getAlunoDelegado()
    {
        return alunoDelegado;
    }

    public void setAlunoDelegado(String alunoDelegado)
    {
        this.alunoDelegado = alunoDelegado;
    }

    public String getSubDelegado()
    {
        return subDelegado;
    }

    public void setSubDelegado(String subDelegado)
    {
        this.subDelegado = subDelegado;
    }

    public int getAnoLetivo()
    {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo)
    {
        this.anoLetivo = anoLetivo;
    }

    public String getCiclo()
    {
        return ciclo;
    }

    public void setCiclo(String ciclo)
    {
        this.ciclo = ciclo;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    public String getTurnoDiurno()
    {
        return turnoDiurno;
    }

    public void setTurnoDiurno(String turnoDiurno)
    {
        this.turnoDiurno = turnoDiurno;
    }
}


