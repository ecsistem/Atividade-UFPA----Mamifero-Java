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
public class Cao extends Mamifero{
    public String latir() {
        return(getNome() + " está latindo.");
    }
    
    public String correr() {
        return(getNome() + " está correndo no parque.");
    }

    public String buscar() {
        return(getNome() + " está buscando uma bola.");
    }
}
