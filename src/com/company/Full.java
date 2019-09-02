package com.company;

public class Full extends Member {


    public Full(String n,String c) {
        setName(n);
        setCpr(c);
    }
    @Override
    public String getMemberType(){
        return "Full";
    }

    @Override
    public int getFee() {
        return 299;
    }
}
