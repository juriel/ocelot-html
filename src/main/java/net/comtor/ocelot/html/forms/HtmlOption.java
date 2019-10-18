package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.utils.HtmlTextContainer;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlOption extends HtmlTextContainer {

    public HtmlOption() {
        super("option");

    }

    public HtmlOption(String value, String label) {
        this();
        addAttribute("value", value);

        setText(label);
    }

    public HtmlOption(String value, String label, boolean selected) {
        this(value, label);
        addAttribute("selected", "selected");
    }

    public HtmlOption selected() {
        addAttribute("selected", "selected");
        return this;
    }

    public boolean isSelected() {
        return getAttribute("selected") != null;
    }

    public void setSelected(boolean selected) {
        if (selected) {
            addAttribute("selected", "selected");

        } else {
            removeAttribute("selected");
        }
    }

    public String getValue() {
        return getAttribute("value");
    }

    public void setValue(String value) {
        addAttribute("value", value);
    }

    public String getLabel() {
        return getText();

    }

    public void setLabel(String label) {
        setText(label);
    }

}
