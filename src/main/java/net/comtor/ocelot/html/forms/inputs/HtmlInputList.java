package net.comtor.ocelot.html.forms.inputs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import net.comtor.ocelot.html.HtmlContainer;
import net.comtor.ocelot.html.HtmlSingleTag;
import net.comtor.ocelot.html.forms.HtmlDatalist;
import net.comtor.ocelot.html.forms.HtmlOption;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlInputList extends HtmlContainer implements Cloneable {

    /*
    private String name;
    private String nameList;
    private List<String> optionsList;
     */
    private HtmlInput input;
    private HtmlDatalist datalist;

    public HtmlInputList(String name, String nameList) {
        super();
        input = new HtmlInput(name);
        datalist = new HtmlDatalist(nameList);

    }

    public HtmlInputList(String name, String nameList, String... options) {
        this(name, nameList);

        for (String option : options) {
            new HtmlOption(option, "");
        }
    }

    public HtmlInputList(String name, String nameList, LinkedList<String> options) {
        this(name, nameList);

        for (String option : options) {
            new HtmlOption(option, "");
        }
    }

    public HtmlInputList addOptions(String... options) {
       for (String option : options) {
            new HtmlOption(option, "");
        }
        return this;
    }

    public HtmlInputList addOptions(LinkedList<String> options) {
       for (String option : options) {
            new HtmlOption(option, "");
        }
        return this;
    }

    public String getNameList() {
        return datalist.getName();
    }

    public void setNameList(String nameList) {
        this.datalist.setName(nameList);
    }


}
