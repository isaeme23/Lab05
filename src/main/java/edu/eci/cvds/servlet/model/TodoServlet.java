package edu.eci.cvds.servlet.model;

import edu.eci.cvds.servlet.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Optional;

@WebServlet(
        urlPatterns = "/TodoServlet"
)

public class TodoServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Writer responseWriter = resp.getWriter();
        Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
        try{
            if(optId.isPresent()) {
                int id = Integer.parseInt(optId.get());
                resp.setStatus(HttpServletResponse.SC_OK);
                ArrayList<Todo> todoList = new ArrayList();
                Todo todo = Service.getTodo(id);
                todoList.add(todo);
                responseWriter.write(Service.todosToHTMLTable(todoList));
                responseWriter.flush();
            }
        } catch (FileNotFoundException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("No existe un item con el identificador dado :(");
        } catch (NumberFormatException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Requerimiento invalido D:");
        } catch (MalformedURLException e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseWriter.write("Error interno del servidor D':");
        } catch (Exception e){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Requerimiento invalido D:");
        }
    }
}
