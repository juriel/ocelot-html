package net.comtor.ocelot.html.forms;

import net.comtor.ocelot.html.HtmlDoubleTag;
import net.comtor.ocelot.html.HtmlObject;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlFieldset extends HtmlDoubleTag implements HtmlFormElement {

    HtmlLegend legend;

    public HtmlFieldset() {
        super("fieldset");

    }

    public HtmlFieldset(String legend) {
        this();
        this.legend = new HtmlLegend(legend);
        add(this.legend);
    }

    public String getLegend() {
        if (legend == null) {
            return null;
        }
        return legend.getText();
    }

    public void setLegend(String legend) {
        if (this.legend == null) {
            this.legend = new HtmlLegend();
            this.addFirst(this.legend);
        }
        this.legend.setText(legend);
    }

    @Override
    public HtmlFormElement setValue(String value) {
        addData(value);
        return this;
    }

    @Override
    public String getValue() {
        HtmlObject f = getFirst();
        if (f == null) {
            return null;
        }
        return f.getHtml();
    }

    @Override
    public HtmlFormElement required() {
        addAttribute("requeired", "required");
        return this;
    }

    @Override
    public HtmlFormElement removeRequired() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlFormElement disable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlFormElement enable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlFormElement readOnly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlFormElement removeReadOnly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlSelect addOption(String value, String label) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlSelect addOption(String value, String label, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HtmlSelect addOption(HtmlOption optionTag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
