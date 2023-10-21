
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        ArrayList<Villano> villanos = new ArrayList<>();
        
        Villano villano = new Villano(20, "Elias");
        villanos.add(villano);
        Villano mal1 = new Malvado(false, 30, "Jorge");
        villanos.add(mal1);
        Villano mal2 = new Malvado(true, 12, "Samuel");
        villanos.add(mal2);
        
        
        for(int i=0;i< villanos.size();i++){
            Villano per = villanos.get(i);
            if(per instanceof Malvado){
                Malvado mal = (Malvado) per;
                System.out.println("El nombre es:"+ mal.getNombre());
                System.out.println("Su edad es:"+mal.getEdad());
                System.out.println("Extraterrestre:"+mal.esExtraterrestre());     
            }else{
                System.out.println("Su nomnre es:"+per.getNombre());
                System.out.println("Su edad es:"+per.getEdad());
            }
                
                
        }
        
        VillanoUltraTumba ser= new VillanoUltraTumba("Demonios", 200, "Parca");
        ser.invocarLegion();
        ser.asustar();
        ser.gritar();
        
       
    }
}
