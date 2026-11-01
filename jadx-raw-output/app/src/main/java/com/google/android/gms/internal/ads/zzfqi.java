package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfqi implements zzgzl {
    public final /* synthetic */ zzfoe zza;
    public final /* synthetic */ zzfoo zzb;
    public final /* synthetic */ zzddu zzc;
    public final /* synthetic */ zzfqk zzd;

    public zzfqi(zzfqk zzfqkVar, zzfoe zzfoeVar, zzfoo zzfooVar, zzddu zzdduVar) {
        this.zza = zzfoeVar;
        this.zzb = zzfooVar;
        this.zzc = zzdduVar;
        Objects.requireNonNull(zzfqkVar);
        this.zzd = zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(@NonNull Throwable th2) {
        zzfoe zzfoeVar = this.zza;
        if (zzfoeVar == null) {
            return;
        }
        zzfoeVar.zzd(false);
        zzfoo zzfooVar = this.zzb;
        if (zzfooVar != null) {
            zzfooVar.zza(zzfoeVar);
            zzfooVar.zzh();
        } else {
            zzfqk zzfqkVar = this.zzd;
            zzfqkVar.zze().zzb(zzfoeVar.zzm());
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        byte b10;
        int i10;
        long j10;
        int iHashCode;
        int i11;
        zzfoe zzfoeVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfoeVar != null) {
            zzfoeVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfoo zzfooVar = this.zzb;
            if (zzfooVar == null) {
                this.zzd.zze().zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zza(zzfoeVar);
                zzfooVar.zzh();
            }
        }
        zzddu zzdduVar = this.zzc;
        if (zzdduVar != null) {
            String strZzb = this.zzd.zzd().zzb();
            if (TextUtils.isEmpty(strZzb)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strZzb);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String strOptString = jSONObject.optString("type");
                String strOptString2 = jSONObject.optString("precision");
                String strOptString3 = jSONObject.optString("currency");
                long jOptLong = jSONObject.optLong("value", 0L);
                int iHashCode2 = strOptString.hashCode();
                byte b11 = -1;
                if (iHashCode2 != 66934) {
                    if (iHashCode2 != 66944) {
                        if (iHashCode2 == 1349395245 && strOptString.equals("ONE_PIXEL")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (strOptString.equals("CPM")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                } else if (strOptString.equals("CPC")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                if (b10 != 0) {
                    if (b10 == 1) {
                        j10 = jOptLong;
                        i10 = 2;
                    } else if (b10 != 2) {
                        i10 = 0;
                    } else {
                        jOptLong /= 1000;
                        i10 = 3;
                    }
                    iHashCode = strOptString2.hashCode();
                    if (iHashCode != -2131980260) {
                        if (iHashCode != 399232571) {
                            if (iHashCode == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                                b11 = 1;
                            }
                        } else if (strOptString2.equals("PRECISE")) {
                            b11 = 2;
                        }
                    } else if (strOptString2.equals("ESTIMATED")) {
                        b11 = 0;
                    }
                    if (b11 != 0) {
                        i11 = 1;
                    } else if (b11 != 1) {
                        i11 = 2;
                    } else if (b11 != 2) {
                        i11 = 0;
                    } else {
                        i11 = 3;
                    }
                    zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i10, i11, strOptString3, j10));
                }
                i10 = 1;
                j10 = jOptLong;
                iHashCode = strOptString2.hashCode();
                if (iHashCode != -2131980260) {
                    if (iHashCode != 399232571) {
                        if (iHashCode == 1271254246) {
                            b11 = 1;
                        }
                    } else if (strOptString2.equals("PRECISE")) {
                        b11 = 2;
                    }
                } else if (strOptString2.equals("ESTIMATED")) {
                    b11 = 0;
                }
                if (b11 != 0) {
                    i11 = 1;
                } else if (b11 != 1) {
                    i11 = 2;
                } else if (b11 != 2) {
                    i11 = 0;
                } else {
                    i11 = 3;
                }
                zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i10, i11, strOptString3, j10));
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "UrlPinger.pingUrl");
            }
        }
    }
}
