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
class Baleia extends Mamifero {
    public String nadar() {
        return (getNome() + " está nadando no oceano.");
    }
    
    public String esguicharAgua() {
        return(getNome() + " está esguichando água pelo respiradouro.");
    }

    public String saltar() {
        return(getNome() + " está saltando fora d'água.");
    }
}