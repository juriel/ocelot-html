package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.HtmlDoubleTag;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlLabel extends HtmlDoubleTag {

    public HtmlLabel() {
        super("label");
    }

    public HtmlLabel(String forInput, String text) {
        this();
        addAttribute("for", forInput);
        addData(text);
    }

    public String getForInput() {
        return getAttribute("for");
    }

    public void setForInput(String forInput) {
        forInput = StringUtils.replace(forInput, ".", "_");
        addAttribute("for", forInput);

    }

}
