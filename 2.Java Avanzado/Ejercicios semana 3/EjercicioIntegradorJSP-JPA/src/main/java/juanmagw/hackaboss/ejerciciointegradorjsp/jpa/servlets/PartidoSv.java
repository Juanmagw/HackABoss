package juanmagw.hackaboss.ejerciciointegradorjsp.jpa.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import juanmagw.hackaboss.ejerciciointegradorjsp.jpa.logica.Controladora;
import juanmagw.hackaboss.ejerciciointegradorjsp.jpa.logica.Equipo;
import juanmagw.hackaboss.ejerciciointegradorjsp.jpa.logica.Partido;

@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {

    Controladora control = new Controladora();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("partidos", control.buscarPartidos());
        response.sendRedirect("partidos.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombrePartido");
        String fecha = request.getParameter("fechaPartido");
        Long idEquipo1 = Long.valueOf(request.getParameter("idPartidoEquipo1"));
        Long idEquipo2 = Long.valueOf(request.getParameter("idPartidoEquipo2"));
        Integer puntuacionEquipo1 = Integer.valueOf(request.getParameter("puntuacionPartidoEquipo1"));
        Integer puntuacionEquipo2 = Integer.valueOf(request.getParameter("puntuacionPartidoEquipo2"));

        Equipo equipo1 = control.buscarEquipoPorID(idEquipo1);
        Equipo equipo2 = control.buscarEquipoPorID(idEquipo2);

        Partido partido = new Partido(nombre, LocalDate.parse(fecha), equipo1, equipo2, puntuacionEquipo1, puntuacionEquipo2);
        control.crearPartido(partido);

        response.sendRedirect("index.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
