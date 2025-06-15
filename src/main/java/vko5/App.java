package vko5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Factory factory = new Factory();
        System.out.println("Anna tehtaalle nimi:");
        String factoryName = sc.nextLine();
        factory.setName(factoryName);
        Machine newMachine = null;


        boolean exit = false;
        while(!exit) {
            System.out.println("1) Lisää kone");
            System.out.println("2) Listaa kaikki koneet");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Anna koneen tyyppi:");
                        String machineName = sc.nextLine();
                        System.out.println("Anna koneen malli:");
                        String model = sc.nextLine();
                        System.out.println("Anna työntekijän nimi:");
                        String workername = sc.nextLine();
                        System.out.println("Anna työntekijän ammattinimike:");
                        String role = sc.nextLine();

                        newMachine = new Machine(machineName, model, workername, role);
                        factory.addMachine(newMachine);
                        break;
                    case 2:
                        String namef = factory.getName();
                        System.out.println("Tehtaasta "+ namef +" löytyy seuraavat koneet:");
                        ArrayList<Machine> machines = factory.getMachines();

                        for(Machine machine : machines)  {
                            System.out.println(machine.getMachineDetails());
                            //System.out.println(worker.getWorkerName());
                            
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }

        }
        sc.close();
	}

}

