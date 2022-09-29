/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncomercio.productosGUI;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author J P Salmeron Dittamo
 */
public class ColoresStock extends DefaultTableCellRenderer {
    

   @Override
   public Component getTableCellRendererComponent(JTable tblProductos,
      Object value, boolean isSelected, boolean hasFocus, int row,
      int column)
   {
      JLabel cell = (JLabel) super.getTableCellRendererComponent (tblProductos, value, isSelected, hasFocus, row, column);
      if ( value instanceof Integer )
      {
        int valor = (int)value;
        if(column == 5){
            if(valor <= 6){
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.RED);
            }
            if(valor > 6 && valor <= 12 ){
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.ORANGE);
            }
            if(valor > 12 ){
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);
            }
        }
       
      } 
      
      if (value instanceof String){
          String valor = (String)value;
          cell.setBackground(Color.WHITE);
          cell.setForeground(Color.BLACK);
      }
      if (value instanceof Float){
          Float valor = (Float)value;
          cell.setBackground(Color.WHITE);
          cell.setForeground(Color.BLACK);
      }
      
      return cell;
   }
}

