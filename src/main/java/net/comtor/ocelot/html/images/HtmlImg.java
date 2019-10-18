package net.comtor.ocelot.html.images;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlImg extends HtmlDoubleTag {

   // private String src;

    public HtmlImg() {
        super("img");
    }

    public HtmlImg(String src) {
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
