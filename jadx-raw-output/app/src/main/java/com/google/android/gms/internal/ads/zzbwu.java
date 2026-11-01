package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbwu extends zzbwx {
    private final Map zza;
    private final Context zzb;

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    public zzbwu(zzcjl zzcjlVar, Map map) {
        super(zzcjlVar, "storePicture");
        this.zza = map;
        this.zzb = zzcjlVar.zzj();
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbgl(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzc();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzP = com.google.android.gms.ads.internal.util.zzs.zzP(context);
        builderZzP.setTitle(resourcesZzf != null ? resourcesZzf.getString(R.string.f20222s1) : "Save image");
        builderZzP.setMessage(resourcesZzf != null ? resourcesZzf.getString(R.string.f20223s2) : "Allow Ad to store image in Picture gallery?");
        builderZzP.setPositiveButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f20224s3) : com.safedk.android.utils.k.f45009b, new zzbws(this, str, lastPathSegment));
        builderZzP.setNegativeButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f20225s4) : "Decline", new zzbwt(this));
        builderZzP.create().show();
    }
}
