package net.comtor.ocelot.html;

import java.util.HashMap;

/**
 *
 * @author juriel
 */
public interface IHtmlTag extends HtmlObject {

    public HashMap<String, String> getAttributes();

    public IHtmlTag addAttribute(String name, String value);

    public String getAttribute(String name);

    public IHtmlTag removeAttribute(String key);

    public IHtmlTag setClass(String myClass);

    public IHtmlTag removeClass(String myClass);

    public IHtmlTag addClass(String myClass);

    public IHtmlTag setStyle(String style);

    public IHtmlTag setName(String name);

    public String getName();

    public IHtmlTag setId(String id);

    public String getId();

    public IHtmlTag setAccessKey(String accessKey);

    public IHtmlTag setTabIndex(String tabIndex);

    public IHtmlTag onBlur(String script);

    public IHtmlTag onChange(String script);

    public IHtmlTag onFocus(String script);

    public IHtmlTag onSelect(String script);

    public IHtmlTag onKeyDown(String script);

    public IHtmlTag onKeyPress(String script);

    public IHtmlTag onKeyUp(String script);

    public IHtmlTag onClick(String script);

    public IHtmlTag onDblClick(String script);

    public IHtmlTag onMouseDown(String script);

    public IHtmlTag onMouseMove(String script);

    public IHtmlTag onMouseOut(String script);

    public IHtmlTag onMouseOver(String script);

    public IHtmlTag onMouseUp(String script);

}
