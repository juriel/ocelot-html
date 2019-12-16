package net.comtor.ocelot.html.forms.inputs;

import net.comtor.ocelot.html.forms.HtmlFormElement;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlInputHidden extends HtmlInput {

    public HtmlInputHidden() {
        super(HtmlInput.HIDDEN);
    }

    public HtmlInputHidden(String name, String value) {
        super(HtmlInput.HIDDEN);

        if (name != null) {
            setName(name);
            setId(name);
        }

        if (value != null) {
            super.setValue(value);
        }
    }

    @Override
    public HtmlFormElement setValue(String value) {
        addAttribute("value", value);

        return this;
    }

    public HtmlInputHidden addNoReset() {
        addAttribute("no-reset", "no-reset");

        return this;
    }

}
