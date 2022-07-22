import java.util.ArrayList;

public class Navegador {
    private Pagina pagina;
    private ArrayList<Pagina> historico = new ArrayList<Pagina>();

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
        historico.add(pagina);
    }

    public void acessarHistorico(int index) throws IllegalArgumentException {
        if ( index < 0 || index > historico.size() -1 ){
            throw new IllegalArgumentException("Index invalido");
        }

        setPagina(historico.get(index));
    }
}
