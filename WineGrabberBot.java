package scripts;

import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.*;

@Script.Manifest(name = "WineGrabberBot", description = "Grabs Wine of Zamorak at the Wilderness Chaos Temple and banks them in Edgeville!", properties = "Author: MGKZSCRIPTS; Topic: 999; client = 4;")

public class WineGrabberBot extends PollingScript<ClientContext> {

    //Constant Item/Object/Cord/NPC IDs
    public static int START_LOCATION[] = { 410,307 };
    public static int BANKER[] = { 395,394 };
    public static int LAW_RUNES = 563;
    public static int AIR_STAFF = 1381;
    public static int WINE_ID = 245;
    public static int FOOD_ID[] = {  };
    public static int END_LOCATION[] = { 410,307 };

    @Override
    public void poll() {


    }








}