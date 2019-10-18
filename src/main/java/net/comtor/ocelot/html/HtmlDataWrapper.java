package net.comtor.ocelot.html;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlDataWrapper implements HtmlObject{

    private String data;

    public HtmlDataWrapper(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getHtml() {
        return data;
    }

   

}
