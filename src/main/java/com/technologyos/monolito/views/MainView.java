package com.technologyos.monolito.views;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/ui")
@PageTitle(value = "Home")
public class MainView extends VerticalLayout {

    private LogoLayout logoLayout;

    public MainView() {
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        add(new LogoLayout());
    }
}
