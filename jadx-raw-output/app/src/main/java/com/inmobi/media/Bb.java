package com.inmobi.media;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Bb {
    public static final Ab a(String str) {
        ck.p.j(str, "logLevel");
        if (lk.x.E(str, "DEBUG", true)) {
            return Ab.DEBUG;
        }
        if (lk.x.E(str, "ERROR", true)) {
            return Ab.ERROR;
        }
        if (lk.x.E(str, "INFO", true)) {
            return Ab.INFO;
        }
        return lk.x.E(str, "STATE", true) ? Ab.STATE : Ab.ERROR;
    }
}
