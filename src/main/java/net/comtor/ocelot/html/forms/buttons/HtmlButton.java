package net.comtor.ocelot.html.forms.buttons;

import net.comtor.ocelot.html.HtmlDoubleTag;
import net.comtor.ocelot.html.HtmlObject;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public abstract class HtmlButton extends HtmlDoubleTag {

    public static final String RESET = "reset";
    public static final String SUBMIT = "submit";
    public static final String BUTTON = "button";

    public HtmlButton(String value) {
        super("button");
        setValue(value);
        setType(BUTTON);
    }

    public HtmlButton(String type, String value) {
        this(value);
        setType(type);
    }

    final public HtmlObject setValue(String value) {
        addEscapedText(value);
        return this;
    }

    final public HtmlObject setType(String type) {
        addAttribute("type", type);
        return this;
    }

}
