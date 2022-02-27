package com.acme.customermasterdata.api;

public class CustomerMasterDataClient {

    private final String url;
    private final String user;
    private final String password;

    public CustomerMasterDataClient(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public CmdCustomerDto findById(String id) {
        remoteCall();
        return new CmdCustomerDto(id, "Paul", "Bahnhofsstrasse", "Zurich", "paul@pa.ul");
    }

    private void remoteCall() {
        try {
            System.out.println("MAKING A REMOTE CALL TO URL " + url + " WITH CREDENTIALS " + user + " / " + password);
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
