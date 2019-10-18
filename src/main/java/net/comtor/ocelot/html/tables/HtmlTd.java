package net.comtor.ocelot.html.tables;

import net.comtor.ocelot.html.HtmlDataWrapper;
import net.comtor.ocelot.html.HtmlDoubleTag;
import net.comtor.ocelot.html.HtmlObject;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlTd extends HtmlDoubleTag {

    //private HtmlObject tag;
    public HtmlTd() {
        super("td");
    }

    public HtmlTd(String text) {
        this();
        add(new HtmlDataWrapper(text));
    }

    public HtmlTd(HtmlObject object) {
        this();
        add(object);
    }

}
