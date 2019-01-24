package com.modusbox.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloWorld {

    public static void main(String[] args) throws ScriptException, IOException {

        byte[] script = Files.readAllBytes(Paths.get("/Users/leo/IdeaProjects/nashorn/src/main/resources/script1.txt"));

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        engine.eval(new String(script));

        Object response = engine.eval("exec('{ \"initialSample\": 456}')");

        System.out.println("Payload: "+response);
    }

}
