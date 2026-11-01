package com.google.android.gms.internal.ads;

import com.ironsource.Z7;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbeq {
    private final zzbeg zza;
    private final int zzb;
    private final int zzc;

    public zzbeq(int i10, int i11, int i12) {
        this.zzb = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i12;
        }
        this.zza = new zzbeo(i11);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzbep(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((zzbef) arrayList2.get(i10)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str);
                        int i11 = 1;
                        boolean z10 = false;
                        while (true) {
                            int i12 = i11 + 2;
                            if (i12 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i11) == '\'') {
                                if (sb2.charAt(i11 - 1) != ' ') {
                                    int i13 = i11 + 1;
                                    if ((sb2.charAt(i13) == 's' || sb2.charAt(i13) == 'S') && (i12 == sb2.length() || sb2.charAt(i12) == ' ')) {
                                        sb2.insert(i11, ' ');
                                        i11 = i12;
                                    } else {
                                        sb2.setCharAt(i11, ' ');
                                    }
                                } else {
                                    sb2.setCharAt(i11, ' ');
                                }
                                z10 = true;
                            }
                            i11++;
                        }
                        String string = z10 ? sb2.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    String[] strArrZzb = zzbek.zzb(str, true);
                    int length = strArrZzb.length;
                    int i14 = this.zzc;
                    if (length >= i14) {
                        for (int i15 = 0; i15 < strArrZzb.length; i15++) {
                            String strConcat = "";
                            for (int i16 = 0; i16 < i14; i16++) {
                                int i17 = i15 + i16;
                                if (i17 >= strArrZzb.length) {
                                    break;
                                }
                                if (i16 > 0) {
                                    strConcat = strConcat.concat(Z7.f27998r);
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrZzb[i17]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzbei zzbeiVar = new zzbei();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzbeiVar.zzb.write(this.zza.zza((String) it.next()));
            } catch (IOException e10) {
                int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e10);
            }
        }
        return zzbeiVar.toString();
    }
}
