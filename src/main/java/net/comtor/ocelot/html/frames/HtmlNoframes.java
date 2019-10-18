package net.comtor.ocelot.html.frames;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
@Deprecated
public class HtmlNoframes extends HtmlTextContainer {

    
    public HtmlNoframes() {
        super("noframes");
    }

    public HtmlNoframes(String text) {
        super("noframes",text);
    }


}
