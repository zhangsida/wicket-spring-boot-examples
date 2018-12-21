package com.giffing.examples.wicket.spring.boot.simple;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class SecondPage extends WebPage {
    public SecondPage() {
        queue(new Label("myLabel", 20 + 5));
    }
}
