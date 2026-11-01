package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class zzuu extends zzij {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;

    @Nullable
    private ArrayDeque zzB;

    @Nullable
    private zzuq zzC;

    @Nullable
    private zzun zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;

    @Nullable
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    public zzin zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzut zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzui zzc;
    private final zzuw zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zzub zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zztb zzl;
    private final AtomicInteger zzm;

    @Nullable
    private zzv zzn;
    private zzv zzo;

    @Nullable
    private zzth zzp;

    @Nullable
    private zzth zzq;
    private zzmk zzr;

    @Nullable
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;

    @Nullable
    private zzuk zzw;

    @Nullable
    private zzv zzx;

    @Nullable
    private MediaFormat zzy;
    private boolean zzz;

    private final void zzao() {
        this.zzS = false;
        zzat();
    }

    private final boolean zzbg() {
        return this.zzO >= 0;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbi() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final void zzbn(zzut zzutVar) {
        this.zzag = zzutVar;
        if (zzutVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzD() {
        this.zzn = null;
        zzbn(zzut.zza);
        this.zzk.clear();
        if (this.zzS) {
            zzao();
        } else {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzZ() {
        return this.zzae;
    }

    public boolean zzaC(zzun zzunVar) {
        return true;
    }

    public final boolean zzaD() {
        return this.zzS;
    }

    @Nullable
    public final zzuk zzaE() {
        return this.zzw;
    }

    @Nullable
    public final zzv zzaF() {
        return this.zzx;
    }

    @Nullable
    public final MediaFormat zzaG() {
        return this.zzy;
    }

    @Nullable
    public final zzun zzaH() {
        return this.zzD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzaI() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar != null) {
                zzukVar.zzl();
                this.zza.zzb++;
                zzun zzunVar = this.zzD;
                zzunVar.getClass();
                zzak(zzunVar.zza);
            }
        } finally {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
        }
    }

    public boolean zzaL() {
        return true;
    }

    public final long zzaM() {
        return this.zzal;
    }

    public boolean zzaQ(zzv zzvVar) throws zziw {
        return true;
    }

    public void zzaR(zzih zzihVar) throws zziw {
    }

    public int zzaS(zzih zzihVar) {
        return 0;
    }

    public boolean zzaT(zzih zzihVar) {
        return false;
    }

    public final long zzaU() {
        return this.zzah;
    }

    public final float zzaX() {
        return this.zzu;
    }

    @Nullable
    public final zzmk zzaY() {
        return this.zzr;
    }

    public abstract int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy;

    public abstract List zzad(zzuw zzuwVar, zzv zzvVar, boolean z10) throws zzuy;

    public boolean zzae(zzv zzvVar) {
        return false;
    }

    public abstract zzuh zzaf(zzun zzunVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f10);

    public zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    public float zzai(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    public void zzaj(String str, zzuh zzuhVar, long j10, long j11) {
        throw null;
    }

    public void zzak(String str) {
        throw null;
    }

    public void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    @Nullable
    @CallSuper
    public zzio zzam(zzlh zzlhVar) throws zziw {
        boolean z10 = true;
        this.zzaf = true;
        zzv zzvVarZzM = zzlhVar.zzb;
        zzvVarZzM.getClass();
        String str = zzvVarZzM.zzo;
        if (str == null) {
            throw zzN(new IllegalArgumentException("Sample MIME type is null."), zzvVarZzM, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !zzvVarZzM.zzr.isEmpty()) {
            zzt zztVarZza = zzvVarZzM.zza();
            zztVarZza.zzp(null);
            zzvVarZzM = zztVarZza.zzM();
        }
        zzv zzvVar = zzvVarZzM;
        zzth zzthVar = zzlhVar.zza;
        this.zzq = zzthVar;
        this.zzn = zzvVar;
        if (this.zzS) {
            this.zzU = true;
            return null;
        }
        zzuk zzukVar = this.zzw;
        if (zzukVar == null) {
            this.zzB = null;
            zzaA();
            return null;
        }
        zzun zzunVar = this.zzD;
        zzunVar.getClass();
        zzv zzvVar2 = this.zzx;
        zzvVar2.getClass();
        zzth zzthVar2 = this.zzp;
        if (zzthVar2 != zzthVar) {
            zzbl();
            return new zzio(zzunVar.zza, zzvVar2, zzvVar, 0, 128);
        }
        zzio zzioVarZzag = zzag(zzunVar, zzvVar2, zzvVar);
        int i10 = zzioVarZzag.zzd;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (zzbj(zzvVar)) {
                        this.zzx = zzvVar;
                        if (zzthVar == zzthVar2 || zzbk()) {
                        }
                    } else {
                        i11 = 16;
                    }
                } else if (zzbj(zzvVar)) {
                    this.zzV = true;
                    this.zzW = 1;
                    int i12 = this.zzE;
                    if (i12 != 2 && (i12 != 1 || zzvVar.zzv != zzvVar2.zzv || zzvVar.zzw != zzvVar2.zzw)) {
                        z10 = false;
                    }
                    this.zzH = z10;
                    this.zzx = zzvVar;
                    if (zzthVar == zzthVar2 || zzbk()) {
                    }
                } else {
                    i11 = 16;
                }
            } else if (zzbj(zzvVar)) {
                this.zzx = zzvVar;
                if (zzthVar != zzthVar2) {
                    if (zzbk()) {
                    }
                } else if (this.zzZ) {
                    this.zzX = 1;
                    if (this.zzG) {
                        this.zzY = 3;
                    } else {
                        this.zzY = 1;
                    }
                }
            } else {
                i11 = 16;
            }
            return (i10 != 0 || (this.zzw == zzukVar && this.zzY != 3)) ? zzioVarZzag : new zzio(zzunVar.zza, zzvVar2, zzvVar, 0, i11);
        }
        zzbl();
        i11 = 0;
        if (i10 != 0) {
        }
    }

    public void zzan(zzv zzvVar, @Nullable MediaFormat mediaFormat) throws zziw {
        throw null;
    }

    public void zzap() {
    }

    public abstract boolean zzaq(long j10, long j11, @Nullable zzuk zzukVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zziw;

    public void zzar() throws zziw {
        throw null;
    }

    public void zzas(zzih zzihVar) throws zziw {
        throw null;
    }

    public final void zzaz() {
        this.zzaj = true;
    }

    public final /* synthetic */ zzmk zzbf() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmn
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzy(boolean z10, boolean z11) throws zziw {
        this.zza = new zzin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzz(com.google.android.gms.internal.ads.zzv[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzwk r18) throws com.google.android.gms.internal.ads.zziw {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzut r1 = r0.zzag
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L27
            com.google.android.gms.internal.ads.zzut r1 = new com.google.android.gms.internal.ads.zzut
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbn(r1)
            boolean r1 = r0.zzaj
            if (r1 == 0) goto L5b
            r12.zzap()
            return
        L27:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L5c
            long r5 = r0.zzac
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3f
            long r7 = r0.zzah
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L5c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L5c
        L3f:
            com.google.android.gms.internal.ads.zzut r1 = new com.google.android.gms.internal.ads.zzut
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbn(r1)
            com.google.android.gms.internal.ads.zzut r1 = r0.zzag
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L5b
            r12.zzap()
        L5b:
            return
        L5c:
            com.google.android.gms.internal.ads.zzut r9 = new com.google.android.gms.internal.ads.zzut
            long r3 = r0.zzac
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzwk):void");
    }

    private final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzav() {
        try {
            zzuk zzukVar = this.zzw;
            zzukVar.getClass();
            zzukVar.zzk();
        } finally {
            zzaN();
        }
    }

    private final boolean zzay(long j10) {
        return this.zzt == -9223372036854775807L || zzL().zzb() - j10 < this.zzt;
    }

    public static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbj(@Nullable zzv zzvVar) throws zziw {
        if (this.zzw != null && this.zzY != 3 && zze() != 0) {
            float f10 = this.zzv;
            zzvVar.getClass();
            float fZzai = zzai(f10, zzvVar, zzI());
            float f11 = this.zzA;
            if (f11 != fZzai) {
                if (fZzai == -1.0f) {
                    zzbl();
                    return false;
                }
                if (f11 != -1.0f || fZzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzai);
                    zzuk zzukVar = this.zzw;
                    zzukVar.getClass();
                    zzukVar.zzp(bundle);
                    this.zzA = fZzai;
                }
            }
        }
        return true;
    }

    private final boolean zzbk() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            if (this.zzG) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbp();
        }
        return true;
    }

    private final void zzbl() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbm() throws zziw {
        int i10 = this.zzY;
        if (i10 == 1) {
            zzav();
            return;
        }
        if (i10 == 2) {
            zzav();
            zzbp();
        } else if (i10 != 3) {
            this.zzae = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }

    private final zzut zzbo() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzut) arrayDeque.getLast() : this.zzag;
    }

    private final void zzbp() throws zziw {
        zzth zzthVar = this.zzq;
        zzthVar.getClass();
        this.zzp = zzthVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final boolean zzbq(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        zzv zzvVar = this.zzo;
        if (zzvVar == null || !Objects.equals(zzvVar.zzo, "audio/opus")) {
            return true;
        }
        return !zzafu.zzf(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzA(long j10, boolean z10, boolean z11) throws zziw {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzut) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzS) {
                zzat();
            } else {
                zzaJ();
            }
            zzff zzffVar = this.zzag.zze;
            if (zzffVar.zzc() > 0) {
                this.zzaf = true;
            }
            zzffVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final long zzT(long j10, long j11) {
        return zzah(j10, j11, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public void zzV(float f10, float f11) throws zziw {
        this.zzu = f10;
        this.zzv = f11;
        zzbj(this.zzx);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16311. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.ads.zzml
    public void zzX(long r27, long r29) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instruction units count: 1631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzX(long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b2 A[Catch: Exception -> 0x0102, TryCatch #11 {Exception -> 0x0102, blocks: (B:63:0x00f8, B:75:0x0143, B:77:0x0155, B:80:0x0164, B:84:0x0177, B:86:0x017f, B:88:0x0187, B:90:0x0191, B:92:0x0199, B:94:0x01a1, B:98:0x01ac, B:100:0x01b2, B:104:0x01bd, B:106:0x01c6, B:131:0x021d, B:133:0x0224, B:135:0x022a, B:136:0x0238, B:111:0x01d3, B:113:0x01db, B:115:0x01e3, B:117:0x01eb, B:119:0x01f3, B:121:0x01fb, B:123:0x0203, B:125:0x020d, B:127:0x0217), top: B:193:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c6 A[Catch: Exception -> 0x0102, TryCatch #11 {Exception -> 0x0102, blocks: (B:63:0x00f8, B:75:0x0143, B:77:0x0155, B:80:0x0164, B:84:0x0177, B:86:0x017f, B:88:0x0187, B:90:0x0191, B:92:0x0199, B:94:0x01a1, B:98:0x01ac, B:100:0x01b2, B:104:0x01bd, B:106:0x01c6, B:131:0x021d, B:133:0x0224, B:135:0x022a, B:136:0x0238, B:111:0x01d3, B:113:0x01db, B:115:0x01e3, B:117:0x01eb, B:119:0x01f3, B:121:0x01fb, B:123:0x0203, B:125:0x020d, B:127:0x0217), top: B:193:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01d3 A[Catch: Exception -> 0x0102, TryCatch #11 {Exception -> 0x0102, blocks: (B:63:0x00f8, B:75:0x0143, B:77:0x0155, B:80:0x0164, B:84:0x0177, B:86:0x017f, B:88:0x0187, B:90:0x0191, B:92:0x0199, B:94:0x01a1, B:98:0x01ac, B:100:0x01b2, B:104:0x01bd, B:106:0x01c6, B:131:0x021d, B:133:0x0224, B:135:0x022a, B:136:0x0238, B:111:0x01d3, B:113:0x01db, B:115:0x01e3, B:117:0x01eb, B:119:0x01f3, B:121:0x01fb, B:123:0x0203, B:125:0x020d, B:127:0x0217), top: B:193:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0203 A[Catch: Exception -> 0x0102, TryCatch #11 {Exception -> 0x0102, blocks: (B:63:0x00f8, B:75:0x0143, B:77:0x0155, B:80:0x0164, B:84:0x0177, B:86:0x017f, B:88:0x0187, B:90:0x0191, B:92:0x0199, B:94:0x01a1, B:98:0x01ac, B:100:0x01b2, B:104:0x01bd, B:106:0x01c6, B:131:0x021d, B:133:0x0224, B:135:0x022a, B:136:0x0238, B:111:0x01d3, B:113:0x01db, B:115:0x01e3, B:117:0x01eb, B:119:0x01f3, B:121:0x01fb, B:123:0x0203, B:125:0x020d, B:127:0x0217), top: B:193:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x022a A[Catch: Exception -> 0x0102, TryCatch #11 {Exception -> 0x0102, blocks: (B:63:0x00f8, B:75:0x0143, B:77:0x0155, B:80:0x0164, B:84:0x0177, B:86:0x017f, B:88:0x0187, B:90:0x0191, B:92:0x0199, B:94:0x01a1, B:98:0x01ac, B:100:0x01b2, B:104:0x01bd, B:106:0x01c6, B:131:0x021d, B:133:0x0224, B:135:0x022a, B:136:0x0238, B:111:0x01d3, B:113:0x01db, B:115:0x01e3, B:117:0x01eb, B:119:0x01f3, B:121:0x01fb, B:123:0x0203, B:125:0x020d, B:127:0x0217), top: B:193:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0284 A[Catch: zzuq -> 0x02b1, TryCatch #8 {zzuq -> 0x02b1, blocks: (B:153:0x026b, B:155:0x0284, B:157:0x028d, B:160:0x029b, B:161:0x029d, B:156:0x0287, B:162:0x029e, B:164:0x02a4, B:165:0x02b0), top: B:188:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0287 A[Catch: zzuq -> 0x02b1, TryCatch #8 {zzuq -> 0x02b1, blocks: (B:153:0x026b, B:155:0x0284, B:157:0x028d, B:160:0x029b, B:161:0x029d, B:156:0x0287, B:162:0x029e, B:164:0x02a4, B:165:0x02b0), top: B:188:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0155 A[Catch: Exception -> 0x0102, TRY_LEAVE, TryCatch #11 {Exception -> 0x0102, blocks: (B:63:0x00f8, B:75:0x0143, B:77:0x0155, B:80:0x0164, B:84:0x0177, B:86:0x017f, B:88:0x0187, B:90:0x0191, B:92:0x0199, B:94:0x01a1, B:98:0x01ac, B:100:0x01b2, B:104:0x01bd, B:106:0x01c6, B:131:0x021d, B:133:0x0224, B:135:0x022a, B:136:0x0238, B:111:0x01d3, B:113:0x01db, B:115:0x01e3, B:117:0x01eb, B:119:0x01f3, B:121:0x01fb, B:123:0x0203, B:125:0x020d, B:127:0x0217), top: B:193:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0177 A[Catch: Exception -> 0x0102, TryCatch #11 {Exception -> 0x0102, blocks: (B:63:0x00f8, B:75:0x0143, B:77:0x0155, B:80:0x0164, B:84:0x0177, B:86:0x017f, B:88:0x0187, B:90:0x0191, B:92:0x0199, B:94:0x01a1, B:98:0x01ac, B:100:0x01b2, B:104:0x01bd, B:106:0x01c6, B:131:0x021d, B:133:0x0224, B:135:0x022a, B:136:0x0238, B:111:0x01d3, B:113:0x01db, B:115:0x01e3, B:117:0x01eb, B:119:0x01f3, B:121:0x01fb, B:123:0x0203, B:125:0x020d, B:127:0x0217), top: B:193:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x017f A[Catch: Exception -> 0x0102, TryCatch #11 {Exception -> 0x0102, blocks: (B:63:0x00f8, B:75:0x0143, B:77:0x0155, B:80:0x0164, B:84:0x0177, B:86:0x017f, B:88:0x0187, B:90:0x0191, B:92:0x0199, B:94:0x01a1, B:98:0x01ac, B:100:0x01b2, B:104:0x01bd, B:106:0x01c6, B:131:0x021d, B:133:0x0224, B:135:0x022a, B:136:0x0238, B:111:0x01d3, B:113:0x01db, B:115:0x01e3, B:117:0x01eb, B:119:0x01f3, B:121:0x01fb, B:123:0x0203, B:125:0x020d, B:127:0x0217), top: B:193:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.android.gms.internal.ads.zzui] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.gms.internal.ads.zzuh] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.android.gms.internal.ads.zzun] */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.zzun, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzaA() throws zziw {
        zzv zzvVar;
        zzv zzvVar2;
        ?? r10;
        ?? Zzaf;
        zzuq zzuqVar;
        zzuq zzuqVar2;
        zzv zzvVar3;
        ?? r18;
        long jZzb;
        int i10;
        boolean z10;
        boolean z11;
        ?? r19;
        if (this.zzw != null || this.zzS || (zzvVar = this.zzn) == null) {
            return;
        }
        ?? r11 = 1;
        if (zzaB(zzvVar)) {
            zzao();
            String str = zzvVar.zzo;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzm(32);
            } else {
                this.zzi.zzm(1);
            }
            this.zzS = true;
            return;
        }
        zzth zzthVar = this.zzq;
        this.zzp = zzthVar;
        if (zzthVar != null) {
            zzgrc.zzi(true);
            this.zzp.zza();
        }
        try {
            zzv zzvVar4 = this.zzn;
            zzvVar4.getClass();
            MediaCrypto mediaCrypto = null;
            if (this.zzB == null) {
                try {
                    List listZzad = zzad(this.zzd, zzvVar4, false);
                    listZzad.isEmpty();
                    this.zzB = new ArrayDeque();
                    if (!listZzad.isEmpty()) {
                        this.zzB.add((zzun) listZzad.get(0));
                    }
                    this.zzC = null;
                } catch (zzuy e10) {
                    throw new zzuq(zzvVar4, (Throwable) e10, false, -49998);
                }
            }
            try {
                if (this.zzB.isEmpty()) {
                    throw new zzuq(zzvVar4, (Throwable) null, false, -49999);
                }
                ArrayDeque arrayDeque = this.zzB;
                arrayDeque.getClass();
                ?? r12 = arrayDeque;
                zzv zzvVar5 = zzvVar;
                while (this.zzw == null) {
                    ?? r13 = (zzun) r12.peekFirst();
                    r13.getClass();
                    zzaQ(zzvVar4);
                    if (!zzaC(r13)) {
                        return;
                    }
                    try {
                        this.zzD = r13;
                        zzv zzvVar6 = this.zzn;
                        zzvVar6.getClass();
                        String str2 = r13.zza;
                        float fZzai = zzai(this.zzv, zzvVar6, zzI());
                        if (fZzai <= this.zze) {
                            fZzai = -1.0f;
                        }
                        long jZzb2 = zzL().zzb();
                        try {
                            Zzaf = zzaf(r13, zzvVar6, mediaCrypto, fZzai);
                            r13 = Build.VERSION.SDK_INT;
                            try {
                                if (r13 >= 31) {
                                    try {
                                        LogSessionId logSessionIdZza = zzK().zza();
                                        ?? r110 = r12;
                                        try {
                                            r19 = r110;
                                            if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                                zzvVar3 = zzvVar5;
                                                try {
                                                    Zzaf.zzb.setString("log-session-id", logSessionIdZza.getStringId());
                                                    r10 = "log-session-id";
                                                    r18 = r110;
                                                    zzvVar2 = zzvVar3;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    Zzaf = r110;
                                                    zzvVar2 = zzvVar3;
                                                    r10 = 1;
                                                    zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r13.zza), e);
                                                    Zzaf.removeFirst();
                                                    zzuqVar = new zzuq(zzvVar4, (Throwable) e, false, (zzun) r13);
                                                    zzal(zzuqVar);
                                                    zzuqVar2 = this.zzC;
                                                    if (zzuqVar2 == null) {
                                                        this.zzC = zzuqVar;
                                                    } else {
                                                        this.zzC = zzuqVar2.zza(zzuqVar);
                                                    }
                                                    if (Zzaf.isEmpty()) {
                                                        throw this.zzC;
                                                    }
                                                    r12 = Zzaf;
                                                    mediaCrypto = null;
                                                    r11 = r10;
                                                    zzvVar5 = zzvVar2;
                                                }
                                            }
                                            StringBuilder sb2 = new StringBuilder(str2.length() + 12);
                                            sb2.append("createCodec:");
                                            sb2.append(str2);
                                            Trace.beginSection(sb2.toString());
                                            zzuk zzukVarZzb = this.zzc.zzb(Zzaf);
                                            this.zzw = zzukVarZzb;
                                            r10 = 0;
                                            this.zzL = zzukVarZzb.zzm(new zzus(this, null));
                                            Trace.endSection();
                                            jZzb = zzL().zzb();
                                            if (r13.zzc(zzvVar6)) {
                                                this.zzA = fZzai;
                                                this.zzx = zzvVar6;
                                                if (r13 <= 25) {
                                                    i10 = 0;
                                                } else {
                                                    i10 = 0;
                                                }
                                                this.zzE = i10;
                                                if (r13 == 29) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                this.zzF = z10;
                                                this.zzG = false;
                                                String str3 = r13.zza;
                                                if (r13 > 25) {
                                                    z11 = r13 > 29 ? false : false;
                                                } else if (r13 > 29) {
                                                }
                                                this.zzJ = z11;
                                                this.zzw.getClass();
                                                if (zze() == 2) {
                                                    this.zzM = zzL().zzb() + 1000;
                                                }
                                                r10 = 1;
                                                r10 = 1;
                                                r10 = 1;
                                                this.zza.zza++;
                                                r13 = r13;
                                                Zzaf = r18;
                                                zzaj(str2, Zzaf, jZzb, jZzb - jZzb2);
                                            } else {
                                                Object[] objArr = new Object[2];
                                                objArr[0] = zzv.zze(zzvVar6);
                                                try {
                                                    objArr[1] = str2;
                                                    String str4 = zzfj.zza;
                                                    zzee.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                                                    this.zzA = fZzai;
                                                    this.zzx = zzvVar6;
                                                    if (r13 <= 25 || !"OMX.Exynos.avc.dec.secure".equals(str2)) {
                                                        i10 = 0;
                                                    } else {
                                                        String str5 = Build.MODEL;
                                                        if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                                                            i10 = 2;
                                                        } else {
                                                            i10 = 0;
                                                        }
                                                    }
                                                    this.zzE = i10;
                                                    if (r13 == 29 || !"c2.android.aac.decoder".equals(str2)) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = true;
                                                    }
                                                    this.zzF = z10;
                                                    this.zzG = false;
                                                    String str6 = r13.zza;
                                                    if (r13 > 25 && "OMX.rk.video_decoder.avc".equals(str6)) {
                                                        z11 = true;
                                                    } else if ((r13 > 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6) || "OMX.bcm.vdec.avc.tunnel".equals(str6) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str6) || "OMX.bcm.vdec.hevc.tunnel".equals(str6) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str6))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && r13.zzf)) {
                                                        z11 = true;
                                                    }
                                                    this.zzJ = z11;
                                                    this.zzw.getClass();
                                                    if (zze() == 2) {
                                                        this.zzM = zzL().zzb() + 1000;
                                                    }
                                                    r10 = 1;
                                                    r10 = 1;
                                                    r10 = 1;
                                                    try {
                                                        this.zza.zza++;
                                                        r13 = r13;
                                                        Zzaf = r18;
                                                        try {
                                                            zzaj(str2, Zzaf, jZzb, jZzb - jZzb2);
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        Zzaf = r18;
                                                        zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r13.zza), e);
                                                        Zzaf.removeFirst();
                                                        zzuqVar = new zzuq(zzvVar4, (Throwable) e, false, (zzun) r13);
                                                        zzal(zzuqVar);
                                                        zzuqVar2 = this.zzC;
                                                        if (zzuqVar2 == null) {
                                                            this.zzC = zzuqVar;
                                                        } else {
                                                            this.zzC = zzuqVar2.zza(zzuqVar);
                                                        }
                                                        if (Zzaf.isEmpty()) {
                                                            throw this.zzC;
                                                        }
                                                    }
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    r10 = 1;
                                                    Zzaf = r18;
                                                    zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r13.zza), e);
                                                    Zzaf.removeFirst();
                                                    zzuqVar = new zzuq(zzvVar4, (Throwable) e, false, (zzun) r13);
                                                    zzal(zzuqVar);
                                                    zzuqVar2 = this.zzC;
                                                    if (zzuqVar2 == null) {
                                                        this.zzC = zzuqVar;
                                                    } else {
                                                        this.zzC = zzuqVar2.zza(zzuqVar);
                                                    }
                                                    if (Zzaf.isEmpty()) {
                                                        throw this.zzC;
                                                    }
                                                    r12 = Zzaf;
                                                    mediaCrypto = null;
                                                    r11 = r10;
                                                    zzvVar5 = zzvVar2;
                                                }
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            zzvVar3 = zzvVar5;
                                        }
                                    } catch (Exception e16) {
                                        e = e16;
                                        zzvVar2 = zzvVar5;
                                        Zzaf = r12;
                                    }
                                    r12 = Zzaf;
                                    mediaCrypto = null;
                                    r11 = r10;
                                    zzvVar5 = zzvVar2;
                                } else {
                                    r19 = r12;
                                }
                                StringBuilder sb3 = new StringBuilder(str2.length() + 12);
                                sb3.append("createCodec:");
                                sb3.append(str2);
                                Trace.beginSection(sb3.toString());
                                zzuk zzukVarZzb2 = this.zzc.zzb(Zzaf);
                                this.zzw = zzukVarZzb2;
                                r10 = 0;
                                this.zzL = zzukVarZzb2.zzm(new zzus(this, null));
                                Trace.endSection();
                                jZzb = zzL().zzb();
                                if (r13.zzc(zzvVar6)) {
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = zzv.zze(zzvVar6);
                                    objArr2[1] = str2;
                                    String str7 = zzfj.zza;
                                    zzee.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr2));
                                    this.zzA = fZzai;
                                    this.zzx = zzvVar6;
                                    if (r13 <= 25) {
                                        i10 = 0;
                                    } else {
                                        i10 = 0;
                                    }
                                    this.zzE = i10;
                                    if (r13 == 29) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    this.zzF = z10;
                                    this.zzG = false;
                                    String str8 = r13.zza;
                                    if (r13 > 25) {
                                        if (r13 > 29) {
                                        }
                                    } else if (r13 > 29) {
                                    }
                                    this.zzJ = z11;
                                    this.zzw.getClass();
                                    if (zze() == 2) {
                                        this.zzM = zzL().zzb() + 1000;
                                    }
                                    r10 = 1;
                                    r10 = 1;
                                    r10 = 1;
                                    this.zza.zza++;
                                    r13 = r13;
                                    Zzaf = r18;
                                    zzaj(str2, Zzaf, jZzb, jZzb - jZzb2);
                                } else {
                                    this.zzA = fZzai;
                                    this.zzx = zzvVar6;
                                    if (r13 <= 25) {
                                        i10 = 0;
                                    } else {
                                        i10 = 0;
                                    }
                                    this.zzE = i10;
                                    if (r13 == 29) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    this.zzF = z10;
                                    this.zzG = false;
                                    String str9 = r13.zza;
                                    if (r13 > 25) {
                                        if (r13 > 29) {
                                        }
                                    } else if (r13 > 29) {
                                    }
                                    this.zzJ = z11;
                                    this.zzw.getClass();
                                    if (zze() == 2) {
                                        this.zzM = zzL().zzb() + 1000;
                                    }
                                    r10 = 1;
                                    r10 = 1;
                                    r10 = 1;
                                    this.zza.zza++;
                                    r13 = r13;
                                    Zzaf = r18;
                                    zzaj(str2, Zzaf, jZzb, jZzb - jZzb2);
                                }
                            } catch (Throwable th2) {
                                r13 = r13;
                                Zzaf = r18;
                                r10 = 1;
                                Trace.endSection();
                                throw th2;
                            }
                            zzvVar2 = zzvVar5;
                            r10 = zzvVar5;
                            r18 = r19;
                        } catch (Exception e17) {
                            e = e17;
                            Zzaf = r12;
                            zzvVar2 = zzvVar5;
                        }
                    } catch (Exception e18) {
                        e = e18;
                        r13 = r13;
                        zzvVar2 = zzvVar5;
                        r10 = r11;
                        Zzaf = r12;
                    }
                    r12 = Zzaf;
                    mediaCrypto = null;
                    r11 = r10;
                    zzvVar5 = zzvVar2;
                }
                this.zzB = mediaCrypto;
            } catch (zzuq e19) {
                e = e19;
                throw zzN(e, zzvVar, false, 4001);
            }
        } catch (zzuq e20) {
            e = e20;
            throw zzN(e, zzvVar, false, 4001);
        }
    }

    public final boolean zzaB(zzv zzvVar) {
        return this.zzq == null && zzae(zzvVar);
    }

    public boolean zzaK() {
        int i10 = this.zzY;
        if (i10 == 3 || ((this.zzF && !this.zzab) || (this.zzG && this.zzaa))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            zzbp();
            return false;
        } catch (zziw e10) {
            zzee.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    public zzum zzaP(Throwable th2, @Nullable zzun zzunVar) {
        return new zzum(th2, zzunVar);
    }

    @CallSuper
    public void zzaV(long j10) {
        this.zzah = j10;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j10 < ((zzut) arrayDeque.peek()).zzb) {
                return;
            }
            zzut zzutVar = (zzut) arrayDeque.poll();
            zzutVar.getClass();
            zzbn(zzutVar);
            zzap();
        }
    }

    public final boolean zzaW() {
        if (this.zzn != null) {
            if (zzQ() || zzbg()) {
                return true;
            }
            if (this.zzM != -9223372036854775807L && zzL().zzb() < this.zzM) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzaZ() throws zziw {
        return zzbj(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final int zzab(zzv zzvVar) throws zziw {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzuy e10) {
            throw zzN(e10, zzvVar, false, 4002);
        }
    }

    public final long zzba() {
        return this.zzag.zzf;
    }

    public final long zzbb() {
        return this.zzag.zzd;
    }

    public final long zzbc() {
        return this.zzag.zzc;
    }

    public final /* synthetic */ void zzbe(zzlh zzlhVar) {
        this.zzm.set(zzO(zzlhVar, this.zzg, 0));
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public void zzx(int i10, @Nullable Object obj) throws zziw {
        if (i10 == 11) {
            zzmk zzmkVar = (zzmk) obj;
            zzmkVar.getClass();
            this.zzr = zzmkVar;
        }
    }

    public zzuu(int i10, zzui zzuiVar, zzuw zzuwVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzuiVar;
        zzuwVar.getClass();
        this.zzd = zzuwVar;
        this.zze = f10;
        this.zzm = new AtomicInteger();
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zzub zzubVar = new zzub();
        this.zzi = zzubVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzut.zza;
        zzubVar.zzj(0);
        zzubVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zztb();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzW = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzin();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzat() {
        zzaw();
        this.zzU = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzT = false;
        this.zzl.zzb();
    }

    private final boolean zzax(int i10) throws zziw {
        zzlh zzlhVarZzH = zzH();
        zzih zzihVar = this.zzf;
        zzihVar.zza();
        int iZzO = zzO(zzlhVarZzH, zzihVar, i10 | 4);
        if (iZzO == -5) {
            zzam(zzlhVarZzH);
            return true;
        }
        if (iZzO == -4 && zzihVar.zzb()) {
            this.zzad = true;
            zzbm();
            return false;
        }
        return false;
    }

    public final boolean zzaJ() throws zziw {
        boolean zZzau = zzau();
        if (zZzau) {
            zzaA();
        }
        return zZzau;
    }

    @CallSuper
    public void zzaN() {
        zzbh();
        zzbi();
        zzaw();
        this.zzM = -9223372036854775807L;
        this.zzaa = false;
        this.zzK = -9223372036854775807L;
        this.zzZ = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    @CallSuper
    public final void zzaO() {
        zzaN();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzab = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzV = false;
        this.zzW = 0;
    }

    public long zzah(long j10, long j11, boolean z10) {
        return super.zzT(j10, j11);
    }

    private final void zzaw() {
        this.zzac = -9223372036854775807L;
        zzbo().zzf = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }
}
