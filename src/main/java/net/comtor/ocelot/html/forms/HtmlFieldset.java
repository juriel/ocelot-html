package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 * @author juriel@comtor.net
 */
public class HtmlFieldset extends HtmlDoubleTag {

    HtmlLegend legend;

    public HtmlFieldset() {
        super("fieldset");
        legend = new HtmlLegend();
        add(legend);
    }

    public HtmlFieldset(String text) {
       this();
       legend.setText(text);
    }

    final public HtmlFieldset setText(String text) {
        legend.removeAll();
        legend.addEscapedText(text);
        return this;
    }

}
