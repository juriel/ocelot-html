package net.comtor.ocelot.html.formatting;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlStrong extends HtmlTextContainer {

    public HtmlStrong() {
        super("strong");
    }

    public HtmlStrong(String text) {
        super("strong",text);
    }

}
