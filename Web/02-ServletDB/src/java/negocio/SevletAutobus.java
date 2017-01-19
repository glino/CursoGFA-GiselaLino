/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import db.AutobusDB;
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
import model.Autobus;

/**
 *
 * @author gi.lino
 */
@WebServlet(name = "SevletAutobus", urlPatterns = {"/autobuses"})
public class SevletAutobus extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


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

            AutobusDB aDB = new  AutobusDB();
           
            try{
                List<Autobus> lista = aDB.getAutobuses();
                PrintWriter pw = response.getWriter();
                
                lista.forEach(autobus-> pw.print(autobus +"<br>"));
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }catch (SQLException e){
                e.printStackTrace();
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
        
        try {
            request.setCharacterEncoding("UTF-8");
            Autobus autobus = new Autobus();
            autobus.setNum_Autobus(Integer.parseInt(request.getParameter("num_autobus")));
            autobus.setSiglas(request.getParameter("siglas"));
            autobus.setModelo(Integer.parseInt(request.getParameter("modelo")));
            autobus.setCapacidad(Integer.parseInt(request.getParameter("capacidad")));
            autobus.setBase(request.getParameter("base"));
        
            AutobusDB aDB= new AutobusDB();

            if(aDB.registrarAutobus(autobus)==1)
                response.sendRedirect("success.html");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SevletAutobus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SevletAutobus.class.getName()).log(Level.SEVERE, null, ex);
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
