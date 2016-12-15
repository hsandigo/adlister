import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by humbertosandigo on 12/14/16.
 */
@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ListAdsDao listAdsDao = new ListAdsDao();
        List<Ad> ads = listAdsDao.all();
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("ads/ads-index.jsp").forward(request, response);
    }
}
