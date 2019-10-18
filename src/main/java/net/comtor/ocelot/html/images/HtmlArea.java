package net.comtor.ocelot.html.images;

import net.comtor.ocelot.html.HtmlSingleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlArea extends HtmlSingleTag {

    //private String shape, coords, alt, href;

    private HtmlArea() {
        super("area");
    }

    public HtmlArea(String shape, String coords, String alt, String href) {
        this();
        addAttribute("shape",shape);
        addAttribute("coords",coords);
        addAttribute("alt",alt);
        addAttribute("href",href);
    }


    public String getShape() {
        return getAttribute("shape");
        
    }

    public void setShape(String shape) {
        addAttribute("shape",shape);
    }

    public String getCoords() {
        return getAttribute("coords");
    }

    public void setCoords(String coords) {
        addAttribute("coords",coords);
    }

    public String getAlt() {
        return getAttribute("alt");
    }

    public void setAlt(String alt) {
        addAttribute("alt",alt);
    }

    public String getHref() {
        
        return getAttribute("href");
    }

    public void setHref(String href) {
        addAttribute("href",href);
    }

    
}
