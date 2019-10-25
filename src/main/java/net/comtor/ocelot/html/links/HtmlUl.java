package net.comtor.ocelot.html.links;

import java.util.Arrays;
import net.comtor.ocelot.html.HtmlEscapedText;
import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlUl extends HtmlDoubleTag {

    public HtmlUl() {
        super("ul");
    }

    public HtmlUl addLi(HtmlLi liTag) {
        add(liTag);
        return this;
    }

    public HtmlUl addLis(HtmlLi... liTag) {
        Arrays.asList(liTag).forEach((li) -> {
            add(li);
        });

        return this;
    }

    public HtmlUl addLi(String text) {
        add(new HtmlLi(text));
        return this;
    }

    public HtmlUl addLis(String... text) {
        Arrays.asList(text).forEach((li) -> {
            add(new HtmlEscapedText(li));
        });

        return this;
    }

}
