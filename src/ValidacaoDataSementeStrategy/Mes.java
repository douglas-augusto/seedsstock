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
public class Mes implements ValidaDataSemente{

    @Override
    public boolean valida(int col, int val) {
        if(col < 1 || col > 12 && val < 1 || val > 12){
           // JOptionPane.showMessageDialog(null, "Dia inválido!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return false;
    }

}

    

