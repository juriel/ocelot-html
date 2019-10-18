package net.comtor.ocelot.html.programing;

import net.comtor.ocelot.html.HtmlSingleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlParam extends HtmlSingleTag {

    public HtmlParam(String name, String value) {
        super("param");
        addAttribute("name", name);
        addAttribute("value", value);

    }

    public String getValue() {
        return getAttribute("value");
    }

    public void setValue(String value) {
        addAttribute("value", value);
    }
}
