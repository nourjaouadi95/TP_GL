/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl2.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl2.MMLRuntimeModule
import org.xtext.example.mydsl2.MMLStandaloneSetup
import org.xtext.example.mydsl2.ide.MMLIdeModule

/**
 * Initialization support for running Xtext languages in web applications.
 */
class MMLWebSetup extends MMLStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MMLRuntimeModule, new MMLIdeModule, new MMLWebModule))
	}
	
}