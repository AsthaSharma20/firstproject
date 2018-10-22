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
public class PersonOld {
    Demographics demo;
    Address address;
    SavingAc saving;
    CheckingAc checking;
    DriverLicense license;
    MedicalRecord record;

    public Demographics getdemo() {
        return demo;
    }
    public SavingAc getsaving(){
        return saving;
    }
    public Address getaddress(){
        return address;
    }
    
   public PersonOld(){
        demo = new Demographics();
        address=new Address();
        saving=new SavingAc();
        checking=new CheckingAc();
        license=new DriverLicense();
        record=new MedicalRecord();
                                
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

    public void setName(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getfirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getlastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getphoneNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getdateOfBirth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getheight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getweight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getssn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
