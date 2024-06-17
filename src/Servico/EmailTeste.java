package Servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailTeste
{

    public static void main(String[] args)
    {     
        Email email = new Email
        (
                "Assunto do e-mail",
                "Mensagem do e-mail",
                "email@destinatario.com"
        );
        
        email.enviar();
    }
}