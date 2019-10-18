package net.comtor.ocelot.html.forms;

import java.util.List;
import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlDatalist extends HtmlDoubleTag {
    public HtmlDatalist(String id) {
        super("datalist");
        setId(id);
    }

    public HtmlDatalist(String id, String... options) {
        this(id);
        for(String opt : options){
            add(new HtmlSingleOption(opt));
        }
    }

    final public void addOptions(List<String> options) {
        for(String opt : options){
            add(new HtmlSingleOption(opt));
        }
    }


}
