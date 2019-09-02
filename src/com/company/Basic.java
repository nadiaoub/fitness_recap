package com.company;

public class Basic extends Member {

    public Basic(String n,String c){
        setName(n);
        setCpr(c);
    }

    @Override
    public String getMemberType(){
        return "Basic";

    }
    @Override
    public int getFee() {
        return 199;
    }


}
