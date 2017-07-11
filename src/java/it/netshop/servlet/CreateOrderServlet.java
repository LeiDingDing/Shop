/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.netshop.servlet;

import it.netshop.dao.OrderDao;
import it.netshop.dao.UserDao;
import it.netshop.pojo.ArrivalInfo;
import it.netshop.pojo.Cart;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class CreateOrderServlet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            request.getRequestDispatcher("arrivalinfo.jsp").include(request, response);
            ArrivalInfo ali=(ArrivalInfo)request.getAttribute("arrive");
            String total=request.getSession().getAttribute("total").toString();
            String username=request.getSession().getAttribute("username").toString();
            UserDao ud=new UserDao();
            OrderDao od=new OrderDao();
            int uid=ud.QueryUid(username);
            Calendar c=Calendar.getInstance(); 
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
            String fid="O"+df.format(c.getTime());
            request.setAttribute("orderid", fid);
            
            od.InsertOrder(fid,total, ali, uid);
            List<Cart>goodsCart=(List<Cart>)request.getSession().getAttribute("goodsoncart");
            String[]gids=new String[goodsCart.size()];
            for(int i=0;i<gids.length;i++){
                 gids[i]=String.valueOf(goodsCart.get(i).getGid());
            }
            od.InsertSorder(goodsCart, fid);
            od.DeleteSomeGoods(gids, username);
            request.getRequestDispatcher("ordersuccess.jsp").include(request, response);
            
            
        } finally {
            out.close();
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
