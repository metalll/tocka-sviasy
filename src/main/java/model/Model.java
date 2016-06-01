package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName = "NewModel")
public class Model {



    @DatabaseField(id = true)
    private int id ;

    @DatabaseField
    private String category= null;

    @DatabaseField
    private String description = null;

    @DatabaseField
    private	String price;

    @DatabaseField
    private String name;

    @DatabaseField
    private String logo;
    
    @DatabaseField
    private String exist;
    
    


    public Model(){}
    public Model(int id,String category,String description,String price,String name,String logo,String exist){
        this.id = id;
        this.category = category;
        this.description = description;
        this.price = price;
        this.name = name;
        this.logo = logo;
        this.exist = exist;

    }


    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
