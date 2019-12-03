package net.comtor.ocelot.html.programing;

import net.comtor.ocelot.html.HtmlObject;
import net.comtor.ocelot.html.HtmlRawText;
import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlScript extends HtmlTextContainer {

    private String code;

    public HtmlScript() {
        super("script");
    }

    public HtmlScript(String code) {
        this();
        this.code = code;
        setCode(code);
    }

    public HtmlObject setSrc(String src) {
        addAttribute("src", src);

        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
        removeAll();
        add(new HtmlRawText(code));
    }

}
