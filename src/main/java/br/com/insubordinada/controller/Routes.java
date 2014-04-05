package br.com.insubordinada.controller;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;

public class Routes {

    public static void main(String[] args) {
        get(new Route("/test") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World";
            }
        });
    }
}
