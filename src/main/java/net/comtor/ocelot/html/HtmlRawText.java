package net.comtor.ocelot.html;

/**
 *
 * @author juriel
 */
public class HtmlRawText implements HtmlObject {

    private String text;

    public HtmlRawText(String data) {
        setText(data);
    }

    public String getText() {
        return text;
    }

    final public HtmlRawText setText(String str) {
        this.text = str;

        return this;
    }

    @Override
    public String getHtml() {
        return text;
    }

}
