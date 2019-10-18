package net.comtor.ocelot.html.forms.buttons;

import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlButtonSubmit extends HtmlInput {

    public HtmlButtonSubmit(String value) {
        super(HtmlInput.BUTTON);
        setValue(value);
    }

}
