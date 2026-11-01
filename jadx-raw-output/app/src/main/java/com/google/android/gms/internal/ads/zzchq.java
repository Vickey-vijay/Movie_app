package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.safedk.android.analytics.events.RedirectEvent;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzchq implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzchr zze;

    public zzchq(zzchr zzchrVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        Objects.requireNonNull(zzchrVar);
        this.zze = zzchrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b10;
        HashMap map = new HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.zza);
        String str = this.zzb;
        if (!TextUtils.isEmpty(str)) {
            map.put("cachedSrc", str);
        }
        String str2 = this.zzc;
        switch (str2) {
            case "interrupted":
                b10 = 3;
                break;
            case "badUrl":
                b10 = 8;
                break;
            case "inProgress":
                b10 = 2;
                break;
            case "downloadTimeout":
                b10 = 9;
                break;
            case "contentLengthMissing":
                b10 = 0;
                break;
            case "playerFailed":
                b10 = 5;
                break;
            case "sizeExceeded":
                b10 = 11;
                break;
            case "externalAbort":
                b10 = 10;
                break;
            case "noop":
                b10 = 4;
                break;
            case "error":
                b10 = 1;
                break;
            case "expireFailed":
                b10 = 6;
                break;
            case "noCacheDir":
                b10 = 7;
                break;
            default:
                b10 = -1;
                break;
        }
        String str3 = RedirectEvent.f44652i;
        switch (b10) {
            case 6:
            case 7:
                str3 = "io";
                break;
            case 8:
            case 9:
                str3 = "network";
                break;
            case 10:
            case 11:
                str3 = "policy";
                break;
        }
        map.put("type", str3);
        map.put("reason", str2);
        String str4 = this.zzd;
        if (!TextUtils.isEmpty(str4)) {
            map.put("message", str4);
        }
        this.zze.zzw("onPrecacheEvent", map);
    }
}
