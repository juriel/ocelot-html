package net.comtor.ocelot.html.tables;

import java.util.Arrays;
import java.util.List;
import net.comtor.ocelot.html.HtmlDoubleTag;
import net.comtor.ocelot.html.HtmlTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 * @author juriel
 */
public class HtmlTable extends HtmlDoubleTag {

    public HtmlTable() {
        super("table");
    }

    public HtmlTable addHeaders(String... headers) {
        addHeaders(Arrays.asList(headers));
        return this;
    }

    public HtmlTable addHeaders(List<String> headers) {
        HtmlTr tr = new HtmlTr();
        headers.forEach((header) -> {
            tr.add(new HtmlTh(header));
        });
        addFirst(tr);
        return this;
    }

    public HtmlTable addRow(String... cells) {
        HtmlTr tr = new HtmlTr();
        Arrays.asList(cells).forEach((cell) -> {
            tr.add(new HtmlTd(cell));
        });
        add(tr);
        return this;
    }

    public HtmlTable addRow(HtmlTag... tags) {
        HtmlTr tr = new HtmlTr();
        Arrays.asList(tags).forEach((tag) -> {
            tr.add(new HtmlTd(tag));
        });
        add(tr);
        return this;
    }
}
