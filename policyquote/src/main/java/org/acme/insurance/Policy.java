package org.acme.insurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Policy implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer price;

   private java.lang.String policyType;

   public Policy()
   {
   }

   public java.lang.Integer getPrice()
   {
      return this.price;
   }

   public void setPrice(java.lang.Integer price)
   {
      this.price = price;
   }

   public java.lang.String getPolicyType()
   {
      return this.policyType;
   }

   public void setPolicyType(java.lang.String policyType)
   {
      this.policyType = policyType;
   }

   public Policy(java.lang.Integer price, java.lang.String policyType)
   {
      this.price = price;
      this.policyType = policyType;
   }

}