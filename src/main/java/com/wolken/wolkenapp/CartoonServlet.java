package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.dto.CartoonDTO;
import com.wolken.wolkenapp.service.CartoonServiceImpl;
import com.wolken.wolkenapp.service.CartoonService;

@WebServlet("/add")
public class CartoonServlet extends HttpServlet {
	
	public CartoonServlet() {
		// TODO Auto-generated constructor stub
	}
	
	CartoonService cartoonService = new CartoonServiceImpl();
	CartoonDTO cartoonDTO = new CartoonDTO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String cartoonId = req.getParameter("cartoon_id");
		 int cartoonId1 = Integer.parseInt(cartoonId);
		String cartoonName = req.getParameter("cartoon_name");
			
			cartoonDTO.setCartoonId(cartoonId1);
			cartoonDTO.setCartoonName(cartoonName);
		
			cartoonService.validateAndSave(cartoonDTO);
			cartoonService.getAll();
			
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("welcome" + cartoonName);

			printWriter.flush();
			printWriter.close();
		
	}
	}
	


