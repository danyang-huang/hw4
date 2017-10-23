

package model;


public class Lipsticks {
    private int narsID;
    private String shade;
    private String series;
    private int price;
    private int rate;
    
    
    
      public Lipsticks() {
        this.narsID = 0;
        this.shade = "";
        this.series = "";
        this.price = 0;
        this.rate = 0;
    }
    

    public Lipsticks(int narsID, String shade, String series, int price, int rate) {
        this.narsID = narsID;
        this.shade = shade;
        this.series = series;
        this.price = price;
        this.rate = rate;
    }

    public int getNarsID() {
        return narsID;
    }

    public void setNarsID(int narsID) {
        this.narsID = narsID;
    }

    public String getShade() {
        return shade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Lipsticks{" + "narsID=" + narsID + ", shade=" + shade + ", series=" + series + ", price=" + price + ", rate=" + rate + '}';
    }
    
    
    
}
