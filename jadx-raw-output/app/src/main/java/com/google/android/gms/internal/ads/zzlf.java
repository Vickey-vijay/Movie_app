package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzlf implements Handler.Callback, zzwh, zzaai, zzmb, zzit, zzmf, zzcc, zzacp {
    private static final long zza = zzfj.zzp(10000);
    private zzmt zzA;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzle zzE;
    private int zzF;
    private zzmd zzG;
    private zzlc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;

    @Nullable
    private zzle zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;

    @Nullable
    private zziw zzX;
    private zzjg zzZ;
    private boolean zzab;
    private final zzip zzad;
    private final zzmp[] zzb;
    private final zzmn[] zzc;
    private final boolean[] zzd;
    private final zzaaj zze;
    private final zzaak zzf;
    private final zzlj zzg;
    private final zzaas zzh;
    private final zzdx zzi;
    private final zzme zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zziu zzo;
    private final ArrayList zzp;
    private final zzdn zzq;
    private final zzld zzr;
    private final zzlq zzs;
    private final zzmc zzt;
    private final long zzu;
    private final zzpq zzv;
    private final zzmx zzw;
    private final zzdx zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzms zzB = zzms.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlf(Context context, zzml[] zzmlVarArr, zzml[] zzmlVarArr2, zzaaj zzaajVar, zzaak zzaakVar, zzlj zzljVar, zzaas zzaasVar, int i10, boolean z10, zzmx zzmxVar, zzmt zzmtVar, zzip zzipVar, long j10, boolean z11, boolean z12, Looper looper, zzdn zzdnVar, zzld zzldVar, zzpq zzpqVar, @Nullable zzme zzmeVar, zzjg zzjgVar, final zzacp zzacpVar) {
        this.zzr = zzldVar;
        this.zze = zzaajVar;
        this.zzf = zzaakVar;
        this.zzg = zzljVar;
        this.zzh = zzaasVar;
        this.zzA = zzmtVar;
        this.zzad = zzipVar;
        this.zzu = j10;
        this.zzq = zzdnVar;
        this.zzv = zzpqVar;
        this.zzZ = zzjgVar;
        this.zzw = zzmxVar;
        this.zzn = zzljVar.zzf(zzpqVar);
        zzljVar.zzg(zzpqVar);
        zzbf zzbfVar = zzbf.zza;
        zzmd zzmdVarZza = zzmd.zza(zzaakVar);
        this.zzG = zzmdVarZza;
        this.zzH = new zzlc(zzmdVarZza);
        int length = zzmlVarArr.length;
        this.zzc = new zzmn[2];
        this.zzd = new boolean[2];
        zzmm zzmmVarZzg = zzaajVar.zzg();
        this.zzb = new zzmp[2];
        boolean z13 = false;
        for (int i11 = 0; i11 < 2; i11++) {
            zzmlVarArr[i11].zzc(i11, zzpqVar, zzdnVar);
            this.zzc[i11] = zzmlVarArr[i11].zzb();
            this.zzc[i11].zzv(zzmmVarZzg);
            zzml zzmlVar = zzmlVarArr2[i11];
            if (zzmlVar != null) {
                zzmlVar.zzc(i11, zzpqVar, zzdnVar);
                z13 = true;
            }
            this.zzb[i11] = new zzmp(zzmlVarArr[i11], zzmlVarArr2[i11], i11);
        }
        this.zzy = z13;
        this.zzo = new zziu(this, zzdnVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzaajVar.zzr(this, zzaasVar);
        this.zzW = true;
        zzdx zzdxVarZzd = zzdnVar.zzd(looper, null);
        this.zzx = zzdxVarZzd;
        this.zzs = new zzlq(zzmxVar, zzdxVarZzd, new zzky(this), zzjgVar);
        this.zzt = new zzmc(this, zzmxVar, zzdxVarZzd, zzpqVar);
        zzme zzmeVar2 = new zzme(null);
        this.zzj = zzmeVar2;
        Looper looperZza = zzmeVar2.zza();
        this.zzk = looperZza;
        zzdx zzdxVarZzd2 = zzdnVar.zzd(looperZza, this);
        this.zzi = zzdxVarZzd2;
        this.zzz = new zzcd(context, looperZza, this);
        zzdxVarZzd2.zzd(35, new zzacp() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzacp
            public final /* synthetic */ void zzcS(long j11, long j12, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j11, j12, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzH(boolean z10, int i10, int i11, int i12) throws zziw {
        boolean z11;
        if (!z10) {
            z11 = false;
        } else if (i10 != -1) {
            z11 = true;
        } else {
            i10 = -1;
            z11 = false;
        }
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.zzC;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zzl == z11 && zzmdVar.zzn == i11 && zzmdVar.zzm == i12) {
            return;
        }
        this.zzG = zzmdVar.zzi(z11, i12, i11);
        zzaC(false, false);
        zzlq zzlqVar = this.zzs;
        for (zzln zzlnVarZzm = zzlqVar.zzm(); zzlnVarZzm != null; zzlnVarZzm = zzlnVarZzm.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z13 = this.zzG.zzp;
            zzlqVar.zzf(this.zzT);
            return;
        }
        int i13 = this.zzG.zze;
        if (i13 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i13 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzV() throws zziw {
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzmpVarArr[i10].zzz(this.zzC ? this.zzB : null);
            i10++;
        }
    }

    private final void zzW(boolean z10, boolean z11) {
        zzX(z10 || !this.zzQ, false, true, false);
        this.zzH.zza(z11 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    @Nullable
    private static Pair zzaD(zzbf zzbfVar, zzle zzleVar, boolean z10, int i10, boolean z11, zzbe zzbeVar, zzbd zzbdVar) {
        zzbf zzbfVar2 = zzleVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        zzbf zzbfVar3 = true == zzbfVar2.zzg() ? zzbfVar : zzbfVar2;
        try {
            Pair pairZzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzleVar.zzb, zzleVar.zzc);
            if (zzbfVar.equals(zzbfVar3)) {
                return pairZzm;
            }
            if (zzbfVar.zze(pairZzm.first) != -1) {
                return (zzbfVar3.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(pairZzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzleVar.zzc) : pairZzm;
            }
            int iZzr = zzr(zzbeVar, zzbdVar, i10, z11, pairZzm.first, zzbfVar3, zzbfVar);
            if (iZzr != -1) {
                return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static final boolean zzaF(@Nullable zzln zzlnVar) {
        if (zzlnVar != null) {
            try {
                if (zzlnVar.zze) {
                    zzyc[] zzycVarArr = zzlnVar.zzc;
                    for (int i10 = 0; i10 < 2; i10++) {
                        zzyc zzycVar = zzycVarArr[i10];
                        if (zzycVar != null) {
                            zzycVar.zzc();
                        }
                    }
                } else {
                    zzlnVar.zza.zzc();
                }
                if (zzlnVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zziw {
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int iZzd = zzmpVarArr[i10].zzd();
            zzmpVarArr[i10].zzA(this.zzo);
            zzN(i10, false);
            this.zzR -= iZzd;
            i10++;
        }
    }

    public static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i10, boolean z10, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        Object obj2 = zzbfVar.zzb(zzbfVar.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i11 = 0; i11 < zzbfVar2.zza(); i11++) {
            if (zzbfVar2.zzb(i11, zzbeVar, 0L).zzb.equals(obj2)) {
                return i11;
            }
        }
        int iZze = zzbfVar.zze(obj);
        int iZzc = zzbfVar.zzc();
        int iZzl = iZze;
        int iZze2 = -1;
        for (int i12 = 0; i12 < iZzc && iZze2 == -1; i12++) {
            iZzl = zzbfVar.zzl(iZzl, zzbdVar, zzbeVar, i10, z10);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar.zzf(iZzl));
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    /* JADX WARN: Code duplicated, block: B:234:0x056d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0575  */
    /* JADX WARN: Code duplicated, block: B:277:0x0631 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, PHI: r7
  0x0631: PHI (r7v6 long) = (r7v8 long), (r7v9 long) binds: [B:276:0x062f, B:272:0x061f] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:284:0x063d A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x0645 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:295:0x0678 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, LOOP:18: B:293:0x0675->B:295:0x0678, LOOP_END, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:298:0x0686 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:313:0x06c4 A[Catch: RuntimeException -> 0x0852, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0852, blocks: (B:330:0x06f4, B:357:0x0776, B:360:0x0783, B:362:0x0787, B:364:0x078d, B:366:0x0793, B:368:0x079d, B:373:0x07a7, B:375:0x07b0, B:385:0x07db, B:309:0x06ba, B:313:0x06c4), top: B:653:0x06ba }] */
    /* JADX WARN: Code duplicated, block: B:317:0x06ca A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x06d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:320:0x06d3 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:327:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:332:0x06fa A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:355:0x0773  */
    /* JADX WARN: Code duplicated, block: B:360:0x0783 A[Catch: RuntimeException -> 0x0852, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #2 {RuntimeException -> 0x0852, blocks: (B:330:0x06f4, B:357:0x0776, B:360:0x0783, B:362:0x0787, B:364:0x078d, B:366:0x0793, B:368:0x079d, B:373:0x07a7, B:375:0x07b0, B:385:0x07db, B:309:0x06ba, B:313:0x06c4), top: B:653:0x06ba }] */
    /* JADX WARN: Code duplicated, block: B:371:0x07a3 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:377:0x07c2 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:379:0x07ca A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:381:0x07d2 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_LEAVE, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Code duplicated, block: B:384:0x07da  */
    /* JADX WARN: Code duplicated, block: B:389:0x0808 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:393:0x0813 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, LOOP:12: B:392:0x0811->B:393:0x0813, LOOP_END, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:396:0x0822 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:400:0x0832 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:402:0x0838 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:460:0x0930 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:462:0x0936 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:464:0x093a A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:465:0x0940  */
    /* JADX WARN: Code duplicated, block: B:466:0x0942  */
    /* JADX WARN: Code duplicated, block: B:467:0x0944 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:469:0x0948 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:471:0x095a A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:472:0x0963  */
    /* JADX WARN: Code duplicated, block: B:478:0x097a  */
    /* JADX WARN: Code duplicated, block: B:484:0x098b  */
    /* JADX WARN: Code duplicated, block: B:489:0x09d9 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:491:0x09e6 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:492:0x09f3 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:494:0x09fa A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:496:0x09fe A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:498:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:499:0x0a05 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:500:0x0a07 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:502:0x0a17 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:504:0x0a1d A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:506:0x0a27 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, LOOP:7: B:505:0x0a25->B:506:0x0a27, LOOP_END, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:535:0x0a9c A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:573:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:577:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:627:0x0beb  */
    /* JADX WARN: Code duplicated, block: B:629:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:632:0x0bfa  */
    /* JADX WARN: Code duplicated, block: B:634:0x0c06 A[LOOP:20: B:634:0x0c06->B:636:0x0c10, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:636:0x0c10 A[LOOP:20: B:634:0x0c06->B:636:0x0c10, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:697:0x083d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x0692 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x066b A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:504:0x0a1d, please report this as an issue */
    /* JADX WARN: Not found block with instruction: 0x08bf: MOVE (r3v100 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0af7: MOVE (r13 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:566:0x0af6 */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0af9: MOVE (r12 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:566:0x0af6 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String str;
        String str2;
        String str3;
        zziw zziwVarZzd;
        zziw zziwVar;
        zziw zziwVar2;
        boolean z10;
        int i10;
        zzlq zzlqVar;
        zzwk zzwkVar;
        zzln zzlnVarZzn;
        String str4;
        RuntimeException runtimeException;
        int i11;
        String str5;
        String str6;
        long j10;
        zzlq zzlqVar2;
        int i12;
        zzaak zzaakVar;
        long j11;
        long jZzc;
        int i13;
        int i14;
        zzaak zzaakVar2;
        zzaac[] zzaacVarArr;
        zzmp[] zzmpVarArr;
        int i15;
        zzmp zzmpVar;
        long j12;
        long jZza;
        zzln zzlnVarZzn2;
        int i16;
        boolean z11;
        int i17;
        zzln zzlnVarZzm;
        zzln zzlnVarZzp;
        zzln zzlnVarZzr;
        boolean z12;
        int i18;
        zzaak zzaakVarZzr;
        int i19;
        zzmp[] zzmpVarArr2;
        zzmp[] zzmpVarArr3;
        int i20;
        zzwk zzwkVar2;
        zzwk zzwkVar3;
        zzln zzlnVarZzo;
        int i21;
        zzlo zzloVarZzh;
        zzln zzlnVar;
        boolean z13;
        boolean z14;
        zzmd zzmdVar;
        zzln zzlnVarZzm2;
        int i22;
        zzln zzlnVarZzm3;
        long jZze;
        zzln zzlnVarZzk;
        boolean z15;
        boolean z16;
        boolean zZzi;
        String str7 = "ExoPlayerImplInternal";
        boolean z17 = true;
        try {
            try {
                try {
                    zzd zzdVar = null;
                    try {
                        try {
                            try {
                                switch (message.what) {
                                    case 1:
                                        boolean z18 = message.arg1 != 0;
                                        int i23 = message.arg2;
                                        zzE(z18, i23 >> 4, true, i23 & 15);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 2:
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        zzdx zzdxVar = this.zzi;
                                        zzdxVar.zzk(2);
                                        if (this.zzG.zza.zzg()) {
                                            j10 = jUptimeMillis;
                                            i17 = 2;
                                        } else {
                                            try {
                                                if (this.zzt.zzb()) {
                                                    zzlq zzlqVar3 = this.zzs;
                                                    zzlqVar3.zzf(this.zzT);
                                                    if (zzlqVar3.zzg() && (zzloVarZzh = zzlqVar3.zzh(this.zzT, this.zzG)) != null) {
                                                        zzln zzlnVarZzi = zzlqVar3.zzi(zzloVarZzh);
                                                        if (!zzlnVarZzi.zzd) {
                                                            zzlnVarZzi.zzt(this, zzloVarZzh.zzb);
                                                        } else if (zzlnVarZzi.zze) {
                                                            zzdxVar.zzd(8, zzlnVarZzi.zza).zza();
                                                        }
                                                        if (zzlqVar3.zzm() == zzlnVarZzi) {
                                                            zzU(zzloVarZzh.zzb, true);
                                                        }
                                                        zzas(false);
                                                    }
                                                    if (this.zzN) {
                                                        this.zzN = zzaF(zzlqVar3.zzk());
                                                        zzan();
                                                    } else {
                                                        zzam();
                                                    }
                                                    if (this.zzK || !this.zzy || this.zzab || zzaz() || (zzlnVarZzo = zzlqVar3.zzo()) == null || zzlnVarZzo != zzlqVar3.zzn() || zzlnVarZzo.zzp() == null || !zzlnVarZzo.zzp().zze || zzav(zzlnVarZzo.zzp()) > 10000000) {
                                                        j10 = jUptimeMillis;
                                                    } else {
                                                        zzlqVar3.zzq();
                                                        zzln zzlnVarZzo2 = zzlqVar3.zzo();
                                                        if (zzlnVarZzo2 != null) {
                                                            zzaak zzaakVarZzr2 = zzlnVarZzo2.zzr();
                                                            int i24 = 0;
                                                            while (true) {
                                                                zzmp[] zzmpVarArr4 = this.zzb;
                                                                if (i24 < 2) {
                                                                    if (zzaakVarZzr2.zza(i24) && zzmpVarArr4[i24].zza() && !zzmpVarArr4[i24].zzc()) {
                                                                        zzmpVarArr4[i24].zzb();
                                                                        i21 = i24;
                                                                        zzar(zzlnVarZzo2, i21, false, zzlnVarZzo2.zzc());
                                                                    } else {
                                                                        i21 = i24;
                                                                    }
                                                                    i24 = i21 + 1;
                                                                    zzlnVarZzo2 = zzlnVarZzo2;
                                                                    zzaakVarZzr2 = zzaakVarZzr2;
                                                                    jUptimeMillis = jUptimeMillis;
                                                                } else {
                                                                    j10 = jUptimeMillis;
                                                                    zzln zzlnVar2 = zzlnVarZzo2;
                                                                    if (zzaz()) {
                                                                        this.zzaa = zzlnVar2.zza.zzh();
                                                                        if (!zzlnVar2.zzd()) {
                                                                            zzlqVar3.zzs(zzlnVar2);
                                                                            zzas(false);
                                                                            zzam();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            j10 = jUptimeMillis;
                                                        }
                                                    }
                                                    zzln zzlnVarZzn3 = zzlqVar3.zzn();
                                                    try {
                                                        try {
                                                            if (zzlnVarZzn3 == null) {
                                                                zzlqVar2 = zzlqVar3;
                                                                str = "Playback error";
                                                                j11 = -9223372036854775807L;
                                                                i12 = -1;
                                                                zzlnVarZzn2 = zzlqVar2.zzn();
                                                                if (zzlnVarZzn2 != null) {
                                                                    i16 = 2;
                                                                } else {
                                                                    i16 = 2;
                                                                }
                                                                z11 = false;
                                                                while (zzax()) {
                                                                    if (z11) {
                                                                        zzC();
                                                                    }
                                                                    this.zzab = false;
                                                                    zzlnVarZzr = zzlqVar2.zzr();
                                                                    zzlnVarZzr.getClass();
                                                                    if (this.zzG.zzb.zza.equals(zzlnVarZzr.zzg.zza.zza)) {
                                                                        zzwkVar2 = this.zzG.zzb;
                                                                        if (zzwkVar2.zzb == i12) {
                                                                            zzwkVar3 = zzlnVarZzr.zzg.zza;
                                                                            if (zzwkVar3.zzb == i12) {
                                                                                z12 = false;
                                                                            } else {
                                                                                z12 = false;
                                                                            }
                                                                        } else {
                                                                            z12 = false;
                                                                        }
                                                                    } else {
                                                                        z12 = false;
                                                                    }
                                                                    zzlo zzloVar = zzlnVarZzr.zzg;
                                                                    zzwk zzwkVar4 = zzloVar.zza;
                                                                    long j13 = zzloVar.zzb;
                                                                    String str8 = str7;
                                                                    i18 = i16;
                                                                    this.zzG = zzao(zzwkVar4, j13, zzloVar.zzc, j13, !z12, 0);
                                                                    zzaj();
                                                                    zzL();
                                                                    if (zzaz()) {
                                                                        zzmpVarArr3 = this.zzb;
                                                                        for (i20 = 0; i20 < i18; i20++) {
                                                                            zzmpVarArr3[i20].zzB();
                                                                        }
                                                                    }
                                                                    if (this.zzG.zze == 3) {
                                                                        zzJ();
                                                                    }
                                                                    zzaakVarZzr = zzlqVar2.zzm().zzr();
                                                                    i19 = 0;
                                                                    while (true) {
                                                                        zzmpVarArr2 = this.zzb;
                                                                        if (i19 < i18) {
                                                                            if (zzaakVarZzr.zza(i19)) {
                                                                                zzmpVarArr2[i19].zzl();
                                                                            }
                                                                            i19++;
                                                                        }
                                                                    }
                                                                    i16 = i18;
                                                                    str7 = str8;
                                                                    j11 = -9223372036854775807L;
                                                                    z11 = true;
                                                                    i12 = -1;
                                                                    break;
                                                                }
                                                                i17 = i16;
                                                                long j14 = this.zzZ.zzb;
                                                            } else if (zzlnVarZzn3.zzp() != null) {
                                                                try {
                                                                    if (this.zzK) {
                                                                        zzlqVar2 = zzlqVar3;
                                                                        str = "Playback error";
                                                                        j11 = -9223372036854775807L;
                                                                        i12 = -1;
                                                                        try {
                                                                            if (zzlnVarZzn3.zzg.zzj || this.zzK) {
                                                                                zzmpVarArr = this.zzb;
                                                                                for (i15 = 0; i15 < 2; i15++) {
                                                                                    zzmpVar = zzmpVarArr[i15];
                                                                                    if (!zzmpVar.zzp(zzlnVarZzn3) && zzmpVar.zzg(zzlnVarZzn3)) {
                                                                                        j12 = zzlnVarZzn3.zzg.zze;
                                                                                        if (j12 != -9223372036854775807L || j12 == Long.MIN_VALUE) {
                                                                                            jZza = -9223372036854775807L;
                                                                                        } else {
                                                                                            jZza = j12 + zzlnVarZzn3.zza();
                                                                                        }
                                                                                        zzmpVar.zzh(zzlnVarZzn3, jZza);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (RuntimeException e10) {
                                                                            e = e10;
                                                                            str4 = str7;
                                                                            runtimeException = e;
                                                                            if (!(runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) {
                                                                                i11 = 1004;
                                                                            } else {
                                                                                i11 = 1000;
                                                                            }
                                                                            zziw zziwVarZzc = zziw.zzc(runtimeException, i11);
                                                                            zzee.zzf(str4, str, zziwVarZzc);
                                                                            zzW(true, false);
                                                                            this.zzG = this.zzG.zzf(zziwVarZzc);
                                                                        }
                                                                    } else {
                                                                        zzln zzlnVarZzn4 = zzlqVar3.zzn();
                                                                        if (zzlnVarZzn4.zze) {
                                                                            int i25 = 0;
                                                                            while (true) {
                                                                                zzmp[] zzmpVarArr5 = this.zzb;
                                                                                if (i25 < 2) {
                                                                                    if (zzmpVarArr5[i25].zzr(zzlnVarZzn4)) {
                                                                                        i25++;
                                                                                    }
                                                                                } else if ((!zzaz() || zzlqVar3.zzo() != zzlqVar3.zzn()) && ((zzlnVarZzn3.zzp().zze || this.zzT >= zzlnVarZzn3.zzp().zzc()) && (!zzlnVarZzn3.zzp().zze || zzav(zzlnVarZzn3.zzp()) <= 10000000))) {
                                                                                    zzaak zzaakVarZzr3 = zzlnVarZzn3.zzr();
                                                                                    zzln zzlnVarZzp2 = zzlqVar3.zzp();
                                                                                    zzaak zzaakVarZzr4 = zzlnVarZzp2.zzr();
                                                                                    zzbf zzbfVar = this.zzG.zza;
                                                                                    zzaak zzaakVar3 = zzaakVarZzr4;
                                                                                    zzlqVar2 = zzlqVar3;
                                                                                    str = "Playback error";
                                                                                    i12 = -1;
                                                                                    zzag(zzbfVar, zzlnVarZzp2.zzg.zza, zzbfVar, zzlnVarZzn3.zzg.zza, -9223372036854775807L, false);
                                                                                    if (zzlnVarZzp2.zze) {
                                                                                        boolean z19 = this.zzy;
                                                                                        if (z19) {
                                                                                            j11 = -9223372036854775807L;
                                                                                            if (this.zzaa != -9223372036854775807L) {
                                                                                                this.zzaa = j11;
                                                                                                if (z19 && !this.zzab) {
                                                                                                    i14 = 0;
                                                                                                    while (true) {
                                                                                                        if (i14 < 2) {
                                                                                                            zzaakVar2 = zzaakVar3;
                                                                                                            if (zzaakVar2.zza(i14)) {
                                                                                                                zzmpVarArr5[i14].zze();
                                                                                                                zzaacVarArr = zzaakVar2.zzc;
                                                                                                                if (zzas.zzd(zzaacVarArr[i14].zzc().zzo, zzaacVarArr[i14].zzc().zzk) || zzmpVarArr5[i14].zzc()) {
                                                                                                                }
                                                                                                            }
                                                                                                            i14++;
                                                                                                            zzaakVar3 = zzaakVar2;
                                                                                                        } else {
                                                                                                            zzaakVar = zzaakVar3;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                jZzc = zzlnVarZzp2.zzc();
                                                                                                for (i13 = 0; i13 < 2; i13++) {
                                                                                                    zzmpVarArr5[i13].zzj(jZzc);
                                                                                                }
                                                                                                if (!zzlnVarZzp2.zzd()) {
                                                                                                    zzlqVar2.zzs(zzlnVarZzp2);
                                                                                                    zzas(false);
                                                                                                    zzam();
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            j11 = -9223372036854775807L;
                                                                                        }
                                                                                        if (zzlnVarZzp2.zza.zzh() != j11) {
                                                                                            this.zzaa = j11;
                                                                                            if (z19) {
                                                                                                i14 = 0;
                                                                                                while (true) {
                                                                                                    if (i14 < 2) {
                                                                                                        zzaakVar2 = zzaakVar3;
                                                                                                        if (zzaakVar2.zza(i14)) {
                                                                                                            zzmpVarArr5[i14].zze();
                                                                                                            zzaacVarArr = zzaakVar2.zzc;
                                                                                                            if (zzas.zzd(zzaacVarArr[i14].zzc().zzo, zzaacVarArr[i14].zzc().zzk)) {
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        i14++;
                                                                                                        zzaakVar3 = zzaakVar2;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            jZzc = zzlnVarZzp2.zzc();
                                                                                            while (i13 < 2) {
                                                                                                zzmpVarArr5[i13].zzj(jZzc);
                                                                                            }
                                                                                            if (!zzlnVarZzp2.zzd()) {
                                                                                                zzlqVar2.zzs(zzlnVarZzp2);
                                                                                                zzas(false);
                                                                                                zzam();
                                                                                            }
                                                                                        }
                                                                                        zzaakVar = zzaakVar3;
                                                                                    } else {
                                                                                        zzaakVar = zzaakVar3;
                                                                                        j11 = -9223372036854775807L;
                                                                                    }
                                                                                    for (int i26 = 0; i26 < 2; i26++) {
                                                                                        zzmpVarArr5[i26].zzi(zzaakVarZzr3, zzaakVar, zzlnVarZzp2.zzc());
                                                                                    }
                                                                                }
                                                                                zzlqVar2 = zzlqVar3;
                                                                                str = "Playback error";
                                                                                j11 = -9223372036854775807L;
                                                                                i12 = -1;
                                                                            }
                                                                        } else {
                                                                            zzlqVar2 = zzlqVar3;
                                                                            str = "Playback error";
                                                                            j11 = -9223372036854775807L;
                                                                            i12 = -1;
                                                                        }
                                                                    }
                                                                    zzlnVarZzn2 = zzlqVar2.zzn();
                                                                    if (zzlnVarZzn2 != null || zzlqVar2.zzm() == zzlnVarZzn2 || zzlnVarZzn2.zzh) {
                                                                        i16 = 2;
                                                                    } else {
                                                                        zzln zzlnVarZzn5 = zzlqVar2.zzn();
                                                                        zzaak zzaakVarZzr5 = zzlnVarZzn5.zzr();
                                                                        int i27 = 0;
                                                                        int i28 = 1;
                                                                        while (true) {
                                                                            zzmp[] zzmpVarArr6 = this.zzb;
                                                                            if (i27 < 2) {
                                                                                int iZzd = zzmpVarArr6[i27].zzd();
                                                                                int iZzH = zzmpVarArr6[i27].zzH(zzlnVarZzn5, zzaakVarZzr5, this.zzo);
                                                                                this.zzR -= iZzd - zzmpVarArr6[i27].zzd();
                                                                                i28 &= iZzH & 1;
                                                                                i27++;
                                                                            } else if (i28 != 0) {
                                                                                int i29 = 0;
                                                                                int i30 = 2;
                                                                                while (i29 < i30) {
                                                                                    if (zzaakVarZzr5.zza(i29) && !zzmpVarArr6[i29].zzp(zzlnVarZzn5)) {
                                                                                        zzar(zzlnVarZzn5, i29, false, zzlnVarZzn5.zzc());
                                                                                    }
                                                                                    i29++;
                                                                                    i30 = i30;
                                                                                }
                                                                                i16 = i30;
                                                                                zzlqVar2.zzn().zzh = true;
                                                                            } else {
                                                                                i16 = 2;
                                                                            }
                                                                        }
                                                                    }
                                                                    z11 = false;
                                                                    while (zzax() && !this.zzK && (zzlnVarZzm = zzlqVar2.zzm()) != null && (zzlnVarZzp = zzlnVarZzm.zzp()) != null && this.zzT >= zzlnVarZzp.zzc() && zzlnVarZzp.zzh) {
                                                                        if (z11) {
                                                                            zzC();
                                                                        }
                                                                        this.zzab = false;
                                                                        zzlnVarZzr = zzlqVar2.zzr();
                                                                        zzlnVarZzr.getClass();
                                                                        if (this.zzG.zzb.zza.equals(zzlnVarZzr.zzg.zza.zza)) {
                                                                            zzwkVar2 = this.zzG.zzb;
                                                                            if (zzwkVar2.zzb == i12) {
                                                                                zzwkVar3 = zzlnVarZzr.zzg.zza;
                                                                                if (zzwkVar3.zzb == i12 || zzwkVar2.zze == zzwkVar3.zze) {
                                                                                    z12 = false;
                                                                                } else {
                                                                                    z12 = true;
                                                                                }
                                                                            } else {
                                                                                z12 = false;
                                                                            }
                                                                        } else {
                                                                            z12 = false;
                                                                        }
                                                                        zzlo zzloVar2 = zzlnVarZzr.zzg;
                                                                        zzwk zzwkVar5 = zzloVar2.zza;
                                                                        long j15 = zzloVar2.zzb;
                                                                        String str9 = str7;
                                                                        i18 = i16;
                                                                        this.zzG = zzao(zzwkVar5, j15, zzloVar2.zzc, j15, !z12, 0);
                                                                        zzaj();
                                                                        zzL();
                                                                        if (zzaz() && zzlnVarZzr == zzlqVar2.zzo()) {
                                                                            zzmpVarArr3 = this.zzb;
                                                                            while (i20 < i18) {
                                                                                zzmpVarArr3[i20].zzB();
                                                                            }
                                                                        }
                                                                        if (this.zzG.zze == 3) {
                                                                            zzJ();
                                                                        }
                                                                        zzaakVarZzr = zzlqVar2.zzm().zzr();
                                                                        i19 = 0;
                                                                        while (true) {
                                                                            zzmpVarArr2 = this.zzb;
                                                                            if (i19 < i18) {
                                                                                if (zzaakVarZzr.zza(i19)) {
                                                                                    zzmpVarArr2[i19].zzl();
                                                                                }
                                                                                i19++;
                                                                            }
                                                                        }
                                                                        i16 = i18;
                                                                        str7 = str9;
                                                                        j11 = -9223372036854775807L;
                                                                        z11 = true;
                                                                        i12 = -1;
                                                                        break;
                                                                    }
                                                                    i17 = i16;
                                                                    long j16 = this.zzZ.zzb;
                                                                } catch (RuntimeException e11) {
                                                                    e = e11;
                                                                    str = "Playback error";
                                                                    runtimeException = e;
                                                                    str4 = str7;
                                                                    if (runtimeException instanceof IllegalStateException) {
                                                                        i11 = 1004;
                                                                    } else {
                                                                        i11 = 1004;
                                                                    }
                                                                    zziw zziwVarZzc2 = zziw.zzc(runtimeException, i11);
                                                                    zzee.zzf(str4, str, zziwVarZzc2);
                                                                    zzW(true, false);
                                                                    this.zzG = this.zzG.zzf(zziwVarZzc2);
                                                                }
                                                            } else {
                                                                zzlqVar2 = zzlqVar3;
                                                                str = "Playback error";
                                                                j11 = -9223372036854775807L;
                                                                i12 = -1;
                                                                if (zzlnVarZzn3.zzg.zzj) {
                                                                    zzmpVarArr = this.zzb;
                                                                    while (i15 < 2) {
                                                                        zzmpVar = zzmpVarArr[i15];
                                                                        if (!zzmpVar.zzp(zzlnVarZzn3)) {
                                                                            j12 = zzlnVarZzn3.zzg.zze;
                                                                            if (j12 != -9223372036854775807L) {
                                                                                jZza = -9223372036854775807L;
                                                                            } else {
                                                                                jZza = -9223372036854775807L;
                                                                            }
                                                                            zzmpVar.zzh(zzlnVarZzn3, jZza);
                                                                        }
                                                                    }
                                                                } else {
                                                                    zzmpVarArr = this.zzb;
                                                                    while (i15 < 2) {
                                                                        zzmpVar = zzmpVarArr[i15];
                                                                        if (!zzmpVar.zzp(zzlnVarZzn3)) {
                                                                            j12 = zzlnVarZzn3.zzg.zze;
                                                                            if (j12 != -9223372036854775807L) {
                                                                                jZza = -9223372036854775807L;
                                                                            } else {
                                                                                jZza = -9223372036854775807L;
                                                                            }
                                                                            zzmpVar.zzh(zzlnVarZzn3, jZza);
                                                                        }
                                                                    }
                                                                }
                                                                zzlnVarZzn2 = zzlqVar2.zzn();
                                                                if (zzlnVarZzn2 != null) {
                                                                    i16 = 2;
                                                                } else {
                                                                    i16 = 2;
                                                                }
                                                                z11 = false;
                                                                while (zzax()) {
                                                                    if (z11) {
                                                                        zzC();
                                                                    }
                                                                    this.zzab = false;
                                                                    zzlnVarZzr = zzlqVar2.zzr();
                                                                    zzlnVarZzr.getClass();
                                                                    if (this.zzG.zzb.zza.equals(zzlnVarZzr.zzg.zza.zza)) {
                                                                        zzwkVar2 = this.zzG.zzb;
                                                                        if (zzwkVar2.zzb == i12) {
                                                                            zzwkVar3 = zzlnVarZzr.zzg.zza;
                                                                            if (zzwkVar3.zzb == i12) {
                                                                                z12 = false;
                                                                            } else {
                                                                                z12 = false;
                                                                            }
                                                                        } else {
                                                                            z12 = false;
                                                                        }
                                                                    } else {
                                                                        z12 = false;
                                                                    }
                                                                    zzlo zzloVar3 = zzlnVarZzr.zzg;
                                                                    zzwk zzwkVar6 = zzloVar3.zza;
                                                                    long j17 = zzloVar3.zzb;
                                                                    String str10 = str7;
                                                                    i18 = i16;
                                                                    this.zzG = zzao(zzwkVar6, j17, zzloVar3.zzc, j17, !z12, 0);
                                                                    zzaj();
                                                                    zzL();
                                                                    if (zzaz()) {
                                                                        zzmpVarArr3 = this.zzb;
                                                                        while (i20 < i18) {
                                                                            zzmpVarArr3[i20].zzB();
                                                                        }
                                                                    }
                                                                    if (this.zzG.zze == 3) {
                                                                        zzJ();
                                                                    }
                                                                    zzaakVarZzr = zzlqVar2.zzm().zzr();
                                                                    i19 = 0;
                                                                    while (true) {
                                                                        zzmpVarArr2 = this.zzb;
                                                                        if (i19 < i18) {
                                                                            if (zzaakVarZzr.zza(i19)) {
                                                                                zzmpVarArr2[i19].zzl();
                                                                            }
                                                                            i19++;
                                                                        }
                                                                    }
                                                                    i16 = i18;
                                                                    str7 = str10;
                                                                    j11 = -9223372036854775807L;
                                                                    z11 = true;
                                                                    i12 = -1;
                                                                    break;
                                                                }
                                                                i17 = i16;
                                                                long j18 = this.zzZ.zzb;
                                                            }
                                                        } catch (RuntimeException e12) {
                                                            e = e12;
                                                        }
                                                    } catch (zziw e13) {
                                                        e = e13;
                                                        zziwVarZzd = e;
                                                        str3 = str7;
                                                        str2 = str;
                                                        if (zziwVarZzd.zzc == 1 && (zzlnVarZzn = this.zzs.zzn()) != null && zziwVarZzd.zzh == null) {
                                                            zziwVarZzd = zziwVarZzd.zzd(zzlnVarZzn.zzg.zza);
                                                        }
                                                        if (zziwVarZzd.zzc != 1 || (zzwkVar = zziwVarZzd.zzh) == null) {
                                                            zziwVar = this.zzX;
                                                            if (zziwVar != null) {
                                                                zziwVar.addSuppressed(zziwVarZzd);
                                                                zziwVarZzd = this.zzX;
                                                            }
                                                            zziwVar2 = zziwVarZzd;
                                                            if (zziwVar2.zzc == 1) {
                                                                zzlqVar = this.zzs;
                                                                if (zzlqVar.zzm() != zzlqVar.zzn()) {
                                                                    while (zzlqVar.zzm() != zzlqVar.zzn()) {
                                                                        zzlqVar.zzr();
                                                                    }
                                                                    zzln zzlnVarZzm4 = zzlqVar.zzm();
                                                                    zzlnVarZzm4.getClass();
                                                                    zzC();
                                                                    zzlo zzloVar4 = zzlnVarZzm4.zzg;
                                                                    zzwk zzwkVar7 = zzloVar4.zza;
                                                                    long j19 = zzloVar4.zzb;
                                                                    this.zzG = zzao(zzwkVar7, j19, zzloVar4.zzc, j19, true, 0);
                                                                }
                                                            }
                                                            if (zziwVar2.zzi || !(this.zzX == null || (i10 = zziwVar2.zza) == 5004 || i10 == 5003)) {
                                                                zzee.zzf(str3, str2, zziwVar2);
                                                                z10 = true;
                                                                zzW(true, false);
                                                                this.zzG = this.zzG.zzf(zziwVar2);
                                                            } else {
                                                                zzee.zzd(str3, "Recoverable renderer error", zziwVar2);
                                                                if (this.zzX == null) {
                                                                    this.zzX = zziwVar2;
                                                                }
                                                                zzdx zzdxVar2 = this.zzi;
                                                                zzdxVar2.zzg(zzdxVar2.zzd(25, zziwVar2));
                                                                z10 = true;
                                                            }
                                                        } else {
                                                            int i31 = zziwVarZzd.zze;
                                                            zzlq zzlqVar4 = this.zzs;
                                                            if (zzlqVar4.zzo() != null && zzlqVar4.zzo().zzg.zza.equals(zzwkVar) && this.zzb[i31].zzq(zzlqVar4.zzo())) {
                                                                this.zzab = true;
                                                                zzab();
                                                                zzln zzlnVarZzo3 = zzlqVar4.zzo();
                                                                zzln zzlnVarZzm5 = zzlqVar4.zzm();
                                                                if (zzlqVar4.zzm() != zzlnVarZzo3) {
                                                                    while (zzlnVarZzm5 != null && zzlnVarZzm5.zzp() != zzlnVarZzo3) {
                                                                        zzlnVarZzm5 = zzlnVarZzm5.zzp();
                                                                    }
                                                                }
                                                                zzlqVar4.zzs(zzlnVarZzm5);
                                                                if (this.zzG.zze != 4) {
                                                                    zzam();
                                                                    this.zzi.zzh(2);
                                                                }
                                                            } else {
                                                                zziwVar = this.zzX;
                                                                if (zziwVar != null) {
                                                                    zziwVar.addSuppressed(zziwVarZzd);
                                                                    zziwVarZzd = this.zzX;
                                                                }
                                                                zziwVar2 = zziwVarZzd;
                                                                if (zziwVar2.zzc == 1) {
                                                                    zzlqVar = this.zzs;
                                                                    if (zzlqVar.zzm() != zzlqVar.zzn()) {
                                                                        while (zzlqVar.zzm() != zzlqVar.zzn()) {
                                                                            zzlqVar.zzr();
                                                                        }
                                                                        zzln zzlnVarZzm6 = zzlqVar.zzm();
                                                                        zzlnVarZzm6.getClass();
                                                                        zzC();
                                                                        zzlo zzloVar5 = zzlnVarZzm6.zzg;
                                                                        zzwk zzwkVar8 = zzloVar5.zza;
                                                                        long j110 = zzloVar5.zzb;
                                                                        this.zzG = zzao(zzwkVar8, j110, zzloVar5.zzc, j110, true, 0);
                                                                    }
                                                                }
                                                                if (zziwVar2.zzi) {
                                                                }
                                                                zzee.zzf(str3, str2, zziwVar2);
                                                                z10 = true;
                                                                zzW(true, false);
                                                                this.zzG = this.zzG.zzf(zziwVar2);
                                                            }
                                                            z10 = true;
                                                        }
                                                    }
                                                    zzC();
                                                    return z10;
                                                }
                                                j10 = jUptimeMillis;
                                                i17 = 2;
                                            } catch (zziw e14) {
                                                e = e14;
                                                str = "Playback error";
                                            }
                                        }
                                        int i32 = this.zzG.zze;
                                        if (i32 != 1) {
                                            if (i32 != 4) {
                                                zzlq zzlqVar5 = this.zzs;
                                                zzln zzlnVarZzm7 = zzlqVar5.zzm();
                                                if (zzlnVarZzm7 == null) {
                                                    zzQ(j10);
                                                } else {
                                                    long j20 = j10;
                                                    Trace.beginSection("doSomeWork");
                                                    zzL();
                                                    if (zzlnVarZzm7.zze) {
                                                        this.zzU = zzfj.zzq(SystemClock.elapsedRealtime());
                                                        zzlnVarZzm7.zza.zzf(this.zzG.zzs - this.zzn, false);
                                                        z13 = true;
                                                        int i33 = 0;
                                                        z14 = true;
                                                        while (true) {
                                                            zzmp[] zzmpVarArr7 = this.zzb;
                                                            if (i33 < i17) {
                                                                zzmp zzmpVar2 = zzmpVarArr7[i33];
                                                                if (zzmpVar2.zzd() == 0) {
                                                                    zzN(i33, false);
                                                                } else {
                                                                    zzmpVar2.zzs(this.zzT, this.zzU);
                                                                    z14 = z14 && zzmpVar2.zzo();
                                                                    boolean zZzt = zzmpVar2.zzt(r47);
                                                                    zzN(i33, zZzt);
                                                                    z13 = z13 && zZzt;
                                                                    if (!zZzt) {
                                                                        zzay(i33);
                                                                    }
                                                                }
                                                                i33++;
                                                                zzlnVarZzm7 = zzlnVarZzm7;
                                                            } else {
                                                                zzlnVar = zzlnVarZzm7;
                                                            }
                                                        }
                                                    } else {
                                                        zzlnVar = zzlnVarZzm7;
                                                        zzlnVar.zza.zzc();
                                                        z13 = true;
                                                        z14 = true;
                                                    }
                                                    long j21 = zzlnVar.zzg.zze;
                                                    if (z14 && zzlnVar.zze && (j21 == -9223372036854775807L || j21 <= this.zzG.zzs)) {
                                                        if (this.zzK) {
                                                            this.zzK = false;
                                                            zzE(false, this.zzG.zzn, false, 5);
                                                        }
                                                        if (zzlnVar.zzg.zzj) {
                                                            zzB(4);
                                                            zzK();
                                                        } else {
                                                            zzmdVar = this.zzG;
                                                            if (zzmdVar.zze != i17) {
                                                                if (this.zzR == 0) {
                                                                    zZzi = zzae();
                                                                } else {
                                                                    if (z13) {
                                                                        if (zzmdVar.zzg) {
                                                                            zzlnVarZzm3 = zzlqVar5.zzm();
                                                                            if (zzP(this.zzG.zza, zzlnVarZzm3.zzg.zza)) {
                                                                                jZze = this.zzad.zze();
                                                                            } else {
                                                                                jZze = -9223372036854775807L;
                                                                            }
                                                                            zzlnVarZzk = zzlqVar5.zzk();
                                                                            if (zzlnVarZzk.zzd()) {
                                                                                z15 = false;
                                                                            } else {
                                                                                z15 = false;
                                                                            }
                                                                            if (zzlnVarZzk.zzg.zza.zzb()) {
                                                                                z16 = false;
                                                                            } else {
                                                                                z16 = false;
                                                                            }
                                                                            if (z15) {
                                                                            }
                                                                        }
                                                                        zzB(3);
                                                                        this.zzX = null;
                                                                        if (zzax()) {
                                                                            zzaC(false, false);
                                                                            this.zzo.zza();
                                                                            zzJ();
                                                                        }
                                                                    }
                                                                    if (this.zzG.zze == 3) {
                                                                        if (this.zzR == 0) {
                                                                            if (!zzae()) {
                                                                                zzaC(zzax(), false);
                                                                                zzB(2);
                                                                                if (this.zzL) {
                                                                                    for (zzlnVarZzm2 = zzlqVar5.zzm(); zzlnVarZzm2 != null; zzlnVarZzm2 = zzlnVarZzm2.zzp()) {
                                                                                        for (zzaac zzaacVar : zzlnVarZzm2.zzr().zzc) {
                                                                                        }
                                                                                    }
                                                                                    this.zzad.zzc();
                                                                                }
                                                                                zzK();
                                                                            }
                                                                        } else if (!z13) {
                                                                            zzaC(zzax(), false);
                                                                            zzB(2);
                                                                            if (this.zzL) {
                                                                                while (zzlnVarZzm2 != null) {
                                                                                    while (i22 < r7) {
                                                                                    }
                                                                                }
                                                                                this.zzad.zzc();
                                                                            }
                                                                            zzK();
                                                                        }
                                                                    }
                                                                }
                                                                if (zZzi) {
                                                                    zzB(3);
                                                                    this.zzX = null;
                                                                    if (zzax()) {
                                                                        zzaC(false, false);
                                                                        this.zzo.zza();
                                                                        zzJ();
                                                                    }
                                                                } else if (this.zzG.zze == 3) {
                                                                    if (this.zzR == 0) {
                                                                        if (!zzae()) {
                                                                            zzaC(zzax(), false);
                                                                            zzB(2);
                                                                            if (this.zzL) {
                                                                                while (zzlnVarZzm2 != null) {
                                                                                    while (i22 < r7) {
                                                                                    }
                                                                                }
                                                                                this.zzad.zzc();
                                                                            }
                                                                            zzK();
                                                                        }
                                                                    } else if (!z13) {
                                                                        zzaC(zzax(), false);
                                                                        zzB(2);
                                                                        if (this.zzL) {
                                                                            while (zzlnVarZzm2 != null) {
                                                                                while (i22 < r7) {
                                                                                }
                                                                            }
                                                                            this.zzad.zzc();
                                                                        }
                                                                        zzK();
                                                                    }
                                                                }
                                                            } else if (this.zzG.zze == 3) {
                                                                if (this.zzR == 0) {
                                                                    if (!zzae()) {
                                                                        zzaC(zzax(), false);
                                                                        zzB(2);
                                                                        if (this.zzL) {
                                                                            while (zzlnVarZzm2 != null) {
                                                                                while (i22 < r7) {
                                                                                }
                                                                            }
                                                                            this.zzad.zzc();
                                                                        }
                                                                        zzK();
                                                                    }
                                                                } else if (!z13) {
                                                                    zzaC(zzax(), false);
                                                                    zzB(2);
                                                                    if (this.zzL) {
                                                                        while (zzlnVarZzm2 != null) {
                                                                            while (i22 < r7) {
                                                                            }
                                                                        }
                                                                        this.zzad.zzc();
                                                                    }
                                                                    zzK();
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        zzmdVar = this.zzG;
                                                        if (zzmdVar.zze != i17) {
                                                            if (this.zzR == 0) {
                                                                zZzi = zzae();
                                                            } else {
                                                                if (z13) {
                                                                    if (zzmdVar.zzg) {
                                                                        zzlnVarZzm3 = zzlqVar5.zzm();
                                                                        if (zzP(this.zzG.zza, zzlnVarZzm3.zzg.zza)) {
                                                                            jZze = this.zzad.zze();
                                                                        } else {
                                                                            jZze = -9223372036854775807L;
                                                                        }
                                                                        zzlnVarZzk = zzlqVar5.zzk();
                                                                        if (zzlnVarZzk.zzd() || !zzlnVarZzk.zzg.zzj) {
                                                                            z15 = false;
                                                                        } else {
                                                                            z15 = true;
                                                                        }
                                                                        if (zzlnVarZzk.zzg.zza.zzb() || zzlnVarZzk.zze) {
                                                                            z16 = false;
                                                                        } else {
                                                                            z16 = true;
                                                                        }
                                                                        if (z15 && !z16) {
                                                                            zZzi = this.zzg.zzi(new zzli(this.zzv, this.zzG.zza, zzlnVarZzm3.zzg.zza, this.zzT - zzlnVarZzm3.zza(), zzau(zzlnVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, jZze, this.zzM));
                                                                        }
                                                                    }
                                                                    zzB(3);
                                                                    this.zzX = null;
                                                                    if (zzax()) {
                                                                        zzaC(false, false);
                                                                        this.zzo.zza();
                                                                        zzJ();
                                                                    }
                                                                }
                                                                if (this.zzG.zze == 3) {
                                                                    if (this.zzR == 0) {
                                                                        if (!zzae()) {
                                                                            zzaC(zzax(), false);
                                                                            zzB(2);
                                                                            if (this.zzL) {
                                                                                while (zzlnVarZzm2 != null) {
                                                                                    while (i22 < r7) {
                                                                                    }
                                                                                }
                                                                                this.zzad.zzc();
                                                                            }
                                                                            zzK();
                                                                        }
                                                                    } else if (!z13) {
                                                                        zzaC(zzax(), false);
                                                                        zzB(2);
                                                                        if (this.zzL) {
                                                                            while (zzlnVarZzm2 != null) {
                                                                                while (i22 < r7) {
                                                                                }
                                                                            }
                                                                            this.zzad.zzc();
                                                                        }
                                                                        zzK();
                                                                    }
                                                                }
                                                            }
                                                            if (zZzi) {
                                                                zzB(3);
                                                                this.zzX = null;
                                                                if (zzax()) {
                                                                    zzaC(false, false);
                                                                    this.zzo.zza();
                                                                    zzJ();
                                                                }
                                                            } else if (this.zzG.zze == 3) {
                                                                if (this.zzR == 0) {
                                                                    if (!zzae()) {
                                                                        zzaC(zzax(), false);
                                                                        zzB(2);
                                                                        if (this.zzL) {
                                                                            while (zzlnVarZzm2 != null) {
                                                                                while (i22 < r7) {
                                                                                }
                                                                            }
                                                                            this.zzad.zzc();
                                                                        }
                                                                        zzK();
                                                                    }
                                                                } else if (!z13) {
                                                                    zzaC(zzax(), false);
                                                                    zzB(2);
                                                                    if (this.zzL) {
                                                                        while (zzlnVarZzm2 != null) {
                                                                            while (i22 < r7) {
                                                                            }
                                                                        }
                                                                        this.zzad.zzc();
                                                                    }
                                                                    zzK();
                                                                }
                                                            }
                                                        } else if (this.zzG.zze == 3) {
                                                            if (this.zzR == 0) {
                                                                if (!zzae()) {
                                                                    zzaC(zzax(), false);
                                                                    zzB(2);
                                                                    if (this.zzL) {
                                                                        while (zzlnVarZzm2 != null) {
                                                                            while (i22 < r7) {
                                                                            }
                                                                        }
                                                                        this.zzad.zzc();
                                                                    }
                                                                    zzK();
                                                                }
                                                            } else if (!z13) {
                                                                zzaC(zzax(), false);
                                                                zzB(2);
                                                                if (this.zzL) {
                                                                    while (zzlnVarZzm2 != null) {
                                                                        while (i22 < r7) {
                                                                        }
                                                                    }
                                                                    this.zzad.zzc();
                                                                }
                                                                zzK();
                                                            }
                                                        }
                                                    }
                                                    int i34 = 2;
                                                    if (this.zzG.zze == 2) {
                                                        int i35 = 0;
                                                        while (true) {
                                                            zzmp[] zzmpVarArr8 = this.zzb;
                                                            if (i35 < i34) {
                                                                if (zzmpVarArr8[i35].zzp(zzlnVar)) {
                                                                    zzay(i35);
                                                                }
                                                                i35++;
                                                                i34 = 2;
                                                            } else {
                                                                zzmd zzmdVar2 = this.zzG;
                                                                if (zzmdVar2.zzg || zzmdVar2.zzr >= 500000 || !zzaF(zzlqVar5.zzk()) || !zzax()) {
                                                                    this.zzY = -9223372036854775807L;
                                                                } else if (this.zzY == -9223372036854775807L) {
                                                                    this.zzY = SystemClock.elapsedRealtime();
                                                                } else if (SystemClock.elapsedRealtime() - this.zzY >= 4000) {
                                                                    throw new zzfb(0, 4000);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        this.zzY = -9223372036854775807L;
                                                    }
                                                    boolean z20 = zzax() && this.zzG.zze == 3;
                                                    zzmd zzmdVar3 = this.zzG;
                                                    boolean z21 = zzmdVar3.zzp;
                                                    int i36 = zzmdVar3.zze;
                                                    if (i36 != 4 && (z20 || i36 == 2 || (i36 == 3 && this.zzR != 0))) {
                                                        zzQ(j20);
                                                    }
                                                    Trace.endSection();
                                                }
                                            }
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        zzC();
                                        return z10;
                                    case 3:
                                        z17 = true;
                                        zzR((zzle) message.obj);
                                        z10 = z17;
                                        zzC();
                                        return z10;
                                    case 4:
                                        z17 = true;
                                        zzM((zzav) message.obj);
                                        zzak(this.zzo.zzj(), true);
                                        z10 = z17;
                                        zzC();
                                        return z10;
                                    case 5:
                                        z17 = true;
                                        this.zzA = (zzmt) message.obj;
                                        z10 = z17;
                                        zzC();
                                        return z10;
                                    case 6:
                                        z17 = true;
                                        zzW(false, true);
                                        z10 = z17;
                                        zzC();
                                        return z10;
                                    case 7:
                                        zzdq zzdqVar = (zzdq) message.obj;
                                        try {
                                            zzX(true, false, true, false);
                                            int i37 = 0;
                                            while (true) {
                                                zzmp[] zzmpVarArr9 = this.zzb;
                                                if (i37 >= 2) {
                                                    this.zzg.zzd(this.zzv);
                                                    this.zzz.zzd();
                                                    this.zze.zzb();
                                                    zzB(1);
                                                    this.zzi.zzm(null);
                                                    this.zzj.zzb();
                                                    zzdqVar.zza();
                                                    return true;
                                                }
                                                try {
                                                    this.zzc[i37].zzw();
                                                    zzmpVarArr9[i37].zzI();
                                                    i37++;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                th = th2;
                                                Throwable th3 = th;
                                                this.zzi.zzm(null);
                                                this.zzj.zzb();
                                                zzdqVar.zza();
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                        break;
                                    case 8:
                                        zzwi zzwiVar = (zzwi) message.obj;
                                        zzlq zzlqVar6 = this.zzs;
                                        if (zzlqVar6.zzd(zzwiVar)) {
                                            zzln zzlnVarZzk2 = zzlqVar6.zzk();
                                            zzlnVarZzk2.getClass();
                                            if (!zzlnVarZzk2.zze) {
                                                float f10 = this.zzo.zzj().zzb;
                                                zzmd zzmdVar4 = this.zzG;
                                                zzlnVarZzk2.zzh(f10, zzmdVar4.zza, zzmdVar4.zzl);
                                            }
                                            zzaw(zzlnVarZzk2.zzg.zza, zzlnVarZzk2.zzq(), zzlnVarZzk2.zzr());
                                            if (zzlnVarZzk2 == zzlqVar6.zzm()) {
                                                zzU(zzlnVarZzk2.zzg.zzb, true);
                                                zzap();
                                                zzlnVarZzk2.zzh = true;
                                                zzmd zzmdVar5 = this.zzG;
                                                zzwk zzwkVar9 = zzmdVar5.zzb;
                                                long j22 = zzlnVarZzk2.zzg.zzb;
                                                this.zzG = zzao(zzwkVar9, j22, zzmdVar5.zzc, j22, false, 5);
                                            }
                                            zzam();
                                        } else {
                                            z17 = true;
                                            zzln zzlnVarZzu = zzlqVar6.zzu(zzwiVar);
                                            if (zzlnVarZzu != null) {
                                                zzgrc.zzi(!zzlnVarZzu.zze);
                                                float f11 = this.zzo.zzj().zzb;
                                                zzmd zzmdVar6 = this.zzG;
                                                zzlnVarZzu.zzh(f11, zzmdVar6.zza, zzmdVar6.zzl);
                                                if (zzlqVar6.zze(zzwiVar)) {
                                                    zzai();
                                                }
                                            }
                                        }
                                        z10 = z17;
                                        zzC();
                                        return z10;
                                    case 9:
                                        zzwi zzwiVar2 = (zzwi) message.obj;
                                        zzlq zzlqVar7 = this.zzs;
                                        if (zzlqVar7.zzd(zzwiVar2)) {
                                            zzlqVar7.zzf(this.zzT);
                                            zzam();
                                        } else if (zzlqVar7.zze(zzwiVar2)) {
                                            zzai();
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 10:
                                        zzad();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 11:
                                        int i38 = message.arg1;
                                        this.zzO = i38;
                                        int iZza = this.zzs.zza(this.zzG.zza, i38);
                                        if ((iZza & 1) != 0) {
                                            zzI(true);
                                        } else if ((iZza & 2) != 0) {
                                            zzab();
                                        }
                                        zzas(false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 12:
                                        boolean z22 = message.arg1 != 0;
                                        this.zzP = z22;
                                        int iZzb = this.zzs.zzb(this.zzG.zza, z22);
                                        if ((iZzb & 1) != 0) {
                                            zzI(true);
                                        } else if ((iZzb & 2) != 0) {
                                            zzab();
                                        }
                                        zzas(false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 13:
                                        boolean z23 = message.arg1 != 0;
                                        zzdq zzdqVar2 = (zzdq) message.obj;
                                        if (this.zzQ != z23) {
                                            this.zzQ = z23;
                                            if (!z23) {
                                                zzmp[] zzmpVarArr10 = this.zzb;
                                                for (int i39 = 0; i39 < 2; i39++) {
                                                    zzmpVarArr10[i39].zzG();
                                                }
                                            }
                                        }
                                        if (zzdqVar2 != null) {
                                            zzdqVar2.zza();
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 14:
                                        zzmh zzmhVar = (zzmh) message.obj;
                                        if (zzmhVar.zzf() == this.zzk) {
                                            zzaE(zzmhVar);
                                            int i40 = this.zzG.zze;
                                            if (i40 == 3 || i40 == 2) {
                                                this.zzi.zzh(2);
                                            }
                                        } else {
                                            this.zzi.zzd(15, zzmhVar).zza();
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 15:
                                        final zzmh zzmhVar2 = (zzmh) message.obj;
                                        Looper looperZzf = zzmhVar2.zzf();
                                        if (looperZzf.getThread().isAlive()) {
                                            this.zzq.zzd(looperZzf, null).zzn(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzkx
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzlf.zzz(zzmhVar2);
                                                }
                                            });
                                        } else {
                                            zzee.zzc("TAG", "Trying to send message on a dead thread.");
                                            zzmhVar2.zzi(false);
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 16:
                                        zzak((zzav) message.obj, false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 17:
                                        zzkz zzkzVar = (zzkz) message.obj;
                                        this.zzH.zza(1);
                                        if (zzkzVar.zzb() != -1) {
                                            this.zzS = new zzle(new zzmj(zzkzVar.zza(), zzkzVar.zzd()), zzkzVar.zzb(), zzkzVar.zzc());
                                        }
                                        zzaf(this.zzt.zzl(zzkzVar.zza(), zzkzVar.zzd()), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 18:
                                        zzkz zzkzVar2 = (zzkz) message.obj;
                                        int iZzc = message.arg1;
                                        this.zzH.zza(1);
                                        zzmc zzmcVar = this.zzt;
                                        if (iZzc == -1) {
                                            iZzc = zzmcVar.zzc();
                                        }
                                        zzaf(zzmcVar.zzm(iZzc, zzkzVar2.zza(), zzkzVar2.zzd()), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 19:
                                        zzla zzlaVar = (zzla) message.obj;
                                        this.zzH.zza(1);
                                        zzmc zzmcVar2 = this.zzt;
                                        int i41 = zzlaVar.zza;
                                        zzaf(zzmcVar2.zzo(0, 0, 0, null), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 20:
                                        int i42 = message.arg1;
                                        int i43 = message.arg2;
                                        zzyf zzyfVar = (zzyf) message.obj;
                                        this.zzH.zza(1);
                                        zzaf(this.zzt.zzn(i42, i43, zzyfVar), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 21:
                                        zzyf zzyfVar2 = (zzyf) message.obj;
                                        this.zzH.zza(1);
                                        zzaf(this.zzt.zzp(zzyfVar2), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 22:
                                        zzaf(this.zzt.zzh(), true);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 23:
                                        this.zzJ = message.arg1 != 0;
                                        zzaj();
                                        if (this.zzK) {
                                            zzlq zzlqVar8 = this.zzs;
                                            if (zzlqVar8.zzn() != zzlqVar8.zzm()) {
                                                zzI(true);
                                                zzas(false);
                                            }
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 24:
                                    default:
                                        return false;
                                    case 25:
                                        zzac();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 26:
                                        zzac();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 27:
                                        int i44 = message.arg1;
                                        int i45 = message.arg2;
                                        List list = (List) message.obj;
                                        this.zzH.zza(1);
                                        zzaf(this.zzt.zza(i44, i45, list), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 28:
                                        zzjg zzjgVar = (zzjg) message.obj;
                                        this.zzZ = zzjgVar;
                                        this.zzs.zzc(this.zzG.zza, zzjgVar);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 29:
                                        this.zzH.zza(1);
                                        zzX(false, false, false, true);
                                        this.zzg.zza(this.zzv);
                                        zzB(true != this.zzG.zza.zzg() ? 2 : 4);
                                        zzF();
                                        this.zzt.zzd(this.zzh.zze());
                                        this.zzi.zzh(2);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 30:
                                        Pair pair = (Pair) message.obj;
                                        Object obj = pair.first;
                                        zzdq zzdqVar3 = (zzdq) pair.second;
                                        zzmp[] zzmpVarArr11 = this.zzb;
                                        for (int i46 = 0; i46 < 2; i46++) {
                                            zzmpVarArr11[i46].zzJ(obj);
                                        }
                                        int i47 = this.zzG.zze;
                                        if (i47 == 3 || i47 == 2) {
                                            this.zzi.zzh(2);
                                        }
                                        if (zzdqVar3 != null) {
                                            zzdqVar3.zza();
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 31:
                                        zzd zzdVar2 = (zzd) message.obj;
                                        int i48 = message.arg1;
                                        this.zze.zze(zzdVar2);
                                        zzcd zzcdVar = this.zzz;
                                        if (i48 != 0) {
                                            zzdVar = zzdVar2;
                                        }
                                        zzcdVar.zzb(zzdVar);
                                        zzF();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 32:
                                        zzD(((Float) message.obj).floatValue());
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 33:
                                        int i49 = message.arg1;
                                        zzmd zzmdVar7 = this.zzG;
                                        zzH(zzmdVar7.zzl, i49, zzmdVar7.zzn, zzmdVar7.zzm);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 34:
                                        zzD(this.zzac);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 35:
                                        zzacp zzacpVar = (zzacp) message.obj;
                                        zzmp[] zzmpVarArr12 = this.zzb;
                                        for (int i50 = 0; i50 < 2; i50++) {
                                            zzmpVarArr12[i50].zzK(zzacpVar);
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 36:
                                        boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                                        if (!zBooleanValue) {
                                            if (this.zzE != null && this.zzD && !this.zzi.zzb(37)) {
                                                this.zzF++;
                                            }
                                            final int i51 = this.zzF;
                                            if (i51 > 0) {
                                                this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        this.zza.zzv(i51);
                                                    }
                                                });
                                            }
                                            this.zzF = 0;
                                            this.zzD = false;
                                            this.zzi.zzk(37);
                                            zzle zzleVar = this.zzE;
                                            if (zzleVar != null) {
                                                zzR(zzleVar);
                                                this.zzE = null;
                                                this.zzD = false;
                                            }
                                        }
                                        this.zzC = zBooleanValue;
                                        zzV();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 37:
                                        this.zzD = false;
                                        zzle zzleVar2 = this.zzE;
                                        if (zzleVar2 != null) {
                                            zzR(zzleVar2);
                                            this.zzE = null;
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 38:
                                        this.zzB = (zzms) message.obj;
                                        zzV();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                }
                            } catch (zziw e15) {
                                zziwVarZzd = e15;
                                str2 = "Playback error";
                                str3 = "ExoPlayerImplInternal";
                            }
                        } catch (RuntimeException e16) {
                            runtimeException = e16;
                            str = "Playback error";
                        }
                    } catch (zziw e17) {
                        zziwVarZzd = e17;
                        str2 = str5;
                        str3 = str6;
                    } catch (RuntimeException e18) {
                        e = e18;
                        runtimeException = e;
                        if (runtimeException instanceof IllegalStateException) {
                            i11 = 1004;
                        } else {
                            i11 = 1004;
                        }
                        zziw zziwVarZzc3 = zziw.zzc(runtimeException, i11);
                        zzee.zzf(str4, str, zziwVarZzc3);
                        zzW(true, false);
                        this.zzG = this.zzG.zzf(zziwVarZzc3);
                    }
                } catch (zziw e19) {
                    str2 = "Playback error";
                    str3 = "ExoPlayerImplInternal";
                    zziwVarZzd = e19;
                }
            } catch (RuntimeException e20) {
                e = e20;
                str = "Playback error";
            }
        } catch (zzat e21) {
            zzA(e21, e21.zzb == 1 ? true != e21.zza ? 3003 : 3001 : 1000);
        } catch (zzhc e22) {
            zzA(e22, e22.zza);
        } catch (zztg e23) {
            zzA(e23, e23.zza);
        } catch (zzvk e24) {
            zzA(e24, 1002);
        } catch (IOException e25) {
            zzA(e25, 2000);
        }
    }

    public final Looper zzn() {
        return this.zzk;
    }

    public final /* synthetic */ zzln zzt(zzlo zzloVar, long j10) {
        zzaan zzaanVarZze = this.zzg.zze(this.zzv);
        long j11 = this.zzZ.zzb;
        zzaak zzaakVar = this.zzf;
        zzmc zzmcVar = this.zzt;
        return new zzln(this.zzc, j10, this.zze, zzaanVarZze, zzmcVar, zzloVar, zzaakVar, -9223372036854775807L);
    }

    public final /* synthetic */ zzdx zzx() {
        return this.zzi;
    }

    private final void zzA(IOException iOException, int i10) {
        zzlq zzlqVar = this.zzs;
        zziw zziwVarZza = zziw.zza(iOException, i10);
        zzln zzlnVarZzm = zzlqVar.zzm();
        if (zzlnVarZzm != null) {
            zziwVarZza = zziwVarZza.zzd(zzlnVarZzm.zzg.zza);
        }
        zzee.zzf("ExoPlayerImplInternal", "Playback error", zziwVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zziwVarZza);
    }

    private final void zzB(int i10) {
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zze != i10) {
            if (i10 != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzmdVar.zze(i10);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzlc(this.zzG);
        }
    }

    private final void zzD(float f10) throws zziw {
        this.zzac = f10;
        float fZza = f10 * this.zzz.zza();
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzmpVarArr[i10].zzL(fZza);
            i10++;
        }
    }

    private final void zzE(boolean z10, int i10, boolean z11, int i11) throws zziw {
        this.zzH.zza(z11 ? 1 : 0);
        zzG(z10, i10, i11);
    }

    private final void zzF() throws zziw {
        zzmd zzmdVar = this.zzG;
        zzG(zzmdVar.zzl, zzmdVar.zzn, zzmdVar.zzm);
    }

    private final void zzG(boolean z10, int i10, int i11) throws zziw {
        zzH(z10, this.zzz.zzc(z10, this.zzG.zze), i10, i11);
    }

    private final void zzI(boolean z10) throws zziw {
        zzwk zzwkVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzwkVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzmd zzmdVar = this.zzG;
            this.zzG = zzao(zzwkVar, jZzT, zzmdVar.zzc, zzmdVar.zzd, z10, 5);
        }
    }

    private final void zzJ() throws zziw {
        zzln zzlnVarZzm = this.zzs.zzm();
        if (zzlnVarZzm == null) {
            return;
        }
        zzaak zzaakVarZzr = zzlnVarZzm.zzr();
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            if (zzaakVarZzr.zza(i10)) {
                zzmpVarArr[i10].zzv();
            }
            i10++;
        }
    }

    private final void zzK() throws zziw {
        this.zzo.zzb();
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzmpVarArr[i10].zzw();
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i10, final boolean z10) {
        boolean[] zArr = this.zzd;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i10, z10);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j10) {
        int i10 = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j11 = zzbeVar.zzg;
        String str = zzfj.zza;
        return zzfj.zzq((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j10;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ba A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0132 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0148 A[EDGE_INSN: B:70:0x0148->B:71:0x0149 BREAK  A[LOOP:0: B:63:0x0130->B:69:0x0144]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0148 A[SYNTHETIC] */
    private final void zzR(zzle zzleVar) throws Throwable {
        long jLongValue;
        boolean z10;
        zzwk zzwkVar;
        long jMax;
        long j10;
        boolean z11;
        long j11;
        long jZzk;
        boolean z12;
        boolean z13;
        long jZzS;
        boolean z14;
        long j12;
        zzmp[] zzmpVarArr;
        int i10;
        zzmp zzmpVar;
        zzln zzlnVarZzm;
        zzmd zzmdVar;
        int i11;
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
                this.zzH.zza(1);
            }
            this.zzE = zzleVar;
            return;
        }
        this.zzH.zza(1);
        zzbf zzbfVar = this.zzG.zza;
        int i12 = this.zzO;
        boolean z15 = this.zzP;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzaD = zzaD(zzbfVar, zzleVar, true, i12, z15, zzbeVar, zzbdVar);
        long j13 = -9223372036854775807L;
        try {
            if (pairZzaD != null) {
                Object obj = pairZzaD.first;
                jLongValue = ((Long) pairZzaD.second).longValue();
                long j14 = zzleVar.zzc;
                j13 = j14 != -9223372036854775807L ? jLongValue : -9223372036854775807L;
                zzwk zzwkVarZzy = this.zzs.zzy(this.zzG.zza, obj, jLongValue);
                if (zzwkVarZzy.zzb()) {
                    this.zzG.zza.zzo(zzwkVarZzy.zza, zzbdVar);
                    int i13 = zzwkVarZzy.zzb;
                    if (zzbdVar.zzd(i13) == zzwkVarZzy.zzc) {
                        zzbdVar.zzj();
                    }
                    long j15 = zzbdVar.zzg.zza(i13).zza;
                    jMax = Math.max(j13, 0L);
                    zzwkVar = zzwkVarZzy;
                    z10 = true;
                    j10 = 0;
                } else {
                    z10 = j14 == -9223372036854775807L;
                    zzwkVar = zzwkVarZzy;
                }
                if (this.zzG.zza.zzg()) {
                    if (pairZzaD == null) {
                        if (this.zzG.zze != 1) {
                            zzB(4);
                        }
                        zzX(false, true, false, true);
                    } else {
                        if (zzwkVar.equals(this.zzG.zzb)) {
                            zzlnVarZzm = this.zzs.zzm();
                            if (zzlnVarZzm == null && zzlnVarZzm.zze && j10 != 0) {
                                zzwi zzwiVar = zzlnVarZzm.zza;
                                long j16 = zzbeVar.zzm;
                                if (this.zzC && j16 != -9223372036854775807L) {
                                    Double d10 = this.zzB.zzc;
                                }
                                jZzk = zzwiVar.zzk(j10, this.zzA);
                            } else {
                                jZzk = j10;
                            }
                            if (zzfj.zzp(jZzk) != zzfj.zzp(this.zzG.zzs) && ((i11 = (zzmdVar = this.zzG).zze) == 2 || i11 == 3)) {
                                z11 = z10;
                                j12 = zzmdVar.zzs;
                            }
                        } else {
                            jZzk = j10;
                        }
                        if (this.zzC) {
                            z12 = true;
                            break;
                        }
                        zzmpVarArr = this.zzb;
                        i10 = 0;
                        while (true) {
                            if (i10 < 2) {
                                z12 = true;
                                break;
                            }
                            zzmpVar = zzmpVarArr[i10];
                            if (!zzmpVar.zzM() && zzmpVar.zze() == 2) {
                                z12 = true;
                                this.zzD = true;
                                break;
                            }
                            i10++;
                        }
                        if (this.zzG.zze == 4) {
                            z13 = z12;
                        } else {
                            z13 = false;
                        }
                        jZzS = zzS(zzwkVar, jZzk, z13);
                        if (j10 != jZzS) {
                            z14 = z12;
                        } else {
                            z14 = false;
                        }
                        z11 = z10 | z14;
                        try {
                            zzmd zzmdVar2 = this.zzG;
                            zzbf zzbfVar2 = zzmdVar2.zza;
                            zzag(zzbfVar2, zzwkVar, zzbfVar2, zzmdVar2.zzb, jMax, true);
                            j12 = jZzS;
                        } catch (Throwable th2) {
                            th = th2;
                            j11 = jZzS;
                            this.zzG = zzao(zzwkVar, j11, jMax, j11, z11, 2);
                            throw th;
                        }
                    }
                    this.zzG = zzao(zzwkVar, j12, jMax, j12, z11, 2);
                    return;
                }
                this.zzS = zzleVar;
                z11 = z10;
                j12 = j10;
                this.zzG = zzao(zzwkVar, j12, jMax, j12, z11, 2);
                return;
            }
            Pair pairZzY = zzY(this.zzG.zza);
            zzwkVar = (zzwk) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z10 = !this.zzG.zza.zzg();
            if (this.zzG.zza.zzg()) {
                if (pairZzaD == null) {
                    if (this.zzG.zze != 1) {
                        zzB(4);
                    }
                    zzX(false, true, false, true);
                } else {
                    if (zzwkVar.equals(this.zzG.zzb)) {
                        zzlnVarZzm = this.zzs.zzm();
                        if (zzlnVarZzm == null) {
                            jZzk = j10;
                        } else {
                            jZzk = j10;
                        }
                        if (zzfj.zzp(jZzk) != zzfj.zzp(this.zzG.zzs)) {
                        }
                    } else {
                        jZzk = j10;
                    }
                    if (this.zzC) {
                        z12 = true;
                        break;
                    }
                    zzmpVarArr = this.zzb;
                    i10 = 0;
                    while (true) {
                        if (i10 < 2) {
                            z12 = true;
                            break;
                        } else {
                            zzmpVar = zzmpVarArr[i10];
                            if (!zzmpVar.zzM()) {
                            }
                            i10++;
                        }
                    }
                    if (this.zzG.zze == 4) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    jZzS = zzS(zzwkVar, jZzk, z13);
                    if (j10 != jZzS) {
                        z14 = z12;
                    } else {
                        z14 = false;
                    }
                    z11 = z10 | z14;
                    zzmd zzmdVar3 = this.zzG;
                    zzbf zzbfVar3 = zzmdVar3.zza;
                    zzag(zzbfVar3, zzwkVar, zzbfVar3, zzmdVar3.zzb, jMax, true);
                    j12 = jZzS;
                }
                this.zzG = zzao(zzwkVar, j12, jMax, j12, z11, 2);
                return;
            }
            this.zzS = zzleVar;
            z11 = z10;
            j12 = j10;
            this.zzG = zzao(zzwkVar, j12, jMax, j12, z11, 2);
            return;
        } catch (Throwable th3) {
            th = th3;
            z11 = z10;
            j11 = j10;
        }
        long j17 = j13;
        j10 = jLongValue;
        jMax = j17;
    }

    private final long zzS(zzwk zzwkVar, long j10, boolean z10) throws zziw {
        zzlq zzlqVar = this.zzs;
        return zzT(zzwkVar, j10, zzlqVar.zzm() != zzlqVar.zzn(), z10);
    }

    private final void zzU(long j10, boolean z10) throws zziw {
        zzln zzlnVarZzm = this.zzs.zzm();
        long jZza = j10 + (zzlnVarZzm == null ? 1000000000000L : zzlnVarZzm.zza());
        this.zzT = jZza;
        this.zzo.zzc(jZza);
        zzmp[] zzmpVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            zzmpVarArr[i10].zzE(zzlnVarZzm, this.zzT, z10);
        }
        for (zzln zzlnVarZzm2 = r0.zzm(); zzlnVarZzm2 != null; zzlnVarZzm2 = zzlnVarZzm2.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm2.zzr().zzc) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e8 A[PHI: r3
  0x00e8: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v11 com.google.android.gms.internal.ads.zzbf)
  (r3v11 com.google.android.gms.internal.ads.zzbf)
 binds: [B:37:0x00b0, B:39:0x00b4, B:41:0x00c5, B:43:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzX(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        long j10;
        long j11;
        zzwk zzwkVar;
        zzbf zzbfVar;
        this.zzi.zzk(2);
        this.zzD = false;
        if (this.zzE != null) {
            this.zzH.zza(1);
            this.zzE = null;
        }
        this.zzX = null;
        zzaC(false, true);
        this.zzo.zzb();
        this.zzT = 1000000000000L;
        try {
            zzaa();
        } catch (zziw | RuntimeException e10) {
            zzee.zzf("ExoPlayerImplInternal", "Disable failed.", e10);
        }
        if (z10) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    zzmpVarArr[i10].zzG();
                } catch (RuntimeException e11) {
                    zzee.zzf("ExoPlayerImplInternal", "Reset failed.", e11);
                }
            }
        }
        this.zzR = 0;
        zzmd zzmdVar = this.zzG;
        zzwk zzwkVar2 = zzmdVar.zzb;
        long j12 = zzmdVar.zzs;
        long j13 = (this.zzG.zzb.zzb() || zzaB(this.zzG, this.zzm)) ? this.zzG.zzc : this.zzG.zzs;
        if (z11) {
            this.zzS = null;
            Pair pairZzY = zzY(this.zzG.zza);
            zzwkVar2 = (zzwk) pairZzY.first;
            long jLongValue = ((Long) pairZzY.second).longValue();
            z14 = zzwkVar2.equals(this.zzG.zzb) ? false : true;
            j10 = jLongValue;
            j11 = -9223372036854775807L;
        } else {
            z14 = false;
            j10 = j12;
            j11 = j13;
        }
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzv();
        this.zzN = false;
        zzbf zzbfVarZzx = this.zzG.zza;
        if (z12 && (zzbfVarZzx instanceof zzmj)) {
            zzbfVarZzx = ((zzmj) zzbfVarZzx).zzx(this.zzt.zzq());
            if (zzwkVar2.zzb != -1) {
                Object obj = zzwkVar2.zza;
                zzbd zzbdVar = this.zzm;
                zzbfVarZzx.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzl;
                zzbfVarZzx.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVarZzx;
                    zzwkVar = new zzwk(obj, zzwkVar2.zzd);
                } else {
                    zzwkVar = zzwkVar2;
                    zzbfVar = zzbfVarZzx;
                }
            } else {
                zzwkVar = zzwkVar2;
                zzbfVar = zzbfVarZzx;
            }
        } else {
            zzwkVar = zzwkVar2;
            zzbfVar = zzbfVarZzx;
        }
        zzmd zzmdVar2 = this.zzG;
        int i11 = zzmdVar2.zze;
        zziw zziwVar = z13 ? null : zzmdVar2.zzf;
        zzyn zzynVar = z14 ? zzyn.zza : zzmdVar2.zzh;
        zzaak zzaakVar = z14 ? this.zzf : zzmdVar2.zzi;
        List listZzi = z14 ? zzguf.zzi() : zzmdVar2.zzj;
        zzmd zzmdVar3 = this.zzG;
        this.zzG = new zzmd(zzbfVar, zzwkVar, j11, j10, i11, zziwVar, false, zzynVar, zzaakVar, listZzi, zzwkVar, zzmdVar3.zzl, zzmdVar3.zzm, zzmdVar3.zzn, zzmdVar3.zzo, j10, 0L, j10, 0L, false);
        if (z12) {
            zzlqVar.zzj();
            this.zzt.zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z10 = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzmd zzmdVar, zzbd zzbdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzwkVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z10, boolean z11) {
        this.zzL = z10;
        long jElapsedRealtime = -9223372036854775807L;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                zzmp zzmpVar = zzmpVarArr[i10];
                int iZzd = zzmpVar.zzd();
                zzmpVar.zzC(this.zzo);
                this.zzR -= iZzd - zzmpVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzad() throws zziw {
        zziu zziuVar = this.zzo;
        float f10 = zziuVar.zzj().zzb;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzm = zzlqVar.zzm();
        zzln zzlnVarZzn = zzlqVar.zzn();
        zzaak zzaakVar = null;
        boolean z10 = true;
        while (zzlnVarZzm != null && zzlnVarZzm.zze) {
            zzmd zzmdVar = this.zzG;
            zzaak zzaakVarZzk = zzlnVarZzm.zzk(f10, zzmdVar.zza, zzmdVar.zzl);
            zzaak zzaakVar2 = zzlnVarZzm == zzlqVar.zzm() ? zzaakVarZzk : zzaakVar;
            zzaak zzaakVarZzr = zzlnVarZzm.zzr();
            boolean z11 = false;
            if (zzaakVarZzr != null) {
                zzaac[] zzaacVarArr = zzaakVarZzk.zzc;
                if (zzaakVarZzr.zzc.length == zzaacVarArr.length) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= zzaacVarArr.length) {
                            if (zzlnVarZzm != zzlnVarZzn) {
                                z11 = true;
                            }
                            z10 &= z11;
                            zzlnVarZzm = zzlnVarZzm.zzp();
                            zzaakVar = zzaakVar2;
                        } else if (zzaakVarZzk.zzb(zzaakVarZzr, i10)) {
                            i10++;
                        }
                    }
                }
            }
            int i11 = 2;
            if (z10) {
                zzln zzlnVarZzm2 = zzlqVar.zzm();
                int iZzs = zzlqVar.zzs(zzlnVarZzm2) & 1;
                zzmp[] zzmpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzaakVar2.getClass();
                long jZzm = zzlnVarZzm2.zzm(zzaakVar2, this.zzG.zzs, 1 == iZzs, zArr);
                zzmd zzmdVar2 = this.zzG;
                boolean z12 = (zzmdVar2.zze == 4 || jZzm == zzmdVar2.zzs) ? false : true;
                zzmd zzmdVar3 = this.zzG;
                zzln zzlnVar = zzlnVarZzm2;
                this.zzG = zzao(zzmdVar3.zzb, jZzm, zzmdVar3.zzc, zzmdVar3.zzd, z12, 5);
                if (z12) {
                    zzU(jZzm, true);
                }
                zzab();
                i11 = 2;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (i12 < 2) {
                    int iZzd = zzmpVarArr[i12].zzd();
                    zArr2[i12] = zzmpVarArr[i12].zzM();
                    zzln zzlnVar2 = zzlnVar;
                    zzmpVarArr[i12].zzD(zzlnVar2.zzc[i12], zziuVar, this.zzT, zArr[i12]);
                    if (iZzd - zzmpVarArr[i12].zzd() > 0) {
                        zzN(i12, false);
                    }
                    this.zzR -= iZzd - zzmpVarArr[i12].zzd();
                    i12++;
                    zzlnVar = zzlnVar2;
                }
                zzaq(zArr2, this.zzT);
                zzlnVar.zzh = true;
            } else {
                zzlqVar.zzs(zzlnVarZzm);
                if (zzlnVarZzm.zze) {
                    long jMax = Math.max(zzlnVarZzm.zzg.zzb, this.zzT - zzlnVarZzm.zza());
                    if (this.zzy && zzaz() && zzlqVar.zzo() == zzlnVarZzm) {
                        zzab();
                    }
                    zzlnVarZzm.zzl(zzaakVarZzk, jMax, false);
                }
            }
            zzas(true);
            if (this.zzG.zze != 4) {
                zzam();
                zzL();
                this.zzi.zzh(i11);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzln zzlnVarZzm = this.zzs.zzm();
        long j10 = zzlnVarZzm.zzg.zze;
        if (!zzlnVarZzm.zze) {
            return false;
        }
        if (j10 == -9223372036854775807L || this.zzG.zzs < j10) {
            return true;
        }
        return !zzax();
    }

    /* JADX WARN: Code duplicated, block: B:213:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:216:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:220:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:222:0x03f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x0405  */
    /* JADX WARN: Code duplicated, block: B:230:0x0409  */
    /* JADX WARN: Code duplicated, block: B:231:0x040b  */
    /* JADX WARN: Code duplicated, block: B:235:0x0418  */
    /* JADX WARN: Code duplicated, block: B:239:0x0443  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.google.android.gms.internal.ads.zzlf] */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    private final void zzaf(zzbf zzbfVar, boolean z10) throws Throwable {
        boolean zZzb;
        Object obj;
        zzwk zzwkVar;
        zzbd zzbdVar;
        long j10;
        int i10;
        long j11;
        int iZzk;
        boolean z11;
        boolean z12;
        long jMax;
        boolean z13;
        boolean z14;
        long jMin;
        boolean z15;
        long jZzah;
        long jZzS;
        boolean z16;
        boolean z17;
        boolean z18;
        zzwk zzwkVarZzb;
        int i11;
        long jLongValue;
        boolean z19;
        int iZzk2;
        boolean z20;
        boolean z21;
        boolean z22;
        Object obj2;
        ?? r19;
        int i12;
        int i13;
        Object obj3;
        boolean z23;
        long j12;
        ?? r110;
        ?? r10;
        int i14;
        ?? r11;
        int i15;
        zzmd zzmdVar = this.zzG;
        zzle zzleVar = this.zzS;
        int i16 = this.zzO;
        boolean z24 = this.zzP;
        if (zzbfVar.zzg()) {
            zzwkVarZzb = zzmd.zzb();
            j10 = -9223372036854775807L;
            z16 = false;
            z17 = true;
            z15 = true;
            z18 = false;
            jZzS = 0;
            jZzah = 0;
        } else {
            zzbd zzbdVar2 = this.zzm;
            zzwk zzwkVar2 = zzmdVar.zzb;
            Object obj4 = zzwkVar2.zza;
            boolean zZzaB = zzaB(zzmdVar, zzbdVar2);
            zZzb = zzwkVar2.zzb();
            long j13 = (zZzb || zZzaB) ? zzmdVar.zzc : zzmdVar.zzs;
            zzbe zzbeVar = this.zzl;
            if (zzleVar != null) {
                obj = obj4;
                zzwkVar = zzwkVar2;
                long j14 = j13;
                Pair pairZzaD = zzaD(zzbfVar, zzleVar, true, i16, z24, zzbeVar, zzbdVar2);
                if (pairZzaD == null) {
                    iZzk2 = zzbfVar.zzk(z24);
                    obj = obj;
                    zzbdVar = zzbdVar2;
                    jLongValue = j14;
                    z22 = true;
                    z20 = false;
                    z21 = false;
                } else {
                    if (zzleVar.zzc == -9223372036854775807L) {
                        zzbdVar = zzbdVar2;
                        iZzk2 = zzbfVar.zzo(pairZzaD.first, zzbdVar).zzc;
                        obj = obj;
                        jLongValue = j14;
                        z19 = false;
                    } else {
                        zzbdVar = zzbdVar2;
                        Object obj5 = pairZzaD.first;
                        jLongValue = ((Long) pairZzaD.second).longValue();
                        obj = obj5;
                        z19 = true;
                        iZzk2 = -1;
                    }
                    z20 = zzmdVar.zze == 4;
                    z21 = z19;
                    z22 = false;
                }
                z12 = z22;
                z13 = z21;
                iZzk = iZzk2;
                i10 = -1;
                z11 = z20;
                long j15 = jLongValue;
                j11 = j14;
                j10 = j15;
            } else {
                obj = obj4;
                zzwkVar = zzwkVar2;
                zzbdVar = zzbdVar2;
                j10 = j13;
                zzbf zzbfVar2 = zzmdVar.zza;
                if (zzbfVar2.zzg()) {
                    iZzk = zzbfVar.zzk(z24);
                    j11 = j10;
                    z11 = false;
                    z12 = false;
                    i10 = -1;
                } else if (zzbfVar.zze(obj) == -1) {
                    i10 = -1;
                    int iZzr = zzr(zzbeVar, zzbdVar, i16, z24, obj, zzbfVar2, zzbfVar);
                    if (iZzr == -1) {
                        iZzr = zzbfVar.zzk(z24);
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    iZzk = iZzr;
                    z12 = z14;
                    j11 = j10;
                    z11 = false;
                } else {
                    i10 = -1;
                    if (j10 == -9223372036854775807L) {
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        iZzk = zzbfVar.zzo(obj, zzbdVar).zzc;
                        j11 = j10;
                        obj = obj;
                    } else if (zZzaB) {
                        zzbfVar2.zzo(obj, zzbdVar);
                        if (zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar2.zze(obj)) {
                            Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(obj, zzbdVar).zzc, j10);
                            Object obj6 = pairZzm.first;
                            long jLongValue2 = ((Long) pairZzm.second).longValue();
                            obj = obj6;
                            jMax = jLongValue2;
                            j11 = j10;
                        } else {
                            if (zzbfVar.zzo(obj, zzbdVar).zzd != -9223372036854775807L) {
                                long j16 = zzbdVar.zzd - 1;
                                String str = zzfj.zza;
                                j11 = j10;
                                jMax = Math.max(0L, Math.min(j11, j16));
                            } else {
                                j11 = j10;
                                jMax = j11;
                            }
                            obj = obj;
                        }
                        j10 = jMax;
                        iZzk = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        j11 = j10;
                        j10 = j11;
                        iZzk = -1;
                        z11 = false;
                        z12 = false;
                    }
                }
                z13 = false;
            }
            if (iZzk != i10) {
                j10 = j10;
                Pair pairZzm2 = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
                Object obj7 = pairZzm2.first;
                long jLongValue3 = ((Long) pairZzm2.second).longValue();
                obj = obj7;
                jMin = jLongValue3;
                j10 = -9223372036854775807L;
            } else {
                j10 = j10;
                jMin = j10;
            }
            zzwk zzwkVarZzy = this.zzs.zzy(zzbfVar, obj, jMin);
            int i17 = zzwkVarZzy.zze;
            boolean z25 = i17 == i10 || ((i11 = zzwkVar.zze) != i10 && i17 >= i11);
            boolean zEquals = obj.equals(obj);
            boolean z26 = zEquals && !zzwkVar.zzb() && !zzwkVarZzy.zzb() && z25;
            zzbd zzbdVarZzo = zzbfVar.zzo(obj, zzbdVar);
            if (!zZzaB && j11 == j10 && obj.equals(zzwkVarZzy.zza)) {
                if (zzwkVar.zzb()) {
                    zzbdVarZzo.zzk(zzwkVar.zzb);
                }
                if (zzwkVarZzy.zzb()) {
                    zzbdVarZzo.zzk(zzwkVarZzy.zzb);
                }
            }
            z15 = true;
            if (true == z26) {
                zzwkVarZzy = zzwkVar;
            }
            if (!zzwkVarZzy.zzb()) {
                if (zEquals && zzwkVar.zzb()) {
                    zza zzaVarZza = zzbfVar.zzo(obj, zzbdVar).zzg.zza(zzwkVar.zzb);
                    long j17 = zzaVarZza.zzi;
                    long j18 = zzmdVar.zzc;
                    jZzah = 0;
                    if (j18 == -9223372036854775807L || j18 < 0) {
                        int i18 = zzaVarZza.zzb;
                        int i19 = zzwkVar.zzc;
                        if (i18 > i19 && zzaVarZza.zze[i19] == 2) {
                            long j19 = zzbfVar.zzo(obj, zzbdVar).zzd;
                            if (j19 != -9223372036854775807L) {
                                jMin = Math.min(j19 - 1, jMin);
                            }
                            j10 = jMin;
                        }
                    }
                }
                jZzS = jMin;
                z16 = z11;
                z17 = z12;
                z18 = z13;
                zzwkVarZzb = zzwkVarZzy;
            } else if (zzwkVarZzy.equals(zzwkVar)) {
                jMin = zzmdVar.zzs;
            } else {
                zzbfVar.zzo(zzwkVarZzy.zza, zzbdVar);
                if (zzwkVarZzy.zzc == zzbdVar.zzd(zzwkVarZzy.zzb)) {
                    zzbdVar.zzj();
                }
                jMin = 0;
            }
            jZzah = 0;
            jZzS = jMin;
            z16 = z11;
            z17 = z12;
            z18 = z13;
            zzwkVarZzb = zzwkVarZzy;
        }
        boolean z27 = (this.zzG.zzb.equals(zzwkVarZzb) && jZzS == this.zzG.zzs) ? false : z15;
        if (z17) {
            try {
                if (this.zzG.zze != z15) {
                    i12 = 4;
                    try {
                        zzB(4);
                    } catch (Throwable th2) {
                        th = th2;
                        obj2 = null;
                        r19 = 4;
                        zzmd zzmdVar2 = this.zzG;
                        zzag(zzbfVar, zzwkVarZzb, zzmdVar2.zza, zzmdVar2.zzb, true == z18 ? jZzS : -9223372036854775807L, false);
                        if (z27 || j10 != this.zzG.zzc) {
                            zzmd zzmdVar3 = this.zzG;
                            obj3 = zzmdVar3.zzb.zza;
                            zzbf zzbfVar3 = zzmdVar3.zza;
                            z23 = (z27 || !z10 || zzbfVar3.zzg() || zzbfVar3.zzo(obj3, this.zzm).zzf) ? false : true;
                            if (z23) {
                                j12 = jZzS;
                            } else {
                                j12 = this.zzG.zzd;
                            }
                            r110 = r19;
                            if (zzbfVar.zze(obj3) != -1) {
                                r110 = 3;
                            }
                            this.zzG = zzao(zzwkVarZzb, jZzS, j10, j12, z23, r110 == true ? 1 : 0);
                        }
                        zzaj();
                        zzZ(zzbfVar, this.zzG.zza);
                        this.zzG = this.zzG.zzd(zzbfVar);
                        if (!zzbfVar.zzg()) {
                            this.zzS = obj2;
                        }
                        zzas(false);
                        this.zzi.zzh(2);
                        throw th;
                    }
                } else {
                    i12 = 4;
                }
                i13 = 0;
                try {
                    zzX(false, false, false, z15);
                } catch (Throwable th3) {
                    th = th3;
                    obj2 = null;
                    r19 = i12;
                    zzmd zzmdVar4 = this.zzG;
                    zzag(zzbfVar, zzwkVarZzb, zzmdVar4.zza, zzmdVar4.zzb, true == z18 ? jZzS : -9223372036854775807L, false);
                    if (z27) {
                        zzmd zzmdVar5 = this.zzG;
                        obj3 = zzmdVar5.zzb.zza;
                        zzbf zzbfVar4 = zzmdVar5.zza;
                        if (z27) {
                        }
                        if (z23) {
                            j12 = jZzS;
                        } else {
                            j12 = this.zzG.zzd;
                        }
                        r110 = r19;
                        if (zzbfVar.zze(obj3) != -1) {
                            r110 = 3;
                        }
                        this.zzG = zzao(zzwkVarZzb, jZzS, j10, j12, z23, r110 == true ? 1 : 0);
                    } else {
                        zzmd zzmdVar6 = this.zzG;
                        obj3 = zzmdVar6.zzb.zza;
                        zzbf zzbfVar5 = zzmdVar6.zza;
                        if (z27) {
                        }
                        if (z23) {
                            j12 = jZzS;
                        } else {
                            j12 = this.zzG.zzd;
                        }
                        r110 = r19;
                        if (zzbfVar.zze(obj3) != -1) {
                            r110 = 3;
                        }
                        this.zzG = zzao(zzwkVarZzb, jZzS, j10, j12, z23, r110 == true ? 1 : 0);
                    }
                    zzaj();
                    zzZ(zzbfVar, this.zzG.zza);
                    this.zzG = this.zzG.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                        this.zzS = obj2;
                    }
                    zzas(false);
                    this.zzi.zzh(2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                obj2 = null;
                r19 = 4;
            }
        } else {
            i13 = 0;
            i12 = 4;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (int i20 = i13; i20 < 2; i20++) {
            zzmpVarArr[i20].zzn(zzbfVar);
        }
        try {
            if (z27) {
                i15 = i13;
                i14 = i12;
                if (!zzbfVar.zzg()) {
                    zzlq zzlqVar = this.zzs;
                    for (zzln zzlnVarZzm = zzlqVar.zzm(); zzlnVarZzm != null; zzlnVarZzm = zzlnVarZzm.zzp()) {
                        if (zzlnVarZzm.zzg.zza.equals(zzwkVarZzb)) {
                            r11 = i15;
                            zzlnVarZzm.zzg = zzlqVar.zzx(zzbfVar, zzlnVarZzm.zzg);
                            zzlnVarZzm.zzs();
                        } else {
                            r11 = i15;
                        }
                    }
                    r11 = i15;
                    jZzS = zzS(zzwkVarZzb, jZzS, z16);
                    r11 = i15;
                }
            } else {
                try {
                    zzlq zzlqVar2 = this.zzs;
                    long jZzah2 = zzlqVar2.zzn() == null ? jZzah : zzah(zzlqVar2.zzn());
                    if (zzaz() && zzlqVar2.zzo() != null) {
                        jZzah = zzah(zzlqVar2.zzo());
                    }
                    r10 = i13;
                    i14 = i12;
                    int iZzw = zzlqVar2.zzw(zzbfVar, this.zzT, jZzah2, jZzah);
                    if ((iZzw & 1) != 0) {
                        zzI(r10);
                        r11 = r10;
                    } else if ((iZzw & 2) != 0) {
                        r11 = r10;
                        zzab();
                        r11 = r10;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r19 = i12;
                    obj2 = null;
                    zzmd zzmdVar7 = this.zzG;
                    zzag(zzbfVar, zzwkVarZzb, zzmdVar7.zza, zzmdVar7.zzb, true == z18 ? jZzS : -9223372036854775807L, false);
                    if (z27) {
                        zzmd zzmdVar8 = this.zzG;
                        obj3 = zzmdVar8.zzb.zza;
                        zzbf zzbfVar6 = zzmdVar8.zza;
                        if (z27) {
                        }
                        if (z23) {
                            j12 = jZzS;
                        } else {
                            j12 = this.zzG.zzd;
                        }
                        r110 = r19;
                        if (zzbfVar.zze(obj3) != -1) {
                            r110 = 3;
                        }
                        this.zzG = zzao(zzwkVarZzb, jZzS, j10, j12, z23, r110 == true ? 1 : 0);
                    } else {
                        zzmd zzmdVar9 = this.zzG;
                        obj3 = zzmdVar9.zzb.zza;
                        zzbf zzbfVar7 = zzmdVar9.zza;
                        if (z27) {
                        }
                        if (z23) {
                            j12 = jZzS;
                        } else {
                            j12 = this.zzG.zzd;
                        }
                        r110 = r19;
                        if (zzbfVar.zze(obj3) != -1) {
                            r110 = 3;
                        }
                        this.zzG = zzao(zzwkVarZzb, jZzS, j10, j12, z23, r110 == true ? 1 : 0);
                    }
                    zzaj();
                    zzZ(zzbfVar, this.zzG.zza);
                    this.zzG = this.zzG.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                        this.zzS = obj2;
                    }
                    zzas(false);
                    this.zzi.zzh(2);
                    throw th;
                }
            }
            r11 = r10;
            r11 = i15;
            zzmd zzmdVar10 = this.zzG;
            zzag(zzbfVar, zzwkVarZzb, zzmdVar10.zza, zzmdVar10.zzb, true != z18 ? -9223372036854775807L : jZzS, false);
            if (z27 || j10 != this.zzG.zzc) {
                zzmd zzmdVar11 = this.zzG;
                Object obj8 = zzmdVar11.zzb.zza;
                zzbf zzbfVar8 = zzmdVar11.zza;
                ?? r28 = (!z27 || !z10 || zzbfVar8.zzg() || zzbfVar8.zzo(obj8, this.zzm).zzf) ? r11 : 1;
                long j20 = r28 != 0 ? jZzS : this.zzG.zzd;
                if (zzbfVar.zze(obj8) != -1) {
                    i14 = 3;
                }
                this.zzG = zzao(zzwkVarZzb, jZzS, j10, j20, r28, i14);
            }
            zzaj();
            zzZ(zzbfVar, this.zzG.zza);
            this.zzG = this.zzG.zzd(zzbfVar);
            if (!zzbfVar.zzg()) {
                this.zzS = null;
            }
            zzas(r11);
            this.zzi.zzh(2);
        } catch (Throwable th6) {
            th = th6;
            obj2 = null;
            r19 = zZzb;
        }
    }

    private final long zzah(zzln zzlnVar) {
        if (zzlnVar == null) {
            return 0L;
        }
        long jZza = zzlnVar.zza();
        if (zzlnVar.zze) {
            int i10 = 0;
            while (true) {
                zzmp[] zzmpVarArr = this.zzb;
                if (i10 >= 2) {
                    break;
                }
                if (zzmpVarArr[i10].zzp(zzlnVar)) {
                    long jZzf = zzmpVarArr[i10].zzf(zzlnVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i10++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzt();
        zzln zzlnVarZzl = zzlqVar.zzl();
        if (zzlnVarZzl != null) {
            if (!zzlnVarZzl.zzd || zzlnVarZzl.zze) {
                zzwi zzwiVar = zzlnVarZzl.zza;
                if (zzwiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzlnVarZzl.zzg.zza, zzlnVarZzl.zze ? zzwiVar.zzi() : 0L)) {
                    if (!zzlnVarZzl.zzd) {
                        zzlnVarZzl.zzt(this, zzlnVarZzl.zzg.zzb);
                        return;
                    }
                    zzlk zzlkVar = new zzlk();
                    zzlkVar.zza(this.zzT - zzlnVarZzl.zza());
                    zzlkVar.zzb(this.zzo.zzj().zzb);
                    zzlkVar.zzc(this.zzM);
                    zzlnVarZzl.zzj(new zzll(zzlkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzln zzlnVarZzm = this.zzs.zzm();
        boolean z10 = false;
        if (zzlnVarZzm != null && zzlnVarZzm.zzg.zzi && this.zzJ) {
            z10 = true;
        }
        this.zzK = z10;
    }

    private final void zzak(zzav zzavVar, boolean z10) throws zziw {
        zzal(zzavVar, zzavVar.zzb, true, z10);
    }

    private final void zzal(zzav zzavVar, float f10, boolean z10, boolean z11) throws zziw {
        int i10;
        if (z10) {
            if (z11) {
                this.zzH.zza(1);
            }
            zzmd zzmdVar = this.zzG;
            this.zzG = new zzmd(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzd, zzmdVar.zze, zzmdVar.zzf, zzmdVar.zzg, zzmdVar.zzh, zzmdVar.zzi, zzmdVar.zzj, zzmdVar.zzk, zzmdVar.zzl, zzmdVar.zzm, zzmdVar.zzn, zzavVar, zzmdVar.zzq, zzmdVar.zzr, zzmdVar.zzs, zzmdVar.zzt, false);
        }
        float f11 = zzavVar.zzb;
        zzln zzlnVarZzm = this.zzs.zzm();
        while (true) {
            i10 = 0;
            if (zzlnVarZzm == null) {
                break;
            }
            zzaac[] zzaacVarArr = zzlnVarZzm.zzr().zzc;
            int length = zzaacVarArr.length;
            while (i10 < length) {
                zzaac zzaacVar = zzaacVarArr[i10];
                i10++;
            }
            zzlnVarZzm = zzlnVarZzm.zzp();
        }
        zzmp[] zzmpVarArr = this.zzb;
        while (i10 < 2) {
            zzmpVarArr[i10].zzm(f10, f11);
            i10++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzlq zzlqVar;
        boolean zZzh;
        zzlq zzlqVar2 = this.zzs;
        if (zzaF(zzlqVar2.zzk())) {
            zzln zzlnVarZzk = zzlqVar2.zzk();
            long jZzau = zzau(zzlnVarZzk.zzg());
            if (zzlnVarZzk == zzlqVar2.zzm()) {
                jZza = this.zzT;
                jZza2 = zzlnVarZzk.zza();
            } else {
                jZza = this.zzT - zzlnVarZzk.zza();
                jZza2 = zzlnVarZzk.zzg.zzb;
            }
            zzlqVar = zzlqVar2;
            zzli zzliVar = new zzli(this.zzv, this.zzG.zza, zzlnVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzlj zzljVar = this.zzg;
            zZzh = zzljVar.zzh(zzliVar);
            zzln zzlnVarZzm = zzlqVar.zzm();
            if (!zZzh && zzlnVarZzm.zze && jZzau < 500000 && this.zzn > 0) {
                zzlnVarZzm.zza.zzf(this.zzG.zzs, false);
                zZzh = zzljVar.zzh(zzliVar);
            }
        } else {
            zzlqVar = zzlqVar2;
            zZzh = false;
        }
        this.zzN = zZzh;
        if (zZzh) {
            zzln zzlnVarZzk2 = zzlqVar.zzk();
            zzlnVarZzk2.getClass();
            zzlk zzlkVar = new zzlk();
            zzlkVar.zza(this.zzT - zzlnVarZzk2.zza());
            zzlkVar.zzb(this.zzo.zzj().zzb);
            zzlkVar.zzc(this.zzM);
            zzlnVarZzk2.zzj(new zzll(zzlkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzln zzlnVarZzk = this.zzs.zzk();
        boolean z10 = false;
        if (this.zzN || (zzlnVarZzk != null && zzlnVarZzk.zza.zzn())) {
            z10 = true;
        }
        zzmd zzmdVar = this.zzG;
        if (z10 != zzmdVar.zzg) {
            this.zzG = zzmdVar.zzg(z10);
        }
    }

    @CheckResult
    private final zzmd zzao(zzwk zzwkVar, long j10, long j11, long j12, boolean z10, int i10) {
        List listZzi;
        zzyn zzynVar;
        zzaak zzaakVar;
        zzln zzlnVarZzm;
        int i11 = 0;
        this.zzW = (!this.zzW && j10 == this.zzG.zzs && zzwkVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzmd zzmdVar = this.zzG;
        zzyn zzynVar2 = zzmdVar.zzh;
        zzaak zzaakVar2 = zzmdVar.zzi;
        List list = zzmdVar.zzj;
        if (this.zzt.zzb()) {
            zzlq zzlqVar = this.zzs;
            zzln zzlnVarZzm2 = zzlqVar.zzm();
            zzyn zzynVarZzq = zzlnVarZzm2 == null ? zzyn.zza : zzlnVarZzm2.zzq();
            zzaak zzaakVarZzr = zzlnVarZzm2 == null ? this.zzf : zzlnVarZzm2.zzr();
            zzaac[] zzaacVarArr = zzaakVarZzr.zzc;
            zzguc zzgucVar = new zzguc();
            boolean z11 = false;
            for (zzaac zzaacVar : zzaacVarArr) {
                if (zzaacVar != null) {
                    zzap zzapVar = zzaacVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgucVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgucVar.zzf(zzapVar);
                        z11 = true;
                    }
                }
            }
            zzguf zzgufVarZzi = z11 ? zzgucVar.zzi() : zzguf.zzi();
            if (zzlnVarZzm2 != null) {
                zzlo zzloVar = zzlnVarZzm2.zzg;
                if (zzloVar.zzc != j11) {
                    zzlnVarZzm2.zzg = zzloVar.zzb(j11);
                }
            }
            if (zzlqVar.zzm() == zzlqVar.zzn() && (zzlnVarZzm = zzlqVar.zzm()) != null) {
                zzaak zzaakVarZzr2 = zzlnVarZzm.zzr();
                while (true) {
                    zzmp[] zzmpVarArr = this.zzb;
                    if (i11 >= 2) {
                        break;
                    }
                    if (zzaakVarZzr2.zza(i11)) {
                        if (zzmpVarArr[i11].zze() != 1) {
                            break;
                        }
                        int i12 = zzaakVarZzr2.zzb[i11].zzb;
                    }
                    i11++;
                }
            }
            listZzi = zzgufVarZzi;
            zzynVar = zzynVarZzq;
            zzaakVar = zzaakVarZzr;
        } else if (zzwkVar.equals(this.zzG.zzb)) {
            listZzi = list;
            zzynVar = zzynVar2;
            zzaakVar = zzaakVar2;
        } else {
            zzaakVar = this.zzf;
            zzynVar = zzyn.zza;
            listZzi = zzguf.zzi();
        }
        if (z10) {
            this.zzH.zzc(i10);
        }
        return this.zzG.zzc(zzwkVar, j10, j11, j12, zzat(), zzynVar, zzaakVar, listZzi);
    }

    private final void zzap() throws zziw {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j10) throws zziw {
        zzmp[] zzmpVarArr;
        zzln zzlnVarZzn = this.zzs.zzn();
        zzaak zzaakVarZzr = zzlnVarZzn.zzr();
        int i10 = 0;
        while (true) {
            zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                break;
            }
            if (!zzaakVarZzr.zza(i10)) {
                zzmpVarArr[i10].zzG();
            }
            i10++;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzaakVarZzr.zza(i11) && !zzmpVarArr[i11].zzp(zzlnVarZzn)) {
                zzar(zzlnVarZzn, i11, zArr[i11], j10);
            }
        }
    }

    private final void zzar(zzln zzlnVar, int i10, boolean z10, long j10) throws zziw {
        zzmp zzmpVar = this.zzb[i10];
        if (zzmpVar.zzM()) {
            return;
        }
        boolean z11 = zzlnVar == this.zzs.zzm();
        zzaak zzaakVarZzr = zzlnVar.zzr();
        zzmo zzmoVar = zzaakVarZzr.zzb[i10];
        zzaac zzaacVar = zzaakVarZzr.zzc[i10];
        boolean z12 = zzax() && this.zzG.zze == 3;
        boolean z13 = !z10 && z12;
        this.zzR++;
        zzmpVar.zzx(zzmoVar, zzaacVar, zzlnVar.zzc[i10], this.zzT, z13, z11, j10, zzlnVar.zza(), zzlnVar.zzg.zza, this.zzo);
        zzmpVar.zzy(11, new zzkt(this), zzlnVar);
        if (z12 && z11) {
            zzmpVar.zzv();
        }
    }

    private final void zzas(boolean z10) {
        zzln zzlnVarZzk = this.zzs.zzk();
        zzwk zzwkVar = zzlnVarZzk == null ? this.zzG.zzb : zzlnVarZzk.zzg.zza;
        boolean z11 = !this.zzG.zzk.equals(zzwkVar);
        if (z11) {
            this.zzG = this.zzG.zzh(zzwkVar);
        }
        zzmd zzmdVar = this.zzG;
        zzmdVar.zzq = zzlnVarZzk == null ? zzmdVar.zzs : zzlnVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((z11 || z10) && zzlnVarZzk != null && zzlnVarZzk.zze) {
            zzaw(zzlnVarZzk.zzg.zza, zzlnVarZzk.zzq(), zzlnVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j10) {
        zzln zzlnVarZzk = this.zzs.zzk();
        if (zzlnVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzT - zzlnVarZzk.zza()));
    }

    private final long zzav(zzln zzlnVar) {
        zzgrc.zzi(zzlnVar.zze);
        return (long) ((zzlnVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzwk zzwkVar, zzyn zzynVar, zzaak zzaakVar) {
        long jZza;
        long jZza2;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzk = zzlqVar.zzk();
        zzlnVarZzk.getClass();
        if (zzlnVarZzk == zzlqVar.zzm()) {
            jZza = this.zzT;
            jZza2 = zzlnVarZzk.zza();
        } else {
            jZza = this.zzT - zzlnVarZzk.zza();
            jZza2 = zzlnVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzli(this.zzv, this.zzG.zza, zzwkVar, jZza - jZza2, zzau(zzlnVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzynVar, zzaakVar.zzc);
    }

    private final boolean zzax() {
        zzmd zzmdVar = this.zzG;
        return zzmdVar.zzl && zzmdVar.zzn == 0;
    }

    private final void zzay(int i10) throws zziw, IOException {
        zzmp zzmpVar = this.zzb[i10];
        try {
            zzln zzlnVarZzm = this.zzs.zzm();
            zzlnVarZzm.getClass();
            zzmpVar.zzu(zzlnVarZzm);
        } catch (IOException | RuntimeException e10) {
            zzmpVar.zze();
            throw e10;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzmpVarArr[i10].zzc()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f10) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i10) {
        this.zzi.zze(33, i10, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzit
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final void zzcS(long j10, long j11, zzv zzvVar, @Nullable MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z10, int i10, int i11) {
        this.zzi.zze(1, z10 ? 1 : 0, (i11 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i10, long j10) {
        this.zzi.zzd(3, new zzle(zzbfVar, i10, j10)).zza();
    }

    public final void zzg(zzms zzmsVar) {
        this.zzi.zzd(38, zzmsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z10) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzk(zzmh zzmhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmhVar).zza();
        } else {
            zzee.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmhVar.zzi(false);
        }
    }

    public final boolean zzl(@Nullable Object obj, long j10) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdqVar)).zza();
        if (j10 != -9223372036854775807L) {
            return zzdqVar.zze(j10);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(7, zzdqVar).zza();
        return zzdqVar.zze(this.zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzo() {
        zzdx zzdxVar = this.zzi;
        zzdxVar.zzk(2);
        zzdxVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        this.zzi.zzd(8, zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        this.zzi.zzd(9, (zzwi) zzyeVar).zza();
    }

    public final /* synthetic */ void zzu(int i10, boolean z10) {
        this.zzw.zzB(i10, this.zzb[i10].zze(), z10);
    }

    public final /* synthetic */ void zzv(int i10) {
        this.zzw.zzW(i10);
    }

    public final void zzy(List list, int i10, long j10, zzyf zzyfVar) {
        this.zzi.zzd(17, new zzkz(list, zzyfVar, i10, j10, null)).zza();
    }

    private final boolean zzP(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzwkVar.zzb() && !zzbfVar.zzg()) {
            int i10 = zzbfVar.zzo(zzwkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i10, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j10) {
        zzln zzlnVarZzp;
        long jMin = 1000;
        if (zzw()) {
            if (this.zzG.zze != 3) {
                jMin = zza;
            }
            zzmp[] zzmpVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                jMin = Math.min(jMin, zzfj.zzp(zzmpVarArr[i10].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzlq zzlqVar = this.zzs;
                if (zzlqVar.zzm() != null) {
                    zzlnVarZzp = zzlqVar.zzm().zzp();
                } else {
                    zzlnVarZzp = null;
                }
                if (zzlnVarZzp != null) {
                    if (this.zzT + (zzfj.zzq(jMin) * this.zzG.zzo.zzb) >= zzlnVarZzp.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j10 + jMin);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    private final long zzT(zzwk zzwkVar, long j10, boolean z10, boolean z11) throws zziw {
        zzK();
        boolean z12 = true;
        zzaC(false, true);
        if (z11 || this.zzG.zze == 3) {
            zzB(2);
        }
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzm = zzlqVar.zzm();
        zzln zzlnVarZzp = zzlnVarZzm;
        while (zzlnVarZzp != null && !zzwkVar.equals(zzlnVarZzp.zzg.zza)) {
            zzlnVarZzp = zzlnVarZzp.zzp();
        }
        if (z10 || zzlnVarZzm != zzlnVarZzp || (zzlnVarZzp != null && zzlnVarZzp.zza() + j10 < 0)) {
            zzaa();
            if (zzlnVarZzp != null) {
                while (zzlqVar.zzm() != zzlnVarZzp) {
                    zzlqVar.zzr();
                }
                zzlqVar.zzs(zzlnVarZzp);
                zzlnVarZzp.zzb(1000000000000L);
                zzap();
                zzlnVarZzp.zzh = true;
            }
        }
        zzab();
        if (zzlnVarZzp != null) {
            zzlqVar.zzs(zzlnVarZzp);
            if (!zzlnVarZzp.zze) {
                zzlnVarZzp.zzg = zzlnVarZzp.zzg.zza(j10);
            } else if (zzlnVarZzp.zzf) {
                if (this.zzC) {
                    boolean z13 = this.zzB.zzi;
                    if (!this.zzG.zza.zzg() && zzlnVarZzp.zzg.zza.equals(this.zzG.zzb)) {
                        zzmp[] zzmpVarArr = this.zzb;
                        boolean zZzF = true;
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzmp zzmpVar = zzmpVarArr[i10];
                            if (zzmpVar.zzM()) {
                                zZzF &= zzmpVar.zzF(zzlnVarZzp, j10);
                            }
                        }
                        if (zZzF) {
                            zzwi zzwiVar = zzlnVarZzp.zza;
                            long j11 = this.zzG.zzs;
                            zzmt zzmtVar = zzmt.zzb;
                            if (zzwiVar.zzk(j11, zzmtVar) == zzwiVar.zzk(j10, zzmtVar)) {
                                z12 = false;
                            } else {
                                zzwi zzwiVar2 = zzlnVarZzp.zza;
                                j10 = zzwiVar2.zzj(j10);
                                zzwiVar2.zzf(j10 - this.zzn, false);
                            }
                        } else {
                            zzwi zzwiVar3 = zzlnVarZzp.zza;
                            j10 = zzwiVar3.zzj(j10);
                            zzwiVar3.zzf(j10 - this.zzn, false);
                        }
                    } else {
                        zzwi zzwiVar4 = zzlnVarZzp.zza;
                        j10 = zzwiVar4.zzj(j10);
                        zzwiVar4.zzf(j10 - this.zzn, false);
                    }
                } else {
                    zzwi zzwiVar5 = zzlnVarZzp.zza;
                    j10 = zzwiVar5.zzj(j10);
                    zzwiVar5.zzf(j10 - this.zzn, false);
                }
            }
            zzU(j10, z12);
            zzam();
        } else {
            zzlqVar.zzv();
            zzU(j10, true);
        }
        zzas(false);
        this.zzi.zzh(2);
        return j10;
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j10 = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmd.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzwk zzwkVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzwkVarZzy.zzb()) {
            zzbfVar.zzo(zzwkVarZzy.zza, zzbdVar);
            if (zzwkVarZzy.zzc == zzbdVar.zzd(zzwkVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(zzwkVarZzy, Long.valueOf(j10));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzlb) arrayList.get(size)).zzb;
            String str = zzfj.zza;
            throw null;
        }
    }

    private static final void zzaE(zzmh zzmhVar) throws zziw {
        zzmhVar.zzh();
        try {
            zzmhVar.zza().zzx(zzmhVar.zzc(), zzmhVar.zze());
        } finally {
            zzmhVar.zzi(true);
        }
    }

    private final void zzac() throws zziw {
        zzad();
        zzI(true);
    }

    private final void zzag(zzbf zzbfVar, zzwk zzwkVar, zzbf zzbfVar2, zzwk zzwkVar2, long j10, boolean z10) throws zziw {
        Object obj;
        zzav zzavVar;
        if (!zzP(zzbfVar, zzwkVar)) {
            if (zzwkVar.zzb()) {
                zzavVar = zzav.zza;
            } else {
                zzavVar = this.zzG.zzo;
            }
            if (!this.zzo.zzj().equals(zzavVar)) {
                zzM(zzavVar);
                zzal(this.zzG.zzo, zzavVar.zzb, false, false);
                return;
            }
            return;
        }
        Object obj2 = zzwkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i10 = zzbfVar.zzo(obj2, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        zzip zzipVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfj.zza;
        zzipVar.zza(zzafVar);
        if (j10 != -9223372036854775807L) {
            zzipVar.zzb(zzO(zzbfVar, obj2, j10));
            return;
        }
        Object obj3 = zzbeVar.zzb;
        if (!zzbfVar2.zzg()) {
            obj = zzbfVar2.zzb(zzbfVar2.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z10) {
            return;
        }
        zzipVar.zzb(-9223372036854775807L);
    }

    public static final /* synthetic */ void zzz(zzmh zzmhVar) {
        try {
            zzaE(zzmhVar);
        } catch (zziw e10) {
            zzee.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    public final void zzj(float f10) {
        this.zzi.zzd(32, Float.valueOf(f10)).zza();
    }
}
