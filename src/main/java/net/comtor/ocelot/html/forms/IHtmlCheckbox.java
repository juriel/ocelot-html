package net.comtor.ocelot.html.forms;

/**
 *
 * @author juandiego@comtor.net
 * @since Nov 13, 2019
 */
public interface IHtmlCheckbox extends HtmlFormElement {

    public default IHtmlCheckbox checked() {
        addAttribute("checked", "checked");

        return this;
    }

    public default IHtmlCheckbox unChecked() {
        removeAttribute("checked");

        return this;
    }
}
