package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p3.i;

/* JADX INFO: compiled from: ExoMediaDrm.java */
/* JADX INFO: loaded from: classes7.dex */
public interface c<T extends i> {

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class a {
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface b<T extends i> {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface InterfaceC0177c<T extends i> {
        c<T> acquireExoMediaDrm(UUID uuid);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class d {
    }

    @Nullable
    Class<T> a();

    void b(b<? super T> bVar);

    void closeSession(byte[] bArr);

    T createMediaCrypto(byte[] bArr) throws MediaCryptoException;

    a getKeyRequest(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i10, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    d getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    @Nullable
    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
