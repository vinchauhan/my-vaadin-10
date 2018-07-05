package com.springular.web.components;

import com.springular.web.entities.PageInfo;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.ArrayList;
import java.util.List;

@Tag("app-navigation")
@HtmlImport("src/components/app-navigation.html")
public class AppNavigation extends PolymerTemplate<TemplateModel> implements AfterNavigationObserver {

    @Id("tabs")
    private Tabs tabs;

    private List<String> hrefs = new ArrayList<>();
    private String logoutHref;
    private String loginHref;
    private String currentHref;

    public void init(List<PageInfo> pages) {
        for(PageInfo page : pages) {
            Tab tab = new Tab(new IronIcon("vaadin", page.getIcon()), new Span(page.getTitle()));
            tabs.add(tab);
        }

    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {

    }
}
