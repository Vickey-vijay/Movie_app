package cg;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Log;

/* JADX INFO: compiled from: WifiLockManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j2 {
    private static final String TAG = "WifiLockManager";
    private static final String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private final Context applicationContext;
    private boolean enabled;
    private boolean stayAwake;

    @Nullable
    private WifiManager.WifiLock wifiLock;

    private void updateWifiLock() {
        WifiManager.WifiLock wifiLock = this.wifiLock;
        if (wifiLock == null) {
            return;
        }
        if (this.enabled && this.stayAwake) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void setEnabled(boolean z10) {
        if (z10 && this.wifiLock == null) {
            WifiManager wifiManager = (WifiManager) this.applicationContext.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                Log.w(TAG, "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, WIFI_LOCK_TAG);
                this.wifiLock = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.enabled = z10;
        updateWifiLock();
    }

    public void setStayAwake(boolean z10) {
        this.stayAwake = z10;
        updateWifiLock();
    }

    public j2(Context context) {
        this.applicationContext = context.getApplicationContext();
    }
}
