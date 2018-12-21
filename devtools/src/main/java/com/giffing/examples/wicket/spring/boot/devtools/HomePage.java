package com.giffing.examples.wicket.spring.boot.devtools;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

@WicketHomePage
public class HomePage extends WebPage {

    public HomePage() {
        queue(new Label("myLabel", 9 + 5));
    }

}
