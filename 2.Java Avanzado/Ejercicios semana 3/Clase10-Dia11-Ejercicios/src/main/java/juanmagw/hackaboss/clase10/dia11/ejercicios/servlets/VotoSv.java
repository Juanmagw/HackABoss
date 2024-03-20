package juanmagw.hackaboss.clase10.dia11.ejercicios.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import juanmagw.hackaboss.clase10.dia11.ejercicios.logica.Controladora;
import juanmagw.hackaboss.clase10.dia11.ejercicios.logica.Voto;

@WebServlet(name = "VotoSv", urlPatterns = {"/VotoSv"})
public class VotoSv extends HttpServlet {

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
        miSesion.setAttribute("votos", control.buscarVotos());
        response.sendRedirect("resultados.jsp");
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

        //Creación de los 3 partidos en la base de datos
//        control.crearVoto(new Voto("Partido A"));
//        control.crearVoto(new Voto("Partido B"));
//        control.crearVoto(new Voto("Partido C"));
        //Asignamos los 3 partidos y añadir cantidad a cada uno en función de la elección de los alumnos 
        Voto voto1 = control.buscarVotoNombre("Partido A");
        Voto voto2 = control.buscarVotoNombre("Partido B");
        Voto voto3 = control.buscarVotoNombre("Partido C");

        try {
            if (request.getParameter("partido").equals("A")) {
                voto1.setCantidad(voto1.getCantidad() + 1);
                control.editarVoto(voto1);
            } else if (request.getParameter("partido").equals("B")) {
                voto2.setCantidad(voto2.getCantidad() + 1);
                control.editarVoto(voto2);
            } else if (request.getParameter("partido").equals("C")) {
                voto3.setCantidad(voto3.getCantidad() + 1);
                control.editarVoto(voto3);
            }
        } catch (NullPointerException e) {
            System.out.println("No existe");
        }

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
