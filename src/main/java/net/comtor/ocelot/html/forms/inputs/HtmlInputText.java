package net.comtor.ocelot.html.forms.inputs;

/**
 * @author juandiego@comtor.net
 * @author juriel@comtor.net
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlInputText extends HtmlInput {

    public HtmlInputText() {
        super(HtmlInput.TEXT);
    }

    public HtmlInputText(String name, String id) {
        this();
        setName(name);
        if (id != null){
            setId(id);
        }
    }

    public HtmlInputText(String name) {
        this(name,null);
    }

}
