package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlTextarea extends HtmlDoubleTag implements HtmlFormElement {

    public HtmlTextarea() {
        super("textarea");
    }

    public HtmlTextarea setValue(String value) {
        addData(value);
        return this;
    }

    

    @Override
    public String getValue() {
        return getContentObjects().getFirst().getHtml();
    }

    @Override
    public HtmlFormElement required() {
        addAttribute("required", "required");
        return this;
    }

    @Override
    public HtmlFormElement removeRequired() {
        removeAttribute("required");
        return this;
    }

    @Override
    public HtmlFormElement disable() {
        addAttribute("disabled", "disabled");
        return this;
    }

    @Override
    public HtmlFormElement enable() {
        removeAttribute("disabled");
        return this;
    }

    @Override
    public HtmlFormElement readOnly() {
        addAttribute("readonly", "readonly");
        return this;
    }

    @Override
    public HtmlFormElement removeReadOnly() {
        removeAttribute("readonly");
        return this;
    }

    @Override
    public HtmlSelect addOption(String value, String label) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlSelect addOption(String value, String label, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlSelect addOption(HtmlOption optionTag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
