package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhhi extends zzhhg {
    @Override // com.google.android.gms.internal.ads.zzhhg
    public final zzhhe zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzhhh(bArr, i10);
    }

    public zzhhi(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }
}
