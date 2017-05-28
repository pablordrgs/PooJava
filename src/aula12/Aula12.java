package aula12;

/**
 * Created by Pablo on 09/05/2017.
 */
public class Aula12 {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldFish = new GoldFish();
        Arara arara = new Arara();

        canguru.locomover();

        cachorro.emitirSom();

        mamifero.setPeso(35.3f);
        mamifero.setCorPelo("Marrom");
        mamifero.alimentar();
        mamifero.locomover();

        reptil.locomover();

        peixe.locomover();

        ave.locomover();

    }
}
