package net.comtor.ocelot.html.forms;

import java.util.LinkedHashMap;
import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlForm extends HtmlDoubleTag {

    private LinkedHashMap<String, HtmlFormElement> formElements;

    public HtmlForm() {
        super("form");

        formElements = new LinkedHashMap<>();
    }

    public HtmlForm(String name) {
        this();

        addAttribute("name", name);
    }

    public LinkedHashMap<String, HtmlFormElement> getFormElements() {
        return formElements;
    }

    public void setFormElements(LinkedHashMap<String, HtmlFormElement> formElements) {
        this.formElements = formElements;
    }

    public void addFormElement(String key, HtmlFormElement value) {
        formElements.put(key, value);
    }

}
