package com.urmi.question134;

class Snoochy{
    Boochy booch;
    public Snoochy(){
        booch = new Boochy(this);
    }
}

class Boochy{
    Snoochy snooch;
    public Boochy(Snoochy s){
        snooch = s;
    }
}

public class Application {
}
