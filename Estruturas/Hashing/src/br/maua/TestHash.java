package br.maua;



public class TestHash {
    public static void main(String[] args) {
        Integer hashcode = null, chave;
        Integer[] tabKeys = new Integer[] { 23, 45, 77, 11, 33, 49, 10, 4, 89, 14} ;
        Integer[] tabHash = new Integer[10];
        int e = 0;

        for (int i = 0; i < tabKeys.length; i++) {
            chave = (tabKeys[i]);
            hashcode = hash(chave);
            System.out.println("Chave = " + chave +
                    " mapeada para hascode = " + hashcode);
            if (tabHash[hashcode] == null) {
                tabHash[hashcode] = tabKeys[i];

            }
            else {
                System.out.println("** Colisao no slot da Tabela Hash ** ");
                System.out.println("Chave " + tabKeys[i] +
                        " REHASHING ");
                tabHash[rehashing(tabHash,i)] = tabKeys[i];

            }
        }
            System.out.println("\nTabela Keys: ");
            System.out.println("--------------------------");
            for (int i = 0; i < tabKeys.length; i++)
                System.out.print("Slot " + i + " ---> " + tabKeys[i] + '\n');
            System.out.println("\nTabela HASH: ");
            System.out.println("--------------------------");
            for (int i = 0; i < tabHash.length; i++) {
                if (tabHash[i] == null)
                    System.out.println("Slot " + i + " ---> Valor nulo");
                else
                    System.out.print("Slot " + i + " ---> " +
                            tabHash[i] + "\n")
                            ;

            }

        }


    public static Integer hash ( int chave){
        return (chave % 10);
    }
    public static Integer rehashing(Integer[] tabhash, Integer indice) {
        for (Integer i = indice + 1 ; i < tabhash.length ; i ++) {
            if (tabhash[i] == null )
                return i;
        }
        for (Integer i = 0 ; i < indice ; i++ ) {
            if (tabhash[i] == null )
                return i;
        }
        return null;
    }
}
