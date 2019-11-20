package net.comtor.html.advanced;

import net.comtor.ocelot.html.forms.HtmlForm;
import net.comtor.ocelot.html.forms.HtmlFormElement;
import net.comtor.ocelot.html.forms.inputs.HtmlInputHidden;

/**
 *
 * @author juriel
 */
public abstract class AbstractHtmlAdministrableFormElement extends HtmlForm implements HtmlAdministrableForm {

    @Override
    public HtmlAdministrableForm addInputHidden(String name, String value) {
        HtmlInputHidden input = new HtmlInputHidden(name, value);
        add(input);

        return this;
    }

    @Override
    public HtmlAdministrableForm addField(String label, HtmlFormElement input, String help, String error) {
        String id = input.getName();

        return this.addField(id, label, input, help, error);
    }

    @Override
    public HtmlAdministrableForm addField(String label, HtmlFormElement input, String help) {
        return this.addField(label, input, help, null);
    }

    @Override
    public HtmlAdministrableForm addField(String label, HtmlFormElement input) {
        return this.addField(label, input, null);
    }

    @Override
    public HtmlFormElement getInput(String name) {
        return (HtmlFormElement) get(name);
    }

    @Override
    public HtmlAdministrableForm addField(LabelInputHelpError input) {
        add(input);

        String id = input.getId();
        put(id, input);

        return this;
    }
}
