package Controller;
import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

public class LoginController
{
    private final Login view;
    private LoginHelper helper;
    
    public LoginController (Login view)
    {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void fizTarefa()
    {
        System.out.println("Busquei algo no banco de dados");
        this.view.exibeMensagem("Executei e fiz tarefa");
    }
    
    public void entrarNoSistema()
    {
        Usuario usuario = helper.obterModelo();
    }
}