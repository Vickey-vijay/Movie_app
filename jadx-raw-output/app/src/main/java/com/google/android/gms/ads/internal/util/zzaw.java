package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzaw implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ boolean zzd;

    public zzaw(zzax zzaxVar, Context context, String str, boolean z10, boolean z11) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
        Objects.requireNonNull(zzaxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        AlertDialog.Builder builderZzP = zzs.zzP(context);
        builderZzP.setMessage(this.zzb);
        if (this.zzc) {
            builderZzP.setTitle(VastTagName.ERROR);
        } else {
            builderZzP.setTitle("Info");
        }
        if (this.zzd) {
            builderZzP.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzP.setPositiveButton("Learn More", new zzav(this, context));
            builderZzP.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzP.create().show();
    }
}
