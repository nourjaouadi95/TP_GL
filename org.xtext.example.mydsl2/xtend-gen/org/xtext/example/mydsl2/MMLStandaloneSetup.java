/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl2;

import org.xtext.example.mydsl2.MMLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MMLStandaloneSetup extends MMLStandaloneSetupGenerated {
  public static void doSetup() {
    new MMLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
