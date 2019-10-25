package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlTextarea extends HtmlTextContainer implements HtmlFormElement {

    public HtmlTextarea() {
        super("textarea");
    }

    public HtmlTextarea setValue(String value) {
        addEscapedText(value);
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
    public HtmlFormElement setName(String name) {
        addAttribute("name", name);
        return this;
    }

    @Override
    public String getName() {
        return getAttribute("name");
    }


}
