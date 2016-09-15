/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CalculationService;

/**
 *
 * @author jcarl
 */
@WebServlet(name = "CalculatorController", urlPatterns = {"/calculate"})
public class CalculatorController extends HttpServlet {

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

        CalculationService service = new CalculationService();
        String action = request.getParameter("action");
        double responseMsg = 0;

        if (action.equalsIgnoreCase("rectangle")) {
            try {
                String length = request.getParameter("length");
                String width = request.getParameter("width");

                responseMsg = service.getAreaOfRectangle(length, width);
                request.setAttribute("answer", responseMsg);
            } catch (IllegalArgumentException iae) {
                request.setAttribute("answer", service.getERROR_MSG());
            }

        } else if (action.equalsIgnoreCase("circle")) {
            try {
                String radius = request.getParameter("radius");

                responseMsg = service.getAreaOfCircle(radius);
                request.setAttribute("answer2", responseMsg);
            } catch (IllegalArgumentException iae) {
                request.setAttribute("answer2", service.getERROR_MSG());
            }

        } else if (action.equalsIgnoreCase("triangle")) {
            try {
                String sideA = request.getParameter("sideA");
                String sideB = request.getParameter("sideB");

                responseMsg = service.getHypotenuse(sideA, sideB);
                request.setAttribute("answer3", responseMsg);
            } catch (IllegalArgumentException iae) {
                request.setAttribute("answer3", service.getERROR_MSG());
            }
        }

        RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
        view.forward(request, response);

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
