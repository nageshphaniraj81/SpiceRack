/**
 * 
 */
package com.spicerack.framework.controls.internals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

import com.spicerack.framework.controls.api.ImplementedBy;

/**
 * The Interface Control.
 *
 * @author Nagesh Phaniraj
 */
@ImplementedBy(ControlBase.class)
public interface Control extends WebElement, WrapsElement, Locatable {
  // Control Interface extends WebElement, WrapsElement, Locatable
}
