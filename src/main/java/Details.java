
public class Details {
    private String prefix,name,gender,intrst[],image;
    public Details(String prefix,String name, String gender, String[] intrst, String image) {
        super();
        this.prefix = prefix;
        this.name = name;
        this.gender = gender;
        this.intrst = intrst;
        this.image = image;
    }

    public Details() {
        super();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getIntrst() {
        return intrst;
    }

    public void setIntrst(String[] intrst) {
        this.intrst = intrst;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
