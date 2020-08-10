package br.maua.parcer;

import br.maua.ENUM.Status;

public class StatusParcer {
    public static Status toStatus(String status){
        if(status.equals("Platinado"))return Status.PLATINADO;
        if(status.equals("Nao Iniciado"))return Status.NAO_INICIADO;
        if(status.equals("Terminado"))return Status.TERMINADO;
        if(status.equals("Jogando"))return Status.JOGANDO;
        else return Status.NAO_INICIADO;
    }
}
