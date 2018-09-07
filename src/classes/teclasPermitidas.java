package classes;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class teclasPermitidas extends PlainDocument{
    //int tamanho; 
    String regex;
    String saida;
    
    public  teclasPermitidas(String r, String s){
       // this.tamanho = tamanho;  // quantidade de caracteres
        this.regex = r;     // caracteres permitidos ex: "[^a-z | ^A-Z | ^0-9 | ^,]"
        this.saida = s;     // saida ( caractere q sairá caso digite um n permitido
    }
    
   @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
 //      int tamanho = (this.getLength() + str.length());
 //      if( tamanho <= tamanho){
            super.insertString(offset, str.replaceAll(regex, saida), attr);
 //      }else{   
 //           super.insertString(offset, str.replaceAll("", ""), attr);
 //      }
    }
    
    
} 

    
    
    
     
/*   Exemplos
    
// deixar todas as letras maiúsculas add "toUpperCase" depois do "str."
 super.insertString(offset, str.toUpperCase.replaceAll("[^a-z | ^A-Z]", TitleProperty), attr);

//deixar todas as letras minúsculas add "toUpperCase" depois do "str."
super.insertString(offset, str.toLowerCase.replaceAll("[^a-z | ^A-Z]", TitleProperty), attr);
*/

/* outras opções

int tamanho; 
    String regex;
    
    public  teclasPermitidas(int tamanho, String regex){
        this.tamanho = tamanho;  // quantidade de caracteres
        this.regex = regex;     // caracteres permitidos ex: "[^a-z | ^A-Z | ^0-9 | ^,]"
    }
    
   @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
       int tamanho = (this.getLength() + str.length());
       if( tamanho <= tamanho){
            super.insertString(offset, str.replaceAll(regex, ""), attr);
       }else{   
            super.insertString(offset, str.replaceAll("", ""), attr);
       }
    }

*/