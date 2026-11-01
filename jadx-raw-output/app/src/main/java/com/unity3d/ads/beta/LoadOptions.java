package com.unity3d.ads.beta;

import ck.i;
import ck.p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: compiled from: LoadOptions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class LoadOptions {
    private final String adMarkup;
    private final Map<String, String> extras;
    private final String placementId;

    /* JADX INFO: compiled from: LoadOptions.kt */
    public static final class Builder {
        private String adMarkup;
        private final Map<String, String> extras;
        private final String placementId;

        public Builder(String str) {
            p.j(str, "placementId");
            this.placementId = str;
            this.extras = new LinkedHashMap();
        }

        public final LoadOptions build() {
            return new LoadOptions(this.placementId, this.adMarkup, this.extras);
        }

        public final Builder withAdMarkup(String str) {
            p.j(str, "adMarkup");
            this.adMarkup = str;
            return this;
        }

        public final Builder withExtras(Map<String, String> map) {
            p.j(map, "extras");
            this.extras.putAll(map);
            return this;
        }
    }

    public LoadOptions(String str, String str2, Map<String, String> map) {
        p.j(str, "placementId");
        p.j(map, "extras");
        this.placementId = str;
        this.adMarkup = str2;
        this.extras = map;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ LoadOptions(String str, String str2, Map map, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? a.j() : map);
    }
}
