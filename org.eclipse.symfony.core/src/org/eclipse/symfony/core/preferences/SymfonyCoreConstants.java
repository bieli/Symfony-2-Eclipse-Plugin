package org.eclipse.symfony.core.preferences;


import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.symfony.core.SymfonyCorePlugin;
import org.eclipse.symfony.core.preferences.CorePreferenceConstants.Keys;
import org.json.simple.JSONObject;


/**
 * 
 * Preference constants for the Symfony plugin.
 * 
 * @see PreferenceInitializer, SymfonyCorePreferences 
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
public class SymfonyCoreConstants {
	
	/**
	 * Option for severity level or annotation problems
	 */
	public static final String ANNOTATION_PROBLEM_SEVERITY = "annotation_problem_severity";
	
	
	/**
	 * Annotation problem severity levels.
	 */
	public static final String ANNOTATION_ERROR 	= "Error";
	public static final String ANNOTATION_WARNING 	= "Warning";	
	public static final String ANNOTATION_IGNORE 	= "Ignore";	
	
	
	// Symfony Class and Method names	
	public static final String CONTROLLER_CLASS 	= "Controller";
	public static final String ACTION_SUFFIX 		= "Action";

	
	
	// FrameworkExtraBundle Annotations	
	public static final String TEMPLATE_ANNOTATION	= "@Template";
	public static final String ROUTE_ANNOTATION 	= "@Route";	
	
	// prefix for methods which render views
	public static final String RENDER_PREFIX		= "render";
	
	
	// namespaces
	public static final String CONTROLLER_NS		="Symfony\\Bundle\\FrameworkBundle\\Controller";
	
	// core classes
	public static final String BUNDLE_FQCN 			= "Symfony\\Component\\HttpKernel\\Bundle\\Bundle";


	 



	
//
//	@SuppressWarnings("unchecked")
//	public static void initializeDefaultValues() {
//
//		//IEclipsePreferences node = new DefaultScope().getNode(PHPCorePlugin.ID);
//		IEclipsePreferences node = DefaultScope.INSTANCE.getNode(SymfonyCorePlugin.ID);
//		node.put(ANNOTATION_PROBLEM_SEVERITY, ANNOTATION_WARNING);
//		
//		JSONObject prefs = new JSONObject();
//		prefs.put("request", "Symfony\\Component\\HttpFoundation\\Request");
//		
//		System.err.println("init default " + prefs.toString());		
//		node.put(Keys.SYNTHETIC_SERVICES, prefs.toString());
//		
//		String dathing = node.get(Keys.SYNTHETIC_SERVICES, "none");
//		
//		System.err.println("dathing " + dathing);
//		
//		
//		String result = ProjectOptions.getSyntheticServices(null);
//		
//		System.err.println("loaded " + result);
//		
//		
//	}	
}