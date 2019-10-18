package net.comtor.ocelot.html.forms;

/**
 *
 * @author juriel
 */
public interface HtmlFormElementWrapper extends HtmlFormElement {

    public void setWrappedHtmlFormElement(HtmlFormElement formElement);

    public HtmlFormElement getWrappedHtmlFormElement();

    default HtmlFormElement setValue(String value) {
        getWrappedHtmlFormElement().setValue(value);
        return this;
    }

    default String getValue() {
        return getWrappedHtmlFormElement().getValue();
    }

    default HtmlFormElement required() {
        getWrappedHtmlFormElement().required();
        return this;
    }

    default HtmlFormElement removeRequired() {
        getWrappedHtmlFormElement().removeRequired();
        return this;
    }

    @Override
    default HtmlFormElement disable() {
        getWrappedHtmlFormElement().disable();
        return this;
    }

    default HtmlFormElement enable() {
        getWrappedHtmlFormElement().enable();
        return this;
    }

    default HtmlFormElement readOnly() {
        getWrappedHtmlFormElement().readOnly();
        return this;
    }

    default HtmlFormElement removeReadOnly() {
        getWrappedHtmlFormElement().removeReadOnly();
        return this;
    }

    default HtmlSelect addOption(String value, String label) {
        HtmlFormElement ele = getWrappedHtmlFormElement();

        if (ele instanceof HtmlSelect) {
            HtmlSelect select = (HtmlSelect) ele;
            select.addOption(value, label);
            return select;
        }
        return null;

    }

    default HtmlSelect addOption(String value, String label, boolean selected) {
        HtmlFormElement ele = getWrappedHtmlFormElement();

        if (ele instanceof HtmlSelect) {
            HtmlSelect select = (HtmlSelect) ele;
            select.addOption(value, label, selected);
            return select;
        }
        return null;
    }

    default HtmlSelect addOption(HtmlOption optionTag) {
        HtmlFormElement ele = getWrappedHtmlFormElement();

        if (ele instanceof HtmlSelect) {
            HtmlSelect select = (HtmlSelect) ele;
            select.addOption(optionTag);
            return select;
        }
        return null;
    }
}
