package net.comtor.ocelot.html.utils;

import net.comtor.ocelot.html.HtmlEscapedText;
import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author juriel
 */
public class HtmlTextContainer extends HtmlDoubleTag implements IHtmlTextContainer {

    private String text;

    public HtmlTextContainer(String tagName) {
        super(tagName);
    }

    public HtmlTextContainer(String tagName, String text) {
        super(tagName);
        setText(text);
    }

    @Override
    final public void setText(String text) {
        this.text = text;
        removeAll();
        add(new HtmlEscapedText(text));
    }

    @Override
    public String getText() {
        return text;
    }

}
