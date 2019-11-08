package net.comtor.html.advanced;

import net.comtor.ocelot.html.forms.HtmlFormElement;

/**
 *
 * @author juriel
 */
public class BasicHtmlAdministrableForm extends AbstractHtmlAdministrableFormElement {

    @Override
    public HtmlAdministrableForm addField(String id, String label, HtmlFormElement input, String help, String error) {
        addEscapedText(label);
        add(input);
        addEscapedText(help);
        addEscapedText(error);
        put(id, input);
        return this;
    }

}
