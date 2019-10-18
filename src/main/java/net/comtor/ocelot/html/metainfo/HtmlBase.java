package net.comtor.ocelot.html.metainfo;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlBase extends HtmlDoubleTag {

    private HtmlBase() {
        super("base");
    }

    public HtmlBase(String href, String target) {
        this();
        addAttribute("href", href);
        addAttribute("target", target);
        
    }


    public String getHref() {
        return getAttribute("href");
    }

    public void setHref(String href) {
        addAttribute("href", href);
    }

    public String getTarget() {
        
        return getAttribute("target");
    }

    public void setTarget(String target) {
        addAttribute("target", target);
        
    }
}
