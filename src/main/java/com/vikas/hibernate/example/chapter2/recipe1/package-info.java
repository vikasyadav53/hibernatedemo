@org.hibernate.annotations.GenericGenerators({
       // @org.hibernate.annotations.GenericGenerator(name = "hilo", strategy = "hilo"),
        @org.hibernate.annotations.GenericGenerator(name = "increment", strategy = "increment"),
        @org.hibernate.annotations.GenericGenerator(name = "uuid", strategy = "uuid"),
}) package com.vikas.hibernate.example.chapter2.recipe1;