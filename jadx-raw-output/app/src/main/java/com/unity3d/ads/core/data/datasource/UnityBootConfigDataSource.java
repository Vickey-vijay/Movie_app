package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: UnityBootConfigDataSource.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface UnityBootConfigDataSource {
    public static final String BUILD_GUID = "build-guid";
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: UnityBootConfigDataSource.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String BUILD_GUID = "build-guid";

        private Companion() {
        }
    }

    String getValue(String str);
}
