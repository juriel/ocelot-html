package net.comtor.ocelot.html.images;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlMap extends HtmlDoubleTag {

    public HtmlMap() {
        super("map");
         
    }

    public HtmlMap(String name) {
        this();
        addAttribute("name", name);
        
    }

}
