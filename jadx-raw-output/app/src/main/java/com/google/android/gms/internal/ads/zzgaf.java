package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import ck.p;
import java.util.List;
import mj.r;
import nj.b0;
import nk.l0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgaf implements zzfyv {
    private final l0 zza;
    private final wk.a zzb;
    private final wk.a zzc;
    private final wk.a zzd;
    private boolean zze;
    private zzfyt zzf;
    private boolean zzg;
    private final DataStore zzh;
    private final zzdvj zzi;

    public zzgaf(DataStore dataStore, zzfzh zzfzhVar, zzdvj zzdvjVar, zzfze zzfzeVar) {
        p.j(dataStore, "adQualityDataStore");
        p.j(zzfzhVar, "coroutineScopeProvider");
        p.j(zzdvjVar, "dataPinger");
        p.j(zzfzeVar, "clock");
        this.zzi = zzdvjVar;
        this.zza = zzfzhVar.zza();
        this.zzb = wk.g.b(false, 1, null);
        this.zzc = wk.g.b(false, 1, null);
        this.zzd = wk.g.b(false, 1, null);
        this.zzh = dataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzs(String str, rj.c cVar) throws Throwable {
        zzfzk zzfzkVar;
        wk.a aVar;
        Throwable th2;
        wk.a aVar2;
        if (cVar instanceof zzfzk) {
            zzfzkVar = (zzfzk) cVar;
            int i10 = zzfzkVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzfzkVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzfzkVar = new zzfzk(this, cVar);
            }
        } else {
            zzfzkVar = new zzfzk(this, cVar);
        }
        Object obj = zzfzkVar.zzc;
        Object objF = sj.a.f();
        int i11 = zzfzkVar.zze;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                aVar = this.zzd;
                zzfzkVar.zza = str;
                zzfzkVar.zzb = aVar;
                zzfzkVar.zze = 1;
                if (aVar.a(null, zzfzkVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (wk.a) zzfzkVar.zza;
                try {
                    kotlin.c.b(obj);
                    aVar2.b(null);
                    return r.f64562a;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.b(null);
                    throw th2;
                }
            }
            wk.a aVar3 = (wk.a) zzfzkVar.zzb;
            String str2 = (String) zzfzkVar.zza;
            kotlin.c.b(obj);
            aVar = aVar3;
            str = str2;
            DataStore dataStore = this.zzh;
            zzfzl zzfzlVar = new zzfzl(str, null);
            zzfzkVar.zza = aVar;
            zzfzkVar.zzb = null;
            zzfzkVar.zze = 2;
            Object objUpdateData = dataStore.updateData(zzfzlVar, zzfzkVar);
            if (objUpdateData != objF) {
                wk.a aVar4 = aVar;
                obj = objUpdateData;
                aVar2 = aVar4;
                aVar2.b(null);
                return r.f64562a;
            }
            return objF;
        } catch (Throwable th4) {
            wk.a aVar5 = aVar;
            th2 = th4;
            aVar2 = aVar5;
            aVar2.b(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzt(rj.c cVar) throws Throwable {
        zzfzn zzfznVar;
        wk.a aVar;
        wk.a aVar2;
        Throwable th2;
        if (cVar instanceof zzfzn) {
            zzfznVar = (zzfzn) cVar;
            int i10 = zzfznVar.zzd;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzfznVar.zzd = i10 - Integer.MIN_VALUE;
            } else {
                zzfznVar = new zzfzn(this, cVar);
            }
        } else {
            zzfznVar = new zzfzn(this, cVar);
        }
        Object obj = zzfznVar.zzb;
        Object objF = sj.a.f();
        int i11 = zzfznVar.zzd;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                aVar = this.zzd;
                zzfznVar.zza = aVar;
                zzfznVar.zzd = 1;
                if (aVar.a(null, zzfznVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (wk.a) zzfznVar.zza;
                try {
                    kotlin.c.b(obj);
                    aVar2.b(null);
                    return r.f64562a;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.b(null);
                    throw th2;
                }
            }
            wk.a aVar3 = (wk.a) zzfznVar.zza;
            kotlin.c.b(obj);
            aVar = aVar3;
            DataStore dataStore = this.zzh;
            zzfzo zzfzoVar = new zzfzo(null);
            zzfznVar.zza = aVar;
            zzfznVar.zzd = 2;
            Object objUpdateData = dataStore.updateData(zzfzoVar, zzfznVar);
            if (objUpdateData != objF) {
                aVar2 = aVar;
                obj = objUpdateData;
                aVar2.b(null);
                return r.f64562a;
            }
            return objF;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th2 = th4;
            aVar2.b(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzu(long j10, rj.c cVar) throws Throwable {
        zzfzm zzfzmVar;
        wk.a aVar;
        if (cVar instanceof zzfzm) {
            zzfzmVar = (zzfzm) cVar;
            int i10 = zzfzmVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzfzmVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzfzmVar = new zzfzm(this, cVar);
            }
        } else {
            zzfzmVar = new zzfzm(this, cVar);
        }
        Object obj = zzfzmVar.zzc;
        Object objF = sj.a.f();
        int i11 = zzfzmVar.zze;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = this.zzb;
            zzfzmVar.zzb = aVar2;
            zzfzmVar.zza = j10;
            zzfzmVar.zze = 1;
            if (aVar2.a(null, zzfzmVar) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzfzmVar.zza;
            aVar = (wk.a) zzfzmVar.zzb;
            kotlin.c.b(obj);
        }
        try {
            zzfyt zzfytVar = this.zzf;
            if (zzfytVar == null) {
                p.B("adQualityDataBuilder");
                zzfytVar = null;
            }
            zzfyt zzfytVar2 = this.zzf;
            if (zzfytVar2 == null) {
                p.B("adQualityDataBuilder");
                zzfytVar2 = null;
            }
            long jZzi = j10 - zzfytVar2.zzi();
            zzfyt zzfytVar3 = this.zzf;
            if (zzfytVar3 == null) {
                p.B("adQualityDataBuilder");
                zzfytVar3 = null;
            }
            zzfytVar.zzb(jZzi - zzfytVar3.zzg());
            return r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzv(rj.c cVar) throws Throwable {
        zzfzr zzfzrVar;
        wk.a aVar;
        wk.a aVar2;
        zzfyu zzfyuVar;
        wk.a aVar3;
        if (cVar instanceof zzfzr) {
            zzfzrVar = (zzfzr) cVar;
            int i10 = zzfzrVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzfzrVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzfzrVar = new zzfzr(this, cVar);
            }
        } else {
            zzfzrVar = new zzfzr(this, cVar);
        }
        Object objUpdateData = zzfzrVar.zzc;
        Object objF = sj.a.f();
        int i11 = zzfzrVar.zze;
        try {
            if (i11 == 0) {
                kotlin.c.b(objUpdateData);
                aVar = this.zzb;
                zzfzrVar.zza = aVar;
                zzfzrVar.zze = 1;
                if (aVar.a(null, zzfzrVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (wk.a) zzfzrVar.zza;
                    try {
                        kotlin.c.b(objUpdateData);
                        aVar3.b(null);
                        return r.f64562a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar3.b(null);
                        throw th;
                    }
                }
                aVar2 = (wk.a) zzfzrVar.zzb;
                zzfyuVar = (zzfyu) zzfzrVar.zza;
                kotlin.c.b(objUpdateData);
                try {
                    DataStore dataStore = this.zzh;
                    zzfzs zzfzsVar = new zzfzs(zzfyuVar, null);
                    zzfzrVar.zza = aVar2;
                    zzfzrVar.zzb = null;
                    zzfzrVar.zze = 3;
                    objUpdateData = dataStore.updateData(zzfzsVar, zzfzrVar);
                    if (objUpdateData != objF) {
                        aVar3 = aVar2;
                        aVar3.b(null);
                        return r.f64562a;
                    }
                    return objF;
                } catch (Throwable th3) {
                    th = th3;
                    aVar3 = aVar2;
                    aVar3.b(null);
                    throw th;
                }
            }
            aVar = (wk.a) zzfzrVar.zza;
            kotlin.c.b(objUpdateData);
            zzfyt zzfytVar = this.zzf;
            if (zzfytVar == null) {
                p.B("adQualityDataBuilder");
                zzfytVar = null;
            }
            zzfyu zzfyuVar2 = (zzfyu) zzfytVar.zzbu();
            aVar.b(null);
            p.g(zzfyuVar2);
            aVar2 = this.zzd;
            zzfzrVar.zza = zzfyuVar2;
            zzfzrVar.zzb = aVar2;
            zzfzrVar.zze = 2;
            if (aVar2.a(null, zzfzrVar) != objF) {
                zzfyuVar = zzfyuVar2;
                DataStore dataStore2 = this.zzh;
                zzfzs zzfzsVar2 = new zzfzs(zzfyuVar, null);
                zzfzrVar.zza = aVar2;
                zzfzrVar.zzb = null;
                zzfzrVar.zze = 3;
                objUpdateData = dataStore2.updateData(zzfzsVar2, zzfzrVar);
                if (objUpdateData != objF) {
                    aVar3 = aVar2;
                    aVar3.b(null);
                    return r.f64562a;
                }
            }
            return objF;
        } catch (Throwable th4) {
            aVar.b(null);
            throw th4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zza() {
        nk.j.d(this.zza, null, null, new zzgaa(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzb(String str) {
        p.j(str, "gwsQueryId");
        nk.j.d(this.zza, null, null, new zzfzu(this, str, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzc() {
        nk.j.d(this.zza, null, null, new zzfzq(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzd() {
        nk.j.d(this.zza, null, null, new zzgae(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zze() {
        nk.j.d(this.zza, null, null, new zzfzy(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzf() {
        nk.j.d(this.zza, null, null, new zzgac(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzg() {
        nk.j.d(this.zza, null, null, new zzfzw(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (zzt(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [wk.a] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [wk.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgaf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(rj.c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzh(rj.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzi(String str, rj.c cVar) throws Throwable {
        zzfzt zzfztVar;
        String str2;
        wk.a aVar;
        long j10;
        if (cVar instanceof zzfzt) {
            zzfztVar = (zzfzt) cVar;
            int i10 = zzfztVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzfztVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzfztVar = new zzfzt(this, cVar);
            }
        } else {
            zzfztVar = new zzfzt(this, cVar);
        }
        Object obj = zzfztVar.zzc;
        Object objF = sj.a.f();
        int i11 = zzfztVar.zze;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfztVar.zzf = str;
            zzfztVar.zza = aVar2;
            zzfztVar.zzb = jCurrentTimeMillis;
            zzfztVar.zze = 1;
            if (aVar2.a(null, zzfztVar) == objF) {
                return objF;
            }
            str2 = str;
            aVar = aVar2;
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzfztVar.zzb;
            aVar = (wk.a) zzfztVar.zza;
            str2 = zzfztVar.zzf;
            kotlin.c.b(obj);
        }
        try {
            if (this.zze) {
                return r.f64562a;
            }
            this.zze = true;
            zzibl zziblVarZzcc = zzfyu.zzp().zzcc();
            p.i(zziblVarZzcc, "toBuilder(...)");
            zzfyt zzfytVar = (zzfyt) zziblVarZzcc;
            this.zzf = zzfytVar;
            if (zzfytVar == null) {
                p.B("adQualityDataBuilder");
                zzfytVar = null;
            }
            zzfytVar.zza(str2);
            zzfytVar.zzj(j10);
            return r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:31:0x0085, B:33:0x0089, B:34:0x008f), top: B:50:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        if (zzv(r0) == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(rj.c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzfzp
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzfzp r0 = (com.google.android.gms.internal.ads.zzfzp) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzp r0 = new com.google.android.gms.internal.ads.zzfzp
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.zze
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.c.b(r11)
            goto La8
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            kotlin.c.b(r11)
            goto L9f
        L40:
            long r5 = r0.zzb
            java.lang.Object r2 = r0.zza
            wk.a r2 = (wk.a) r2
            kotlin.c.b(r11)
            goto L85
        L4a:
            java.lang.Object r2 = r0.zza
            wk.a r2 = (wk.a) r2
            kotlin.c.b(r11)
            goto L61
        L52:
            kotlin.c.b(r11)
            wk.a r2 = r10.zzc
            r0.zza = r2
            r0.zze = r6
            java.lang.Object r11 = r2.a(r7, r0)
            if (r11 == r1) goto Lb5
        L61:
            boolean r11 = r10.zzg     // Catch: java.lang.Throwable -> Lb0
            if (r11 == 0) goto L6b
            mj.r r11 = mj.r.f64562a     // Catch: java.lang.Throwable -> Lb0
            r2.b(r7)
            return r11
        L6b:
            r10.zzg = r6     // Catch: java.lang.Throwable -> Lb0
            mj.r r11 = mj.r.f64562a     // Catch: java.lang.Throwable -> Lb0
            r2.b(r7)
            wk.a r2 = r10.zzb
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r8
            r0.zze = r5
            java.lang.Object r11 = r2.a(r7, r0)
            if (r11 == r1) goto Lb5
            r5 = r8
        L85:
            com.google.android.gms.internal.ads.zzfyt r11 = r10.zzf     // Catch: java.lang.Throwable -> Lab
            if (r11 != 0) goto L8f
            java.lang.String r11 = "adQualityDataBuilder"
            ck.p.B(r11)     // Catch: java.lang.Throwable -> Lab
            r11 = r7
        L8f:
            r11.zzo(r5)     // Catch: java.lang.Throwable -> Lab
            r2.b(r7)
            r0.zza = r7
            r0.zze = r4
            java.lang.Object r11 = r10.zzu(r5, r0)
            if (r11 == r1) goto Lb5
        L9f:
            r0.zze = r3
            java.lang.Object r11 = r10.zzv(r0)
            if (r11 != r1) goto La8
            goto Lb5
        La8:
            mj.r r11 = mj.r.f64562a
            return r11
        Lab:
            r11 = move-exception
            r2.b(r7)
            throw r11
        Lb0:
            r11 = move-exception
            r2.b(r7)
            throw r11
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzj(rj.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010d A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzk(rj.c cVar) throws Throwable {
        zzgad zzgadVar;
        wk.a aVar;
        wk.a aVar2;
        long j10;
        zzfyt zzfytVar;
        zzfyt zzfytVar2;
        zzfyt zzfytVar3;
        zzfyt zzfytVar4;
        zzfyt zzfytVar5;
        zzfyt zzfytVar6;
        long jLongValue;
        zzfyt zzfytVar7;
        zzfyt zzfytVar8;
        if (cVar instanceof zzgad) {
            zzgadVar = (zzgad) cVar;
            int i10 = zzgadVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgadVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgadVar = new zzgad(this, cVar);
            }
        } else {
            zzgadVar = new zzgad(this, cVar);
        }
        Object obj = zzgadVar.zzc;
        Object objF = sj.a.f();
        int i11 = zzgadVar.zze;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                aVar = this.zzc;
                zzgadVar.zza = aVar;
                zzgadVar.zze = 1;
                if (aVar.a(null, zzgadVar) != objF) {
                }
                return objF;
            }
            if (i11 == 1) {
                aVar = (wk.a) zzgadVar.zza;
                kotlin.c.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = zzgadVar.zzb;
                aVar2 = (wk.a) zzgadVar.zza;
                kotlin.c.b(obj);
            }
            try {
                zzfytVar = this.zzf;
                if (zzfytVar == null) {
                    p.B("adQualityDataBuilder");
                    zzfytVar = null;
                }
                if (zzfytVar.zzr() > 0) {
                    zzfytVar6 = this.zzf;
                    if (zzfytVar6 == null) {
                        p.B("adQualityDataBuilder");
                        zzfytVar6 = null;
                    }
                    List listZzq = zzfytVar6.zzq();
                    p.i(listZzq, "getAdClickTimestampsMsList(...)");
                    Object objR0 = b0.r0(listZzq);
                    p.i(objR0, "last(...)");
                    jLongValue = j10 - ((Number) objR0).longValue();
                    zzfytVar7 = this.zzf;
                    if (zzfytVar7 == null) {
                        p.B("adQualityDataBuilder");
                        zzfytVar7 = null;
                    }
                    zzfytVar7.zzt();
                    if (jLongValue < 5000) {
                        zzfytVar8 = this.zzf;
                        if (zzfytVar8 == null) {
                            p.B("adQualityDataBuilder");
                            zzfytVar8 = null;
                        }
                        zzfytVar8.zzd(zzfytVar8.zzc() + 1);
                    }
                }
                zzfytVar2 = this.zzf;
                if (zzfytVar2 == null) {
                    p.B("adQualityDataBuilder");
                    zzfytVar2 = null;
                }
                if (zzfytVar2.zzn() > 0) {
                    zzfytVar4 = this.zzf;
                    if (zzfytVar4 == null) {
                        p.B("adQualityDataBuilder");
                        zzfytVar4 = null;
                    }
                    List listZzm = zzfytVar4.zzm();
                    p.i(listZzm, "getAppBackgroundTimestampsMsList(...)");
                    Object objR1 = b0.r0(listZzm);
                    p.i(objR1, "last(...)");
                    long jLongValue2 = j10 - ((Number) objR1).longValue();
                    zzfytVar5 = this.zzf;
                    if (zzfytVar5 == null) {
                        p.B("adQualityDataBuilder");
                        zzfytVar5 = null;
                    }
                    zzfytVar5.zzh(zzfytVar5.zzg() + jLongValue2);
                }
                zzfytVar3 = this.zzf;
                if (zzfytVar3 == null) {
                    p.B("adQualityDataBuilder");
                    zzfytVar3 = null;
                }
                zzfytVar3.zzp(j10);
                return r.f64562a;
            } finally {
                aVar2.b(null);
            }
            if (!this.zzg) {
                r rVar = r.f64562a;
                aVar.b(null);
                return rVar;
            }
            this.zzg = false;
            r rVar2 = r.f64562a;
            aVar.b(null);
            wk.a aVar3 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgadVar.zza = aVar3;
            zzgadVar.zzb = jCurrentTimeMillis;
            zzgadVar.zze = 2;
            if (aVar3.a(null, zzgadVar) != objF) {
                aVar2 = aVar3;
                j10 = jCurrentTimeMillis;
                zzfytVar = this.zzf;
                if (zzfytVar == null) {
                    p.B("adQualityDataBuilder");
                    zzfytVar = null;
                }
                if (zzfytVar.zzr() > 0) {
                    zzfytVar6 = this.zzf;
                    if (zzfytVar6 == null) {
                        p.B("adQualityDataBuilder");
                        zzfytVar6 = null;
                    }
                    List listZzq2 = zzfytVar6.zzq();
                    p.i(listZzq2, "getAdClickTimestampsMsList(...)");
                    Object objR2 = b0.r0(listZzq2);
                    p.i(objR2, "last(...)");
                    jLongValue = j10 - ((Number) objR2).longValue();
                    zzfytVar7 = this.zzf;
                    if (zzfytVar7 == null) {
                        p.B("adQualityDataBuilder");
                        zzfytVar7 = null;
                    }
                    zzfytVar7.zzt();
                    if (jLongValue < 5000) {
                        zzfytVar8 = this.zzf;
                        if (zzfytVar8 == null) {
                            p.B("adQualityDataBuilder");
                            zzfytVar8 = null;
                        }
                        zzfytVar8.zzd(zzfytVar8.zzc() + 1);
                    }
                }
                zzfytVar2 = this.zzf;
                if (zzfytVar2 == null) {
                    p.B("adQualityDataBuilder");
                    zzfytVar2 = null;
                }
                if (zzfytVar2.zzn() > 0) {
                    zzfytVar4 = this.zzf;
                    if (zzfytVar4 == null) {
                        p.B("adQualityDataBuilder");
                        zzfytVar4 = null;
                    }
                    List listZzm2 = zzfytVar4.zzm();
                    p.i(listZzm2, "getAppBackgroundTimestampsMsList(...)");
                    Object objR3 = b0.r0(listZzm2);
                    p.i(objR3, "last(...)");
                    long jLongValue3 = j10 - ((Number) objR3).longValue();
                    zzfytVar5 = this.zzf;
                    if (zzfytVar5 == null) {
                        p.B("adQualityDataBuilder");
                        zzfytVar5 = null;
                    }
                    zzfytVar5.zzh(zzfytVar5.zzg() + jLongValue3);
                }
                zzfytVar3 = this.zzf;
                if (zzfytVar3 == null) {
                    p.B("adQualityDataBuilder");
                    zzfytVar3 = null;
                }
                zzfytVar3.zzp(j10);
                return r.f64562a;
            }
            return objF;
        } catch (Throwable th2) {
            aVar.b(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (zzs(r14, r0) == r1) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(rj.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzl(rj.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: all -> 0x0106, TRY_ENTER, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (zzs(r15, r0) == r1) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzm(rj.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzm(rj.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzn(rj.c cVar) throws Throwable {
        zzfzv zzfzvVar;
        wk.a aVar;
        long j10;
        if (cVar instanceof zzfzv) {
            zzfzvVar = (zzfzv) cVar;
            int i10 = zzfzvVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzfzvVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzfzvVar = new zzfzv(this, cVar);
            }
        } else {
            zzfzvVar = new zzfzv(this, cVar);
        }
        Object obj = zzfzvVar.zzc;
        Object objF = sj.a.f();
        int i11 = zzfzvVar.zze;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfzvVar.zzb = aVar2;
            zzfzvVar.zza = jCurrentTimeMillis;
            zzfzvVar.zze = 1;
            if (aVar2.a(null, zzfzvVar) == objF) {
                return objF;
            }
            aVar = aVar2;
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzfzvVar.zza;
            aVar = (wk.a) zzfzvVar.zzb;
            kotlin.c.b(obj);
        }
        try {
            zzfyt zzfytVar = this.zzf;
            if (zzfytVar == null) {
                p.B("adQualityDataBuilder");
                zzfytVar = null;
            }
            zzfytVar.zzs(j10);
            return r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    private static final boolean zzw(zzfyu zzfyuVar) {
        Long l10;
        boolean z10;
        boolean z11;
        List listZzk = zzfyuVar.zzk();
        if (listZzk != null) {
            l10 = (Long) b0.s0(listZzk);
        } else {
            l10 = null;
        }
        if (zzfyuVar.zzl() > zzfyuVar.zzm() && !zzfyuVar.zzd()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (l10 != null) {
            if (zzfyuVar.zzi() - l10.longValue() > 5000) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }
}
