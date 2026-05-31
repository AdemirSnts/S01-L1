public class Main {

    public static void main(String[] args) {

        Alien alien1 = new Alien("Zeus");
        Alien alien2 = new Alien("Xenon");

        Youkai youkai1 = new Youkai("Nakimura");
        Youkai youkai2 = new Youkai("Katanashira");

        RegistroOculto registro = new RegistroOculto();

        registro.registrarEntidade(alien1);
        registro.registrarEntidade(alien2);
        registro.registrarEntidade(alien1);
        registro.registrarEntidade(youkai1);
        registro.registrarEntidade(youkai2);
        registro.registrarEntidade(youkai1);

        registro.listarEntidades();
    }
}