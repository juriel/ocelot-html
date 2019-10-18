package net.comtor.ocelot.html.formatting;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
@Deprecated
public class HtmlStrike extends HtmlTextContainer {

    public HtmlStrike() {
        super("strike");
    }

    public HtmlStrike(String text) {
        super("strike",text);
    }

}
