package com.acme.customermasterdata.api;

public class CustomerMasterDataClient {

  public CmdCustomerDto findById(String id) {
    remoteCall();
    return new CmdCustomerDto(id, "Paul","Bahnhofsstrasse","Zürich","paul@pa.ul");
  }

  private void remoteCall() {
    try {
      System.out.println("MAKING A REMOTE CALL...");
      Thread.sleep(8000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
