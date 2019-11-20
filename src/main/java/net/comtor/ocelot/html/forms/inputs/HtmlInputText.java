package net.comtor.ocelot.html.forms.inputs;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlInputText extends HtmlInput {

    public HtmlInputText() {
        super(HtmlInput.TEXT);
    }

    public HtmlInputText(String name, String id) {
        this();

        setName(name);
        setId(id);
    }

    public HtmlInputText(String id) {
        this("", id);
    }

}
