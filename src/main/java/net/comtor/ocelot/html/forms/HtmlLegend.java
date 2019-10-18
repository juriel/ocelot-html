package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlLegend extends HtmlTextContainer {
    public HtmlLegend(){
        super("legend");
    }
    public HtmlLegend(String text){
        super("legend",text);
    }
}
