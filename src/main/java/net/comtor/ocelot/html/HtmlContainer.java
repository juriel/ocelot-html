package net.comtor.ocelot.html;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlContainer implements IHtmlContainer {

    LinkedList<HtmlObject> children;
    LinkedHashMap<String, HtmlObject> map;

    public HtmlContainer() {
        children = new LinkedList<>();
        map = new LinkedHashMap<>();
    }

    final public IHtmlContainer add(HtmlObject child) {
        children.add(child);

        return this;
    }

    final public IHtmlContainer addAll(HtmlObject... children) {
        for (HtmlObject htmlObject : children) {
            add(htmlObject);
        }

        return this;
    }

    @Deprecated
    public IHtmlContainer addTag(HtmlObject child) {
        return add(child);
    }

    @Override
    public LinkedList<HtmlObject> getContentObjects() {
        return children;
    }

    protected void preHtmlRender() {

    }

    @Override
    final public String getHtml() {
        preHtmlRender();

        StringBuilder sb = new StringBuilder();

        for (HtmlObject htmlObject : children) {
            sb.append(htmlObject.getHtml());
        }

        return sb.toString();
    }

    public IHtmlContainer addAll(List<HtmlObject> asList) {
        children.addAll(asList);

        return this;

    }

    @Override
    public HtmlObject getElementById(String id) {
        for (HtmlObject cc : children) {
            if (cc instanceof IHtmlTag) {
                IHtmlTag child = (IHtmlTag) cc;

                if ((child.getId() != null) && child.getId().equals(id)) {
                    return child;
                }
            }

            if (cc instanceof IHtmlContainer) {
                IHtmlContainer child = (IHtmlContainer) cc;
                HtmlObject resp = child.getElementById(id);

                if (resp != null) {
                    return resp;
                }
            }
        }

        return null;

    }

    @Override
    public IHtmlContainer addFirst(HtmlObject htmlObject) {
        children.addFirst(htmlObject);

        return this;
    }

    @Override
    public HtmlObject getFirst() {
        return children.getFirst();
    }

    @Override
    public IHtmlContainer removeAll() {
        children = new LinkedList<>();

        return this;
    }

    public IHtmlContainer put(String id, HtmlObject obj) {
        map.put(id, obj);

        return this;
    }

    @Override
    public HtmlObject get(String id) {
        return map.get(id);
    }

}
