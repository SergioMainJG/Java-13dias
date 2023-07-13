package clases;

public class Caja {
    
    double width, height, lenght, volume;
    
    public Caja(){
        
        System.out.println("Primer Constructor");
    }

    public Caja(double width, double height, double lenght) {
        
        System.out.println("Segundo Constructor");
        
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }
    
    
    
    public double calculateVolume(){
        
        volume = (width*height*lenght);
        
        System.out.println("El volumen: " + volume);
        return volume;
    }
    
    public void printCalculateVolume(){
        
        volume = (width*height*lenght);
        
        System.out.println("El volumen es:" + volume);
    }
    
    public double calculateVolumeArg(double width, double height, double lenght){
        
        volume = (width*height*lenght);
        
        System.out.println("El volumen: " + volume);
        return volume;
    }
    
}
