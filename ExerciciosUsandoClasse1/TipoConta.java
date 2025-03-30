import java.util.HashMap;
import java.util.Map;

public enum TipoConta {
    Corrente(1, "Conta Corrente"),
    Poupanca(2, "Conta Poupanca"),
    Portabil(3, "Conta Para Portabilidade"),
    Investimento(4, "Carteira de Investimentos"),
    Universitaria(5, "Conta Universitaria");

    private final int codigo;

    private final String Descricao;

    private static final Map<Integer, TipoConta> map = new HashMap<>();

    static {
        for (TipoConta tipo : TipoConta.values()) {
            map.put(tipo.getCodigo(), tipo);

        }
    }

    TipoConta(int codigo, String descricao) {
        this.codigo = codigo;
        this.Descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public static TipoConta fromCodigo(int codigo) {
        return map.get(codigo);
    }
}
