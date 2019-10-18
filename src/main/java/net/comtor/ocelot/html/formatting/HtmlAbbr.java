package net.comtor.ocelot.html.formatting;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlAbbr extends HtmlTextContainer {

    private HtmlAbbr(String title) {
        super("abbr");
        addAttribute("title", title);
    }
}
