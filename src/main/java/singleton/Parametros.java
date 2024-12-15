package singleton;

public class Parametros {
    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String nomeEscritorio;
    private String usuarioLogado;

    public String getNomeEscritorio() {
        return nomeEscritorio;
    }

    public void setNomeEscritorio(String nomeEscritorio) {
        this.nomeEscritorio = nomeEscritorio;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
