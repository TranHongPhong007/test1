/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Filter;
/**
 *
 * @author LENOVO
 */


import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.regex.Pattern;

@WebFilter("/*")
public class PhoneFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String phone = req.getParameter("tel");

        if (phone != null && !Pattern.matches("^[0-9]{10}$", phone)) {
            request.setAttribute("error", "Số điện thoại không hợp lệ!");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }
}
