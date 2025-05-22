package oops1;

public class UseBoard {
	   public static void main(String[] args) {
	        Board[] boards = new Board[5];
	        
	        boards[0] = new Board("AAA", 10, 10, "Glass");
	        boards[1] = new Board("BBB", 15, 20, "Plastic");
	        boards[2] = new Board("CCC", 12, 12, "Wood");
	        boards[3] = new Board("DDD", 18, 18, "Glass");
	        boards[4] = new Board("EEE", 25, 30, "Plastic");
	        
	        int squareBoardCount = 0;
	        int plasticBoardCount = 0;
	        int heavyBoardCount = 0;
	        
	        for (Board board : boards) {
	            if (board.getHeight() == board.getWidth()) {
	                squareBoardCount++;
	            }
	            if (board.getMaterial().equalsIgnoreCase("Glass")) {
	                heavyBoardCount++;
	            }
	            if (board.getMaterial().equalsIgnoreCase("Plastic")) {
	                plasticBoardCount++;
	                System.out.println("Plastic Board: " + board.getBrand());
	            }
	        }
	        
	        System.out.println("Total Square Boards: " + squareBoardCount);
	        System.out.println("Total Plastic Boards: " + plasticBoardCount);
	        System.out.println("Total Heavy Boards: " + heavyBoardCount);
	    }
	}


	class Board {
	    private String brand;
	    private int height;
	    private int width;
	    private String material;

	    public Board(String brand, int height, int width, String material) {
	        this.brand = brand;
	        this.height = height;
	        this.width = width;
	        this.material = material;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public void setWidth(int width) {
	        this.width = width;
	    }

	    public String getMaterial() {
	        return material;
	    }

	    public void setMaterial(String material) {
	        this.material = material;
	    }
	}

	
	 

