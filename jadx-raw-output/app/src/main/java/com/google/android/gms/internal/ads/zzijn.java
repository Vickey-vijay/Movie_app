package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzijn implements zzatj {
    private static final zzijy zzg = zzijy.zzb(zzijn.class);
    public final String zza;
    public long zzd;
    public zzijs zzf;
    private ByteBuffer zzh;
    public long zze = -1;
    public boolean zzc = true;
    public boolean zzb = true;

    public zzijn(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        if (this.zzc) {
            return;
        }
        try {
            zzijy zzijyVar = zzg;
            String str = this.zza;
            zzijyVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzh = this.zzf.zze(this.zzd, this.zze);
            this.zzc = true;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final String zza() {
        return this.zza;
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        zzc();
        zzijy zzijyVar = zzg;
        String str = this.zza;
        zzijyVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzh;
        if (byteBuffer != null) {
            this.zzb = true;
            byteBuffer.rewind();
            zze(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final void zzb(zzijs zzijsVar, ByteBuffer byteBuffer, long j10, zzatg zzatgVar) throws IOException {
        this.zzd = zzijsVar.zzc();
        byteBuffer.remaining();
        this.zze = j10;
        this.zzf = zzijsVar;
        zzijsVar.zzd(zzijsVar.zzc() + j10);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }
}
