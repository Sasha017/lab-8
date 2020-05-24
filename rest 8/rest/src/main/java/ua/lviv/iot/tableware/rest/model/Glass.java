package ua.lviv.iot.tableware.rest.model;

import java.util.Objects;

public class Glass extends Fork {
	private int temperatureResistance;
    private int waterCapacityGal;
    
    public double getTemperatureResistance() {
        return temperatureResistance;
    }
    public double getWaterCapacityGal() {
        return waterCapacityGal;
    }

    public void setTemperatureResistance(int temperatureResistance) {
        this.temperatureResistance = temperatureResistance;
    }
    public void setWaterCapacityGal(int waterCapacityGal) {
        this.waterCapacityGal = waterCapacityGal;
    }

    public Glass() {
        this(null, 0, 0, 0, null, 0, 0, 0, 0);
    }

    public Glass(String manufacturer, int price, int fireResistance, int dateOfManufacture,
            MatherialType matherial, int strenght, int weightCapacityKg, int temperatureResistance, int waterCapacityGal) {
        super(manufacturer, price, fireResistance, dateOfManufacture,
                matherial, strenght, weightCapacityKg);
        this.temperatureResistance = temperatureResistance;
        this.waterCapacityGal = waterCapacityGal;
    }


   /* public String getHeaders() {
        return super.getHeaders() + ",trackSpeedInMetersPerSecond ";
    }*/

    public String toCSV() {
		return super.toCSV()+","+"temperatureResistance= "+getTemperatureResistance()+","+"waterCapacityGal="+getWaterCapacityGal();
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Glass that = (Glass) o;
        return getTemperatureResistance() == that.getTemperatureResistance() &&
        			getWaterCapacityGal() == that.getWaterCapacityGal();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTemperatureResistance(),getWaterCapacityGal());
    }

    @Override
    public String toString() {
        return "Glass temperatureResistance=" + temperatureResistance  + "waterCapacityGal=" + waterCapacityGal ;
    }

}

/*package ua.lviv.iot.tableware.rest.model;

import ua.lviv.iot.tableware.rest.model.DisponsableTableWare;
import ua.lviv.iot.tableware.rest.model.Glass;
import ua.lviv.iot.tableware.rest.model.MatherialType;

public class Glass extends DisponsableTableWare {
    private int temperatureResistance;
    private int waterCapacityGal;
  
    public Glass(String manufacturer, int price, int fireResistance, int dateOfManufacture, MatherialType matherial,
            int temperatureResistance, int waterCapacityGal) {
        super(manufacturer, price, fireResistance, dateOfManufacture, matherial);
        this.temperatureResistance = temperatureResistance;
        this.waterCapacityGal = waterCapacityGal;
    }
    public int getTemperatureResistance() {
        return temperatureResistance;
    }
    public void setTemperatureResistance(int temperatureResistance) {
        this.temperatureResistance = temperatureResistance;
    }
    public int getWaterCapacityGal() {
        return waterCapacityGal;
    }
    public void setWaterCapacityGal(int waterCapacityGal) {
        this.waterCapacityGal = waterCapacityGal;
    }
    public Glass() {
        
    }
	public String getHeaders() {
		return super.getHeaders()+",temperatureResistance "+",waterCapacityGal";
	}
	public String toCSV() {
		return super.toCSV()+","+"temperatureResistance= "+getTemperatureResistance()+","+"waterCapacityGal="+getWaterCapacityGal();
	}


	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        if (!super.equals(o)) return false;
	        Glass that = (Glass) o;
	        return getTemperatureResistance() == that.getTemperatureResistance();
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(super.hashCode(), getTemperatureResistance());
	    }

	    @Override
	    public String toString() {
	        return "Glass [temperatureResistance=" + TemperatureResistance + "]";
	    }

}
		
	*/