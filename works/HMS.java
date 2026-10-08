package hms;
abstract class HospitalStaff{
abstract void reportForDuty();
abstract void endDuty();
abstract void attendSeminar();
}
class Doctor extends HospitalStaff{
void reportForDuty(){ 
System.out.println("HospitalStaff: Reporting for Duty");}
void endDuty(){ 
System.out.println("HospitalStaff: Ending duty shift");}
void attendSeminar(){ 
System.out.println("HospitalStaff: Attending medical seminar");}
String department;
void setdepartment(String department){
this.department = department;}
String getdepartment(){
return department;
}
void diagnosePatient(){ 
System.out.println("Doctor: Diagnose patient with fever and cough");}
void prescribeTreatment(){ 
System.out.println("Doctor: Prescribing antibiotics for infection");}
void performSurgery(){ 
System.out.println("Doctor: Performing appendectomy surgery");}
}
class Nurse extends HospitalStaff{
void reportForDuty(){ 
System.out.println("HospitalStaff: Reporting for Duty");}
void endDuty(){ 
System.out.println("HospitalStaff: Ending duty shift");}
void attendSeminar(){ 
System.out.println("HospitalStaff: Attending medical seminar");} 
void administerMedication(){ 
System.out.println("Nurse: Administering medication to 8 patients");}
void checkVitals(){ 
System.out.println("Nurse: Checking vital signs for 10 patients");}
void assistDoctor(){ 
System.out.println("Nurse: Assisting doctor during patients rounds");} 
}
class Pharmacist extends HospitalStaff{
void reportForDuty(){ 
System.out.println("HospitalStaff: Reporting for Duty");}
void endDuty(){ 
System.out.println("HospitalStaff: Ending duty shift");}
void attendSeminar(){ 
System.out.println("HospitalStaff: Attending medical seminar");} 
void dispenseMedicine(){ 
System.out.println("Pharmacist: Dispensing 15 prescription orders");}
void checkStock(){ 
System.out.println("Pharmacist: Checking medice inventory - 500 items");}
void prepareCompounds(){ 
System.out.println("Pharmacist: Preparing 5 customized compounds");} 
}

public class HMS {
public static void main(String[] args) {
Doctor d = new Doctor();
 System.out.println("==Doctor==");
    d.reportForDuty();
    d.endDuty();
    d.attendSeminar();
    d.diagnosePatient();
    d.prescribeTreatment();
    d.performSurgery();
    System.out.println("Doctor: Current department + department");

Nurse n = new Nurse();
System.out.println("==Nurse==");
    n.reportForDuty();
    n.endDuty();
    n.attendSeminar();
    n.administerMedication();
    n.checkVitals();
    n.assistDoctor();
    
Pharmacist p = new Pharmacist();
System.out.println("==Pharmacist==");
    p.reportForDuty();
    p.endDuty();
    p.attendSeminar();
    p.dispenseMedicine();
    p.checkStock();
    p.prepareCompounds();  
    }}
