package citiaolianxiang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;



public class SearchServlet {

	static private List<String> list = new ArrayList<String>();
	static {
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String keyword = request.getParameter("keyword");
		List<String> res = new ArrayList<String>();

		for (String string : list) {
			if (string.contains(keyword)) {
				res.add(string);
			}
		}
		JSONArray jsonArray = JSONArray.fromObject(res);
		System.out.println(jsonArray.toString());
		response.setContentType("text/html");
		response.getWriter().write(jsonArray.toString());
	}

	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String aString ="21112";

	}

}
