package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer(String type){
        switch(type) {
            case "Regular":
                return new RegularCustomer();
            //customer = new RegularCustomer();
            case "Mountain":
                return new MountainCustomer();
                //customer = new MountainCustomer();
            case "Delinquent":
                return new DelinquentCustomer();
                //customer = new DelinquentCustomer();
            default :
                return null;

        }
    }
    
}
