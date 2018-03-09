package com.fomenko.apiVK.actions;

import com.fomenko.apiVK.client.AbstractAction;

public class Functional extends AbstractAction {
    Functional(com.fomenko.apiVK.client.BotApiClient botApiClient) {
        super(botApiClient);
    }
    public String weather(String city){
        return new com.fomenko.apiVK.functions.bot.Functional(getClient()).weather(city);
    }
}
