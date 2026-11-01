package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhxs extends ThreadLocal {
    public final /* synthetic */ zzhxt zza;

    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzhxe zzhxeVar = zzhxe.zzb;
            zzhxt zzhxtVar = this.zza;
            Mac mac = (Mac) zzhxeVar.zzb(zzhxtVar.zzb());
            mac.init(zzhxtVar.zzc());
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public zzhxs(zzhxt zzhxtVar) {
        Objects.requireNonNull(zzhxtVar);
        this.zza = zzhxtVar;
    }
}
