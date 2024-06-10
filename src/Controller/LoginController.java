package Controller;
import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;
import Model.DAO.UsuarioDAO;
import View.MenuPrincipal;

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
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if (usuarioAutenticado != null)
        {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }
        else
        {
            view.exibeMensagem("Usuário ou senha inválidos.");
        }
    }
}