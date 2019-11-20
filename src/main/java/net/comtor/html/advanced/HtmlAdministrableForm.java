package net.comtor.html.advanced;

import net.comtor.ocelot.html.IHtmlContainer;
import net.comtor.ocelot.html.forms.HtmlFormElement;

/**
 *
 * @author juriel
 */
public interface HtmlAdministrableForm extends IHtmlContainer {

    public HtmlAdministrableForm addInputHidden(String name, String value);

    public HtmlAdministrableForm addField(String id, String label, HtmlFormElement input, String help, String error);

    public HtmlAdministrableForm addField(String label, HtmlFormElement input, String help, String error);

    public HtmlAdministrableForm addField(String label, HtmlFormElement input, String help);

    public HtmlAdministrableForm addField(String label, HtmlFormElement input);  // Esta saca el id del name del HtmlFormElement

    //public <INPUT extends HtmlFormElement> HtmlAdministrableForm addField(INPUT input);
    public HtmlAdministrableForm addField(LabelInputHelpError input);

    HtmlFormElement getInput(String name);  // En este caso el name del input es el id con el que se indexó

    void setAction(String action);

    String getAction();

    void setName(String name);

    String getName();

    void setEnctType(String encType);
}
