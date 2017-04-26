/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import interfaces.IComponent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emerson
 */
public class Composite implements IComponent{

    private String nome;
    private Boolean colapsed = Boolean.FALSE;
    private List<IComponent> elementos = new ArrayList<>();
    @Override
    public String operation() {
        String retorno = new String();
                
        if(!colapsed) {
            System.out.println("<" + nome +">");
            for (IComponent child : elementos) {
                child.operation();
            }
            System.out.println("</" + nome + ">");
        } else {
            System.out.println("<" + nome +">...</" + nome + ">");
        }
        this.colapsed = !colapsed;
        return retorno;
    }

    @Override
    public Boolean addChild(IComponent component) {
        return elementos.add(component);
    }

    @Override
    public Boolean removeChild(IComponent component) {
        return elementos.remove(component);
    }

    @Override
    public IComponent getChild(Integer index) {
         return elementos.get(index);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
