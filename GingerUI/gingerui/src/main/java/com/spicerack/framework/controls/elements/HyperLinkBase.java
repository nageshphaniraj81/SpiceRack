package com.spicerack.framework.controls.elements;


import org.openqa.selenium.WebElement;

import com.spicerack.framework.controls.internals.ControlBase;

/**
 * @author Nagesh Phaniraj
 *
 */

public class HyperLinkBase extends ControlBase implements HyperLink {
    public HyperLinkBase(WebElement element) {
        super(element);
    }

    @Override
    public void ClickLink() {
        getWrappedElement().click();
    }

    @Override
    public String GetUrlText() {
        return getWrappedElement().getText();
    }

    @Override
    public boolean CheckUrlTextContains(String containsText) {
        if (getWrappedElement().getText().contains(containsText))
            return true;
        else
            return false;
    }
}
