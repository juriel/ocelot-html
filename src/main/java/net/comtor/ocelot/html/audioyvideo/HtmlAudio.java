package net.comtor.ocelot.html.audioyvideo;

import net.comtor.ocelot.html.HtmlDoubleTag;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class HtmlAudio extends HtmlDoubleTag {

    public HtmlAudio() {
        super("audio");
        addAttribute("controls", "controls");

    }

}
