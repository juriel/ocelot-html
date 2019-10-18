package net.comtor.ocelot.html;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlContainer implements IHtmlContainer {

    LinkedList<HtmlObject> children;

    public HtmlContainer() {
        children = new LinkedList<>();
    }

    public IHtmlContainer add(HtmlObject child) {
        children.add(child);
        return this;
    }

    public IHtmlContainer addAll(HtmlObject... children) {
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
                if (child.getAttributes().containsKey("id") && child.getId().equals(id)) {
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

//                if (!child.getContentObjects().isEmpty()) {
//                    HtmlObject target = child.getElementById(id);
//                    if (target != null) {
//                        return target;
//                    }
//                }
        }
        return null;

    }

    @Override
    public HtmlObject getElementByName(String name) {

        for (HtmlObject cc : children) {
            if (cc instanceof IHtmlTag) {
                IHtmlTag child = (IHtmlTag) cc;

                if (child.getAttributes().containsKey("name") && child.getName().equals(name)) {
                    return child;
                }
            }
            if (cc instanceof IHtmlContainer) {
                IHtmlContainer child = (IHtmlContainer) cc;

                HtmlObject resp = child.getElementByName(name);
                if (resp != null) {
                    return resp;
                }
//
//                if (!child.getContenObjects().isEmpty()) {
//                    HtmlObject target = child.getElementByName(name);
//                    if (target != null) {
//                        return target;
//                    }
//                }
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

}