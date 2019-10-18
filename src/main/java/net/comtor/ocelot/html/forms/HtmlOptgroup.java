package net.comtor.ocelot.html.forms;

import java.util.Arrays;
import java.util.LinkedList;
import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlOptgroup extends HtmlDoubleTag {

    public HtmlOptgroup(String label) {
        super("optgroup");
        addAttribute("label", label);
    }

    public HtmlOptgroup addOptions(LinkedList<HtmlOption> options) {
        options.forEach((opt) -> {
            this.add(opt);
        });
        return this;
    }

    public HtmlOptgroup addOptions(HtmlOption... options) {
        Arrays.asList(options).forEach((opt) -> {
            this.add(opt);
        });
        return this;
    }

}
