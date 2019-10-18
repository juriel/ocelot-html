package net.comtor.ocelot.html;

import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlDoubleTag extends HtmlTag implements IHtmlContainer {

    HtmlContainer container;

    public HtmlDoubleTag(String tagName) {
        super(tagName, false);
        this.container = new HtmlContainer();
    }

    public HtmlDoubleTag(String tagName, HtmlTag object) {
        this(tagName);
        add(object);
    }

    public HtmlDoubleTag(String tagName, String text) {
        this(tagName);
        add(new HtmlDataWrapper(text));
    }

    @Override
    public IHtmlContainer add(HtmlObject child) {
        container.add(child);
        return this;
    }

    @Override
    public IHtmlContainer addAll(HtmlObject... children) {
        container.addAll(children);
        return this;
    }

    @Override
    public IHtmlContainer removeAll() {
        container.removeAll();
        return this;
    }

    @Override
    public IHtmlContainer addAll(List<HtmlObject> list) {
        container.addAll(list);
        return this;
    }

    @Override
    public HtmlObject getFirst() {
        return container.getFirst();
    }

    @Override
    public LinkedList<HtmlObject> getContentObjects() {
        return container.getContentObjects();
    }

    @Override
    public HtmlObject getElementById(String id) {
        return container.getElementById(id);
    }


    public HtmlObject addEscapedData(String text) {
        if (text != null) {
            text = StringUtils.replace(text, "&", "&amp;");
            text = StringUtils.replace(text, "<", "&lt;");
            text = StringUtils.replace(text, ">", "&gt;");
            text = StringUtils.replace(text, "\"", "&quot;");
            text = StringUtils.replace(text, "'", "&#39;");
            container.add(new HtmlDataWrapper(text));
        }
        return this;
    }

    public HtmlDoubleTag addData(String text) {
        container.add(new HtmlDataWrapper(text));
        return this;
    }

    @Override
    public IHtmlContainer addFirst(HtmlObject child) {
        container.addFirst(child);
        return this;
    }

    @Override
    protected final StringBuilder getContainerHtml() {
        return new StringBuilder(container.getHtml());
    }

}
