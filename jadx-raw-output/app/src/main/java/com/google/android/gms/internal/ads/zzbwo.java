package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbwo extends zzbwx {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public final /* synthetic */ Context zzc() {
        return this.zzb;
    }

    public zzbwo(zzcjl zzcjlVar, Map map) {
        super(zzcjlVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcjlVar.zzj();
        this.zzc = zzd(UnifiedMediationParams.KEY_DESCRIPTION);
        this.zzf = zzd("summary");
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd("location");
    }

    private final String zzd(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    private final long zze(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbgl(context).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzP = com.google.android.gms.ads.internal.util.zzs.zzP(context);
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        builderZzP.setTitle(resourcesZzf != null ? resourcesZzf.getString(R.string.f20226s5) : "Create calendar event");
        builderZzP.setMessage(resourcesZzf != null ? resourcesZzf.getString(R.string.f20227s6) : "Allow Ad to create a calendar event?");
        builderZzP.setPositiveButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f20224s3) : com.safedk.android.utils.k.f45009b, new zzbwm(this));
        builderZzP.setNegativeButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f20225s4) : "Decline", new zzbwn(this));
        builderZzP.create().show();
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra(UnifiedMediationParams.KEY_DESCRIPTION, this.zzf);
        long j10 = this.zzd;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.zze;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }
}
