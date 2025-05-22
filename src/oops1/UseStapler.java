package oops1;

public class UseStapler {
	  public static void main(String[] args) {
	        Stapler s1 = new Stapler();
	        s1.setBrand("StaplerX");
	        s1.setPrice(15.99);
	        s1.setColour("Red");
	        s1.setMaterial("Plastic");
	        
	        Stapler s2 = new Stapler();
            s2.setBrand("StaplerY");
	        s2.setPrice(20.49);
	        s2.setColour("Blue");
	        s2.setMaterial("Metal");

	        Stapler s3 = new Stapler();
	        s3.setBrand("StaplerZ");
	        s3.setPrice(25.99);
	        s3.setColour("Green");
	        s3.setMaterial("Wood");
	        
	        Stapler[] m = {s1,s2,s3};

	       for (Stapler x : m) {
	            System.out.println("BRAND:"+x.getBrand()+", "+"PRICE:"+x.getPrice()+", "+"COLOR:"+x.getColour()+", "+"MATERIAL:"+x.getMaterial());
	           
	        }
	    }
	}



class Stapler {
    private String brand;
    private double price;
    private String colour;
    private String material;

    // Getter and Setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
