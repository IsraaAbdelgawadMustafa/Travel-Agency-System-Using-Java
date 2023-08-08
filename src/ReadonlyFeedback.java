/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sheroq;


/**
 *
 * @author user
 */
 public class ReadonlyFeedback implements Customer {
     private Feedback underlyingfeed;
     
     
     public ReadonlyFeedback(Feedback feedback) {
    this.underlyingfeed = feedback;
  }
     @Override
  public String getaddFeedback() {
    return underlyingfeed.getaddFeedback();
  } 
 }
 
    