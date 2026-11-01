package com.unity3d.ads.core.data.datasource;

import ck.i;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;

/* JADX INFO: compiled from: AndroidTcfDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AndroidTcfDataSource implements TcfDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String TCF_TCSTRING_KEY = "IABTCF_TCString";

    /* JADX INFO: compiled from: AndroidTcfDataSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.TcfDataSource
    public String getTcfString() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + "_settings", "IABTCF_TCString");
    }
}
