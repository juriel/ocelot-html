package net.comtor.ocelot.html.formatting;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlBlockquote extends HtmlTextContainer {


    public HtmlBlockquote() {
        super("blockquote");
    }

    public HtmlBlockquote(String cite, String text) {
        this();
        addAttribute("cite",  cite);
            setText(text);

    }

    public String getCite() {
        return getAttribute("cite");
    }

    public void setCite(String cite) {
        addAttribute("cite", cite);
    }

}
