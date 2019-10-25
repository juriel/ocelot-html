package net.comtor.ocelot.html.styles;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlDialog extends HtmlDoubleTag {

    
    public HtmlDialog(){
        super("dialog");
    }

    public HtmlDialog(String text) {
        super("dialog");
        addEscapedText(text);
    }


}
