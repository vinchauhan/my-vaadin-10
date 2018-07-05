package com.springular.web.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.spring.annotation.SpringComponent;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Tag("confirm-dialog")
@HtmlImport("src/components/confirm-dialog.html")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@SpringComponent

public class ConfirmDialog extends Component {

    public ConfirmDialog() {

    }


}
