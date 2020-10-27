package net.comtor.ocelot.html;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author juriel@comtor.net
 */
public class HtmlEscapedText implements HtmlObject {

    private String text;

    public HtmlEscapedText(String data) {
        setText(data);
    }

    public String getText() {
        return text;
    }

    public final HtmlEscapedText setText(String str) {
        this.text = str;

        if (text != null) {
            text = StringUtils.replace(text, "&", "&amp;");
            text = StringUtils.replace(text, "<", "&lt;");
            text = StringUtils.replace(text, ">", "&gt;");
            text = StringUtils.replace(text, "\"", "&quot;");
            text = StringUtils.replace(text, "'", "&#39;");
        }

        return this;
    }

    @Override
    public String getHtml() {
        return text;
    }

}
