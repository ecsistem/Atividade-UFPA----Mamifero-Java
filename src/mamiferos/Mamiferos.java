/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamiferos;

/**
 *
 * @author edson
 */
public class Mamiferos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baleia baleia = new Baleia();
        Cao cao  = new Cao();
        
        cao.setNome("Caramelo");
        cao.setIdade(2);
        cao.setRaça("Vira-lata");
        
        baleia.setNome("Dopey Dick");
        baleia.setIdade(3);
        baleia.setRaça("Baleia Rosa");
        
        System.out.println(cao.getNome()+" tem "+cao.getIdade()+ "anos e é da raça "+cao.getRaça());
        System.out.println(cao.latir());
        System.out.println(cao.buscar());
        System.out.println(cao.correr());
        System.out.println(cao.comer());
        System.out.println(cao.dormir());
        
        System.out.println(baleia.getNome()+" tem "+baleia.getIdade()+ "anos e é da raça "+baleia.getRaça());
        System.out.println(baleia.nadar());
        System.out.println(baleia.esguicharAgua());
        System.out.println(baleia.saltar());
        System.out.println(baleia.comer());
        System.out.println(baleia.dormir());
    }
    
}
