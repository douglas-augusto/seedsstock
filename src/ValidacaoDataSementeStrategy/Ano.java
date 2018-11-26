/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidacaoDataSementeStrategy;

/**
 *
 * @author Renan
 */
public class Ano implements ValidaDataSemente{

    @Override
    public boolean valida(int col, int val) {
        if(col < 1999 || col > 2100 && val < 1999 || val > 2100){
           // JOptionPane.showMessageDialog(null, "Dia inválido!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return false;
    }

    

    
    
}
