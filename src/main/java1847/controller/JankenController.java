import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JankenController")
public class JankenController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // リクエストからユーザ名を取得
        String username = request.getParameter("username");

        // ユーザ名をHTMLで表示するためのレスポンスを設定
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Hi " + username + "</h1>");
        response.getWriter().println("<p>janken.htmlの内容をここに追加</p>");
        response.getWriter().println("</body></html>");
    }
}
