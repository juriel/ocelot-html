package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 * @author juriel@comtor.net
 */
public class HtmlFieldset extends HtmlDoubleTag {

    HtmlLegend legend;

    public HtmlFieldset(String text) {
        super("fieldset");
        legend = new HtmlLegend();
        legend.addData(text);
    }
    
    
    public HtmlFieldset setText(String text){
        legend.removeAll();
        legend.addData(text);
        return this;
    }
    

}
