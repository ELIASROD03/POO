package Problema3_2_1;


public class VillanoUltraTumba extends Villano implements SerDeUltratumba{
    
    private String legion;

    public VillanoUltraTumba(String legion, int e, String n) {
        super(e, n);
        this.legion = legion;
    }
    
    @Override
    public void asustar(){
        System.out.println("Buuuuuu!!!!");
    }
    
    @Override
    public void gritar(){
        System.out.println("Uaaaayyyy!!!!");
    }
    
    public void invocarLegion(){
        System.out.println(getNombre()+" ha invocado a la legion de "+legion);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    
    
    
    
}
