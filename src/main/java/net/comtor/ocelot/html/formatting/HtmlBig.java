package net.comtor.ocelot.html.formatting;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
@Deprecated
public class HtmlBig extends HtmlTextContainer {

    public HtmlBig() {
        super("big");
    }

    public HtmlBig(String text) {

        super("big", text);
    }

}
