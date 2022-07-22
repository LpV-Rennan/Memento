import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NavegadorTest {

    @Test
    void deveRetornarAPagina(){
        Navegador navegador = new Navegador();
        navegador.setPagina(new Pagina("google","https://google.com"));
        assertEquals("Pagina{titulo='google', link='https://google.com'}", navegador.getPagina().toString());
    }

    @Test
    void deveRetornarAPrimeiraPagina(){
        Navegador navegador = new Navegador();
        navegador.setPagina(new Pagina("google","https://google.com"));
        assertEquals("Pagina{titulo='google', link='https://google.com'}", navegador.getPagina().toString());

        navegador.setPagina(new Pagina("globo", "https://globo.com"));
        assertEquals("Pagina{titulo='globo', link='https://globo.com'}", navegador.getPagina().toString());

        try {
            navegador.acessarHistorico(0);
            assertEquals("Pagina{titulo='google', link='https://google.com'}", navegador.getPagina().toString());
        }catch(IllegalArgumentException err){

        }
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Navegador navegador = new Navegador();
            navegador.acessarHistorico(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Index invalido", e.getMessage());
        }
    }

}