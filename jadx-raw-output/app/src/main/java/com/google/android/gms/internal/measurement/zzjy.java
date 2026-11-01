package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzkc;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes8.dex */
public class zzjy<MessageType extends zzkc<MessageType, BuilderType>, BuilderType extends zzjy<MessageType, BuilderType>> extends zzik<MessageType, BuilderType> {
    public zzkc zza;
    public boolean zzb = false;
    private final zzkc zzc;

    @Override // com.google.android.gms.internal.measurement.zzik
    public final /* bridge */ /* synthetic */ zzik zzax(byte[] bArr, int i10, int i11, zzjo zzjoVar) throws zzkm {
        zzaD(bArr, 0, i11, zzjoVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final /* synthetic */ zzlj zzbR() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzjy zzau() {
        zzjy zzjyVar = (zzjy) this.zzc.zzl(5, null, null);
        zzjyVar.zzaC(zzaG());
        return zzjyVar;
    }

    public final zzjy zzaC(zzkc zzkcVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zza(this.zza, zzkcVar);
        return this;
    }

    public final zzjy zzaD(byte[] bArr, int i10, int i11, zzjo zzjoVar) throws zzkm {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        try {
            zzlr.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i11, new zzio(zzjoVar));
            return this;
        } catch (zzkm e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkm.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public MessageType zzaG() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzkc zzkcVar = this.zza;
        zzlr.zza().zzb(zzkcVar.getClass()).zzf(zzkcVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    public void zzaI() {
        zzkc zzkcVar = (zzkc) this.zza.zzl(4, null, null);
        zza(zzkcVar, this.zza);
        this.zza = zzkcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final /* synthetic */ zzik zzav(zzil zzilVar) {
        zzaC((zzkc) zzilVar);
        return this;
    }

    public zzjy(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzkc) messagetype.zzl(4, null, null);
    }

    private static final void zza(zzkc zzkcVar, zzkc zzkcVar2) {
        zzlr.zza().zzb(zzkcVar.getClass()).zzg(zzkcVar, zzkcVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType zzaE() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.zzkc r0 = r5.zzaG()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzl(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.zzlr r3 = com.google.android.gms.internal.measurement.zzlr.zza()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.zzlu r3 = r3.zzb(r4)
            boolean r3 = r3.zzk(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.zzl(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.zzmk r1 = new com.google.android.gms.internal.measurement.zzmk
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjy.zzaE():com.google.android.gms.internal.measurement.zzkc");
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final /* bridge */ /* synthetic */ zzik zzaw(byte[] bArr, int i10, int i11) throws zzkm {
        zzaD(bArr, 0, i11, zzjo.zza());
        return this;
    }
}
