/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import db.tiposvehiculos.AutomovilDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.vehiculo.tiposvehiculos.Automovil;

/**
 *
 * @author gi.lino
 */
@WebServlet(name = "Automovil", urlPatterns = {"/Automovil"})
public class SevletAutomovil extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Automovil</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Automovil at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        
        
            AutomovilDB aDB = new  AutomovilDB();
            PrintWriter pw = response.getWriter();
        try {
            pw.print(aDB.consultar(1).toString()+"<br>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SevletAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SevletAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }

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
             //processRequest(request, response);
        
        
            /*AutomovilDB aDB = new  AutomovilDB();
            PrintWriter pw = response.getWriter();
            pw.print(aDB.consultar(0).toString()+"<br>");*/
            
            request.setCharacterEncoding("UTF-8");
            Automovil auto = new Automovil(0,0,"");
            auto.setIdVehiculo(Integer.parseInt(request.getParameter("idVehiculo")));
            auto.setCantidadRuedas(Integer.parseInt(request.getParameter("cantidadRuedas")));
            auto.setTipoVehiculo(request.getParameter("tipoVehiculo"));
            AutomovilDB aDB1 = new  AutomovilDB();
        try {
            if(aDB1.registrar(auto))
                response.sendRedirect("success.html");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SevletAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SevletAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }

            
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
