package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlForm extends HtmlDoubleTag {


    public HtmlForm() {
        super("form");
    }

    public HtmlForm(String name) {
        this();
        addAttribute("name", name);
       
    }


}
