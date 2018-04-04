package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @作者:lixuepeng
 * @日期:2018年04月03日 13:59:22
 *sadasd
 */
public class Servlet2 extends HttpServlet {
	private String message;

	/**
	 *test
	 * @throws ServletException
	 */
	@Override
	public void init() throws ServletException {
		message = "Hello world, this message is from servlet!";
	}

	/**
	 * test33333333333333
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置响应内容类型
		resp.setContentType("text/html");
		//设置逻辑实现
		PrintWriter out = resp.getWriter();
		out.println("<h3>" + message + "</h3>");
	}
	@Override
	public void destroy() {
		super.destroy();
	}
}
