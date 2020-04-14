package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
    name = "AoVivo",
    urlPatterns = {"/aovivo"}
)

public class AoVivo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<HTML>");
        out.print("<body>");
        out.print("<form action=hello method=get>");
        out.println(String.format("<h1>Bem-vindo ao Java JDBC em web<h1>"));
        out.println(String.format("<h1>Escolha uma das opções que voce deseja acessar no banco de dados:<h1>"));
        out.print("<select name='opcao' ><br>");
        out.print("<option value='Listar todos'>Listar todos</option>");
        out.print("<option value='Listar por id'>Listar por id</option>");
        out.print("<option value='Listar por nome'>Listar por nome</option>");
        out.print("<option value='Inserir registro'>Inserir registro</option>");
        out.print("<option value='Editar registro'>Editar registro</option>");
        out.print("<option value='Excluir registro'>Excluir registro</option>");
        out.print("</select>");
        out.print("<input type=submit value=Enviar>");
        out.print("</form>");
        out.print("</body>");
        out.println("</html>");
    }
}
