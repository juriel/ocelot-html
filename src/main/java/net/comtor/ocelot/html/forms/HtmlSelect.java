package net.comtor.ocelot.html.forms;

import java.util.LinkedList;
import net.comtor.ocelot.html.HtmlDoubleTag;
import net.comtor.ocelot.html.HtmlObject;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlSelect extends HtmlDoubleTag implements HtmlFormElement {

    public HtmlSelect() {
        super("select");

    }

    public HtmlSelect(String name) {
        this();
        addAttribute("name", name);
    }

    public HtmlSelect(String name, String... options) {
        this();
        for (String option : options) {
            add(new HtmlOption(option, option));

        }
    }

    public HtmlSelect(String name, HtmlOption... options) {
        this(name);
        for (HtmlOption option : options) {
            add(option);
        }
    }

    public HtmlSelect addOption(String value, String label) {
        add(new HtmlOption(value, label));
        return this;
    }

    public HtmlSelect addOption(String value, String label, boolean selected) {
        add(new HtmlOption(value, label, selected));
        return this;
    }

    public HtmlSelect addOption(HtmlOption optionTag) {
        add(optionTag);
        return this;
    }

    @Override
    public HtmlFormElement setValue(String value) {
        LinkedList<HtmlObject> optionsList = getContentObjects();
        for (HtmlObject obj : optionsList) {
            if (obj instanceof HtmlOption) {
                HtmlOption option = (HtmlOption) obj;
                if (option.getValue() != null && option.getValue().equals(value)) {
                    option.selected();
                }
            }
        }
        return this;
    }

    @Override
    public String getValue() {
        LinkedList<HtmlObject> optionsList = getContentObjects();
        for (HtmlObject obj : optionsList) {
            if (obj instanceof HtmlOption) {
                HtmlOption option = (HtmlOption) obj;
                if (option.isSelected()) {
                    return option.getValue();
                }
            }

        }
        return "";
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
    public HtmlFormElement disable() {
        addAttribute("disabled", "disabled");
        return this;
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
    public HtmlFormElement setName(String name) {
        addAttribute("name", name);
        return this;
    }

    @Override
    public String getName() {
        return getAttribute("name");
    }

}
