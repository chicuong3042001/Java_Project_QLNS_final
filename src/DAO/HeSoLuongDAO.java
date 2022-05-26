/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.HeSoLuongDTO;
import Exception.AllException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dohung
 */
public class HeSoLuongDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public HeSoLuongDAO() {
    }

    public ArrayList<HeSoLuongDTO> getHeSoLuong() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM hesoluong");
            rs = stmt.executeQuery();
            
            ArrayList<HeSoLuongDTO> hesoluong = new ArrayList();
            
            while(rs.next()) {
                hesoluong.add(new HeSoLuongDTO(rs.getString("MaHSL"), rs.getDouble("HeSoLuong")));
            }
            
            return hesoluong;
        } catch (SQLException ex) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public boolean addHeSoLuong(HeSoLuongDTO hesoluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("INSERT INTO hesoluong (MaHSL, HeSoLuong) VALUES (?,?)");
            
            stmt.setString(1, hesoluong.getMaHSL());
            stmt.setDouble(2, hesoluong.getHeSoLuong());
            
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deleteHeSoLuong(String id) throws AllException{
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM hesoluong WHERE MaHSL = ?");
            stmt.setString(1, id);

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            throw new AllException("Không thể xóa do có nhân viên đang nhận mã hệ số lương.Để xóa được, vui lòng xóa nhân viên trước");
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
//        return false;
    }

    public boolean deleteHeSoLuong(HeSoLuongDTO hesoluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM hesoluong WHERE MaHSL = ?");
            stmt.setString(1, hesoluong.getMaHSL());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updateHeSoLuong(HeSoLuongDTO hesoluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("UPDATE hesoluong SET HeSoLuong = ? WHERE MaHSL = ?");
            stmt.setDouble(1, hesoluong.getHeSoLuong());
            stmt.setString(2, hesoluong.getMaHSL());
            
            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public HeSoLuongDTO findHSLByID(String MaHSL) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM hesoluong WHERE MaHSL = ?");
            stmt.setString(1, MaHSL);

            rs = stmt.executeQuery();

            while (rs.next()) {
                HeSoLuongDTO hsldto = new HeSoLuongDTO();
                hsldto.setMaHSL(rs.getString("MaHSL"));
                hsldto.setHeSoLuong(rs.getDouble("HeSoLuong"));
                return hsldto;
            }
            
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
        return null;
    }
}
