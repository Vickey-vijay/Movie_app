package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public class zzecr extends Exception {
    private final int zza;

    public zzecr(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzecr(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzecr(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = 1;
    }
}
