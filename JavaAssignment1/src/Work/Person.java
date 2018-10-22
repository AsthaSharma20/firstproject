/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Work;

/**
 *
 * @author Astha Sharma
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Astha Sharma
 */
public class Person {
    
    private Demographics demo;
    private Address address;
    private SavingAc saving;
    private CheckingAc checking;
    private DriverLicense license;
    private MedicalRecord record;

  
   public Person(){
        demo = new Demographics();
        address=new Address();
        saving=new SavingAc();
        checking=new CheckingAc();
        license=new DriverLicense();
        record=new MedicalRecord();
                                
    }

    public Demographics getDemo() {
        return demo;
    }

    public void setDemo(Demographics demo) {
        this.demo = demo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public SavingAc getSaving() {
        return saving;
    }

    public void setSaving(SavingAc saving) {
        this.saving = saving;
    }

    public CheckingAc getChecking() {
        return checking;
    }

    public void setChecking(CheckingAc checking) {
        this.checking = checking;
    }

    public DriverLicense getLicense() {
        return license;
    }

    public void setLicense(DriverLicense license) {
        this.license = license;
    }

    public MedicalRecord getRecord() {
        return record;
    }

    public void setRecord(MedicalRecord record) {
        this.record = record;
    }

    
    
}
