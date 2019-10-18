package net.comtor.ocelot.html;

import java.util.HashMap;

/**
 *
 * @author juriel
 */
public class HtmlContainerWithMainTag extends HtmlContainer implements IHtmlTag {

    IHtmlTag containerMainTag;

    public HtmlContainerWithMainTag(IHtmlTag containerMainTag) {
        this.containerMainTag = containerMainTag;
    }

    public IHtmlTag getContainerMainTag() {
        return containerMainTag;
    }

    @Override
    public HashMap<String, String> getAttributes() {
        return containerMainTag.getAttributes();

    }

    @Override
    public IHtmlTag addAttribute(String name, String value) {
        containerMainTag.addAttribute(name, value);
        return this;
    }

    @Override
    public String getAttribute(String name) {
        return containerMainTag.getAttribute(name);
    }

    @Override
    public IHtmlTag removeAttribute(String key) {
        containerMainTag.removeAttribute(key);
        return this;
    }

    @Override
    public IHtmlTag setClass(String myClass) {
        containerMainTag.setClass(myClass);
        return this;
    }

    @Override
    public IHtmlTag removeClass(String myClass) {
        containerMainTag.removeClass(myClass);
        return this;
    }

    @Override
    public IHtmlTag addClass(String myClass) {
        containerMainTag.addClass(myClass);
        return this;

    }

    @Override
    public IHtmlTag setStyle(String style) {
        containerMainTag.setStyle(style);
        return this;
    }

    @Override
    public IHtmlTag setName(String name) {
        containerMainTag.setName(name);
        return this;
    }

    @Override
    public IHtmlTag setId(String id) {
        containerMainTag.setId(id);
        return this;
    }

    @Override
    public String getId() {
        return containerMainTag.getId();

    }

    @Override
    public IHtmlTag setAccessKey(String accessKey) {
        containerMainTag.setAccessKey(accessKey);
        return this;
    }

    @Override
    public IHtmlTag setTabIndex(String tabIndex) {
        containerMainTag.setTabIndex(tabIndex);
        return this;
    }

    @Override
    public IHtmlTag onBlur(String script) {
        containerMainTag.onBlur(script);
        return this;
    }

    @Override
    public IHtmlTag onChange(String script) {
        containerMainTag.onChange(script);
        return this;
    }

    @Override
    public IHtmlTag onFocus(String script) {
        containerMainTag.onFocus(script);
        return this;
    }

    @Override
    public IHtmlTag onSelect(String script) {
        containerMainTag.onSelect(script);
        return this;
    }

    @Override
    public IHtmlTag onKeyDown(String script) {
        containerMainTag.onKeyDown(script);
        return this;
    }

    @Override
    public IHtmlTag onKeyPress(String script) {
        containerMainTag.onKeyPress(script);
        return this;
    }

    @Override
    public IHtmlTag onKeyUp(String script) {
        containerMainTag.onKeyUp(script);
        return this;
    }

    @Override
    public IHtmlTag onClick(String script) {
        containerMainTag.onClick(script);
        return this;
    }

    @Override
    public IHtmlTag onDblClick(String script) {
        containerMainTag.onDblClick(script);
        return this;
    }

    @Override
    public IHtmlTag onMouseDown(String script) {
        containerMainTag.onMouseDown(script);
        return this;
    }

    @Override
    public IHtmlTag onMouseMove(String script) {
        containerMainTag.onMouseDown(script);
        return this;
    }

    @Override
    public IHtmlTag onMouseOut(String script) {
        containerMainTag.onMouseOut(script);
        return this;
    }

    @Override
    public IHtmlTag onMouseOver(String script) {
        containerMainTag.onMouseOver(script);
                 return this;
    }

    @Override
    public IHtmlTag onMouseUp(String script) {
        containerMainTag.onMouseUp(script);
                 return this;
    }

    @Override
    public String getName() {
        return this.containerMainTag.getName();
    }

 

}
