package net.comtor.ocelot.html.links;

import net.comtor.ocelot.html.HtmlDoubleTag;
import net.comtor.ocelot.html.HtmlObject;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlLi extends HtmlDoubleTag {

    public HtmlLi() {
        super("li");
    }

    public HtmlLi(String text) {
        this();
        addEscapedText(text);
        
    }

    public HtmlLi(HtmlObject tag) {
        this();
        add(tag);
    }

    
}
