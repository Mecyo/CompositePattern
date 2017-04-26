package composite;

import interfaces.IComponent;

/**
 *
 * @author Emerson
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IComponent component;
        Composite html = new Composite();
        html.setNome("html");
        Composite div1 = new Composite();
        div1.setNome("div");
        html.addChild(div1);
        Composite div2 = new Composite();
        div2.setNome("div");
        Paragrafo paragrafo = new Paragrafo();
        div2.addChild(paragrafo);
        html.addChild(div2);
        component = html;
        component.operation();
        component.operation();
    }
    
}
