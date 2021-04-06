package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.CartoonDTO;

public interface CartoonService {
	
	public void validateAndSave(CartoonDTO cartoonDTO);
	public void validateAndUpdate(Integer cartoonId,String cartoonName);
	public void validateAndDelete(Integer cartoonId1);
	public List<CartoonDTO> getAll();


}
