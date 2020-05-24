package ua.lviv.iot.tableware.rest.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Fork extends DisponsableTableWare {
	private int strenght;
    private int weightCapacityKg;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fork(String manufacturer, int price, int fireResistance, int dateOfManufacture,
            MatherialType matherial, int strenght, int weightCapacityKg) {
        super(manufacturer, price, fireResistance, dateOfManufacture, matherial);
        this.weightCapacityKg = weightCapacityKg;
        this.strenght = strenght;
    }

    public double getWeightCapacityKg() {
        return weightCapacityKg;
    }
        
        public double getStrenght() {
            return strenght;
    }

    public Fork(String string, int i, int j, int k, double d, double e) {
        this(null, 0, 0, 0, null, 0, 0);
    }

    public void setWeightCapacityKg(int weightCapacityKg) {
        this.weightCapacityKg = weightCapacityKg;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
   /* public String getHeaders() {
        return super.getHeaders() + ",droppedWeightInKilo ";
    }
*/
    public String toCSV() {
		return super.toCSV()+","+"strenght= "+getStrenght()+","+"weightCapacityKg="+getWeightCapacityKg();
	}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fork that = (Fork) o;
        return getWeightCapacityKg() == that.getWeightCapacityKg() &&
        		getStrenght() == that.getStrenght() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeightCapacityKg(),getStrenght());
    }


    @Override
    public String toString() {
        return "Fork [weightCapacityKg=" + weightCapacityKg +"id=" + id +"+ "
        		+ "strenght=" + strenght +"id=\" + id +\"]";
    }
}

/* package ua.lviv.iot.tableware.rest.model;

/*import ua.lviv.iot.tableware.rest.model.DisponsableTableWare;
import ua.lviv.iot.tableware.rest.model.MatherialType;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Fork extends DisponsableTableWare {
	private int strenght;
    private int weightCapacityKg;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fork(String manufacturer, int price, int fireResistance, int dateOfManufacture, MatherialType matherial,
            int strenght, int weightCapacityKg) {
        super(manufacturer, price, fireResistance, dateOfManufacture, matherial);
        this.strenght = strenght;
        this.weightCapacityKg = weightCapacityKg;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getWeightCapacityKg() {
        return weightCapacityKg;
    }

    public void setWeightCapacityKg(int weightCapacityKg) {
        this.weightCapacityKg = weightCapacityKg;
    }

    public Fork(String string, int i, int j, int k, int l, int m) {

    }
	public String getHeaders() {
		return super.getHeaders()+",strenght "+",weightCapacityKg";
	}
	public String toCSV() {
		return super.toCSV()+","+"strenght= "+getStrenght()+","+"weightCapacityKg="+getWeightCapacityKg();
	}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fork that = (Fork) o;
        return getWeightCapacityKg() == that.getWeightCapacityKg();
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeightCapacityKg());
    }

    @Override
    public String toString() {
        return "Fork [weightCapacityKg=" + weightCapacityKg +"id=" + id +"]";
    }
}
/*public class Fork extends DisponsableTableWare {
    private int strenght;
    private int weightCapacityKg;

    public Fork(String manufacturer, int price, int fireResistance, int dateOfManufacture, MatherialType matherial,
            int strenght, int weightCapacityKg) {
        super(manufacturer, price, fireResistance, dateOfManufacture, matherial);
        this.strenght = strenght;
        this.weightCapacityKg = weightCapacityKg;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getWeightCapacityKg() {
        return weightCapacityKg;
    }

    public void setWeightCapacityKg(int weightCapacityKg) {
        this.weightCapacityKg = weightCapacityKg;
    }

    public Fork() {

    }
	public String getHeaders() {
		return super.getHeaders()+",strenght "+",weightCapacityKg";
	}
	public String toCSV() {
		return super.toCSV()+","+"strenght= "+getStrenght()+","+"weightCapacityKg="+getWeightCapacityKg();
	}
}*/