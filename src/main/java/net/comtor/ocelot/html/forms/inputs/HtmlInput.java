package net.comtor.ocelot.html.forms.inputs;

import net.comtor.ocelot.html.HtmlSingleTag;
import net.comtor.ocelot.html.forms.HtmlOption;
import net.comtor.ocelot.html.forms.HtmlSelect;
import net.comtor.ocelot.html.forms.HtmlFormElement;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlInput extends HtmlSingleTag implements HtmlFormElement {

    public static final String BUTTON = "button";
    public static final String CHECKBOX = "checkbox";
    public static final String COLOR = "color";
    public static final String DATE = "date";
    public static final String DATETIMELOCAL = "datetime-local";
    public static final String EMAIL = "email";
    public static final String FILE = "file";
    public static final String HIDDEN = "hidden";
    public static final String IMAGE = "image";
    public static final String MONTH = "month";
    public static final String NUMBER = "number";
    public static final String PASSWORD = "password";
    public static final String RADIO = "radio";
    public static final String RANGE = "range";
    public static final String RESET = "reset";
    public static final String SEARCH = "search";
    public static final String SUBMIT = "submit";
    public static final String TEL = "tel";
    public static final String TEXT = "text";
    public static final String TIME = "time";
    public static final String URL = "url";
    public static final String WEEK = "week";

    private HtmlInput() {
        super("input");
    }

    public HtmlInput(String type) {
        this();
        setType(type);
    }

    public final void setType(String type) {
        addAttribute("type", type);
    }

    @Override
    public HtmlFormElement required() {
        addAttribute("required", "required");
        return this;
    }

    @Override
    public HtmlFormElement removeRequired() {
        removeAttribute("required");
        return this;
    }

    @Override
    public HtmlFormElement setValue(String value) {
        addAttribute("value", value);
        return this;
    }

    @Override
    public String getValue() {
        return getAttribute("value");
    }

    @Override
    public HtmlFormElement enable() {
        removeAttribute("disabled");
        return this;
    }

    @Override
    public HtmlFormElement readOnly() {
        addAttribute("readonly", "readonly");
        return this;
    }

    @Override
    public HtmlFormElement removeReadOnly() {
        removeAttribute("readonly");
        return this;
    }

    @Override
    public HtmlFormElement disable() {
        addAttribute("disabled", "disabled");
        return this;
    }

    @Override
    public HtmlSelect addOption(String value, String label) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlSelect addOption(String value, String label, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlSelect addOption(HtmlOption optionTag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
