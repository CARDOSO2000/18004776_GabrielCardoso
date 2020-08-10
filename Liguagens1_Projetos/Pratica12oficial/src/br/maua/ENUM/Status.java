package br.maua.ENUM;

public enum Status {
    PLATINADO{
        @Override
        public String toString(){
            return "Platinado";
        }
    }, NAO_INICIADO{
        @Override
        public String toString(){
            return "Nao iniciado";
        }
    }, TERMINADO{
        @Override
        public String toString(){
            return "Terminado";
        }
    }, JOGANDO{
        @Override
        public String toString(){
            return "Jogando";
        }
    }, NAO_ACABADO{
        @Override
        public String toString(){
            return "Nao acabado";
        }
    }
}
