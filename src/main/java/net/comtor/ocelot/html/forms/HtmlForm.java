package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 * @author juriel
 * @author juandiego
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlForm extends HtmlDoubleTag {

    public static final String METHOD_POST = "POST";
    public static final String METHOD_GET = "GET";
    public static final String ENCTYPE_MULTIPART_FORM_DATA = "multipart/form-data";

    public HtmlForm() {
        super("form");
    }

    public HtmlForm(String name) {
        this();
        addAttribute("name", name);
    }

    public void setAction(String action) {
        addAttribute("action", action);
    }

    public String getAction() {
        return getAttribute("action");
    }

    public void setName(String name) {
        addAttribute("name", name);
    }

    public String getName() {
        return getAttribute("name");
    }

    public void setEnctType(String encType) {
        addAttribute("enctype", encType);
    }
}
