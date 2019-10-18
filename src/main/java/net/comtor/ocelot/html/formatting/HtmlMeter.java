package net.comtor.ocelot.html.formatting;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlMeter extends HtmlDoubleTag {
//
//    double value;
//    int min;
//    int max;

    public HtmlMeter() {
        super("meter");
    }

    public HtmlMeter(double value) {
        this();
        addAttribute("value", ""+value);
        
        
    }

    public HtmlMeter(double value, int min, int max) {
        this();
           addAttribute("value", ""+value);
        addAttribute("min", ""+min);
        addAttribute("max", ""+max);
    }

}
