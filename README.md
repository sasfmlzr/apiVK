## About Api for VK

This api allows you to quickly create a bot for vk.com.

## Latest release

To add a dependency using Maven:

```
<dependency>
	    <groupId>com.github.sasfmlzr</groupId>
	    <artifactId>apiVK</artifactId>
	    <version>1.0.1</version>
</dependency>
```

To add a dependency using Gradle:

```
dependencies {
  compile 'com.github.sasfmlzr:apiVK:1.0.1'
}
``` 

## Example
        int UserID;
        String token;

        TransportClient transportClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(transportClient);
        UserActor actor = new UserActor(UserID,token);
        UserBot userBot = new UserBot(vk,actor);
        //Database database = new Database();
        if (!databaseLoaded){
            userBot.botApiClient().database.connectDatabase();
            userBot.botApiClient().database.InitDB();
            }
        userBot.botApiClient().stateBot.pushPowerBot=true;
        userBot.run();

