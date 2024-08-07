package com.technologyos.monolito.views;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class LogoLayout extends HorizontalLayout {

    private Image image;

    public LogoLayout(){
        image = new Image("images/logo.png", "My image");
        setJustifyContentMode(JustifyContentMode.CENTER);
        add(image);
    }
}
