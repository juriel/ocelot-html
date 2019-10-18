package net.comtor.ocelot.html.utils;

import net.comtor.ocelot.html.HtmlContainer;
import net.comtor.ocelot.html.HtmlDataWrapper;
import net.comtor.ocelot.html.IHtmlContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public abstract class HtmlTextContainer2 extends HtmlContainer implements IHtmlContainer {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        removeAll();
        add(new HtmlDataWrapper(text));
    }

}
