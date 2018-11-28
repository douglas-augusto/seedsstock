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

    public int ano;
    
    @Override
    public boolean valida(int col, int val) {
        if((col > 1999 && col < 2018) && (val > 2018 && val < 2050)){
           // JOptionPane.showMessageDialog(null, "Dia inválido!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    

    
    
}
