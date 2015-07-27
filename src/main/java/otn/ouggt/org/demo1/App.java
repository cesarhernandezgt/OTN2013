package otn.ouggt.org.demo1;

import java.util.List;


public class App 
{
	/* NULL POINTER DEREFERENCE
	 * Codigo de ECLIPSE 3.5RC3
	 * org.eclipse.update.internal.ui.views.FeatureStateAtion 
	 */
	@SuppressWarnings("null")
	public int returnSomething(List<?> adapters){
		if (adapters == null  && adapters.size() ==0){
			//do something
			return 1;
		}else{
			//do something else
			return 0;
		}		
	}


	public static void main (String args[]){
		App obj = new App();
		int i = obj.returnSomething(null);
		System.out.println(i);}
    
	
	
	
	
	/* INFINITE RECURSIVE LOOPS
	 * Código de Google Web Toolkit
	 * com.google.gwt.user.cliente.uiTabPanel
	 */
	
	class Windget{
		//attributes, methods and rock and roll
	}
	
	int getWidgetIndex(Windget w) {
		return getWidgetIndex(w);
	}
    
}
