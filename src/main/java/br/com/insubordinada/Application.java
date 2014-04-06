package br.com.insubordinada;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.servlet.SparkApplication;
import spark.template.freemarker.FreeMarkerRoute;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class Application implements SparkApplication {

    @Override
    public void init() {
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
