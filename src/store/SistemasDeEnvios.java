
package store;

public class SistemasDeEnvios {
   private IEnvio envio;
   
   public  SistemasDeEnvios(IEnvio envio){
       this.envio= envio;
   }
   
   public void enviarPaquete(String direccion){   
       envio.enviarPaquete(direccion);
   }
}
