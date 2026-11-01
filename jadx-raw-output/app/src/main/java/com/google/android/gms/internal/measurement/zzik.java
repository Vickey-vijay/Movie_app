package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzil;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzik<MessageType extends zzil<MessageType, BuilderType>, BuilderType extends zzik<MessageType, BuilderType>> implements zzli {
    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* synthetic */ zzli zzaA(byte[] bArr, zzjo zzjoVar) throws zzkm {
        return zzax(bArr, 0, bArr.length, zzjoVar);
    }

    @Override // 
    public abstract zzik zzau();

    public abstract zzik zzav(zzil zzilVar);

    public zzik zzaw(byte[] bArr, int i10, int i11) throws zzkm {
        throw null;
    }

    public zzik zzax(byte[] bArr, int i10, int i11, zzjo zzjoVar) throws zzkm {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* synthetic */ zzli zzaz(byte[] bArr) throws zzkm {
        return zzaw(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzay(zzlj zzljVar) {
        if (zzbR().getClass().isInstance(zzljVar)) {
            return zzav((zzil) zzljVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
