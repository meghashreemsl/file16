package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.dto.CartoonDTO;
import com.wolken.wolkenapp.service.CartoonService;
import com.wolken.wolkenapp.service.CartoonServiceImpl;

@WebServlet("/display")
public class CartoonServlet3 extends HttpServlet {

	public CartoonServlet3() {
		// TODO Auto-generated constructor stub
	}

	CartoonService cartoonService = new CartoonServiceImpl();
	CartoonDTO cartoonDTO = new CartoonDTO();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<CartoonDTO> cartoonList = cartoonService.getAll();

		req.setAttribute("cartoonList", cartoonList);

		RequestDispatcher dispatcher = req.getRequestDispatcher("getall.jsp");
		dispatcher.forward(req, resp);
		/*
		 * PrintWriter writer = resp.getWriter(); writer.print(cartoonList);
		 * writer.flush();
		 */

		/*
		 * String cartoonId = req.getParameter("cartoon_id"); Integer cartoonId1 =
		 * Integer.parseInt(cartoonId); String cartoonName =
		 * req.getParameter("cartoon_name");
		 * 
		 * cartoonDTO.setCartoonId(cartoonId1); cartoonDTO.setCartoonName(cartoonName);
		 * 
		 * cartoonService.getAll();
		 * 
		 * PrintWriter printWriter = resp.getWriter(); printWriter.print("welcome" +
		 * cartoonName);
		 * 
		 * printWriter.flush(); printWriter.close();
		 */

	}
}
