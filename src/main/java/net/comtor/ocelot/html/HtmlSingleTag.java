package net.comtor.ocelot.html;

/**
 * A tag without content
 *
 * @author Guido A. Cafiel Vellojin
 * @author juriel@comtor.net
 */
public abstract class HtmlSingleTag extends HtmlTag {

    public HtmlSingleTag(String tagName) {
        super(tagName,true);
    }

}
