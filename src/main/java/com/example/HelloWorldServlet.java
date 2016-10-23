package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.chenzehe.runjar.Run;

@WebServlet(urlPatterns = {"/*"}, loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet 
{
  @Override 
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException
  {
      String[] param = {""};
      Run run = new Run();
      run.main(param);
      response.getOutputStream().print("Hello World");
  }
}
