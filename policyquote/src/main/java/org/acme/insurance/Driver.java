package org.acme.insurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Driver implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String name;

   private java.lang.Integer age;

   private java.lang.Integer numberOfAccidents;

   private java.lang.Integer numberOfTickets;

   public Driver()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.lang.Integer getNumberOfAccidents()
   {
      return this.numberOfAccidents;
   }

   public void setNumberOfAccidents(java.lang.Integer numberOfAccidents)
   {
      this.numberOfAccidents = numberOfAccidents;
   }

   public java.lang.Integer getNumberOfTickets()
   {
      return this.numberOfTickets;
   }

   public void setNumberOfTickets(java.lang.Integer numberOfTickets)
   {
      this.numberOfTickets = numberOfTickets;
   }

   public Driver(java.lang.String name, java.lang.Integer age,
         java.lang.Integer numberOfAccidents, java.lang.Integer numberOfTickets)
   {
      this.name = name;
      this.age = age;
      this.numberOfAccidents = numberOfAccidents;
      this.numberOfTickets = numberOfTickets;
   }

}
