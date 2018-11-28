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
        if((col > 0 && col < 13) && (val > 0 && val < 13)){
           // JOptionPane.showMessageDialog(null, "Dia inválido!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

}

    

