package Controller;
import Model.Usuario;
import View.Login;

public class LoginController
{
    private final Login view;
    
    public LoginController (Login view)
    {
        this.view = view;
    }
    
    public void fizTarefa()
    {
        System.out.println("Busquei algo no banco de dados");
        this.view.exibeMensagem("Executei e fiz tarefa");
    }
    
    public void entrarNoSistema()
    {
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        
        Usuario modelo = new Usuario(0, nome, senha);
    }
    
}