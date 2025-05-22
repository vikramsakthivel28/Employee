package oops1;

public class UseCity {
	  public static void main(String[] args) {
	        City[] cities = new City[5];
	        
	        cities[0] = new City(1, "Singapore", 5600000, "Singapore");
	        cities[1] = new City(2, "New York", 8419000, "USA");
	        cities[2] = new City(3, "Los Angeles", 3980000, "USA");
	        cities[3] = new City(4, "Tokyo", 13960000, "Japan");
	        cities[4] = new City(5, "Berlin", 3769000, "Germany");

	        int metroCityCount = 0;
	        int cityStateCount = 0;
	        int luckyCityCount = 0;
	        
	        for (City city : cities) {
	            if (city.getPopulation() > 1000000) {
	                metroCityCount++;
	            }
	            if (city.getName().equalsIgnoreCase(city.getCountryName())) {
	                cityStateCount++;
	            }
	            if (city.getId() % 2 != 0) {
	                luckyCityCount++;
	                System.out.println("Lucky City Found: " + city.getName());
	            }
	        }
	        
	        System.out.println("Total Metro Cities: " + metroCityCount);
	        System.out.println("Total City States: " + cityStateCount);
	        System.out.println("Total Lucky Cities: " + luckyCityCount);
	    }
	}

		
	class City {
	    private int id;
	    private String name;
	    private int population;
	    private String countryName;

	    public City(int id, String name, int population, String countryName) {
	        this.id = id;
	        this.name = name;
	        this.population = population;
	        this.countryName = countryName;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getPopulation() {
	        return population;
	    }

	    public void setPopulation(int population) {
	        this.population = population;
	    }

	    public String getCountryName() {
	        return countryName;
	    }

	    public void setCountryName(String countryName) {
	        this.countryName = countryName;
	    }
	}


	  

