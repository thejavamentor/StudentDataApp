package com.std.model;

public enum BranchEnum {
    CSE(100), ELE(102), CVL(102);

    int branchCode;

    BranchEnum(int branchCode) {
        this.branchCode = branchCode;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public String getBranchName(){
        return  this.name();
    }

    public static BranchEnum getBranch(String branchName){
        for(BranchEnum branch : values()){
            if(branch.name().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

}
