package composite;

import interfaces.IComponent;

/**
 *
 * @author Emerson
 */
public class Paragrafo implements IComponent{

    @Override
    public Boolean addChild(IComponent component) {
        return false;
    }

    @Override
    public Boolean removeChild(IComponent component) {
        return false;
    }

    @Override
    public IComponent getChild(Integer index) {
        return null;
    }

    @Override
    public String operation() {
        return "Texto do parágrafo.";
    }
    
}
