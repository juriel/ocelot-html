package net.comtor.ocelot.html.tables;

import net.comtor.ocelot.html.HtmlDoubleTag;
import net.comtor.ocelot.html.HtmlObject;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlTh extends HtmlDoubleTag {

    public HtmlTh() {
        super("th");
    }

    public HtmlTh(String text) {
        this();
        addData(text);
    }

    public HtmlTh(HtmlObject object) {
        this();
        add(object);
    }
    

}
