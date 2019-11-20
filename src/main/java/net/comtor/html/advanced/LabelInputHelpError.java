package net.comtor.html.advanced;

import net.comtor.ocelot.html.IHtmlTag;
import net.comtor.ocelot.html.forms.HtmlFormElement;

/**
 *
 * This interface represents a set of a Label, a input , a help (to explain) and
 * error
 *
 * @author juriel
 */
public interface LabelInputHelpError<INPUT extends HtmlFormElement> extends HtmlFormElement {

    INPUT getInput();

    public void setLabel(String label);

    public String getLabel();

    public void setHelp(String label);

    public String getHelp();

    public void setError(String label);

    public String getError();

    public default HtmlFormElement setValue(String value) {
        getInput().setValue(value);

        return this;
    }

    @Override
    public default String getValue() {
        return getInput().getValue();
    }

    @Override
    default public HtmlFormElement setName(String name) {
        getInput().setName(name);

        return this;
    }

    @Override
    default public String getName() {
        return getInput().getName();
    }

    @Override
    default public HtmlFormElement required() {
        getInput().required();

        return this;
    }

    @Override
    default public HtmlFormElement removeRequired() {
        getInput().removeRequired();

        return this;
    }

    @Override
    default public HtmlFormElement disable() {
        getInput().disable();

        return this;
    }

    @Override

    default public HtmlFormElement enable() {
        getInput().enable();

        return this;
    }

    @Override

    default HtmlFormElement readOnly() {
        getInput().readOnly();

        return this;
    }

    @Override
    default public HtmlFormElement removeReadOnly() {
        getInput().removeReadOnly();

        return this;
    }

    @Override

    default public IHtmlTag setId(String id) {
        getInput().setId(id);

        return this;
    }

    @Override
    default public String getId() {
        return getInput().getId();
    }

    @Override
    default public IHtmlTag onBlur(String script) {
        getInput().onBlur(script);

        return this;
    }

    @Override
    default public IHtmlTag onChange(String script) {
        getInput().onChange(script);

        return this;
    }

    @Override
    default public IHtmlTag onFocus(String script) {
        getInput().onFocus(script);

        return this;
    }

    @Override
    default public IHtmlTag onSelect(String script) {
        getInput().onSelect(script);

        return this;
    }

    @Override
    default public IHtmlTag onKeyDown(String script) {
        getInput().onKeyDown(script);

        return this;
    }

    @Override
    default public IHtmlTag onKeyPress(String script) {
        getInput().onKeyPress(script);

        return this;
    }

    @Override
    default public IHtmlTag onKeyUp(String script) {
        getInput().onKeyUp(script);

        return this;
    }

    @Override
    default public IHtmlTag onClick(String script) {
        getInput().onClick(script);

        return this;
    }

    @Override
    default public IHtmlTag onDblClick(String script) {
        getInput().onDblClick(script);

        return this;
    }

    @Override
    default public IHtmlTag onMouseDown(String script) {
        getInput().onMouseDown(script);

        return this;
    }

    @Override
    default public IHtmlTag onMouseMove(String script) {
        getInput().onMouseMove(script);

        return this;
    }

    @Override
    default public IHtmlTag onMouseOut(String script) {
        getInput().onMouseOut(script);

        return this;
    }

    @Override
    default public IHtmlTag onMouseOver(String script) {
        getInput().onMouseOver(script);

        return this;
    }

    @Override
    default public IHtmlTag onMouseUp(String script) {
        getInput().onMouseUp(script);

        return this;
    }

    @Override
    default public IHtmlTag setTabIndex(String tabIndex) {
        getInput().setTabIndex(tabIndex);

        return this;
    }

}
