package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.CartoonDTO;

public interface CartoonDAO {
 public void createCartoon(CartoonDTO cartoonDTO);
  public void updateById(Integer cartoonId,String cartoonName);
    public void delete(Integer cartoonId1);
    public  List<CartoonDTO> getAll();


}
