/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.HeSoLuongDAO;
import DTO.HeSoLuongDTO;
import Exception.AllException;
import Exception.DuplicatedException;
import java.util.ArrayList;

/**
 *
 * @author dohung
 */
public class HeSoLuongBUS {
    HeSoLuongDAO hesoluongdao = new HeSoLuongDAO();

    public HeSoLuongBUS() {
    }
    
    public ArrayList<HeSoLuongDTO> getHeSoLuong(){
        return hesoluongdao.getHeSoLuong();
    }
    
    public boolean addHeSoLuong(HeSoLuongDTO hesoluong) throws DuplicatedException {
        ArrayList<HeSoLuongDTO> list = hesoluongdao.getHeSoLuong();
        
        for (HeSoLuongDTO item : list) {
            if(item.getMaHSL().equals(hesoluong.getMaHSL())) {
                throw new DuplicatedException("Mã hệ số lương bị trùng");
            }
        }
        return hesoluongdao.addHeSoLuong(hesoluong);
    }
    
    public boolean deleteHeSoLuong(String id) throws AllException {
        return hesoluongdao.deleteHeSoLuong(id);
    }
    
    public boolean deleteHeSoLuong(HeSoLuongDTO hesoluong) throws AllException {
        return hesoluongdao.deleteHeSoLuong(hesoluong.getMaHSL());
    }
    
    public boolean updateHeSoLuong(HeSoLuongDTO hesoluong) {
        return hesoluongdao.updateHeSoLuong(hesoluong);
    }
    public HeSoLuongDTO findHSLbyID(String MaHSL){
        return hesoluongdao.findHSLByID(MaHSL);
    }
}
