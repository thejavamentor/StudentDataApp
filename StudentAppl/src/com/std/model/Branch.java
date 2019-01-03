package com.std.model;

public enum Branch {
    CSE(100), ELE(102), CVL(102);

    int branchCode;

    Branch(int branchCode) {
        this.branchCode = branchCode;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public String getBranchName(){
        return  this.name();
    }

}
