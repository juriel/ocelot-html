package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.IHtmlTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public interface HtmlFormElement extends IHtmlTag {

    public HtmlFormElement setName(String name);

    public String getName();

    public HtmlFormElement setValue(String value);

    public String getValue();

    public HtmlFormElement required();

    public HtmlFormElement removeRequired();

    public HtmlFormElement disable();

    public HtmlFormElement enable();

    public HtmlFormElement readOnly();

    public HtmlFormElement removeReadOnly();

}
