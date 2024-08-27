import aline.ufpb.br.Endereco;

import javax.swing.JOptionPane;



    public class TesteEndereco {

        public static void main(String [] args){
            int numPessoas = 3;
            String [] nomes = new String[numPessoas];
            Endereco[] enderecos = new Endereco[numPessoas];
            Endereco enderecoDeAyla = new Endereco();
            System.out.println("Endereço de Ayla:"+ enderecoDeAyla.toString());
            Endereco enderecoDeRodrigo = new Endereco("João Pessoa","PB");
            System.out.println(enderecoDeRodrigo.toString());
//        int x = 0;
//        while(x<numPessoas){
//            nomes[x] = JOptionPane.showInputDialog("Digite o nome da pessoa");
//            String logradouro = JOptionPane.showInputDialog("Digite o nome da rua/avenida/travessa...");
//            String numero = JOptionPane.showInputDialog("Digite o número da casa ou apartamento");
//            String bairro = JOptionPane.showInputDialog("Digite o bairro");
//            String cidade = JOptionPane.showInputDialog("Digite a cidade");
//            String estado = JOptionPane.showInputDialog("Digite o estado");
//            enderecos[x] = new Endereco(logradouro, numero, bairro, cidade, estado);
//            x++;
//        }
//
//        for(int k=0; k< enderecos.length; k++){
//            System.out.println("Endereço de "+ nomes[k]+":"+ enderecos[k].toString());
//            //System.out.println("Rua/Av./Trav.:"+ enderecos[k].getLogradouro()+","+
//            //        enderecos[k].getNumero() );
//
//        }
        }

    }
