package net.comtor.ocelot.html;

import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

/**
 * Esta clase es la raiz de la librería de generación de html básico
 *
 * @author Guido A. Cafiel Vellojin
 */
public abstract class HtmlTag implements IHtmlTag {

    private String tagName;
    private HashMap<String, String> attributes;
    private String tagClass;
    private boolean singleTag;

    public HtmlTag(String tagName, boolean singleTag) {
        this.tagName = tagName;
        this.singleTag = singleTag;
        attributes = new HashMap<>();
        tagClass = "";

    }

    final public String getTag() {
        return tagName;
    }

    protected boolean isSingleTag() {
        return singleTag;
    }

    public HtmlTag setSingleTag(boolean singleTag) {
        this.singleTag = singleTag;
        return this;
    }

    @Override
    final public IHtmlTag addAttribute(String name, String value) {
        attributes.put(name, value);
        return this;
    }

    @Override
    public String getAttribute(String name) {
        return attributes.get(name);
    }

    @Override
    final public IHtmlTag removeAttribute(String key) {
        attributes.remove(key);
        return this;
    }

    @Override
    final public IHtmlTag setClass(String myClass) {
        this.tagClass = myClass;
        attributes.put("class", tagClass);
        return this;
    }

    @Override

    final public IHtmlTag removeClass(String myClass) {
        this.tagClass = this.tagClass.replace(myClass, "");
        attributes.put("class", tagClass);
        return this;
    }

    @Override

    public IHtmlTag addClass(String myClass) {
        if (tagClass.length() > 0) {
            this.tagClass += " ";
        }
        this.tagClass += myClass;
        attributes.put("class", tagClass);
        return this;
    }

    @Override

    public IHtmlTag setStyle(String style) {
        attributes.put("style", style);
        return this;
    }

    @Override
    final public IHtmlTag setId(String id) {
        attributes.put("id", StringUtils.replace(id, ".", "_"));
        return this;
    }

    @Override
    final public String getId() {
        if (!attributes.containsKey("id")) {
            return null;
        }
        return this.attributes.get("id");
    }

    @Override
    final public IHtmlTag setAccessKey(String accessKey) {
        attributes.put("accesskey", accessKey);
        return this;
    }

    @Override
    final public IHtmlTag setTabIndex(String tabIndex) {
        attributes.put("tabindex", tabIndex);
        return this;
    }

    @Override
    final public IHtmlTag onBlur(String script) {
        attributes.put("onblur", script);
        return this;
    }

    @Override
    final public IHtmlTag onChange(String script) {
        attributes.put("onchange", script);
        return this;
    }

    @Override
    final public IHtmlTag onFocus(String script) {
        attributes.put("onfocus", script);
        return this;
    }

    @Override
    final public IHtmlTag onSelect(String script) {
        attributes.put("onselect", script);
        return this;
    }

    @Override
    final public IHtmlTag onKeyDown(String script) {
        attributes.put("onkeydown", script);
        return this;
    }

    @Override
    final public IHtmlTag onKeyPress(String script) {
        attributes.put("onkeypress", script);
        return this;
    }

    @Override
    final public IHtmlTag onKeyUp(String script) {
        attributes.put("onkeyup", script);
        return this;
    }

    @Override
    final public IHtmlTag onClick(String script) {
        attributes.put("onclick", script);
        return this;
    }

    @Override
    public IHtmlTag onDblClick(String script) {
        attributes.put("ondblclick", script);
        return this;
    }

    @Override
    public IHtmlTag onMouseDown(String script) {
        attributes.put("onmousedown", script);
        return this;
    }

    @Override
    public IHtmlTag onMouseMove(String script) {
        attributes.put("onmousemove", script);
        return this;
    }

    @Override
    public IHtmlTag onMouseOut(String script) {
        attributes.put("onmouseout", script);
        return this;
    }

    @Override
    public IHtmlTag onMouseOver(String script) {
        attributes.put("onmouseover", script);
        return this;
    }

    @Override
    public IHtmlTag onMouseUp(String script) {
        attributes.put("onmouseup", script);
        return this;
    }

    public HtmlObject getRoot() {
        return this;
    }

    /**
     * Sobre escribir este método para modificar el objeto antes de hacer el render a html
     */
    protected void preHtmlRender() {

    }

    @Override
    final public String getHtml() {
        preHtmlRender();
        StringBuilder myAttributes = new StringBuilder();

        attributes.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            String value = entry.getValue();
            myAttributes.append("  ").append(key).append("=\"").append(value).append("\"");
        });

        if (isSingleTag()) {
            return new StringBuilder("<").append(getTag()).append(" ").append(myAttributes).append(" />").toString();
        }

        StringBuilder content = getContainerHtml();

        if (getTag() == null) {
            return content.toString();
        }

        return (new StringBuilder("<").append(getTag()).append(" ").append(myAttributes).append(" >").append(content).append("</").append(getTag()).append(">")).toString();

    }

    protected StringBuilder getContainerHtml() {
        return new StringBuilder();
    }

}
