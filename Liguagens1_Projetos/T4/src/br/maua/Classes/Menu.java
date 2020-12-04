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
    while (n != 0 ){
        System.out.println("Oque voce deseja fazer?");
        System.out.println("1- Criar um personagem");
        System.out.println("2- Deletar personagem");
        System.out.println("3- Alterar Personagem");
        System.out.println("0 - Sair");
        n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Qual Nome?");
                nome = scanner.nextLine();
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
                        g = scanner.nextLine();
                        if(g.equals(Profissao.LADRAO)){
                            Personagem personagem = new Personagem(h,Raca.KHAJIIT.toString(),Profissao.LADRAO.toString(),(r.nextFloat()*20)+5,nome,(r.nextFloat()*30)+70,(r.nextFloat()*20)+5,(r.nextFloat()*20)+50,(r.nextFloat()*20)+50,(r.nextFloat()*20)+80,(r.nextFloat()*20)+80,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                            personagem.toString();
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

                        }else if(g.equals(Profissao.GUERREIRO)){
                            Personagem personagem = new Personagem(h,Raca.KHAJIIT.toString(),Profissao.GUERREIRO.toString(),(r.nextFloat()*20)+5,nome,(r.nextFloat()*30)+70,(r.nextFloat()*20)+5,(r.nextFloat()*20)+50,(r.nextFloat()*20)+50,(r.nextFloat()*20)+80,(r.nextFloat()*20)+80,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                            personagem.toString();
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
                        }else if(g.equals(Profissao.ARQUEIRO)){
                            Personagem personagem = new Personagem(h,Raca.KHAJIIT.toString(),Profissao.ARQUEIRO.toString(),(r.nextFloat()*20)+5,nome,(r.nextFloat()*30)+70,(r.nextFloat()*20)+5,(r.nextFloat()*20)+50,(r.nextFloat()*20)+50,(r.nextFloat()*20)+80,(r.nextFloat()*20)+80,0,0, Armadura.NAO_POSSUI.toString(), Armas.NAO_POSSUI.toString(), Pedra.NAO_POSSUI.toString());
                            personagem.toString();
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
                        System.out.println(Profissao.GUERREIRO + " - Arma: Espada");
                        System.out.println(Profissao.ARQUEIRO + "- Arma: Arco");
                        break;
                }
                break;
        }
        h++;
    }
}

}