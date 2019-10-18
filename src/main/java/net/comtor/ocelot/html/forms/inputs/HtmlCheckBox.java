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

    public HtmlCheckBox(boolean checked) {
        super(HtmlInput.CHECKBOX);
        this.checked = checked;
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
