package net.comtor.ocelot.html.styles;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlData extends HtmlDoubleTag {


    public HtmlData() {
        super("data");
    }
    
    

    public HtmlData(String value, String label) {
        this();
        this.addAttribute("value", value);
        addData(label);
    }


}
