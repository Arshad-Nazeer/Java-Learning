package L45_Super;

// Super class
public class Person {
   String fname;
   String lname;

   Person(String fname, String lname) {
       this.fname = fname;
       this.lname = lname;
   }

   void showName(){
       // when there are no other local variables and arguements in the method, this keyword is not required
       System.out.println(fname+" "+lname);
   }
}
