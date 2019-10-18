package net.comtor.ocelot.html.styles;

import net.comtor.ocelot.html.HtmlObject;
import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlSpan extends HtmlTextContainer {

    public HtmlSpan() {
        super("span");
    }

    public HtmlSpan(String text) {
        super("span", text == null ? "" : text);
    }

    public HtmlSpan(HtmlObject object) {
        super("span");
        add(object);
    }

}
