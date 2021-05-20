
package observerexample;


public interface Observer {
    
        //metodo para actualizar el observador, usado por subject
	public void update();
	
	//adjuntar subject a observer
	public void setSubject(Subject sub);
    
}
