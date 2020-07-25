
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Datos.Datos;

public class LogicaServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String opciones;
        int opcionescad;
        
        String opciones1;
        int opciones1cad;
        
        String cuota;
        int cuotacad;
        
        opciones= request.getParameter("opciones");
        opcionescad= Integer.parseInt(opciones);
        
        opciones1= request.getParameter("opciones1");
        opciones1cad= Integer.parseInt(opciones1);
        
        cuota= request.getParameter("txtnumero");
        cuotacad= Integer.parseInt(cuota);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LogicaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Datos obj= new Datos();
            
            String r1= "Colegio: "+obj.colegio(opcionescad);
            String r2= "Instituto: "+obj.instituto(opciones1cad);
            String r3= "Cuota: "+obj.cuota(cuotacad);
            String r4= "Descuento: "+obj.descuento(opcionescad, opciones1cad, cuotacad);
            String r5= "Importe: "+obj.importe(opcionescad, opciones1cad, cuotacad);
            
            request.setAttribute("mensaje1",r1);
            request.setAttribute("mensaje2",r2);
            request.setAttribute("mensaje3",r3);
            request.setAttribute("mensaje4",r4);
            request.setAttribute("mensaje5",r5);
            request.getRequestDispatcher("/Formulario01.jsp").forward(request, response);
            
            
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
