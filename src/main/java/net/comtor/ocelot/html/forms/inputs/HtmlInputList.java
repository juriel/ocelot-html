package net.comtor.ocelot.html.forms.inputs;

import java.util.LinkedList;
import net.comtor.ocelot.html.HtmlContainer;
import net.comtor.ocelot.html.forms.HtmlDatalist;
import net.comtor.ocelot.html.forms.HtmlOption;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlInputList extends HtmlContainer {

    private HtmlInput input;
    private HtmlDatalist datalist;

    public HtmlInputList(String name, String nameList) {
        super();
        input = new HtmlInput(name);
        datalist = new HtmlDatalist(nameList);
        add(input);
        add(datalist);

    }

    public HtmlInputList(String name, String nameList, String... options) {
        this(name, nameList);
        for (String option : options) {
            HtmlOption op = new HtmlOption(option, "");
            datalist.add(op);
        }
    }

    public HtmlInputList(String name, String nameList, LinkedList<String> options) {
        this(name, nameList);

        for (String option : options) {
            HtmlOption op = new HtmlOption(option, "");
            datalist.add(op);
        }
    }

    public HtmlInputList addOptions(String... options) {
        for (String option : options) {
            HtmlOption op = new HtmlOption(option, "");
            datalist.add(op);
        }
        return this;
    }

    public HtmlInputList addOptions(LinkedList<String> options) {
        for (String option : options) {
            HtmlOption op = new HtmlOption(option, "");
            datalist.add(op);
        }

        return this;
    }
}
