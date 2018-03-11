
//package jsfDemo;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "pizza")
@RequestScoped
public class Pizza
{
    
    private String firstName, mi, lastName, pnumber,email,addressline1,addressline2,city,pin,psize="Small";
    private String mushrooms="0" , redpeppers="0", greenolives="0", pineapple="0", broccoli="0", blackolives="0";
   private boolean mushroomR,redpepperR, greenoliveR, pineappleR, broccoliR, blackoliveR;
   
   
    public void setmushroomR(boolean mushroomR) {
       this.mushroomR = mushroomR ;       }

    public boolean getmushroomR() {
       return this.mushroomR;
    }
    
    public void setredpepperR(boolean redpepperR) {
       this.redpepperR = redpepperR ;       }

    public boolean getredpepperR() {
       return this.redpepperR;
    }
     public void setgreenoliveR(boolean greenoliveR) {
       this.greenoliveR =greenoliveR ;       }

    public boolean getgreenoliveR() {
       return this.greenoliveR;
    }
    
    public void setpineappleR(boolean pineappleR) {
       this.pineappleR =pineappleR ;       }

    public boolean getpineappleR() {
       return this.pineappleR;
    }
    
   public void setbroccoliR(boolean  broccoliR) {
       this. broccoliR = broccoliR ;       }

    public boolean getbroccoliR() {
       return this.broccoliR;
    } 
    
     public void setblackoliveR(boolean  blackoliveR) {
       this. blackoliveR = blackoliveR ;       }

    public boolean getblackoliveR() {
       return this.blackoliveR;
    } 
    
    public String getFirstName () {return firstName;}
    public void setFirstName (String firstName) {this.firstName = firstName;}
    public String getMi () {return mi;}
    public void setMi (String mi) {this.mi = mi;}
    public String getLastName () {return lastName;}
    public void setLastName (String lastName) {this.lastName = lastName;}
    public String getPnumber () {return pnumber;}
    public void setPnumber (String pnumber) {this.pnumber = pnumber;}
    public String getEmail () {return email;}
    public void setEmail (String email) {this.email = email;}
    public String getAddressline1 () {return addressline1;}
    public void setAddressline1 (String addressline1) {this.addressline1 = addressline1;}
    public String getAddressline2 () {return addressline2;}
    public void setAddressline2 (String addressline2) {this.addressline2 = addressline2;}
    public String getCity () {return city;}
    public void setCity (String city) {this.city = city;}
    public String getPin () {return pin;}
    public void setPin (String pin) {this.pin = pin;}
    
    public String getPsize () {return psize;}
    public void setPsize (String psize) {this.psize = psize;}
    
    public String getMushrooms () {return mushrooms;}
    public void setMushrooms (String mushrooms) {this.mushrooms = mushrooms; System.out.println("Update Mushroom "+mushrooms);}
    
    public String getRedpeppers () {return redpeppers;}
    public void setRedpeppers (String redpeppers) {this.redpeppers = redpeppers;  System.out.println("Update Redpeppers "+redpeppers);}
    
    public String getGreenolives () {return greenolives;}
    public void setGreenolives (String greenolives) {this.greenolives = greenolives;  System.out.println("Update Green Olives "+greenolives);}
    
    public String getPineapple () {return pineapple;}
    public void setPineapple (String pineapple) {this.pineapple = pineapple;  System.out.println("Update Pineapple "+pineapple);}
    
    public String getBroccoli () {return broccoli;}
    public void setBroccoli (String broccoli) {this.broccoli = broccoli;  System.out.println("Update Broccoli "+broccoli);}
    
    public String getBlackolives () {return blackolives;}
    public void setBlackolives (String blackolives) {this.blackolives = blackolives; System.out.println("Update Black Olives "+blackolives);}
    
    public String getResponse ()throws NullPointerException
    {
        System.out.println("Starting the process...Response");
        try{
            
        
        int a=0,d=0;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@')
                a=1;
            if(email.charAt(i)=='.')
                d=1;
        }
        
        if (lastName == null)
           return "<br/>Invalid Name !!";
           // return "";
        
        else if(pnumber.length() !=10)
            return "<br/>Enter Valid Phone Number !!";
        
        else if(a==0 || d==0)
            return "<br/>Enter valid Email Id";
        
        else
        {
            System.out.println("Starting the process...22222222222222222");
            double sum=0.0, ingr=0.0, base=0.0, gst;
            
            //String [] allIngredients=null;
          if(!mushroomR)
          {
              mushrooms="0";
          }
          if(!redpepperR)
          {
              redpeppers = "0";
          }
          if(!greenoliveR)
          {
              greenolives="0";
          }
          if(!pineappleR)
          {
              pineapple="0";
          }
          if(!broccoliR)
          {
              broccoli="0";
          }
          if(!blackoliveR)
          {
              blackolives = "0";
          }
               System.out.println(mushrooms+" "+redpeppers+" "+greenolives+" "+pineapple+" "+broccoli+" "+blackolives );
               try{ingr = Double.parseDouble(mushrooms) + Double.parseDouble(redpeppers) + Double.parseDouble(greenolives) + Double.parseDouble(pineapple) + Double.parseDouble(broccoli) + Double.parseDouble(blackolives);}
               catch(Exception ee)
               {System.out.println(ee.getMessage());}
            System.out.println("Starting the process...444444444444444444444444");
            System.out.println(ingr);
            if(psize.equals("Small"))
            base = 500;
            else if(psize.equals("Medium"))
            base = 750;
            if(psize.equals("Large"))
            base = 1000;
            sum = base + ingr;
            gst = 0.15 * sum;
            sum = sum+ gst;
            return "<br/><h1>BILL</h1><h2>" +
                   firstName + " " + mi + " " + lastName + "</h2><br/>" +
                    "<strong>Phone Number:</strong> " + pnumber + "<br/>"+
                    "<strong>Email Id:</strong> " + email + "<br/>"+
                    "<strong>Address:</strong> " + addressline1 + "<br/>"+
                    "         "+addressline2 + "<br/>"+
                    "<strong>City: </strong>" + city + "<br/>"+
                    "<strong>Pin:</strong> " + pin + "<br/>"+
                    "<strong>Pizza Size: </strong>" + psize + "<br/>"+
                    "<strong>Price of the pizza size : </strong>"+base + "<br/>"+
                    "<strong>Price of the ingredients choosen : </strong>"+ingr + "<br/>"+
                    "<strong>GST @ 15% : </strong>"+gst + "<br/>"+
                    "********************************************************<br/>"+
                    "<h2>Amount to be paid : " + sum+"</h2><br/>"+
                    "**********************************************************";
        }
        
        }
        catch(Exception e){};
        return "";
    }

    public Pizza() {
    System.out.println("Starting the process...constructor");
    }
}
