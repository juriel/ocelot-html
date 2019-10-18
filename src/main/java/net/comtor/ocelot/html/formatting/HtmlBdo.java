package net.comtor.ocelot.html.formatting;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlBdo extends HtmlDoubleTag {

    private boolean leftToRight;

    public HtmlBdo() {
        super("bdo");
        leftToRight = true;
    }

    /**
     * Define the text direction, with true the text go left to right "example", false the text go right to left "elpmaxe"
     *
     * @param righToLeft
     */
    public HtmlBdo(boolean righToLeft) {
        this();
        if (leftToRight) {
            addAttribute("dir", "ltr");
        } else {
            addAttribute("dir", "rtl");
        }
    }


    public boolean isLeftToRight() {
        return getAttribute("dir").equals("ltr");
    }

    /**
     * Define the text direction, with true the text go left to right "example", false the text go right to left "elpmaxe"
     *
     * @param leftToRight
     */
    public void setLeftToRight(boolean leftToRight) {
       if (leftToRight) {
            addAttribute("dir", "ltr");
        } else {
            addAttribute("dir", "rtl");
        }
    }


}
