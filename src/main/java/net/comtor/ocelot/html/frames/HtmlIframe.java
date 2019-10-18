package net.comtor.ocelot.html.frames;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlIframe extends HtmlDoubleTag {

    public HtmlIframe() {
        super("iframe");
    }

    public HtmlIframe(String src) {
        this();
        addAttribute("src", src);

    }

    public String getSrc() {
        return getAttribute("src");
    }

    public void setSrc(String src) {
        addAttribute("src", src);

    }

}
