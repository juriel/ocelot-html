package net.comtor.ocelot.html.forms.inputs;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlCheckBox extends HtmlInput {

    private boolean checked;

    public HtmlCheckBox() {
        super(HtmlInput.CHECKBOX);
    }

    public HtmlCheckBox(String id, String name, boolean checked) {
        super(HtmlInput.CHECKBOX);

        addAttribute("id", name);
        addAttribute("name", name);

        this.checked = checked;
    }

    public HtmlCheckBox(String id, boolean checked) {
        this(id, id, checked);
    }

    public HtmlCheckBox(boolean checked) {
        this("", "", checked);
    }

    public HtmlCheckBox checked() {
        addAttribute("checked", "checked");

        return this;
    }

    @Override
    protected void preHtmlRender() {
        super.preHtmlRender();

        if (checked) {
            addAttribute("checked", "checked");
        }
    }

}
