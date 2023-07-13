package clases;

public class test {
    
    public static void main(String[] args){
        
        Caja caja1 = new Caja();
        Caja caja2 = new Caja(3.5, 2.6, 5.0);
        Caja caja3 = new Caja();
        
        caja1.lenght = 2.5;
        caja1.height = 3.9;
        caja1.width = 1.35;
        caja1.printCalculateVolume();
        
        caja2.calculateVolume();
        
        caja3.calculateVolumeArg(1, 2, 3);
        
    }
}
