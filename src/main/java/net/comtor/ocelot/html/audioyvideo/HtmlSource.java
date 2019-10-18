package net.comtor.ocelot.html.audioyvideo;

import net.comtor.ocelot.html.HtmlSingleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlSource extends HtmlSingleTag {

//    private String src;
//    private String type;
    public HtmlSource() {
        super("source");
    }

    public HtmlSource(String src, String type) {
        this();
        addAttribute("src", src);
        addAttribute("type", type);

    }

    public String getType() {
        return getAttribute("type");
    }

    public void setType(String type) {

        addAttribute("type", type);
    }

    public String getSrc() {
        return getAttribute("src");
    }

    public void setSrc(String src) {
        addAttribute("src", src);

    }

    

}
