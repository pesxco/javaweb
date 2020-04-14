package servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/hello"}
)
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String sopcao = req.getParameter("opcao");

        if(sopcao.equals("Listar todos")){
            req.getRequestDispatcher("listar.jsp").forward(req , resp);
        }else if(sopcao.equals("Listar por id")){
                out.print("<HTML>");
                out.print("<body>");
                out.println(String.format("<h1>listando por id<h1>"));
                out.print("</body>");
                out.println("</html>");
        }else if(sopcao.equals("Listar por nome")){
            out.print("<HTML>");
            out.print("<body>");
            out.println(String.format("<h1>listando por nome<h1>"));
            out.print("</body>");
            out.println("</html>");
        }else if(sopcao.equals("Inserir registro")){
            out.print("<HTML>");
            out.print("<body>");
            out.println(String.format("<h1>Inserindo registro<h1>"));
            out.print("</body>");
            out.println("</html>");
        }else if(sopcao.equals("Editar registro")){
            out.print("<HTML>");
            out.print("<body>");
            out.println(String.format("<h1>Editando registro<h1>"));
            out.print("</body>");
            out.println("</html>");
        }else if(sopcao.equals("Excluir registro")){
            out.print("<HTML>");
            out.print("<body>");
            out.println(String.format("<h1>Excluindo registro<h1>"));
            out.print("</body>");
            out.println("</html>");
        }
    }

}
