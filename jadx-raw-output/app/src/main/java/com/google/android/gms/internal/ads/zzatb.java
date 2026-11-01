package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public class zzatb extends zzary {
    private final Object zza;

    @Nullable
    @GuardedBy("mLock")
    private final zzasd zzb;

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzase zzr(zzaru zzaruVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaruVar.zzb;
            Map map = zzaruVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals(G5.M)) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaruVar.zzb);
        }
        return zzase.zza(str, zzasv.zza(zzaruVar));
    }

    @Override // com.google.android.gms.internal.ads.zzary
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzasd zzasdVar;
        synchronized (this.zza) {
            zzasdVar = this.zzb;
        }
        zzasdVar.zza(str);
    }

    public zzatb(int i10, String str, zzasd zzasdVar, @Nullable zzasc zzascVar) {
        super(i10, str, zzascVar);
        this.zza = new Object();
        this.zzb = zzasdVar;
    }
}
