package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class arithmeticCalc extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // GET requests will end up here!

        // Load a JSP from this servlet
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalc.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        // VERY IMPORTANT!
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // POST requests will end up here!

        // Capture the incoming parameters from the JSP
        {
            String input1 = request.getParameter("firstNumber");
            String input2 = request.getParameter("secondNumber");
            String button = request.getParameter("btn");

            //validation
            try {
                int num1 = Integer.parseInt(input1);
                int num2 = Integer.parseInt(input2);
                String message;
                
                switch(button){
                    case "+":
                        int result=num1+num2;
                        message="result: "+result;
                        
                        break;
                    case "-":
                        result=num1-num2;
                        message="result: "+result;
                        break;
                    case "*":
                        result=num1*num2;
                        message="result: "+result;
                        break;
                    case "%":
                        result=num1%num2;
                        message="result: "+result;
                        break;
                    default:
                        message="please select a button";
                }
                //String nnage = Integer.toString(nage);
                // put the error message into the request object as an attribute
                request.setAttribute("message", message);
                // load the form once again
                //getServletContext().getRequestDispatcher("/WEB-INF/ageCalc.jsp").forward(request, response);
                // after a JSP has been loaded, stop the code call

            } catch (Exception e) {

                //System.out.println(e.getMessage());
                String nmessage = "please enter a valid input " + e.getMessage();
                // put the error message into the request object as an attribute
                request.setAttribute("message", nmessage);
                // load the form once again
            }
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalc.jsp").forward(request, response);
            
        }
    }
}
