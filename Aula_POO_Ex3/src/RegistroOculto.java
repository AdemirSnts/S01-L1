import java.util.HashMap;
import java.util.Map;

public class RegistroOculto {

    private HashMap<String, Entidade> entidades;

    public RegistroOculto() {
        entidades = new HashMap<>();
    }

    public void registrarEntidade(Entidade entidade) {

        if (entidades.containsKey(entidade.getNome())) {
            System.out.println("AVISO: A entidade "
                    + entidade.getNome()
                    + " ja esta registrada.");
        } else {
            entidades.put(entidade.getNome(), entidade);
            System.out.println(entidade.getNome()
                    + " registrada com sucesso.");
        }
    }

    public void listarEntidades() {

        System.out.println("\n=== ENTIDADES REGISTRADAS ===");

        for (Map.Entry<String, Entidade> item : entidades.entrySet()) {

            Entidade entidade = item.getValue();

            if (entidade instanceof Rastreavel) {
                Rastreavel r = (Rastreavel) entidade;

                System.out.println(
                        entidade.getNome()
                                + " >> "
                                + r.obterCoordenadas()
                );
            }
        }
    }
}