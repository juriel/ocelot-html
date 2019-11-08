package net.comtor.ocelot.html;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author juriel
 */
public interface IHtmlContainer extends HtmlObject{

    HtmlObject getFirst();

    public LinkedList<HtmlObject> getContentObjects();

    public HtmlObject getElementById(String id);


    public IHtmlContainer add(HtmlObject child);

    public IHtmlContainer addAll(HtmlObject... children);

    public IHtmlContainer addAll(List<HtmlObject> list);

    public IHtmlContainer addFirst(HtmlObject child);

    public IHtmlContainer removeAll();
    
    
    IHtmlContainer put(String id, HtmlObject obj) ;
    
    HtmlObject get(String id);

}
