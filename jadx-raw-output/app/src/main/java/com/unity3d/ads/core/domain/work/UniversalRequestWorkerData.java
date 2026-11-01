package com.unity3d.ads.core.domain.work;

import androidx.work.Data;
import ck.i;
import ck.p;

/* JADX INFO: compiled from: UniversalRequestWorkerData.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class UniversalRequestWorkerData {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    /* JADX INFO: compiled from: UniversalRequestWorkerData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final Data invoke() throws Throwable {
        Data dataBuild = new Data.Builder().putString(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).build();
        p.i(dataBuild, "Builder()\n            .p…tId)\n            .build()");
        return dataBuild;
    }

    public UniversalRequestWorkerData(String str) {
        p.j(str, KEY_UNIVERSAL_REQUEST_ID);
        this.universalRequestId = str;
    }
}
