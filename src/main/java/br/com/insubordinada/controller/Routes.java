package br.com.insubordinada.controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.template.freemarker.FreeMarkerRoute;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class Routes {

    public static void main(String[] args) {
        get(new FreeMarkerRoute("/hello") {
            @Override
            public ModelAndView handle(Request request, Response response) {
                Map<String, Object> attributes = new HashMap<>();
                attributes.put("message", "Hello FreeMarker");

                return modelAndView(attributes, "hello.ftl");
            }
        });
    }
}
