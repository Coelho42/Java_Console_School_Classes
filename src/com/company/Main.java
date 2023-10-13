package com.company;
import java.util.Scanner;
import java.util.Date;
public class Main {

    public static void main(String[] args) {

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Atributos
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Turmas
        Turma gi1 = null;           // Objeto vazio
        Turma gi2 = new Turma();    // Objeto válido (recebeu uma cópia da classe)
        Turma gi3 = new Turma();    // Objeto válido (recebeu uma cópia da classe)
        gi1 = new Turma();          // Objeto passa a ser válido

        // Array de 3 turmas
        Turma[] Turmas = new Turma[3];

        // Professores
        Professor p1 = new Professor(); // Objeto válido (recebeu uma cópia da classe)
        Professor p2 = new Professor(); // Objeto válido (recebeu uma cópia da classe)
        Professor p3 = new Professor(); // Objeto válido (recebeu uma cópia da classe)

        // Array de 3 professores
        Professor[] Professores = new Professor[3];

        // Alunos
        Aluno a1, a2, a3 = new Aluno(); // 3 objetos válidos do tipo aluno

        // Array de 3 alunos
        Aluno[] Alunos = new Aluno[3];

        // Declaração do scanner
        Scanner reader = new Scanner(System.in);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // APP
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Declaração de variáveis
        int nTurmas = 0, nAlunos = 0, nProfessores = 0;                                             // Variáveis que fazem a contagem do nr de turmas, alunos e professores, que são usadas para as proteções na APP
        String opcao, opcoes, opcoes1, opcoes2, opcoes3, opcoes4, opcoes5, opcoes6;                 // Variáveis para as opções introduzidas na APP;
        int nAlunosmatriculados = 0, nProfessoresmatriculados = 0;                                  // Variáveis para as matriculas
        int aT1 = 0, aT2 = 0, aT3 = 0, pT1 = 0, pT2 = 0, pT3 = 0;                                   // Variáveis para mostrar os alunos e professores conforme o número de matriculas

        // Execução da tarefa de acordo com o que o opcao escolher do Menu, e voltar a pedir caso este introduza uma opção não válida
        do
        {
            // Chamada do Menu na Main
            desenhaMenu();

            // Conforme aquilo que o utilizador introduzir o menu executa essa opção
            System.out.println(" ");
            opcao = reader.next();
            System.out.println(" ");

            // Opções do Menu
            switch (opcao)
            {
                case "1":

                    for (int k = 0; k < Turmas.length; k++)
                    {
                        Turmas[k] = new Turma();

                        // Id da Turma
                        Turmas[k].setId(k + 1);

                        // Nome
                        System.out.println(" Introduza o Nome da " + (k + 1) + "ª turma");
                        Turmas[k].setNomeTurma(reader.next());
                        System.out.println();

                        // nº de alunos
                        System.out.println(" Introduza o nº de alunos da " + (k + 1) + "ª turma");
                        Turmas[k].setnAlunos(reader.nextInt());
                        System.out.println();

                        // Ano Letivo
                        System.out.println(" Introduza o ano letivo da " + (k + 1) + "ª turma");
                        Turmas[k].setAnoLetivo(reader.nextInt());
                        System.out.println();

                        // Ciclo
                        System.out.println(" Introduza o ciclo da " + (k + 1) + "ª turma");
                        Turmas[k].setCiclo(reader.next());
                        System.out.println();

                        // Curso
                        System.out.println(" Introduza o tipo de curso da " + (k + 1) + "ª turma");
                        Turmas[k].setCurso(reader.next());
                        System.out.println();

                        // Turno
                        System.out.println(" Introduza o Turno da " + (k + 1) + "ª turma");
                        Turmas[k].setTurnoDiurno(reader.next());
                        System.out.println();
                        System.out.println();

                    }

                    // Exceção para quando o programa for apresentar os dados
                    nTurmas = Turmas.length;
                    break;

                case "2":

                    // Caso o nTurmas for == 0, este ciclo for não pode ser executado, porque não existem turmas, se nTurmas >0 então o ciclo for para o preechimento dos alunos poderá ser executado
                    if (nTurmas != 0)
                    {
                        // Preenche 3 Alunos
                        for (int j = 0; j < Alunos.length; j++)
                        {
                            Alunos[j] = new Aluno();

                            //Id do aluno
                            Alunos[j].setId(j + 1);

                            // Nome
                            System.out.println(" Introduza o Nome do " + (j + 1) + "º aluno");
                            Alunos[j].setNomeAluno(reader.next());
                            Alunos[j].setNumeroProcesso(j + 1);
                            System.out.println();

                            // Idade
                            System.out.println(" Introduza a Idade do " + (j + 1) + "º aluno");
                            Alunos[j].setIdadeAluno(reader.nextInt());
                            Alunos[j].setDataNascimento(new Date());
                            System.out.println();

                            // nº cartão de identificação
                            System.out.println(" Introduza o nº CC do " + (j + 1) + "º aluno");
                            Alunos[j].setIdCivil(reader.nextInt());
                            System.out.println();

                            // nº cartão de seg social
                            System.out.println(" Introduza o nº Seg. Social " + (j + 1) + "º aluno");
                            Alunos[j].setIdSegSocial(reader.nextInt());
                            System.out.println();

                            // nº cartão de sist. de saúde
                            System.out.println(" Introduza o nº Sist.de saúde " + (j + 1) + "º aluno");
                            Alunos[j].setIdSistSaude(reader.nextInt());
                            System.out.println();

                            // Morada
                            System.out.println(" Introduza a Morada do " + (j + 1) + "º aluno");
                            Alunos[j].setMorada(reader.next());
                            System.out.println();

                            // Género - repete até a resposta ser válida
                            boolean validoAluno = true;
                            do
                            {
                                validoAluno = true;
                                System.out.println(" Género Masculino? (S/N)");
                                switch (reader.next())
                                {
                                    case "s":
                                    case "S":
                                        Alunos[j].setSexoMasculino(true);
                                        break;

                                    case "n":
                                    case "N":
                                        Alunos[j].setSexoMasculino(false);
                                        break;

                                    default:
                                        System.out.println();
                                        System.out.println(" Wrong answer - repita sff");
                                        System.out.println();
                                        validoAluno = false;
                                        break;
                                }
                            } while (!validoAluno);

                            // nº de telefone
                            System.out.println();
                            System.out.println(" Introduza o número de telefone do " + (j + 1) + "º aluno");
                            Alunos[j].setTelefone(reader.next());
                            System.out.println();

                            // nº de identificação Civil
                            System.out.println(" Introduza o número de identificação Civil do " + (j + 1) + "º aluno");
                            Alunos[j].setIdCivil(reader.nextInt());
                            System.out.println();

                            // Pergunta se o aluno está matriculado - repete até a resposta ser válida
                            do
                            {
                                validoAluno = true;     // Variável para se for um aluno válido ou não

                                System.out.println(" Está Matriculado? (S/N)");
                                switch (reader.next())
                                {
                                    case "s":
                                    case "S":
                                        Alunos[j].setEstaMatriculado(true);
                                        break;

                                    case "n":
                                    case "N":
                                        Alunos[j].setEstaMatriculado(false);

                                        // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                        do
                                        {

                                            // Pergunta em que turma deseja matricular o aluno
                                            System.out.println();
                                            System.out.println(" Em qual das seguintes turmas deseja matricular o aluno criado?");
                                            System.out.println();

                                            // Ciclo for que mostra as turmas criadas
                                            for (int a = 0; a < Alunos.length; a++)
                                            {
                                                System.out.println(" Press '" + (a + 1) + "' se quiser inserir o aluno na - " + (a + 1) + "ª Turma ---> " + Turmas[a].getNomeTurma());
                                            }

                                            // Lê o que vier do teclado
                                            opcoes = reader.next();
                                            System.out.println();

                                            // Switch para a turma que o utilizador escolher matricular o aluno
                                            switch (opcoes)
                                            {
                                                case "1":
                                                    System.out.println(" O aluno foi matriculado na turma " + Turmas[0].getNomeTurma());
                                                    nAlunosmatriculados = aT1 + 1;

                                                    Alunos[j].setEstaMatriculado(true);
                                                    System.out.println();

                                                    // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                                    do
                                                    {

                                                        // Pergunta se deseja inserir este aluno como delegado de turma
                                                        System.out.println(" Deseja inserir este aluno como delegado de turma? (S/N)");

                                                        // Lê o que vier do teclado
                                                        opcoes1 = reader.next();
                                                        System.out.println();

                                                        // Switch para aquilo que o utilizador introduzir se "S" o aluno é colocado como delegado, se "N", ele pergunta se quer o aluno como subdelegado
                                                        switch (opcoes1)
                                                        {
                                                            case "s":
                                                            case "S":
                                                                System.out.println(" O aluno foi colocado como Delegado na turma " + Turmas[0].getNomeTurma());
                                                                Turmas[0].setAlunoDelegado(Alunos[j].getNomeAluno());
                                                                System.out.println();
                                                                System.out.println();
                                                                break;

                                                            case "n":
                                                            case "N":

                                                                // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                                                do
                                                                {

                                                                    // Pergunta ao utilizador se então deseja inserir o aluno como delegado de turma
                                                                    System.out.println(" Deseja então inserir o aluno como Sub-Delegado? (S/N)");

                                                                    // Lê o que o utilizador introduzir no teclado
                                                                    opcoes2 = reader.next();
                                                                    System.out.println();

                                                                    // Switch para as turmas que o utilizador pode selecionar
                                                                    switch (opcoes2)
                                                                    {
                                                                        case "s":
                                                                        case "S":
                                                                            System.out.println(" O aluno foi colocado como Sub-Delegado na turma " + Turmas[0].getNomeTurma());
                                                                            Turmas[0].setSubDelegado(Alunos[j].getNomeAluno());
                                                                            System.out.println();
                                                                            System.out.println();
                                                                            break;

                                                                        case "n":
                                                                        case "N":
                                                                            break;

                                                                        default:
                                                                            System.out.println(" A opção introduzida não é válida, porfavor insira uma opção válida");
                                                                            System.out.println();
                                                                            opcoes2 = "0";
                                                                            break;
                                                                    }
                                                                } while (opcoes2 == "0");
                                                                break;

                                                            default:
                                                                System.out.println(" A opção introduzida não é válida, porfavor insira uma opção válida");
                                                                System.out.println();
                                                                opcoes1 = "0";
                                                                break;
                                                        }
                                                    } while (opcoes1 == "0");
                                                    break;

                                                case "2":
                                                    System.out.println(" O aluno foi matriculado na turma " + Turmas[1].getNomeTurma());

                                                    nAlunosmatriculados = aT2 + 1;
                                                    Alunos[j].setEstaMatriculado(true);
                                                    System.out.println();

                                                    // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                                    do
                                                    {

                                                        // Pergunta se deseja inserir este aluno como delegado de turma
                                                        System.out.println(" Deseja inserir este aluno como delegado de turma? (S/N)");

                                                        // Lê o que vier do teclado
                                                        opcoes3 = reader.next();
                                                        System.out.println();

                                                        // Switch para aquilo que o utilizador introduzir se "S" o aluno é colocado como delegado, se "N", ele pergunta se quer o aluno como subdelegado
                                                        switch (opcoes3)
                                                        {
                                                            case "s":
                                                            case "S":
                                                                System.out.println(" O aluno foi colocado como Delegado na turma " + Turmas[1].getNomeTurma());
                                                                Turmas[1].setAlunoDelegado(Alunos[j].getNomeAluno());
                                                                System.out.println();
                                                                System.out.println();
                                                                break;

                                                            case "n":
                                                            case "N":

                                                                do
                                                                {
                                                                    // Pergunta ao utilizador se então deseja inserir o aluno como delegado de turma
                                                                    System.out.println(" Deseja então inserir o aluno como Sub-Delegado? (S/N)");

                                                                    // Lê o que o utilizador introduzir no teclado
                                                                    opcoes4 = reader.next();
                                                                    System.out.println();

                                                                    // Switch para as turmas que o utilizador pode selecionar
                                                                    switch (opcoes4)
                                                                    {
                                                                        case "s":
                                                                        case "S":
                                                                            System.out.println(" O aluno foi colocado como Sub-Delegado na turma " + Turmas[1].getNomeTurma());
                                                                            Turmas[1].setSubDelegado(Alunos[j].getNomeAluno());
                                                                            System.out.println();
                                                                            System.out.println();
                                                                            break;

                                                                        case "n":
                                                                        case "N":
                                                                            break;

                                                                        default:
                                                                            System.out.println(" A opção introduzida não é válida, porfavor insira uma opção válida");
                                                                            System.out.println();
                                                                            opcoes4 = "0";
                                                                            break;
                                                                    }
                                                                } while (opcoes4 == "0");
                                                                break;

                                                            default:
                                                                System.out.println(" A opção introduzida não é válida, porfavor insira uma opção válida");
                                                                System.out.println();
                                                                opcoes3 = "0";
                                                                break;
                                                        }
                                                    } while (opcoes3 == "0");
                                                    break;

                                                case "3":
                                                    System.out.println(" O aluno foi matriculado na turma " + Turmas[2].getNomeTurma());

                                                    nAlunosmatriculados = aT3 + 1;
                                                    Alunos[j].setEstaMatriculado(true);
                                                    System.out.println();

                                                    // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                                    do
                                                    {

                                                        // Pergunta se deseja inserir este aluno como delegado de turma
                                                        System.out.println(" Deseja inserir este aluno como delegado de turma? (S/N)");

                                                        // Lê o que vier do teclado
                                                        opcoes5 = reader.next();
                                                        System.out.println();

                                                        // Switch para aquilo que o utilizador introduzir se "S" o aluno é colocado como delegado, se "N", ele pergunta se quer o aluno como subdelegado
                                                        switch (opcoes5)
                                                        {
                                                            case "s":
                                                            case "S":
                                                                System.out.println(" O aluno foi colocado como Delegado na turma " + Turmas[2].getNomeTurma());
                                                                Turmas[2].setAlunoDelegado(Alunos[j].getNomeAluno());
                                                                System.out.println();
                                                                System.out.println();
                                                                break;

                                                            case "n":
                                                            case "N":

                                                                // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                                                do
                                                                {

                                                                    // Pergunta ao utilizador se então deseja inserir o aluno como delegado de turma
                                                                    System.out.println(" Deseja então inserir o aluno como Sub-Delegado? (S/N)");

                                                                    // Lê o que o utilizador introduzir no teclado
                                                                    opcoes6 = reader.next();
                                                                    System.out.println();

                                                                    // Switch para as turmas que o utilizador pode selecionar
                                                                    switch (opcoes6)
                                                                    {
                                                                        case "s":
                                                                        case "S":
                                                                            System.out.println(" O aluno foi colocado como Sub-Delegado na turma " + Turmas[2].getNomeTurma());
                                                                            Turmas[2].setSubDelegado(Alunos[j].getNomeAluno());
                                                                            System.out.println();
                                                                            System.out.println();
                                                                            break;

                                                                        case "n":
                                                                        case "N":
                                                                            break;

                                                                        default:
                                                                            System.out.println(" A opção introduzida não é válida, porfavor insira uma opção válida");
                                                                            System.out.println();
                                                                            opcoes6 = "0";
                                                                            break;
                                                                    }
                                                                } while (opcoes6 == "0");
                                                                break;

                                                            default:
                                                                System.out.println(" A opção introduzida não é válida, porfavor insira uma opção válida");
                                                                System.out.println();
                                                                opcoes5 = "0";
                                                                break;
                                                        }
                                                    } while (opcoes5 == "0");
                                                    break;

                                                default:
                                                    System.out.println(" A opção introduzida não é válida, porfavor insira uma opção válida");
                                                    System.out.println();
                                                    opcoes = "0";
                                                    break;
                                            }
                                        } while (opcoes == "0");
                                        break;

                                    default:
                                        System.out.println(" Wrong answer - repita sff");
                                        System.out.println();
                                        validoAluno = false;
                                        break;
                                }
                            } while (!validoAluno);
                        }
                    }
                    else
                    {
                        System.out.println(" Não existem turmas criadas, porfavor crie uma turma");
                    }

                    // Exceção para quando o programa for apresentar os dados
                    nAlunos = Alunos.length;
                    break;

                case "3":

                    // Caso o nTurmas for == 0, este ciclo for não pode ser executado, porque não existem turmas, se nTurmas >0 então o ciclo for para o preechimento dos alunos poderá ser executado
                    if (nTurmas != 0)
                    {
                        // Preenche 3 Professores
                        for (int i = 0; i < Professores.length; i++)
                        {
                            Professores[i] = new Professor();

                            // Id do professor
                            Professores[i].setId(i + 1);

                            // Nome
                            System.out.println(" Introduza o Nome do " + (i + 1) + "º professor");
                            Professores[i].setNomeProfessor(reader.next());
                            Professores[i].setNumeroProcesso(i + 1);
                            System.out.println();

                            // Idade
                            System.out.println(" Introduza a Idade do " + (i + 1) + "º professor");
                            Professores[i].setIdadeProfessor(reader.nextInt());
                            Professores[i].setDataNascimento(new Date());
                            System.out.println();

                            // nº cartão de identificação
                            System.out.println(" Introduza o nº CC do " + (i + 1) + "º professor");
                            Professores[i].setIdCivil(reader.nextInt());
                            System.out.println();

                            // nº cartão de seg social
                            System.out.println(" Introduza o nº Seg. Social " + (i + 1) + "º professor");
                            Professores[i].setIdSegSocial(reader.nextInt());
                            System.out.println();

                            // nº cartão de sist. de saúde
                            System.out.println(" Introduza o nº Sist.de saúde " + (i + 1) + "º professor");
                            Professores[i].setIdSistSaude(reader.nextInt());
                            System.out.println();

                            // Morada
                            System.out.println(" Introduza a Morada do " + (i + 1) + "º Professor");
                            Professores[i].setMorada(reader.next());
                            System.out.println();

                            // Género - repete até a resposta ser válida
                            boolean validoProf = true;
                            do
                            {
                                validoProf = true;
                                System.out.println(" Género Masculino? (S/N)");
                                switch (reader.next())
                                {
                                    case "s":
                                    case "S":
                                        Professores[i].setSexoMasculino(true);
                                        break;
                                    case "n":
                                    case "N":
                                        Professores[i].setSexoMasculino(false);
                                        break;

                                    default:
                                        System.out.println();
                                        System.out.println(" Wrong answer - repita sff");
                                        System.out.println();
                                        validoProf = false;
                                        break;
                                }
                            } while (!validoProf);

                            // nº de telefone
                            System.out.println();
                            System.out.println(" Introduza o número de telefone do " + (i + 1) + "º professor");
                            Professores[i].setTelefone(reader.next());
                            System.out.println();

                            // nº de identificação Civil
                            System.out.println(" Introduza o número de identificação Civil do " + (i + 1) + "º professor");
                            Professores[i].setIdCivil(reader.nextInt());
                            System.out.println();

                            // Pergunta se o professor está matriculado - repete até a resposta ser válida
                            do
                            {
                                validoProf = true;
                                System.out.println(" Está Matriculado? (S/N)");
                                switch (reader.next())
                                {
                                    case "s":
                                    case "S":
                                        Professores[i].setEstaMatriculado(true);
                                        break;

                                    case "n":
                                    case "N":
                                        Professores[i].setEstaMatriculado(false);

                                        // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                        do
                                        {

                                            // Pergunta em que turma deseja matricular o professor
                                            System.out.println();
                                            System.out.println(" Em qual das seguintes turmas deseja matricular o professor criado?");
                                            System.out.println();

                                            // Ciclo for que mostra as turmas criadas
                                            for (int p = 0; p < Professores.length; p++)
                                            {
                                                System.out.println(" Press '" + (p + 1) + "' se quiser inserir o professor na - " + (p + 1) + "ª Turma ---> " + Turmas[p].getNomeTurma());
                                            }

                                            // Lê o que vier do teclado
                                            opcoes = reader.next();
                                            System.out.println();

                                            // Switch para a turma que o utilizador escolher matricular o aluno
                                            switch (opcoes)
                                            {
                                                case "1":
                                                    System.out.println(" O professor foi matriculado na turma " + Turmas[0].getNomeTurma());
                                                    nProfessoresmatriculados = pT1 + 1;

                                                    Professores[i].setEstaMatriculado(true);
                                                    System.out.println();

                                                    // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                                    do
                                                    {

                                                        // Pergunta se deseja inserir este professor como DT de turma
                                                        System.out.println(" Deseja inserir este professor como DT de turma? (S/N)");

                                                        // Lê o que vier do teclado
                                                        opcoes1 = reader.next();
                                                        System.out.println();

                                                        // Switch para aquilo que o utilizador introduzir se "S" o professor é colocado como DT, se "N", ignora e continua o código
                                                        switch (opcoes1)
                                                        {
                                                            case "s":
                                                            case "S":
                                                                System.out.println(" O professor foi colocado como DT da turma " + Turmas[0].getNomeTurma());
                                                                Turmas[0].setProfessorDt(Professores[i].getNomeProfessor());
                                                                System.out.println();
                                                                System.out.println();
                                                                break;

                                                            case "n":
                                                            case "N":
                                                                break;

                                                            default:
                                                                System.out.println(" A opção introduzida não é válida, porfavor introduza uma opção válida");
                                                                System.out.println();
                                                                opcoes1 = "0";
                                                                break;
                                                        }
                                                    } while (opcoes1 == "0");
                                                    break;

                                                case "2":
                                                    System.out.println(" O professor foi matriculado na turma " + Turmas[1].getNomeTurma());
                                                    nProfessoresmatriculados = pT2 + 1;

                                                    Professores[i].setEstaMatriculado(true);
                                                    System.out.println();

                                                    // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                                    do
                                                    {

                                                        // Pergunta se deseja inserir este professor como DT de turma
                                                        System.out.println(" Deseja inserir este professor como DT de turma? (S/N)");

                                                        // Lê o que vier do teclado
                                                        opcoes3 = reader.next();
                                                        System.out.println();

                                                        // Switch para aquilo que o utilizador introduzir se "S" o professor é colocado como DT, se "N", ignora e continua o código
                                                        switch (opcoes3)
                                                        {
                                                            case "s":
                                                            case "S":
                                                                System.out.println(" O professor foi colocado como DT de turma " + Turmas[1].getNomeTurma());
                                                                Turmas[1].setProfessorDt(Professores[i].getNomeProfessor());
                                                                System.out.println();
                                                                System.out.println();
                                                                break;

                                                            case "n":
                                                            case "N":
                                                                break;

                                                            default:
                                                                System.out.println(" A opção introduzida não é válida, porfavor introduza uma opção válida");
                                                                System.out.println();
                                                                opcoes3 = "0";
                                                                break;
                                                        }
                                                    } while (opcoes3 == "0");
                                                    break;

                                                case "3":
                                                    System.out.println(" O professor foi matriculado na turma " + Turmas[2].getNomeTurma());
                                                    nProfessoresmatriculados = pT3 + 1;

                                                    Professores[i].setEstaMatriculado(true);
                                                    Professores[i].setEstaMatriculado(true);
                                                    System.out.println();

                                                    // Faz o Switch enquanto o valor que vier do utilizador for default, ou seja incorreto
                                                    do
                                                    {

                                                        // Pergunta se deseja inserir este professor como DT de turma
                                                        System.out.println(" Deseja inserir este professor como DT de turma? (S/N)");

                                                        // Lê o que vier do teclado
                                                        opcoes5 = reader.next();
                                                        System.out.println();

                                                        // Switch para aquilo que o utilizador introduzir se "S" o professor é colocado como DT, se "N", ignora e continua o código
                                                        switch (opcoes5)
                                                        {
                                                            case "s":
                                                            case "S":
                                                                System.out.println(" O professor foi colocado como DT de turma " + Turmas[2].getNomeTurma());
                                                                Turmas[2].setProfessorDt(Professores[i].getNomeProfessor());
                                                                System.out.println();
                                                                System.out.println();
                                                                break;

                                                            case "n":
                                                            case "N":
                                                                break;

                                                            default:
                                                                System.out.println(" A opção introduzida não é válida, porfavor introduza uma opção válida");
                                                                System.out.println();
                                                                opcoes5 = "0";
                                                                break;
                                                        }
                                                    } while (opcoes5 == "0");
                                                    break;

                                                default:
                                                    System.out.println(" A opção introduzida não é válida, porfavor introduza uma opção válida");
                                                    System.out.println();
                                                    opcoes = "0";
                                                    break;
                                            }
                                        } while (opcoes == "0");
                                        break;

                                    default:
                                        System.out.println(" Wrong answer - repita sff");
                                        System.out.println();
                                        validoProf = false;
                                        break;
                                }
                            } while (!validoProf);
                        }
                    }
                    else
                    {
                        System.out.println(" Não existem turmas criadas, porfavor crie uma turma");
                    }

                    // Exceção para quando o programa for apresentar os dados
                    nProfessores = Professores.length;
                    break;

                case "4":

                    // Variável para a turma que o utilizador quiser ver no ecrã na lista de dados
                    String opcaoDados;

                    // Mostra Dados
                    if (nTurmas == 0)
                    {
                        System.out.println(" Não contêm dados em relação ás Turmas ");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println(" Qual das seguintes turmas pretende visualizar?");
                        System.out.println();

                        // Ciclo for que mostra as turmas criadas
                        for (int t = 0; t < Turmas.length; t++)
                        {
                            System.out.println((t + 1) + " - " + (t + 1) + "ª Turma ---> " + Turmas[t].getNomeTurma());
                        }
                        opcaoDados = reader.next();

                        // Switch para a turma escolhida
                        switch (opcaoDados)
                        {
                            case "1":

                                System.out.println(" Turma nº: " + Turmas[0].getId());
                                System.out.println(" Nome: " + Turmas[0].getNomeTurma());
                                System.out.println(" Número de alunos: " + Turmas[0].getnAlunos());
                                System.out.println(" Ciclo: " + Turmas[0].getCiclo());
                                System.out.println(" Curso: " + Turmas[0].getCurso());
                                System.out.println(" Turno: " + Turmas[0].getTurnoDiurno());
                                System.out.println(" Ano letivo: " + Turmas[0].getAnoLetivo());
                                System.out.println(" DT de Turma: " + Turmas[0].getProfessorDt());
                                System.out.println(" Delegado de turma: " + Turmas[0].getAlunoDelegado());
                                System.out.println(" Sub - Delegado de turma: " + Turmas[0].getSubDelegado());
                                System.out.println();
                                System.out.println();
                                System.out.println();

                                if (nAlunosmatriculados == 0)
                                {
                                    System.out.println(" Não contêm Alunos matriculados nesta turma ");
                                    System.out.println();
                                }
                                else
                                {

                                    System.out.println(" Aluno nº: " + Alunos[0].getId());
                                    System.out.println(" Nº do Processo: " + Alunos[0].getNumeroProcesso());
                                    System.out.println(" Nome: " + Alunos[0].getNomeAluno());
                                    System.out.println(" Idade: " + Alunos[0].getIdadeAluno());
                                    System.out.println(" Género Masculino: " + Alunos[0].getSexoMasculino());
                                    System.out.println(" Número de telefone: " + Alunos[0].getTelefone());
                                    System.out.println(" Morada: " + Alunos[0].getMorada());
                                    System.out.println(" Data de nascimento: " + Alunos[0].getDataNascimento());
                                    System.out.println(" Tipo ID civil: " + Alunos[0].getTipoIdCivil());
                                    System.out.println(" ID civil: " + Alunos[0].getIdCivil());
                                    System.out.println(" ID segurança social: " + Alunos[0].getIdSegSocial());
                                    System.out.println(" ID  sistema de saude: " + Alunos[0].getIdSistSaude());
                                    System.out.println(" Tem turma: " + Alunos[0].getEstaMatriculado());
                                    System.out.println();
                                    System.out.println();

                                }

                                if (nProfessoresmatriculados == 0)
                                {
                                    System.out.println(" Não contêm Professores matriculados nesta turma ");
                                    System.out.println();
                                }
                                else
                                {

                                    System.out.println(" Professor nº: " + Professores[0].getId());
                                    System.out.println(" Nº do processo: " + Professores[0].getNumeroProcesso());
                                    System.out.println(" Nome: " + Professores[0].getNomeProfessor());
                                    System.out.println(" Idade: " + Professores[0].getIdadeProfessor());
                                    System.out.println(" Género Masculino: " + Professores[0].getSexoMasculino());
                                    System.out.println(" Número de telefone: " + Professores[0].getTelefone());
                                    System.out.println(" Morada: " + Professores[0].getMorada());
                                    System.out.println(" Data de Nascimento: " + Professores[0].getDataNascimento());
                                    System.out.println(" Tipo ID civil: " + Professores[0].getTipoIdCivil());
                                    System.out.println(" ID civil: " + Professores[0].getIdCivil());
                                    System.out.println(" ID segurança social: " + Professores[0].getIdSegSocial());
                                    System.out.println(" ID sistema saude: " + Professores[0].getIdSistSaude());
                                    System.out.println(" Tem Turma: " + Professores[0].getEstaMatriculado());
                                    System.out.println();
                                    System.out.println();
                                }
                                break;

                            case "2":

                                System.out.println(" Turma nº: " + Turmas[1].getId());
                                System.out.println(" Nome: " + Turmas[1].getNomeTurma());
                                System.out.println(" Número de alunos: " + Turmas[1].getnAlunos());
                                System.out.println(" Ciclo: " + Turmas[1].getCiclo());
                                System.out.println(" Curso: " + Turmas[1].getCurso());
                                System.out.println(" Turno: " + Turmas[1].getTurnoDiurno());
                                System.out.println(" Ano letivo: " + Turmas[1].getAnoLetivo());
                                System.out.println(" DT de Turma: " + Turmas[1].getProfessorDt());
                                System.out.println(" Delegado de turma: " + Turmas[1].getAlunoDelegado());
                                System.out.println(" Sub - Delegado de turma: " + Turmas[1].getSubDelegado());
                                System.out.println();
                                System.out.println();
                                System.out.println();

                                if (nAlunosmatriculados == 0)
                                {
                                    System.out.println(" Não contêm Alunos matriculados nesta turma ");
                                    System.out.println();
                                }
                                else
                                {
                                    System.out.println(" Aluno nº: " + Alunos[1].getId());
                                    System.out.println(" Nº do Processo: " + Alunos[1].getNumeroProcesso());
                                    System.out.println(" Nome: " + Alunos[1].getNomeAluno());
                                    System.out.println(" Idade: " + Alunos[1].getIdadeAluno());
                                    System.out.println(" Género Masculino: " + Alunos[1].getSexoMasculino());
                                    System.out.println(" Número de telefone: " + Alunos[1].getTelefone());
                                    System.out.println(" Morada: " + Alunos[1].getMorada());
                                    System.out.println(" Data de nascimento: " + Alunos[1].getDataNascimento());
                                    System.out.println(" Tipo ID civil: " + Alunos[1].getTipoIdCivil());
                                    System.out.println(" ID civil: " + Alunos[1].getIdCivil());
                                    System.out.println(" ID segurança social: " + Alunos[1].getIdSegSocial());
                                    System.out.println(" ID  sistema de saude: " + Alunos[1].getIdSistSaude());
                                    System.out.println(" Tem turma: " + Alunos[1].getEstaMatriculado());
                                    System.out.println();
                                    System.out.println();
                                }

                                if (nProfessoresmatriculados == 0)
                                {
                                    System.out.println(" Não contêm Professores matriculados nesta turma ");
                                    System.out.println();
                                }
                                else
                                {
                                    System.out.println(" Professor nº: " + Professores[1].getId());
                                    System.out.println(" Nº do processo: " + Professores[1].getNumeroProcesso());
                                    System.out.println(" Nome: " + Professores[1].getNomeProfessor());
                                    System.out.println(" Idade: " + Professores[1].getIdadeProfessor());
                                    System.out.println(" Género Masculino: " + Professores[1].getSexoMasculino());
                                    System.out.println(" Número de telefone: " + Professores[1].getTelefone());
                                    System.out.println(" Morada: " + Professores[1].getMorada());
                                    System.out.println(" Data de Nascimento: " + Professores[1].getDataNascimento());
                                    System.out.println(" Tipo ID civil: " + Professores[1].getTipoIdCivil());
                                    System.out.println(" ID civil: " + Professores[1].getIdCivil());
                                    System.out.println(" ID segurança social: " + Professores[1].getIdSegSocial());
                                    System.out.println(" ID sistema saude: " + Professores[1].getIdSistSaude());
                                    System.out.println(" Tem Turma: " + Professores[1].getEstaMatriculado());
                                    System.out.println();
                                    System.out.println();
                                }
                                break;

                            case "3":

                                System.out.println(" Turma nº: " + Turmas[2].getId());
                                System.out.println(" Nome: " + Turmas[2].getNomeTurma());
                                System.out.println(" Número de alunos: " + Turmas[2].getnAlunos());
                                System.out.println(" Ciclo: " + Turmas[2].getCiclo());
                                System.out.println(" Curso: " + Turmas[2].getCurso());
                                System.out.println(" Turno: " + Turmas[2].getTurnoDiurno());
                                System.out.println(" Ano letivo: " + Turmas[2].getAnoLetivo());
                                System.out.println(" DT de Turma: " + Turmas[2].getProfessorDt());
                                System.out.println(" Delegado de turma: " + Turmas[2].getAlunoDelegado());
                                System.out.println(" Sub - Delegado de turma: " + Turmas[2].getSubDelegado());
                                System.out.println();
                                System.out.println();
                                System.out.println();

                                if (nAlunosmatriculados == 0)
                                {
                                    System.out.println(" Não contêm Alunos matriculados nesta turma ");
                                    System.out.println();
                                }
                                else
                                {
                                    System.out.println(" Aluno nº: " + Alunos[2].getId());
                                    System.out.println(" Nº do Processo: " + Alunos[2].getNumeroProcesso());
                                    System.out.println(" Nome: " + Alunos[2].getNomeAluno());
                                    System.out.println(" Idade: " + Alunos[2].getIdadeAluno());
                                    System.out.println(" Género Masculino: " + Alunos[2].getSexoMasculino());
                                    System.out.println(" Número de telefone: " + Alunos[2].getTelefone());
                                    System.out.println(" Morada: " + Alunos[2].getMorada());
                                    System.out.println(" Data de nascimento: " + Alunos[2].getDataNascimento());
                                    System.out.println(" Tipo ID civil: " + Alunos[2].getTipoIdCivil());
                                    System.out.println(" ID civil: " + Alunos[2].getIdCivil());
                                    System.out.println(" ID segurança social: " + Alunos[2].getIdSegSocial());
                                    System.out.println(" ID  sistema de saude: " + Alunos[2].getIdSistSaude());
                                    System.out.println(" Tem turma: " + Alunos[2].getEstaMatriculado());
                                    System.out.println();
                                    System.out.println();
                                }

                                if (nProfessoresmatriculados == 0)
                                {
                                    System.out.println(" Não contêm Professores matriculados nesta turma ");
                                    System.out.println();
                                }
                                else
                                {
                                    System.out.println(" Professor nº: " + Professores[2].getId());
                                    System.out.println(" Nº do processo: " + Professores[2].getNumeroProcesso());
                                    System.out.println(" Nome: " + Professores[2].getNomeProfessor());
                                    System.out.println(" Idade: " + Professores[2].getIdadeProfessor());
                                    System.out.println(" Género Masculino: " + Professores[2].getSexoMasculino());
                                    System.out.println(" Número de telefone: " + Professores[2].getTelefone());
                                    System.out.println(" Morada: " + Professores[2].getMorada());
                                    System.out.println(" Data de Nascimento: " + Professores[2].getDataNascimento());
                                    System.out.println(" Tipo ID civil: " + Professores[2].getTipoIdCivil());
                                    System.out.println(" ID civil: " + Professores[2].getIdCivil());
                                    System.out.println(" ID segurança social: " + Professores[2].getIdSegSocial());
                                    System.out.println(" ID sistema saude: " + Professores[2].getIdSistSaude());
                                    System.out.println(" Tem Turma: " + Professores[2].getEstaMatriculado());
                                    System.out.println();
                                    System.out.println();

                                }
                                break;

                            default:

                                System.out.println(" A opção introduzida não é válida, porfavor introduza uma opção válida");
                                break;
                        }
                    }
                    break;

                case "0":

                    System.out.println(" Cya!");
                    break;
            }
        } while (opcao != "0");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /// <summary>
    /// Número de astericos e tipo de carater que pretendemos utilizar para desenhar o Menu
    /// </summary>
    /// <param name="contador">Número de asteriscos</param>
    /// <param name="carater">Carater que pretendemos utilizar para desenhar o Menu</param>

    static void desenhaChar(int contador, char carater)
    {
        for (int i = 1; i <= contador; i++)
        {
            System.out.print(carater);
        }
    }

    /// <summary>
    /// Desenho e Opções do Menu
    /// </summary>
    static void desenhaMenu()
    {

        String menu = "Menu";
        String opcao1 = "Criar Turma";
        String opcao2 = "Adicionar Aluno";
        String opcao3 = "Adicionar Professor";
        String opcao4 = "Listar Dados";
        String opcao5 = "Sair";

        int conta;

        // Cabeçalho do Menu
        desenhaChar(35, ' ');
        desenhaChar(50, '*');
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(2, '*');
        desenhaChar(20, ' ');
        conta = menu.length();
        System.out.print(menu);
        desenhaChar(26 - conta, ' ');
        desenhaChar(2, '*');
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(50, '*');

        // Linhas Laterais
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais e 1 ª opção do Menu
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(5, ' ');
        System.out.print(" 1 - ");
        conta = opcao1.length();
        System.out.print(opcao1);
        desenhaChar(38 - conta, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais e 2 ª opção do Menu
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(5, ' ');
        System.out.print(" 2 - ");
        conta = opcao2.length();
        System.out.print(opcao2);
        desenhaChar(38 - conta, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais e 3 ª opção do Menu
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(5, ' ');
        System.out.print(" 3 - ");
        conta = opcao3.length();
        System.out.print(opcao3);
        desenhaChar(38 - conta, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais e 4 ª opção do Menu
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(5, ' ');
        System.out.print(" 4 - ");
        conta = opcao4.length();
        System.out.print(opcao4);
        desenhaChar(38 - conta, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais e 5 ª opção do Menu
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(5, ' ');
        System.out.print(" 0 - ");
        conta = opcao5.length();
        System.out.print(opcao5);
        desenhaChar(38 - conta, ' ');
        desenhaChar(1, '*');

        // Linhas Laterais
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(1, '*');
        desenhaChar(48, ' ');
        desenhaChar(1, '*');

        // Linha de baixo do Menu
        System.out.println(" ");
        desenhaChar(35, ' ');
        desenhaChar(50, '*');
        System.out.println(" ");
        System.out.println(" ");
    }
}




