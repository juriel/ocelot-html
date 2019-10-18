package net.comtor.ocelot.html.programing;

import net.comtor.ocelot.html.HtmlSingleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlEmbed extends HtmlSingleTag {


    public HtmlEmbed() {
        super("embed");
    }

    public HtmlEmbed(String src) {
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
