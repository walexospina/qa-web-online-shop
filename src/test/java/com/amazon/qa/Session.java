package com.amazon.qa;

import com.qa.items.Item;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;

public class Session {

    private static final String ITEM_KEY = "item";

    public static String getItem(){

        String item = Serenity.sessionVariableCalled(ITEM_KEY);
        Assert.assertNotNull("Current environment stored in Serenity session is NULL. Remember to create a Student using Given Scenario steps like \"I am a student\". More examples in ActorScenarioSteps.java",
                item);
        return item;
    }

    public static void storeItem(String item){
        Serenity.setSessionVariable(ITEM_KEY).to(item);
    }

}
