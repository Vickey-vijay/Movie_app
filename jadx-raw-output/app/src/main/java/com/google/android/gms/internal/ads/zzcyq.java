package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcyq implements zzdel, zzdjy {
    private zzbzn zza;
    private final Context zzc;
    private final zzfor zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzc() {
        zzbzn zzbznVar;
        zzbsz zzbszVarZzb;
        if (!this.zzb.getAndSet(true)) {
            int i10 = 3;
            if (((Boolean) zzbje.zzo.zze()).booleanValue()) {
                i10 = 2;
            } else if (!((Boolean) zzbje.zzp.zze()).booleanValue()) {
                if (((Boolean) zzbje.zzn.zze()).booleanValue()) {
                    try {
                        String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()).optString("local_flag_write");
                        if (TextUtils.equals(strOptString, "client")) {
                            i10 = 2;
                        } else if (!TextUtils.equals(strOptString, NotificationCompat.CATEGORY_SERVICE)) {
                            i10 = 1;
                        }
                    } catch (JSONException unused) {
                    }
                } else {
                    i10 = 1;
                }
            }
            int i11 = i10 - 1;
            if (i11 == 1) {
                zzbszVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            } else if (i11 == 2) {
                zzbszVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            }
            zzbst zzbstVar = zzbsw.zza;
            this.zza = new zzbzq(this.zzc, zzbszVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbstVar, zzbstVar), this.zze, this.zzf);
            this.zzg = true;
        }
        if (this.zzg && (zzbznVar = this.zza) != null) {
            q5.i iVarZzb = zzbznVar.zzb();
            if (!this.zzh && ((Boolean) zzbiw.zzi.zze()).booleanValue()) {
                iVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf();
                    }
                }, this.zzf);
            }
            zzcel.zza(iVarZzb, "persistFlagsClient");
        }
    }

    public final /* synthetic */ void zzf() {
        zzbgp.zze(this.zzc);
        this.zzh = true;
    }

    public zzcyq(Context context, zzfor zzforVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzforVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(@Nullable String str) {
        zzc();
    }
}
