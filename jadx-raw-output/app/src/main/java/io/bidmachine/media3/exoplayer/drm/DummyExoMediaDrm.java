package io.bidmachine.media3.exoplayer.drm;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.CryptoConfig;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class DummyExoMediaDrm implements ExoMediaDrm {
    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void acquire() {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void closeSession(byte[] bArr) {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public int getCryptoType() {
        return 1;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    public PersistableBundle getMetrics() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public /* bridge */ /* synthetic */ List getOfflineLicenseKeySetIds() {
        return super.getOfflineLicenseKeySetIds();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public String getPropertyString(String str) {
        return "";
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void release() {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public /* bridge */ /* synthetic */ void removeOfflineLicense(byte[] bArr) {
        super.removeOfflineLicense(bArr);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void setOnEventListener(@Nullable ExoMediaDrm.OnEventListener onEventListener) {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void setOnExpirationUpdateListener(@Nullable ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(@Nullable ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public /* bridge */ /* synthetic */ void setPlayerIdForSession(byte[] bArr, PlayerId playerId) {
        super.setPlayerIdForSession(bArr, playerId);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyByteArray(String str, byte[] bArr) {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyString(String str, String str2) {
    }

    public static DummyExoMediaDrm getInstance() {
        return new DummyExoMediaDrm();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public CryptoConfig createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i10, @Nullable HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(String str) {
        return Util.EMPTY_BYTE_ARRAY;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.ExoMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }
}
