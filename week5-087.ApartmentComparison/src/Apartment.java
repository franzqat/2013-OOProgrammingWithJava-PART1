
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    //ma se è privata come faccio a compararla?
    public boolean larger(Apartment otherApartment){
        if (this.squareMeters > otherApartment.squareMeters) return true;
        return false;
        
    }
    
    public int apartmentPrice(){
        return squareMeters * pricePerSquareMeter;
    }
    
    public int priceDifference(Apartment otherApartment){
        return Math.abs(this.apartmentPrice() - otherApartment.apartmentPrice());
    }
  
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (apartmentPrice() > otherApartment.apartmentPrice()) {
            return true;
        }
        return false;
    }
}
