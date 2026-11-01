package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzapv implements zzapn {
    public final /* synthetic */ zzapx zza;
    private final zzeq zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        zzfg zzfgVar;
        int i10;
        int i11;
        if (zzerVar.zzs() == 2) {
            zzapx zzapxVar = this.zza;
            zzfg zzfgVar2 = (zzfg) zzapxVar.zzh().get(0);
            if ((zzerVar.zzs() & 128) != 0) {
                zzerVar.zzk(1);
                int iZzt = zzerVar.zzt();
                int i12 = 3;
                zzerVar.zzk(3);
                zzeq zzeqVar = this.zzb;
                zzerVar.zzl(zzeqVar, 2);
                zzeqVar.zzh(3);
                int i13 = 13;
                zzapxVar.zzq(zzeqVar.zzj(13));
                zzerVar.zzl(zzeqVar, 2);
                int i14 = 4;
                zzeqVar.zzh(4);
                int i15 = 12;
                zzerVar.zzk(zzeqVar.zzj(12));
                SparseArray sparseArray = this.zzc;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.zzd;
                sparseIntArray.clear();
                int iZzd = zzerVar.zzd();
                while (iZzd > 0) {
                    zzerVar.zzl(zzeqVar, 5);
                    int iZzj = zzeqVar.zzj(8);
                    zzeqVar.zzh(i12);
                    int iZzj2 = zzeqVar.zzj(i13);
                    zzeqVar.zzh(i14);
                    int iZzj3 = zzeqVar.zzj(i15);
                    int iZzg = zzerVar.zzg();
                    int i16 = iZzg + iZzj3;
                    int i17 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int iZzs = 0;
                    while (zzerVar.zzg() < i16) {
                        int iZzs2 = zzerVar.zzs();
                        int iZzg2 = zzerVar.zzg() + zzerVar.zzs();
                        if (iZzg2 > i16) {
                            break;
                        }
                        if (iZzs2 == 5) {
                            long jZzz = zzerVar.zzz();
                            if (jZzz == 1094921523) {
                                zzfgVar2 = zzfgVar2;
                                iZzt = iZzt;
                                i17 = 129;
                                zzeqVar = zzeqVar;
                            } else if (jZzz == 1161904947) {
                                i17 = 135;
                            } else if (jZzz == 1094921524) {
                                i17 = 172;
                            } else if (jZzz == 1212503619) {
                                i11 = 36;
                                i17 = i11;
                            }
                        } else if (iZzs2 == 106) {
                            zzfgVar2 = zzfgVar2;
                            iZzt = iZzt;
                            i17 = 129;
                            zzeqVar = zzeqVar;
                        } else if (iZzs2 == 122) {
                            i17 = 135;
                        } else if (iZzs2 == 127) {
                            int iZzs3 = zzerVar.zzs();
                            if (iZzs3 == 21) {
                                i17 = 172;
                            } else {
                                if (iZzs3 == 14) {
                                    i11 = 136;
                                } else if (iZzs3 == 33) {
                                    i11 = 139;
                                }
                                i17 = i11;
                            }
                        } else if (iZzs2 == 123) {
                            i11 = 138;
                            i17 = i11;
                        } else if (iZzs2 == 10) {
                            String strTrim = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                            iZzs = zzerVar.zzs();
                            str = strTrim;
                        } else if (iZzs2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzerVar.zzg() < iZzg2) {
                                zzeq zzeqVar2 = zzeqVar;
                                String strTrim2 = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                int iZzs4 = zzerVar.zzs();
                                zzfg zzfgVar3 = zzfgVar2;
                                byte[] bArr = new byte[4];
                                zzerVar.zzm(bArr, 0, 4);
                                arrayList2.add(new zzapy(strTrim2, iZzs4, bArr));
                                zzfgVar2 = zzfgVar3;
                                zzeqVar = zzeqVar2;
                                iZzt = iZzt;
                            }
                            zzfgVar2 = zzfgVar2;
                            iZzt = iZzt;
                            zzeqVar = zzeqVar;
                            arrayList = arrayList2;
                            i17 = 89;
                        } else {
                            zzfgVar2 = zzfgVar2;
                            iZzt = iZzt;
                            zzeqVar = zzeqVar;
                            if (iZzs2 == 111) {
                                i17 = 257;
                            }
                        }
                        zzerVar.zzk(iZzg2 - zzerVar.zzg());
                        zzfgVar2 = zzfgVar2;
                        zzeqVar = zzeqVar;
                        iZzt = iZzt;
                    }
                    zzfg zzfgVar4 = zzfgVar2;
                    int i18 = iZzt;
                    zzeq zzeqVar3 = zzeqVar;
                    zzerVar.zzh(i16);
                    zzapz zzapzVar = new zzapz(i17, str, iZzs, arrayList, Arrays.copyOfRange(zzerVar.zzi(), iZzg, i16));
                    if (iZzj == 6 || iZzj == 5) {
                        iZzj = zzapzVar.zza;
                    }
                    iZzd -= iZzj3 + 5;
                    if (!zzapxVar.zzk().get(iZzj2)) {
                        zzaqc zzaqcVarZzb = zzapxVar.zzi().zzb(iZzj, zzapzVar);
                        sparseIntArray.put(iZzj2, iZzj2);
                        sparseArray.put(iZzj2, zzaqcVarZzb);
                    }
                    i14 = 4;
                    zzfgVar2 = zzfgVar4;
                    zzeqVar = zzeqVar3;
                    iZzt = i18;
                    i12 = 3;
                    i13 = 13;
                    i15 = 12;
                }
                zzfg zzfgVar5 = zzfgVar2;
                int i19 = iZzt;
                int size = sparseIntArray.size();
                int i20 = 0;
                while (i20 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i20);
                    int iValueAt = sparseIntArray.valueAt(i20);
                    zzapxVar.zzk().put(iKeyAt, true);
                    zzapxVar.zzl().put(iValueAt, true);
                    zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i20);
                    if (zzaqcVar != null) {
                        i10 = i19;
                        zzfgVar = zzfgVar5;
                        zzaqcVar.zza(zzfgVar, zzapxVar.zzm(), new zzaqb(i10, iKeyAt, 8192));
                        zzapxVar.zzj().put(iValueAt, zzaqcVar);
                    } else {
                        zzfgVar = zzfgVar5;
                        i10 = i19;
                    }
                    i20++;
                    zzfgVar5 = zzfgVar;
                    i19 = i10;
                }
                zzapxVar.zzj().remove(this.zze);
                zzapxVar.zzo(0);
                if (zzapxVar.zzn() == 0) {
                    zzapxVar.zzm().zzv();
                    zzapxVar.zzp(true);
                }
            }
        }
    }

    public zzapv(zzapx zzapxVar, int i10) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i10;
    }
}
