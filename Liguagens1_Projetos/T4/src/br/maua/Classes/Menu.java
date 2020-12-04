package br.maua.Classes;

import br.maua.DAO.PersonagemDao;
import br.maua.Enum.*;

import java.util.Random;
import java.util.Scanner;

public class Menu {


public void apresentacao(){
    Random r = new Random();
    PersonagemDao personagemDao = new PersonagemDao();
    System.out.println("Bem vindo!");
    int n = 1;
    String nome;
    int i;
    int h = 0;
    float o;
    Scanner scanner = new Scanner(System.in);
    Scanner scannerlinha = new Scanner(System.in);
    while (n != 0 ){
        System.out.println("Oque voce deseja fazer?");
        System.out.println("1- Criar um personagem");
        System.out.println("2- Deletar personagem");
        System.out.println("3- Alterar Personagem");
        System.out.println("4- Ver Todos os Personagens");
        System.out.println("0 - Sair");
        n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Qual Nome?");
                nome = scannerlinha.nextLine();
                System.out.println("Qual a raça?");
                System.out.println("1- "+ Raca.KHAJIIT +"\n"
                        +"{ Profissoes: Ladrao(Melhor), Guerreiro ou Arqueiro"
                        +"\n"+"  Descricao: Os Khajiit são uma raça com aspecto felino, oriundos de uma província de Elseweyr.\n Têm a capacidade de ver no escuro e são muito ágeis e inteligentes. }"+"\n");
                System.out.println("2- "+ Raca.ARGONIANS +"\n" + "{ Profissoes: Ladrao, Mago, Tanque "
                        +"\n"+ "Descricao: Os argonianos são seres provenientes dos pântanos, com aspecto de réptil que estão apetrechados com todas as classes de venenos. " +
                        "\nNão são afetados por doenças e graças à sua pele característica, podem respirar dentro de água e curar as feridas, durante 60 segundos. }\n");
                System.out.println("3- "+Raca.ELF +"\n"+
                        "{ Profissoes: Mago" + "\n" + "Descricao: Os Elfs, conhecidos originalmente por Altmer, são originários de Summerset e são uns grandes metres da magia. } \n");
                System.out.println("4- "+Raca.DARK_ELF+"\n"+
                        "{ Profissoes: Mago"+"\n"+ "Descricao: Os Dark Elves dominam as magias mais escuras de Skyrim, principalmente se forem feitiços de fogo. }\n" +
                        "Possuem um maior poder magico mas muito frageis }\n ");
                i = scanner.nextInt();
                String g;
                switch (i){
                    case 1:
                        System.out.println("Nome: " + nome);
                        System.out.println("Raca: Khajiit");
                        System.out.println("Qual profissao?");
                        System.out.println(Profissao.LADRAO + " - Arma: Adaga");
                        System.out.println(Profissao.GUERREIRO + " - Arma: Espada");
                        System.out.println(Profissao.ARQUEIRO + "- Arma: Arco");
                        g = scannerlinha.nextLine();
                        if(g.equalsIgnoreCase(Profissao.LADRAO.toString())){
                            Personagem personagem = new Personagem(Idgenerator(),Raca.KHAJIIT.toString(),Profissao.LADRAO.toString(),(r.nextFloat()*20)+5,nome,(r.nextFloat()*30)+70,(r.nextFloat()*20)+5,(r.nextFloat()*20)+50,(r.nextFloat()*20)+50,(r.nextFloat()*20)+80,(r.nextFloat()*20)+80,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                            System.out.println(personagem.toString());
                            personagemDao.create(personagem);
                            System.out.println("Deseja adicionar acessorios?");
                            System.out.println("1- Sim");
                            System.out.println("2 - Nao");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    System.out.println("Escolha a Armadura:");
                                    System.out.println("1- "+Armadura.ROUPA_DE_VELOCIDADE + " +20 Velocidade, +10 Defesa");
                                    System.out.println("2- "+Armadura.ARMADURA_DE_COBRE + " -5 Velocidade, + +5 Defesa");
                                    System.out.println("3- "+Armadura.ARMADURA_DE_FERRO + " -10 Velocidade, + +10 Defesa");
                                    System.out.println("4- "+ Armadura.ARMADURA_DE_DIAMANTE + " +20 Defesa");
                                    System.out.println("5- "+ Armadura.ARMADURA_CELESTIAL + " +10 Velocidade, +30 Defesa");
                                    i = scanner.nextInt();
                                    switch (i){
                                        case 1:
                                            personagem.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                             o = personagem.getDefesa() + 10;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() + 20;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            o = personagem.getDefesa() + 5;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 5;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            o = personagem.getDefesa() + 10;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 10;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 4:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            o = personagem.getDefesa() + 20;
                                            personagem.setDefesa(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 5:
                                            personagem.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            o = personagem.getDefesa() + 30;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() + 10;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                    }

                                    break;
                                case 2:
                                    System.out.println("Personagem Criado!");
                                    break;
                            }

                        }else if(g.equalsIgnoreCase(Profissao.GUERREIRO.toString())){
                            Personagem personagem = new Personagem(Idgenerator(),Raca.KHAJIIT.toString(),Profissao.GUERREIRO.toString(),(r.nextFloat()*20)+5,nome,(r.nextFloat()*30)+70,(r.nextFloat()*20)+5,(r.nextFloat()*20)+50,(r.nextFloat()*20)+50,(r.nextFloat()*20)+80,(r.nextFloat()*20)+80,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                            System.out.println(personagem.toString());
                            personagemDao.create(personagem);
                            System.out.println("Deseja adicionar acessorios?");
                            System.out.println("1- Sim");
                            System.out.println("2 - Nao");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    System.out.println("Escolha a Armadura:");
                                    System.out.println("1- "+Armadura.ROUPA_DE_VELOCIDADE + " +20 Velocidade, +10 Defesa");
                                    System.out.println("2- "+Armadura.ARMADURA_DE_COBRE + " -5 Velocidade, + +5 Defesa");
                                    System.out.println("3- "+Armadura.ARMADURA_DE_FERRO + " -10 Velocidade, + +10 Defesa");
                                    System.out.println("4- "+ Armadura.ARMADURA_DE_DIAMANTE + " +20 Defesa");
                                    System.out.println("5- "+ Armadura.ARMADURA_CELESTIAL + " +10 Velocidade, +30 Defesa");
                                    i = scanner.nextInt();
                                    switch (i){
                                        case 1:
                                            personagem.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            o = personagem.getDefesa() + 10;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() + 20;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Espada, +15 Ataque -5 Velocidade");
                                                    personagem.setArmas(Armas.ESPADA.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() - 5;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            o = personagem.getDefesa() + 5;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 5;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Espada, +15 Ataque -5 Velocidade");
                                                    personagem.setArmas(Armas.ESPADA.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() - 5;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            o = personagem.getDefesa() + 10;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 10;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Espada, +15 Ataque -5 Velocidade");
                                                    personagem.setArmas(Armas.ESPADA.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() - 5;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 4:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            o = personagem.getDefesa() + 20;
                                            personagem.setDefesa(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Espada, +15 Ataque -5 Velocidade");
                                                    personagem.setArmas(Armas.ESPADA.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() - 5;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 5:
                                            personagem.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            o = personagem.getDefesa() + 30;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() + 10;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Espada, +15 Ataque -5 Velocidade");
                                                    personagem.setArmas(Armas.ESPADA.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() - 5;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                    }

                                    break;
                                case 2:
                                    System.out.println("Personagem Criado!");
                                    break;
                            }
                        }else if(g.equalsIgnoreCase(Profissao.ARQUEIRO.toString())){
                            Personagem personagem = new Personagem(Idgenerator(),Raca.KHAJIIT.toString(),Profissao.ARQUEIRO.toString(),(r.nextFloat()*20)+5,nome,(r.nextFloat()*30)+70,(r.nextFloat()*20)+5,(r.nextFloat()*20)+50,(r.nextFloat()*20)+50,(r.nextFloat()*20)+80,(r.nextFloat()*20)+80,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                            System.out.println(personagem.toString());
                            personagemDao.create(personagem);
                            System.out.println("Deseja adicionar acessorios?");
                            System.out.println("1- Sim");
                            System.out.println("2 - Nao");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    System.out.println("Escolha a Armadura:");
                                    System.out.println("1- "+Armadura.ROUPA_DE_VELOCIDADE + " +20 Velocidade, +10 Defesa");
                                    System.out.println("2- "+Armadura.ARMADURA_DE_COBRE + " -5 Velocidade, + +5 Defesa");
                                    System.out.println("3- "+Armadura.ARMADURA_DE_FERRO + " -10 Velocidade, + +10 Defesa");
                                    System.out.println("4- "+ Armadura.ARMADURA_DE_DIAMANTE + " +20 Defesa");
                                    System.out.println("5- "+ Armadura.ARMADURA_CELESTIAL + " +10 Velocidade, +30 Defesa");
                                    i = scanner.nextInt();
                                    switch (i){
                                        case 1:
                                            personagem.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            o = personagem.getDefesa() + 10;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() + 20;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Arco, +15 Ataque");
                                                    personagem.setArmas(Armas.ARCO.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            o = personagem.getDefesa() + 5;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 5;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Arco, +15 Ataque");
                                                    personagem.setArmas(Armas.ARCO.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            o = personagem.getDefesa() + 10;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 10;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Arco, +15 Ataque");
                                                    personagem.setArmas(Armas.ARCO.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 4:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            o = personagem.getDefesa() + 20;
                                            personagem.setDefesa(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Arco, +15 Ataque");
                                                    personagem.setArmas(Armas.ARCO.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 5:
                                            personagem.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            o = personagem.getDefesa() + 30;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() + 10;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Arco, +15 Ataque");
                                                    personagem.setArmas(Armas.ARCO.toString());
                                                    o = personagem.getAtaque() + 15;
                                                    personagem.setAtaque(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                    }

                                    break;
                                case 2:
                                    System.out.println("Personagem Criado!");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nome: " + nome);
                        System.out.println("Raca: Argonians");
                        System.out.println("Qual profissao?");
                        System.out.println(Profissao.LADRAO + " - Arma: Adaga");
                        System.out.println(Profissao.MAGO + " - Arma: Livro");
                        System.out.println(Profissao.TANQUE + "- Arma: Machado");
                        g = scannerlinha.nextLine();
                        if(g.equalsIgnoreCase(Profissao.LADRAO.toString())){
                            Personagem personagem = new Personagem(Idgenerator(),Raca.ARGONIANS.toString(),Profissao.LADRAO.toString(),(r.nextFloat()*50)+50,nome,(r.nextFloat()*30)+60,(r.nextFloat()*30)+70,(r.nextFloat()*20)+70,(r.nextFloat()*20)+70,(r.nextFloat()*20)+50,(r.nextFloat()*20)+20,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                            System.out.println(personagem.toString());
                            personagemDao.create(personagem);
                            System.out.println("Deseja adicionar acessorios?");
                            System.out.println("1- Sim");
                            System.out.println("2 - Nao");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    System.out.println("Escolha a Armadura:");
                                    System.out.println("1- "+Armadura.ROUPA_DE_VELOCIDADE + " +20 Velocidade, +10 Defesa");
                                    System.out.println("2- "+Armadura.ARMADURA_DE_COBRE + " -5 Velocidade, + +5 Defesa");
                                    System.out.println("3- "+Armadura.ARMADURA_DE_FERRO + " -10 Velocidade, + +10 Defesa");
                                    System.out.println("4- "+ Armadura.ARMADURA_DE_DIAMANTE + " +20 Defesa");
                                    System.out.println("5- "+ Armadura.ARMADURA_CELESTIAL + " +10 Velocidade, +30 Defesa");
                                    i = scanner.nextInt();
                                    switch (i){
                                        case 1:
                                            personagem.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            o = personagem.getDefesa() + 10;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() + 20;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            o = personagem.getDefesa() + 5;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 5;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            o = personagem.getDefesa() + 10;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 10;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 4:
                                            personagem.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            o = personagem.getDefesa() + 20;
                                            personagem.setDefesa(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 5:
                                            personagem.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            o = personagem.getDefesa() + 30;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() + 10;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                                    personagem.setArmas(Armas.ADAGA.toString());
                                                    o = personagem.getAtaque() + 10;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() + 10;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                    }

                                    break;
                                case 2:
                                    System.out.println("Personagem Criado!");
                                    break;
                            }

                        }else if(g.equalsIgnoreCase(Profissao.MAGO.toString())){
                            Personagem personagem = new Personagem(Idgenerator(),Raca.ARGONIANS.toString(),Profissao.MAGO.toString(),(r.nextFloat()*30)+60,nome,(r.nextFloat()*30)+60,(r.nextFloat()*30)+70,(r.nextFloat()*20)+70,(r.nextFloat()*20)+70,(r.nextFloat()*20)+50,(r.nextFloat()*20)+20,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                            System.out.println(personagem.toString());
                            personagemDao.create(personagem);
                            System.out.println("Deseja adicionar acessorios?");
                            System.out.println("1- Sim");
                            System.out.println("2 - Nao");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    System.out.println("Escolha a Armadura:");
                                    System.out.println("1- "+Armadura.CAPA_DE_COURO + " +5 Mana, +10 Defesa Magica");
                                    System.out.println("2- "+Armadura.CAPA_DA_INVISIBILIDADE + " +10 Mana , +10 Defesa Magica");
                                    System.out.println("3- "+Armadura.CAPA_CELESTIAL + " +20 Mana, + +20 Defesa Magica");
                                    i = scanner.nextInt();
                                    switch (i){
                                        case 1:
                                            personagem.setArmadura(Armadura.CAPA_DE_COURO.toString());
                                            o = personagem.getDefesa_magica() + 10;
                                            personagem.setDefesa_magica(o);
                                            o = personagem.getMana() + 5;
                                            personagem.setMana(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                                    personagem.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                                    o = personagem.getAtaque_magico() + 10;
                                                    personagem.setAtaque_magico(o);
                                                    o = personagem.getMana() + 10;
                                                    personagem.setMana(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            personagem.setArmadura(Armadura.CAPA_DA_INVISIBILIDADE.toString());
                                            o = personagem.getDefesa_magica() + 10;
                                            personagem.setDefesa_magica(o);
                                            o = personagem.getMana() + 10;
                                            personagem.setMana(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                                    personagem.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                                    o = personagem.getAtaque_magico() + 10;
                                                    personagem.setAtaque_magico(o);
                                                    o = personagem.getMana() + 10;
                                                    personagem.setMana(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            personagem.setArmadura(Armadura.CAPA_CELESTIAL.toString());
                                            o = personagem.getDefesa_magica() + 20;
                                            personagem.setDefesa_magica(o);
                                            o = personagem.getMana() + 20;
                                            personagem.setMana(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                                    personagem.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                                    o = personagem.getAtaque_magico() + 10;
                                                    personagem.setAtaque_magico(o);
                                                    o = personagem.getMana() + 10;
                                                    personagem.setMana(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;


                                    }

                                    break;
                                case 2:
                                    System.out.println("Personagem Criado!");
                                    break;
                            }
                        }else if(g.equalsIgnoreCase(Profissao.TANQUE.toString())){
                            Personagem personagem = new Personagem(Idgenerator(),Raca.ARGONIANS.toString(),Profissao.TANQUE.toString(),(r.nextFloat()*50)+50,nome,(r.nextFloat()*30)+60,(r.nextFloat()*30)+70,(r.nextFloat()*20)+70,(r.nextFloat()*20)+70,(r.nextFloat()*20)+50,(r.nextFloat()*20)+20,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                            System.out.println(personagem.toString());
                            personagemDao.create(personagem);
                            System.out.println("Deseja adicionar acessorios?");
                            System.out.println("1- Sim");
                            System.out.println("2 - Nao");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    System.out.println("Escolha a Armadura:");
                                    System.out.println("1- "+Armadura.ARMADURA_PESADA_DE_COBRE + " -10 Velocidade, +20 Defesa");
                                    System.out.println("2- "+Armadura.ARMADURA_PESADA_DE_OURO + " -15 Velocidade, + +25 Defesa");
                                    System.out.println("3- "+Armadura.ARMADURA_PESADA_DE_DIAMANTE + " -20 Velocidade, + +40 Defesa");
                                    System.out.println("4- "+ Armadura.ARMADURA_PESADA_CELESTIAL + " -15 Velocidade, +50 Defesa");
                                    i = scanner.nextInt();
                                    switch (i){
                                        case 1:
                                            personagem.setArmadura(Armadura.ARMADURA_PESADA_DE_COBRE.toString());
                                            o = personagem.getDefesa() + 20;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 10;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Machado, +30 Ataque -20 Velocidade");
                                                    personagem.setArmas(Armas.MACHADO.toString());
                                                    o = personagem.getAtaque() + 30;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() - 20;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            personagem.setArmadura(Armadura.ARMADURA_PESADA_DE_OURO.toString());
                                            o = personagem.getDefesa() + 25;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 15;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Machado, +30 Ataque -20 Velocidade");
                                                    personagem.setArmas(Armas.MACHADO.toString());
                                                    o = personagem.getAtaque() + 30;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() - 20;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            personagem.setArmadura(Armadura.ARMADURA_PESADA_DE_DIAMANTE.toString());
                                            o = personagem.getDefesa() + 40;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 20;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Machado, +30 Ataque -20 Velocidade");
                                                    personagem.setArmas(Armas.MACHADO.toString());
                                                    o = personagem.getAtaque() + 30;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() - 20;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;
                                        case 4:
                                            personagem.setArmadura(Armadura.ARMADURA_PESADA_CELESTIAL.toString());
                                            o = personagem.getDefesa() + 50;
                                            personagem.setDefesa(o);
                                            o = personagem.getVelociade() - 15;
                                            personagem.setVelociade(o);
                                            personagemDao.update(personagem);
                                            System.out.println("Deseja adcionar arma?");
                                            System.out.println("1- Sim");
                                            System.out.println("2- Não");
                                            i = scanner.nextInt();
                                            switch (i){
                                                case 1:
                                                    System.out.println("Arma: Machado, +30 Ataque -20 Velocidade");
                                                    personagem.setArmas(Armas.MACHADO.toString());
                                                    o = personagem.getAtaque() + 30;
                                                    personagem.setAtaque(o);
                                                    o = personagem.getVelociade() - 20;
                                                    personagem.setVelociade(o);
                                                    personagemDao.update(personagem);
                                                    break;
                                                case 2:
                                                    System.out.println("Personagem Criado!");
                                                    break;
                                            }
                                            break;

                                    }

                                    break;
                                case 2:
                                    System.out.println("Personagem Criado!");
                                    break;
                            }
                        }

                        break;
                    case 3:
                        System.out.println("Nome: " + nome);
                        System.out.println("Raca: Elfos");
                        Personagem personagem = new Personagem(Idgenerator(),Raca.ELF.toString(),Profissao.MAGO.toString(),(r.nextFloat()*30)+70,nome,(r.nextFloat()*30)+20,(r.nextFloat()*30)+70,(r.nextFloat()*20)+40,(r.nextFloat()*20)+70,(r.nextFloat()*20)+50,(r.nextFloat()*20)+20,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                        System.out.println(personagem.toString());
                        personagemDao.create(personagem);
                        System.out.println("Deseja adicionar acessorios?");
                        System.out.println("1- Sim");
                        System.out.println("2 - Nao");
                        i = scanner.nextInt();
                        switch (i){
                            case 1:
                                System.out.println("Escolha a Armadura:");
                                System.out.println("1- "+Armadura.CAPA_DE_COURO + " +5 Mana, +10 Defesa Magica");
                                System.out.println("2- "+Armadura.CAPA_DA_INVISIBILIDADE + " +10 Mana , +10 Defesa Magica");
                                System.out.println("3- "+Armadura.CAPA_CELESTIAL + " +20 Mana, + +20 Defesa Magica");
                                i = scanner.nextInt();
                                switch (i){
                                    case 1:
                                        personagem.setArmadura(Armadura.CAPA_DE_COURO.toString());
                                        o = personagem.getDefesa_magica() + 10;
                                        personagem.setDefesa_magica(o);
                                        o = personagem.getMana() + 5;
                                        personagem.setMana(o);
                                        personagemDao.update(personagem);
                                        System.out.println("Deseja adcionar arma?");
                                        System.out.println("1- Sim");
                                        System.out.println("2- Não");
                                        i = scanner.nextInt();
                                        switch (i){
                                            case 1:
                                                System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                                personagem.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                                o = personagem.getAtaque_magico() + 10;
                                                personagem.setAtaque_magico(o);
                                                o = personagem.getMana() + 10;
                                                personagem.setMana(o);
                                                personagemDao.update(personagem);
                                                break;
                                            case 2:
                                                System.out.println("Personagem Criado!");
                                                break;
                                        }
                                        break;
                                    case 2:
                                        personagem.setArmadura(Armadura.CAPA_DA_INVISIBILIDADE.toString());
                                        o = personagem.getDefesa_magica() + 10;
                                        personagem.setDefesa_magica(o);
                                        o = personagem.getMana() + 10;
                                        personagem.setMana(o);
                                        personagemDao.update(personagem);
                                        System.out.println("Deseja adcionar arma?");
                                        System.out.println("1- Sim");
                                        System.out.println("2- Não");
                                        i = scanner.nextInt();
                                        switch (i){
                                            case 1:
                                                System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                                personagem.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                                o = personagem.getAtaque_magico() + 10;
                                                personagem.setAtaque_magico(o);
                                                o = personagem.getMana() + 10;
                                                personagem.setMana(o);
                                                personagemDao.update(personagem);
                                                break;
                                            case 2:
                                                System.out.println("Personagem Criado!");
                                                break;
                                        }
                                        break;
                                    case 3:
                                        personagem.setArmadura(Armadura.CAPA_CELESTIAL.toString());
                                        o = personagem.getDefesa_magica() + 20;
                                        personagem.setDefesa_magica(o);
                                        o = personagem.getMana() + 20;
                                        personagem.setMana(o);
                                        personagemDao.update(personagem);
                                        System.out.println("Deseja adcionar arma?");
                                        System.out.println("1- Sim");
                                        System.out.println("2- Não");
                                        i = scanner.nextInt();
                                        switch (i){
                                            case 1:
                                                System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                                personagem.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                                o = personagem.getAtaque_magico() + 10;
                                                personagem.setAtaque_magico(o);
                                                o = personagem.getMana() + 10;
                                                personagem.setMana(o);
                                                personagemDao.update(personagem);
                                                break;
                                            case 2:
                                                System.out.println("Personagem Criado!");
                                                break;
                                        }
                                        break;


                                }

                                break;
                            case 2:
                                System.out.println("Personagem Criado!");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Nome: " + nome);
                        System.out.println("Raca: Dark Elfs");
                        Personagem personagem1 = new Personagem(Idgenerator(),Raca.DARK_ELF.toString(),Profissao.MAGO.toString(),(r.nextFloat()*30)+70,nome,(r.nextFloat()*30)+20,(r.nextFloat()*20)+80,(r.nextFloat()*20)+10,(r.nextFloat()*20)+30,(r.nextFloat()*20)+50,(r.nextFloat()*20)+60,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                        System.out.println(personagem1.toString());
                        personagemDao.create(personagem1);
                        System.out.println("Deseja adicionar acessorios?");
                        System.out.println("1- Sim");
                        System.out.println("2 - Nao");
                        i = scanner.nextInt();
                        switch (i){
                            case 1:
                                System.out.println("Escolha a Armadura:");
                                System.out.println("1- "+Armadura.CAPA_DE_COURO + " +5 Mana, +10 Defesa Magica");
                                System.out.println("2- "+Armadura.CAPA_DA_INVISIBILIDADE + " +10 Mana , +10 Defesa Magica");
                                System.out.println("3- "+Armadura.CAPA_CELESTIAL + " +20 Mana, + +20 Defesa Magica");
                                i = scanner.nextInt();
                                switch (i){
                                    case 1:
                                        personagem1.setArmadura(Armadura.CAPA_DE_COURO.toString());
                                        o = personagem1.getDefesa_magica() + 10;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() + 5;
                                        personagem1.setMana(o);
                                        personagemDao.update(personagem1);
                                        System.out.println("Deseja adcionar arma?");
                                        System.out.println("1- Sim");
                                        System.out.println("2- Não");
                                        i = scanner.nextInt();
                                        switch (i){
                                            case 1:
                                                System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                                personagem1.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                                o = personagem1.getAtaque_magico() + 10;
                                                personagem1.setAtaque_magico(o);
                                                o = personagem1.getMana() + 10;
                                                personagem1.setMana(o);
                                                personagemDao.update(personagem1);
                                                break;
                                            case 2:
                                                System.out.println("Personagem Criado!");
                                                break;
                                        }
                                        break;
                                    case 2:
                                        personagem1.setArmadura(Armadura.CAPA_DA_INVISIBILIDADE.toString());
                                        o = personagem1.getDefesa_magica() + 10;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() + 10;
                                        personagem1.setMana(o);
                                        personagemDao.update(personagem1);
                                        System.out.println("Deseja adcionar arma?");
                                        System.out.println("1- Sim");
                                        System.out.println("2- Não");
                                        i = scanner.nextInt();
                                        switch (i){
                                            case 1:
                                                System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                                personagem1.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                                o = personagem1.getAtaque_magico() + 10;
                                                personagem1.setAtaque_magico(o);
                                                o = personagem1.getMana() + 10;
                                                personagem1.setMana(o);
                                                personagemDao.update(personagem1);
                                                break;
                                            case 2:
                                                System.out.println("Personagem Criado!");
                                                break;
                                        }
                                        break;
                                    case 3:
                                        personagem1.setArmadura(Armadura.CAPA_CELESTIAL.toString());
                                        o = personagem1.getDefesa_magica() + 20;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() + 20;
                                        personagem1.setMana(o);
                                        personagemDao.update(personagem1);
                                        System.out.println("Deseja adcionar arma?");
                                        System.out.println("1- Sim");
                                        System.out.println("2- Não");
                                        i = scanner.nextInt();
                                        switch (i){
                                            case 1:
                                                System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                                personagem1.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                                o = personagem1.getAtaque_magico() + 10;
                                                personagem1.setAtaque_magico(o);
                                                o = personagem1.getMana() + 10;
                                                personagem1.setMana(o);
                                                personagemDao.update(personagem1);
                                                break;
                                            case 2:
                                                System.out.println("Personagem Criado!");
                                                break;
                                        }
                                        break;


                                }

                                break;
                            case 2:
                                System.out.println("Personagem Criado!");
                                break;
                        }
                        break;

                }
                break;
            case 2:
                System.out.println("Qual deseja deletar?");
                System.out.println(personagemDao.getAll().toString());
                int u = scanner.nextInt();
                Personagem personagem2 = null;
                for(int l = 0;l < personagemDao.getAll().size();l++){
                    if (u == personagemDao.getAll().get(l).getId()){
                        personagem2 = personagemDao.getAll().get(l);
                    }
                }if(personagem2 != null){
                personagemDao.delete(personagem2);}
                else {
                System.out.println("nao existe esse personagem");
                }
                break;
            case 3:
                System.out.println("Qual deseja alterar?");
                System.out.println(personagemDao.getAll().toString());
                int p = scanner.nextInt();
                Personagem personagem1 = null;
                for(int l = 0;l < personagemDao.getAll().size();l++){
                    if (p == personagemDao.getAll().get(l).getId()){
                        personagem1 = personagemDao.getAll().get(l);
                    }
                }if(personagem1 != null){
                if(personagem1.getRaca().equals(Raca.KHAJIIT.toString())){
                    System.out.println(personagem1.toString());
                    System.out.println("Oque deseja alterar?");
                    System.out.println("1- Adicionar Pedra?");
                    System.out.println("2- Alerar Armadura?");
                    System.out.println("3- Remover ou adicionar Arma");
                    i = scanner.nextInt();
                    switch (i){
                        case 1:
                            System.out.println("Qual pedra deseja adicionar?");
                            System.out.println("1- " + Pedra.PEDRA_AZUL + " +5 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("2- " + Pedra.PEDRA_ROXA + " +10 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("3- " + Pedra.PEDRA_VERDE + " +15 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("4- " + Pedra.PEDRA_VERMELHA + " +20 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("1- " + Pedra.PEDRA_CELESTIAL + " +30 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    personagem1.setPedra(Pedra.PEDRA_AZUL.toString());
                                    o = personagem1.getAtaque()+5;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+5;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+5;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+5;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 2:
                                    personagem1.setPedra(Pedra.PEDRA_ROXA.toString());
                                    o = personagem1.getAtaque()+10;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+10;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+10;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+10;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 3:
                                    personagem1.setPedra(Pedra.PEDRA_VERDE.toString());
                                    o = personagem1.getAtaque()+15;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+15;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+15;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+15;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 4:
                                    personagem1.setPedra(Pedra.PEDRA_VERMELHA.toString());
                                    o = personagem1.getAtaque()+20;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+20;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+20;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+20;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 5:
                                personagem1.setPedra(Pedra.PEDRA_CELESTIAL.toString());
                                o = personagem1.getAtaque()+30;
                                personagem1.setAtaque(o);
                                o = personagem1.getAtaque_magico()+30;
                                personagem1.setAtaque_magico(o);
                                o = personagem1.getDefesa()+30;
                                personagem1.setDefesa(o);
                                o = personagem1.getDefesa_magica()+30;
                                personagem1.setDefesa_magica(o);
                                personagemDao.update(personagem1);
                                break;
                            }
                            break;
                        case 2:
                            if(personagem1.getProfissao().equals(Profissao.LADRAO.toString())){
                                System.out.println("Armadura atual: "+personagem1.getArmadura());
                                System.out.println("Escolha a Armadura:");
                                System.out.println("1- "+Armadura.ROUPA_DE_VELOCIDADE + " +20 Velocidade, +10 Defesa");
                                System.out.println("2- "+Armadura.ARMADURA_DE_COBRE + " -5 Velocidade, + +5 Defesa");
                                System.out.println("3- "+Armadura.ARMADURA_DE_FERRO + " -10 Velocidade, + +10 Defesa");
                                System.out.println("4- "+ Armadura.ARMADURA_DE_DIAMANTE + " +20 Defesa");
                                System.out.println("5- "+ Armadura.ARMADURA_CELESTIAL + " +10 Velocidade, +30 Defesa");
                                System.out.println("6- Remover a armadura");
                                i = scanner.nextInt();
                                switch (i){
                                    case 1:
                                        if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +25;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getVelociade() +30;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 2:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getDefesa() - 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() - 25;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() - 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 15;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() - 5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 25;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -15;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 3:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getVelociade() -30;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 4:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 15;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getVelociade() -20;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 5:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 25;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +15;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 30;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 6:
                                        if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() - 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getVelociade() -20;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 30;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }break;


                                }
                            }else {
                                System.out.println("Armadura atual: "+personagem1.getArmadura());
                                System.out.println("Escolha a Armadura:");
                                System.out.println("1- "+Armadura.ARMADURA_DE_COBRE + " -5 Velocidade, + +5 Defesa");
                                System.out.println("2- "+Armadura.ARMADURA_DE_FERRO + " -10 Velocidade, + +10 Defesa");
                                System.out.println("3- "+ Armadura.ARMADURA_DE_DIAMANTE + " +20 Defesa");
                                System.out.println("4- "+ Armadura.ARMADURA_CELESTIAL + " +10 Velocidade, +30 Defesa");
                                System.out.println("5- Remover a armadura");
                                i = scanner.nextInt();
                                switch (i){
                                    case 1:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() - 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 15;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() - 5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 25;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -15;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 2:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 3:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 15;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 4:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 25;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +15;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 30;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 5:
                                        if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() - 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 30;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }break;

                                }
                            }
                            break;
                        case 3:
                            System.out.println("1- Adicionar Arma");
                            System.out.println("2- Remover Arma");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    if(personagem1.getProfissao().equals(Profissao.LADRAO.toString())){
                                        System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                        personagem1.setArmas(Armas.ADAGA.toString());
                                        o = personagem1.getAtaque() + 10;
                                        personagem1.setAtaque(o);
                                        o = personagem1.getVelociade() + 10;
                                        personagem1.setVelociade(o);
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getProfissao().equals(Profissao.GUERREIRO.toString())){
                                        System.out.println("Arma: Espada, +15 Ataque -5 Velocidade");
                                        personagem1.setArmas(Armas.ESPADA.toString());
                                        o = personagem1.getAtaque() + 15;
                                        personagem1.setAtaque(o);
                                        o = personagem1.getVelociade() - 5;
                                        personagem1.setVelociade(o);
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getProfissao().equals(Profissao.ARQUEIRO.toString())){
                                        System.out.println("Arma: Arco, +15 Ataque");
                                        personagem1.setArmas(Armas.ARCO.toString());
                                        o = personagem1.getAtaque() + 15;
                                        personagem1.setAtaque(o);
                                        personagemDao.update(personagem1);
                                    }
                                    break;
                                case 2:
                                    if(personagem1.getProfissao().equals(Profissao.LADRAO.toString())){
                                    personagem1.setArmas(Armas.NAO_POSSUI.toString());
                                    o = personagem1.getAtaque() - 10;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getVelociade() - 10;
                                    personagem1.setVelociade(o);
                                    personagemDao.update(personagem1);
                                }else if(personagem1.getProfissao().equals(Profissao.GUERREIRO.toString())){
                                    personagem1.setArmas(Armas.NAO_POSSUI.toString());
                                    o = personagem1.getAtaque() - 15;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getVelociade() + 5;
                                    personagem1.setVelociade(o);
                                    personagemDao.update(personagem1);
                                }else if(personagem1.getProfissao().equals(Profissao.ARQUEIRO.toString())){
                                    personagem1.setArmas(Armas.NAO_POSSUI.toString());
                                    o = personagem1.getAtaque() - 15;
                                    personagem1.setAtaque(o);
                                    personagemDao.update(personagem1);
                                }
                                    break;
                            }
                        break;

                    }
                }else if(personagem1.getRaca().equals(Raca.ARGONIANS.toString())){
                    System.out.println(personagem1.toString());
                    System.out.println("Oque deseja alterar?");
                    System.out.println("1- Adicionar Pedra?");
                    System.out.println("2- Alerar Armadura?");
                    System.out.println("3- Remover ou adicionar Arma?");
                    i = scanner.nextInt();
                    switch (i){
                        case 1:
                            System.out.println("Qual pedra deseja adicionar?");
                            System.out.println("1- " + Pedra.PEDRA_AZUL + " +5 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("2- " + Pedra.PEDRA_ROXA + " +10 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("3- " + Pedra.PEDRA_VERDE + " +15 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("4- " + Pedra.PEDRA_VERMELHA + " +20 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("1- " + Pedra.PEDRA_CELESTIAL + " +30 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    personagem1.setPedra(Pedra.PEDRA_AZUL.toString());
                                    o = personagem1.getAtaque()+5;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+5;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+5;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+5;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 2:
                                    personagem1.setPedra(Pedra.PEDRA_ROXA.toString());
                                    o = personagem1.getAtaque()+10;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+10;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+10;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+10;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 3:
                                    personagem1.setPedra(Pedra.PEDRA_VERDE.toString());
                                    o = personagem1.getAtaque()+15;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+15;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+15;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+15;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 4:
                                    personagem1.setPedra(Pedra.PEDRA_VERMELHA.toString());
                                    o = personagem1.getAtaque()+20;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+20;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+20;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+20;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 5:
                                    personagem1.setPedra(Pedra.PEDRA_CELESTIAL.toString());
                                    o = personagem1.getAtaque()+30;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+30;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+30;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+30;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                            }
                            break;
                        case 2:
                            if(personagem1.getProfissao().equals(Profissao.LADRAO.toString())){
                                System.out.println("Armadura atual: "+personagem1.getArmadura());
                                System.out.println("Escolha a Armadura:");
                                System.out.println("1- "+Armadura.ROUPA_DE_VELOCIDADE + " +20 Velocidade, +10 Defesa");
                                System.out.println("2- "+Armadura.ARMADURA_DE_COBRE + " -5 Velocidade, + +5 Defesa");
                                System.out.println("3- "+Armadura.ARMADURA_DE_FERRO + " -10 Velocidade, + +10 Defesa");
                                System.out.println("4- "+ Armadura.ARMADURA_DE_DIAMANTE + " +20 Defesa");
                                System.out.println("5- "+ Armadura.ARMADURA_CELESTIAL + " +10 Velocidade, +30 Defesa");
                                System.out.println("6- Remover a armadura");
                                i = scanner.nextInt();
                                switch (i){
                                    case 1:
                                        if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +25;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getVelociade() +30;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ROUPA_DE_VELOCIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 2:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getDefesa() - 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() - 25;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() - 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 15;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() - 5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 25;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -15;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 3:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getVelociade() -30;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_FERRO.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 4:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 15;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getVelociade() -20;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 5:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 25;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +15;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() + 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 30;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 6:
                                        if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() - 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ROUPA_DE_VELOCIDADE.toString())){
                                            o = personagem1.getVelociade() -20;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_FERRO.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 30;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }break;


                                }
                            }else if(personagem1.getProfissao().equals(Profissao.TANQUE.toString())){
                                System.out.println("Armadura atual: "+personagem1.getArmadura());
                                System.out.println("Escolha a Armadura:");
                                System.out.println("1- "+Armadura.ARMADURA_PESADA_DE_COBRE + " -10 Velocidade, +20 Defesa");
                                System.out.println("2- "+Armadura.ARMADURA_PESADA_DE_OURO + " -15 Velocidade, + +25 Defesa");
                                System.out.println("3- "+Armadura.ARMADURA_PESADA_DE_DIAMANTE + " -20 Velocidade, + +40 Defesa");
                                System.out.println("4- "+ Armadura.ARMADURA_PESADA_CELESTIAL + " -15 Velocidade, +50 Defesa");
                                System.out.println("5- Remover a armadura");
                                i = scanner.nextInt();
                                switch (i){
                                    case 1:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_COBRE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_OURO.toString())){
                                            o = personagem1.getDefesa() - 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_DIAMANTE.toString())){
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 30;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() + 5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 2:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_OURO.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 5;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() - 5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_OURO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_DIAMANTE.toString())){
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() - 15;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_OURO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 25;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_OURO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 25;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -15;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_OURO.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 3:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_DIAMANTE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_OURO.toString())){
                                            o = personagem1.getDefesa() + 15;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() - 5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_COBRE.toString())){
                                            o = personagem1.getVelociade() - 5;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() + 20;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 10;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() - 5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_DIAMANTE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 40;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 4:
                                        if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_CELESTIAL.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_OURO.toString())){
                                            o = personagem1.getDefesa() + 25;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_DIAMANTE.toString())){
                                            o = personagem1.getVelociade() +5;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() +10;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() + 30;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() - 5;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa() + 50;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() -15;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.ARMADURA_PESADA_DE_COBRE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 5:
                                        if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_COBRE.toString())){
                                            o = personagem1.getDefesa() - 20;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +10;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_OURO.toString())){
                                            o = personagem1.getVelociade() + 15;
                                            personagem1.setVelociade(o);
                                            o = personagem1.getDefesa() - 25;
                                            personagem1.setDefesa(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_DE_DIAMANTE.toString())){
                                            o = personagem1.getDefesa() - 40;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +20;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.ARMADURA_PESADA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa() - 50;
                                            personagem1.setDefesa(o);
                                            o = personagem1.getVelociade() +15;
                                            personagem1.setVelociade(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }break;



                                }

                            }else if (personagem1.getProfissao().equals(Profissao.MAGO.toString())){
                                System.out.println("Armadura atual: "+personagem1.getArmadura());
                                System.out.println("Escolha a Armadura:");
                                System.out.println("1- "+Armadura.CAPA_DE_COURO + " +5 Mana, +10 Defesa Magica");
                                System.out.println("2- "+Armadura.CAPA_DA_INVISIBILIDADE + " +10 Mana , +10 Defesa Magica");
                                System.out.println("3- "+Armadura.CAPA_CELESTIAL + " +20 Mana, + +20 Defesa Magica");
                                System.out.println("4- Remover Armadura");
                                i = scanner.nextInt();
                                switch (i){
                                    case 1:
                                        if(personagem1.getArmadura().equals(Armadura.CAPA_DE_COURO.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.CAPA_DA_INVISIBILIDADE.toString())){
                                            o = personagem1.getMana() -5;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.CAPA_DE_COURO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.CAPA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa_magica() - 10;
                                            personagem1.setDefesa_magica(o);
                                            o = personagem1.getMana() - 15;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.CAPA_DE_COURO.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa_magica() + 10;
                                            personagem1.setDefesa_magica(o);
                                            o = personagem1.getMana() + 5;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.CAPA_DE_COURO.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 2:
                                        if(personagem1.getArmadura().equals(Armadura.CAPA_DA_INVISIBILIDADE.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.CAPA_DE_COURO.toString())){
                                            o = personagem1.getMana() +5;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.CAPA_DA_INVISIBILIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.CAPA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa_magica() - 10;
                                            personagem1.setDefesa_magica(o);
                                            o = personagem1.getMana() - 10;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.CAPA_DA_INVISIBILIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa_magica() + 10;
                                            personagem1.setDefesa_magica(o);
                                            o = personagem1.getMana() + 10;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.CAPA_DA_INVISIBILIDADE.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 3:
                                        if(personagem1.getArmadura().equals(Armadura.CAPA_CELESTIAL.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.CAPA_DA_INVISIBILIDADE.toString())){
                                            o = personagem1.getMana() +15;
                                            personagem1.setMana(o);
                                            o = personagem1.getDefesa_magica() + 10;
                                            personagem1.setDefesa_magica(o);
                                            personagem1.setArmadura(Armadura.CAPA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.CAPA_DE_COURO.toString())){
                                            o = personagem1.getDefesa_magica() + 10;
                                            personagem1.setDefesa_magica(o);
                                            o = personagem1.getMana() + 15;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.CAPA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            o = personagem1.getDefesa_magica() + 20;
                                            personagem1.setDefesa_magica(o);
                                            o = personagem1.getMana() + 20;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.CAPA_CELESTIAL.toString());
                                            personagemDao.update(personagem1);
                                        }
                                        break;
                                    case 4:
                                        if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                            System.out.println("Nada atualizado!");
                                        }else if(personagem1.getArmadura().equals(Armadura.CAPA_DA_INVISIBILIDADE.toString())){
                                            o = personagem1.getMana() - 10;
                                            personagem1.setMana(o);
                                            o = personagem1.getDefesa_magica() - 10;
                                            personagem1.setDefesa_magica(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.CAPA_DE_COURO.toString())){
                                            o = personagem1.getDefesa_magica() - 10;
                                            personagem1.setDefesa_magica(o);
                                            o = personagem1.getMana() - 5;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }else if(personagem1.getArmadura().equals(Armadura.CAPA_CELESTIAL.toString())){
                                            o = personagem1.getDefesa_magica() - 20;
                                            personagem1.setDefesa_magica(o);
                                            o = personagem1.getMana() - 20;
                                            personagem1.setMana(o);
                                            personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                            personagemDao.update(personagem1);
                                        }break;



                                }
                            }
                         break;
                        case 3:
                            System.out.println("1- Adicionar Arma");
                            System.out.println("2- Remover Arma");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    if(personagem1.getProfissao().equals(Profissao.LADRAO.toString())){
                                        System.out.println("Arma: Adaga, +10 Ataque +10 Velocidade");
                                        personagem1.setArmas(Armas.ADAGA.toString());
                                        o = personagem1.getAtaque() + 10;
                                        personagem1.setAtaque(o);
                                        o = personagem1.getVelociade() + 10;
                                        personagem1.setVelociade(o);
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getProfissao().equals(Profissao.TANQUE.toString())){
                                        System.out.println("Arma: Machado, +30 Ataque -20 Velocidade");
                                        personagem1.setArmas(Armas.MACHADO.toString());
                                        o = personagem1.getAtaque() + 30;
                                        personagem1.setAtaque(o);
                                        o = personagem1.getVelociade() - 20;
                                        personagem1.setVelociade(o);
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getProfissao().equals(Profissao.MAGO.toString())){
                                        System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                        personagem1.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                        o = personagem1.getAtaque_magico() + 10;
                                        personagem1.setAtaque_magico(o);
                                        o = personagem1.getMana() + 10;
                                        personagem1.setMana(o);
                                        personagemDao.update(personagem1);
                                    }
                                    break;
                                case 2:
                                    if(personagem1.getProfissao().equals(Profissao.LADRAO.toString())){
                                        personagem1.setArmas(Armas.NAO_POSSUI.toString());
                                        o = personagem1.getAtaque() - 10;
                                        personagem1.setAtaque(o);
                                        o = personagem1.getVelociade() - 10;
                                        personagem1.setVelociade(o);
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getProfissao().equals(Profissao.TANQUE.toString())){
                                        personagem1.setArmas(Armas.NAO_POSSUI.toString());
                                        o = personagem1.getAtaque() - 30;
                                        personagem1.setAtaque(o);
                                        o = personagem1.getVelociade() + 20;
                                        personagem1.setVelociade(o);
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getProfissao().equals(Profissao.MAGO.toString())){
                                        personagem1.setArmas(Armas.NAO_POSSUI.toString());
                                        o = personagem1.getAtaque_magico() - 10;
                                        personagem1.setAtaque_magico(o);
                                        o = personagem1.getMana() - 10;
                                        personagem1.setMana(o);
                                        personagemDao.update(personagem1);
                                    }
                                    break;
                            }
                            break;
                    }
                }else if(personagem1.getRaca().equals(Raca.ELF.toString()) || personagem1.getRaca().equals(Raca.DARK_ELF.toString())){
                    System.out.println(personagem1.toString());
                    System.out.println("Oque deseja alterar?");
                    System.out.println("1- Adicionar Pedra?");
                    System.out.println("2- Alerar Armadura?");
                    System.out.println("3- Remover ou adicionar Arma?");
                    i = scanner.nextInt();
                    switch (i){
                        case 1:
                            System.out.println("Qual pedra deseja adicionar?");
                            System.out.println("1- " + Pedra.PEDRA_AZUL + " +5 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("2- " + Pedra.PEDRA_ROXA + " +10 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("3- " + Pedra.PEDRA_VERDE + " +15 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("4- " + Pedra.PEDRA_VERMELHA + " +20 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            System.out.println("1- " + Pedra.PEDRA_CELESTIAL + " +30 em Ataque, Ataque_Magico, Defesa, Defesa_Magica");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    personagem1.setPedra(Pedra.PEDRA_AZUL.toString());
                                    o = personagem1.getAtaque()+5;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+5;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+5;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+5;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 2:
                                    personagem1.setPedra(Pedra.PEDRA_ROXA.toString());
                                    o = personagem1.getAtaque()+10;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+10;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+10;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+10;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 3:
                                    personagem1.setPedra(Pedra.PEDRA_VERDE.toString());
                                    o = personagem1.getAtaque()+15;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+15;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+15;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+15;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 4:
                                    personagem1.setPedra(Pedra.PEDRA_VERMELHA.toString());
                                    o = personagem1.getAtaque()+20;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+20;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+20;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+20;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 5:
                                    personagem1.setPedra(Pedra.PEDRA_CELESTIAL.toString());
                                    o = personagem1.getAtaque()+30;
                                    personagem1.setAtaque(o);
                                    o = personagem1.getAtaque_magico()+30;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getDefesa()+30;
                                    personagem1.setDefesa(o);
                                    o = personagem1.getDefesa_magica()+30;
                                    personagem1.setDefesa_magica(o);
                                    personagemDao.update(personagem1);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Armadura atual: "+personagem1.getArmadura());
                            System.out.println("Escolha a Armadura:");
                            System.out.println("1- "+Armadura.CAPA_DE_COURO + " +5 Mana, +10 Defesa Magica");
                            System.out.println("2- "+Armadura.CAPA_DA_INVISIBILIDADE + " +10 Mana , +10 Defesa Magica");
                            System.out.println("3- "+Armadura.CAPA_CELESTIAL + " +20 Mana, + +20 Defesa Magica");
                            System.out.println("4- Remover Armadura");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    if(personagem1.getArmadura().equals(Armadura.CAPA_DE_COURO.toString())){
                                        System.out.println("Nada atualizado!");
                                    }else if(personagem1.getArmadura().equals(Armadura.CAPA_DA_INVISIBILIDADE.toString())){
                                        o = personagem1.getMana() -5;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.CAPA_DE_COURO.toString());
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getArmadura().equals(Armadura.CAPA_CELESTIAL.toString())){
                                        o = personagem1.getDefesa_magica() - 10;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() - 15;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.CAPA_DE_COURO.toString());
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                        o = personagem1.getDefesa_magica() + 10;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() + 5;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.CAPA_DE_COURO.toString());
                                        personagemDao.update(personagem1);
                                    }
                                    break;
                                case 2:
                                    if(personagem1.getArmadura().equals(Armadura.CAPA_DA_INVISIBILIDADE.toString())){
                                        System.out.println("Nada atualizado!");
                                    }else if(personagem1.getArmadura().equals(Armadura.CAPA_DE_COURO.toString())){
                                        o = personagem1.getMana() +5;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.CAPA_DA_INVISIBILIDADE.toString());
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getArmadura().equals(Armadura.CAPA_CELESTIAL.toString())){
                                        o = personagem1.getDefesa_magica() - 10;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() - 10;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.CAPA_DA_INVISIBILIDADE.toString());
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                        o = personagem1.getDefesa_magica() + 10;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() + 10;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.CAPA_DA_INVISIBILIDADE.toString());
                                        personagemDao.update(personagem1);
                                    }
                                    break;
                                case 3:
                                    if(personagem1.getArmadura().equals(Armadura.CAPA_CELESTIAL.toString())){
                                        System.out.println("Nada atualizado!");
                                    }else if(personagem1.getArmadura().equals(Armadura.CAPA_DA_INVISIBILIDADE.toString())){
                                        o = personagem1.getMana() +15;
                                        personagem1.setMana(o);
                                        o = personagem1.getDefesa_magica() + 10;
                                        personagem1.setDefesa_magica(o);
                                        personagem1.setArmadura(Armadura.CAPA_CELESTIAL.toString());
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getArmadura().equals(Armadura.CAPA_DE_COURO.toString())){
                                        o = personagem1.getDefesa_magica() + 10;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() + 15;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.CAPA_CELESTIAL.toString());
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                        o = personagem1.getDefesa_magica() + 20;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() + 20;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.CAPA_CELESTIAL.toString());
                                        personagemDao.update(personagem1);
                                    }
                                    break;
                                case 4:
                                    if(personagem1.getArmadura().equals(Armadura.NAO_POSSUI.toString())){
                                        System.out.println("Nada atualizado!");
                                    }else if(personagem1.getArmadura().equals(Armadura.CAPA_DA_INVISIBILIDADE.toString())){
                                        o = personagem1.getMana() - 10;
                                        personagem1.setMana(o);
                                        o = personagem1.getDefesa_magica() - 10;
                                        personagem1.setDefesa_magica(o);
                                        personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getArmadura().equals(Armadura.CAPA_DE_COURO.toString())){
                                        o = personagem1.getDefesa_magica() - 10;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() - 5;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                        personagemDao.update(personagem1);
                                    }else if(personagem1.getArmadura().equals(Armadura.CAPA_CELESTIAL.toString())){
                                        o = personagem1.getDefesa_magica() - 20;
                                        personagem1.setDefesa_magica(o);
                                        o = personagem1.getMana() - 20;
                                        personagem1.setMana(o);
                                        personagem1.setArmadura(Armadura.NAO_POSSUI.toString());
                                        personagemDao.update(personagem1);
                                    }break;

                            }

                            break;
                        case 3:
                            System.out.println("1- Adicionar Arma");
                            System.out.println("2- Remover Arma");
                            i = scanner.nextInt();
                            switch (i){
                                case 1:
                                    System.out.println("Arma: Livro, +10 Ataque Magico +10 Mana");
                                    personagem1.setArmas(Armas.LIVRO_DE_MAGIAS.toString());
                                    o = personagem1.getAtaque_magico() + 10;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getMana() + 10;
                                    personagem1.setMana(o);
                                    personagemDao.update(personagem1);
                                    break;
                                case 2:
                                    personagem1.setArmas(Armas.NAO_POSSUI.toString());
                                    o = personagem1.getAtaque_magico() - 10;
                                    personagem1.setAtaque_magico(o);
                                    o = personagem1.getMana() - 10;
                                    personagem1.setMana(o);
                                    personagemDao.update(personagem1);
                                    break;
                            }
                            break;
                    }
                }}else {
                System.out.println("Personagem nao existe");
            }
                break;
            case 4:
                System.out.println(personagemDao.getAll().toString());
                break;
        }
        h++;
    }
}
private int Idgenerator(){
    int i, j;
    PersonagemDao personagemDao = new PersonagemDao();
    Random r = new Random();
    j = r.nextInt();
    for(i = 0;i < personagemDao.getAll().size();i++ ){
        if (j == personagemDao.getAll().get(i).getId()){
            j = r.nextInt();
        }
    }

    return j;
}
}