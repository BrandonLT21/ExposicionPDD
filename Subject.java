
package observerexample;


public interface Subject {
    
        //metodos para registrar y dar de baja los observer
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	//metodo para notificarle el cambio a los observer
	public void notifyObservers();
	
	//metodo para obtener las actualizaciones del subject
	public Object getUpdate(Observer obj);
    
}
