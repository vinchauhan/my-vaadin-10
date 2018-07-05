package com.springular.spring;

import com.springular.web.components.AppNavigation;
import com.springular.web.components.ConfirmDialog;
import com.springular.web.entities.PageInfo;
import com.springular.web.utils.HeroConst;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.*;
import com.vaadin.flow.templatemodel.TemplateModel;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.ArrayList;
import java.util.List;

import static com.springular.web.utils.HeroConst.*;

/**
 * The main view contains a simple label element and a template element.
 */
@Tag("main-view")
@HtmlImport("src/main-view.html")
@Route("")
@PageTitle("Home")
@Viewport(VIEWPORT)
public class MainView extends PolymerTemplate<TemplateModel> implements RouterLayout, BeforeEnterObserver {

    @Id("appNavigation")
    private AppNavigation appNavigation;

    //private final ConfirmDialog confirmDialog;

    public MainView(@Autowired ConfirmDialog confirmDialog) {
        // This is just a simple label created via Elements API
        //this.confirmDialog = confirmDialog;

        List<PageInfo> pages = new ArrayList<>();

        pages.add(new PageInfo(PAGE_STOREFRONT, ICON_STOREFRONT, TITLE_STOREFRONT));

        appNavigation.init(pages);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {

    }

    @Override
    public void showRouterLayoutContent(HasElement content) {

    }
}
