/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl2.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.mydsl2.ui.internal.Mydsl2Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Mydsl2Activator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		Mydsl2Activator activator = Mydsl2Activator.getInstance();
		return activator != null ? activator.getInjector(Mydsl2Activator.ORG_XTEXT_EXAMPLE_MYDSL2_MML) : null;
	}

}