package net.comtor.ocelot.html.formatting;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlBdi extends HtmlTextContainer {

    //private String text;

    public HtmlBdi() {
        super("bdi");
    }
    

    public HtmlBdi(String text) {
        super("bdi",text);
    }

}
