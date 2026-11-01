package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpu extends ContentObserver {
    public final /* synthetic */ zzpx zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        zzpx zzpxVar = this.zza;
        zzpxVar.zzf(zzps.zza(zzpxVar.zzg(), zzpxVar.zzj(), zzpxVar.zzh()));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpu(zzpx zzpxVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        Objects.requireNonNull(zzpxVar);
        this.zza = zzpxVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }
}
