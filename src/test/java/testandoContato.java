import aline.ufpb.br.Contato;


public class testandoContato {
        public static void main(String [] args){
            Contato meuContato1 = new Contato();
            Contato meuContato2 = new Contato(
                    "Maria",
                    new Endereco("Rua XYZ",
                            "123", "Centro",
                            "Mamanguape", "PB"));
            System.out.println("Contato 1: "+ meuContato1.toString());
            System.out.println("Contato 2: "+ meuContato2.toString());

        }
    }
