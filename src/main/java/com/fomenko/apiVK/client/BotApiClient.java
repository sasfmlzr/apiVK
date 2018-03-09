package com.fomenko.apiVK.client;

import com.fomenko.apiVK.actions.Messages;
import com.fomenko.apiVK.actions.Other;
import com.fomenko.apiVK.bot.AbstractBot;
import com.fomenko.apiVK.functions.botdatabase.Database;
import com.vk.api.sdk.client.VkApiClient;

public class BotApiClient extends AbstractBot{

    private VkApiClient vk;

    public BotApiClient(VkApiClient vkApi){
        vk=vkApi;
    }

    public VkApiClient getVkApiClient(){return this.vk;}

    public Messages messages() {
        return new Messages(this);
    }

    public Other other() {
        return new Other();
    }

    public static Database database=new Database();

    public StateBot stateBot=new StateBot();

}
