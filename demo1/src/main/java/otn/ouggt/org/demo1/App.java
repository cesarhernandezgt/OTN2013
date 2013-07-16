package otn.ouggt.org.demo1;

import java.util.List;


public class App 
{
	/* NULL POINTER DEREFERENCE
	 * C—digo de ECLIPSE 3.5RC3
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
    
    
    
}
