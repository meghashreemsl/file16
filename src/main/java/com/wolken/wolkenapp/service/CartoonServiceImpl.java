package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dao.CartoonDAOImpl;

import com.wolken.wolkenapp.dto.CartoonDTO;


public class CartoonServiceImpl implements CartoonService {

	CartoonDTO dto = new CartoonDTO();
	CartoonDAOImpl dao = new CartoonDAOImpl();
	
	@Override
	public void validateAndSave(CartoonDTO cartoonDTO) {
		// TODO Auto-generated method stub
		
 		if(cartoonDTO.getCartoonId()>0) {
			if(cartoonDTO.getCartoonName()!=null) {
				dao.createCartoon(cartoonDTO);
			}else {
				System.out.println("cartoon name is not valid");
			}
			
		}else {
			System.out.println("cartoon id is not valid");
		}
		
	}

	
	  @Override public void validateAndUpdate(Integer  cartoonId ,String cartoonName) { 
		  //  TODO Auto-generated method stub 
	  if(cartoonId>0) {
	  if(cartoonName!=null) {
		  dao.updateById(cartoonId,cartoonName);
		  }
	  else {
	  System.out.println("cartoon name is not valid"); }
	  
	  }else { System.out.println("cartoon id is not valid"); }
	  
	  }
	 
		
	@Override
	public void validateAndDelete(Integer cartoonId1) {
		// TODO Auto-generated method stub
		if(cartoonId1 >0) {
				dao.delete(cartoonId1);
			
		}else {
			System.out.println("cartoon id is not valid");
		}
		
	}


	@Override
	public List<CartoonDTO> getAll() {
		// TODO Auto-generated method stub
		
		return  dao.getAll();
		
	}

	}


