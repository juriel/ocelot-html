package net.comtor.ocelot.html.decorators;

import net.comtor.ocelot.html.HtmlObject;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public abstract class HtmlObjectDecorator implements HtmlObject {

    HtmlObject object;

    public HtmlObjectDecorator(HtmlObject object) {
        this.object = object;
    }

    public HtmlObject getHtmlObject() {
        return object;
    }

}
