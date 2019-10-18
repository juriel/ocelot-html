package net.comtor.ocelot.html.links;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlA extends HtmlDoubleTag {

    public HtmlA() {
        super("a");
    }

    public HtmlA(String href, String label) {
        this();
        addAttribute("href", href);
        addData(label);
    }

    public HtmlA(String label) {
        this();
        addData(label);
    }

}
