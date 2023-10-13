package com.company;
import java.util.Date;

/**
 * Created by a50445 on 06-07-2017.
 */
public class Professor {

    ////////////////////////////////
    /// Atributos e propriedades ///
    ////////////////////////////////

    private int numeroProcesso;         // Número do processo do Professor (institucional)
    private String nomeProfessor;       // Nome do Professor
    private int idadeProfessor;         // Idade do Professor
    private boolean sexoMasculino;      // True se for masculino false se for femenino
    private boolean estaMatriculado;    // True se estiver matriculado false se não estiver matriculado
    private String telefone;            // Número de telefone do Professor
    private int id;                     // ID do Professor no programa
    private String morada;              // Morada do Professor
    private int idCivil;                // Tipo id Civil
    private String tipoIdCivil;         // nome do documento de identificação civil
    private int idSegSocial;            // numero de identificação de segurança social
    private int idSistSaude;            // numero de identificação do sistema de saude
    private Date dataNascimento;        // Data de nascimento do Professor

    //////////////
    // Métodos  //
    //////////////

    /////////////////////////
    /// Getters & Setters ///
    /////////////////////////

    public int getNumeroProcesso()
    {
        return numeroProcesso;
    }

    public void setNumeroProcesso(int numeroProcesso)
    {
        this.numeroProcesso = numeroProcesso;
    }

    public String getNomeProfessor()
    {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor)
    {
        this.nomeProfessor = nomeProfessor;
    }

    public int getIdadeProfessor()
    {
        return idadeProfessor;
    }

    public void setIdadeProfessor(int idadeProfessor)
    {
        this.idadeProfessor = idadeProfessor;
    }

    public boolean getSexoMasculino()
    {
        return sexoMasculino;
    }

    public void setSexoMasculino(boolean sexoMasculino)
    {
        this.sexoMasculino = sexoMasculino;
    }

    public boolean getEstaMatriculado()
    {
        return estaMatriculado;
    }

    public void setEstaMatriculado(boolean estaMatriculado)
    {
        this.estaMatriculado = estaMatriculado;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getIdCivil()
    {
        return idCivil;
    }

    public void setIdCivil(int idCivil)
    {
        this.idCivil = idCivil;
    }

    public String getTipoIdCivil()
    {
        return tipoIdCivil;
    }

    public void setTipoIdCivil(String tipoIdCivil)
    {
        this.tipoIdCivil = tipoIdCivil;
    }

    public int getIdSegSocial()
    {
        return idSegSocial;
    }

    public void setIdSegSocial(int idSegSocial)
    {
        this.idSegSocial = idSegSocial;
    }

    public int getIdSistSaude()
    {
        return idSistSaude;
    }

    public void setIdSistSaude(int idSistSaude)
    {
        this.idSistSaude = idSistSaude;
    }

    public Date getDataNascimento()
    {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
}


