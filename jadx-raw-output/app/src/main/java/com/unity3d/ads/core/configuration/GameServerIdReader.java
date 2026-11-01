package com.unity3d.ads.core.configuration;

import ck.i;
import ck.p;
import com.unity3d.services.core.misc.JsonStorage;

/* JADX INFO: compiled from: GameServerIdReader.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GameServerIdReader extends MetadataReader<String> {
    public static final Companion Companion = new Companion(null);
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    /* JADX INFO: compiled from: GameServerIdReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameServerIdReader(JsonStorage jsonStorage) {
        super(jsonStorage, PLAYER_SERVER_ID_KEY);
        p.j(jsonStorage, "jsonStorage");
    }
}
