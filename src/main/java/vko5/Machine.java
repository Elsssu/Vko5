package vko5;

public class Machine {
    private String type;

    private String model;

    private Worker operator;

    


    public Machine(String type, String model, String workername, String role) {
        this.type = type;
        this.model = model;
        this.operator = new Worker(workername, role);
        
    }

    public String getMachineDetails(){
        String details = "Koneen tiedot: " + type + ", " + model + "\n" + "Työntekijän tiedot: " + operator.getWorkerName()+ ", " + operator.getWorkerRole();
        return details;
    }
}
