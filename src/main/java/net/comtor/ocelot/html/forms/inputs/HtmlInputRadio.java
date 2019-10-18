package net.comtor.ocelot.html.forms.inputs;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlInputRadio extends HtmlInput {

    private boolean checked;

    public HtmlInputRadio() {
        super(HtmlInput.RADIO);
    }

    public HtmlInputRadio(boolean checked) {
        super(HtmlInput.RADIO);
        this.checked = checked;
    }

    @Override
    protected void preHtmlRender() {
        super.preHtmlRender();
        if (checked) {
            addAttribute("checked", "checked");
        }
    }

}
