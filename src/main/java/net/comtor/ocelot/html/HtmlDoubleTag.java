package net.comtor.ocelot.html;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Guido A. Cafiel Vellojin
 * @author juriel@comtor.net
 */
public class HtmlDoubleTag extends HtmlTag implements IHtmlContainer {

    private HtmlContainer container;

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
        add(new HtmlEscapedText(text));
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

    final public HtmlObject addEscapedText(String text) {

        container.add(new HtmlEscapedText(text));
        return this;
    }

    final public HtmlDoubleTag addRawText(String text) {
        container.add(new HtmlRawText(text));
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

    @Override
    public IHtmlContainer put(String id, HtmlObject obj) {
        container.put(id, obj);
        return this;
    }

    @Override
    public HtmlObject get(String id) {
        return container.get(id);
    }

}
