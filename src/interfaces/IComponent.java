package interfaces;

/**
 *
 * @author Emerson
 */
public interface IComponent {
    
    Boolean colapsed = Boolean.FALSE;
    
    public String operation();
    
    public Boolean addChild(IComponent component);
    
    public Boolean removeChild(IComponent component);
    
    public IComponent getChild(Integer index);
    
}
