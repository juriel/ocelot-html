package net.comtor.ocelot.html.links;

import net.comtor.ocelot.html.HtmlSingleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlLink extends HtmlSingleTag {

    //private String rel;
    //private String type;
    //private String href;

    public HtmlLink(String rel, String type, String href) {
        super("link");
        addAttribute("rel", rel);
        addAttribute("type", type);
        addAttribute("href", href);
    }

    public String getHref() {
        return getAttribute("href");
    }

    public void setHref(String href) {
        addAttribute("href", href);
        
    }

    public String getRel() {
        return getAttribute("rel");
        
    }

    public void setRel(String rel) {
        addAttribute("rel", rel);
    }

    public String getType() {
        return getAttribute("type");
        
    }

    public void setType(String type) {
        addAttribute("type", type);
    }

}
