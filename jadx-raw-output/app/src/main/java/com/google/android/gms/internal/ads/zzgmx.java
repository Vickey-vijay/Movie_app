package com.google.android.gms.internal.ads;

import ck.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgmx implements zzgmu {
    private final zzgoe zza;
    private final long zzb;

    public zzgmx(zzgao zzgaoVar, zzgoe zzgoeVar, long j10) {
        this.zza = zzgoeVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zza(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzgduVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z10 = zzgduVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z10) {
            this.zza.zzb(20203);
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zzb(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzgduVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }

    private static boolean zzc(zzgdu zzgduVar) {
        int iZza = zzgduVar.zzb().zza().zza();
        int iZzb = zzgduVar.zzb().zza().zzb();
        byte[] bArrZza = zzatu.zza();
        p.j(bArrZza, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        p.i(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZza);
        byteBufferAllocate.putInt(iZzb);
        byte[] bArrArray = byteBufferAllocate.array();
        p.i(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, bArrZza);
    }
}
