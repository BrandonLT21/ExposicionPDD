
package observerexample;


public class ObserverPatternTest {

    public static void main(String[] args) {
        
       
		//se crean los subjects
		MyTopic topic = new MyTopic();
		
		//se crean los observers
		Observer obj1 = new MyTopicSuscriber("Obj1");
		Observer obj2 = new MyTopicSuscriber("Obj2");
		Observer obj3 = new MyTopicSuscriber("Obj3");
		
		//se registra el observer al subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		//se adjunta el observer al subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		
		//se comprueba si hay alguna actualización disponible
		obj1.update();
		
		//aqui se envia el mensaje al subject
		topic.postMessage("New Message");
	}
  
    }
    

