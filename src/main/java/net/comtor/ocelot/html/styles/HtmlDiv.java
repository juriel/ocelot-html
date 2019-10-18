package net.comtor.ocelot.html.styles;

import net.comtor.ocelot.html.HtmlDoubleTag;
import net.comtor.ocelot.html.HtmlObject;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlDiv extends HtmlDoubleTag {

    public HtmlDiv() {
        super("div");
    }

    public HtmlDiv(HtmlObject object) {
        this();
        add(object);
    }

    public HtmlDiv(String id) {
        this();
        setId(id);
    }

}
