package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.HtmlSingleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlSingleOption extends HtmlSingleTag {

    public HtmlSingleOption(){
        super("option");
    }
    
    //private String value;

    public HtmlSingleOption(String value) {
        this();
        addAttribute("value", value);
        
    }

    public String getValue() {
        return getAttribute("value");
    }

    public void setValue(String value) {
        addAttribute("value", value);
    }

  

}
