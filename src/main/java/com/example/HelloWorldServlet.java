package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.icyplat.app.IcyplatApi;
import java.util.Map;
import java.util.HashMap;
import java.util.Enumeration;
import com.google.gson.Gson;

@WebServlet(urlPatterns = {"/*"}, loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet 
{
    IcyplatApi icyplatapi = new IcyplatApi();
    @Override 
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws IOException
    {
        Enumeration<String> parameterNames = request.getParameterNames();
        HashMap<String, String> map = new HashMap<String, String>();
        while (parameterNames.hasMoreElements()) {
            String key = (String) parameterNames.nextElement();
            String val = request.getParameter(key);
            map.put(key, val);
        }
	HashMap<String, String> res = icyplatapi.recvMessage(map);
	//String out = (String)res.get("name");
	Gson gson = new Gson();
	String out = gson.toJson(res);
        response.getOutputStream().print(out);
    }
}
