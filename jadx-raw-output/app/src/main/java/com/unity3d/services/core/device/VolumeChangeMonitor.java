package com.unity3d.services.core.device;

import android.util.SparseArray;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;

/* JADX INFO: compiled from: VolumeChangeMonitor.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class VolumeChangeMonitor {
    private final IEventSender eventSender;
    private final VolumeChange volumeChange;
    private final SparseArray<VolumeChangeListener> volumeChangeListeners;

    public VolumeChangeMonitor(IEventSender iEventSender, VolumeChange volumeChange) {
        p.j(iEventSender, "eventSender");
        p.j(volumeChange, "volumeChange");
        this.eventSender = iEventSender;
        this.volumeChange = volumeChange;
        this.volumeChangeListeners = new SparseArray<>();
    }

    public final void registerVolumeChangeListener(final int i10) {
        if (this.volumeChangeListeners.get(i10) == null) {
            VolumeChangeListener volumeChangeListener = new VolumeChangeListener() { // from class: com.unity3d.services.core.device.VolumeChangeMonitor$registerVolumeChangeListener$listener$1
                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public int getStreamType() {
                    return i10;
                }

                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public void onVolumeChanged(int i11) {
                    this.this$0.eventSender.sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(getStreamType()), Integer.valueOf(i11), Integer.valueOf(Device.getStreamMaxVolume(i10)));
                }
            };
            this.volumeChangeListeners.append(i10, volumeChangeListener);
            this.volumeChange.registerListener(volumeChangeListener);
        }
    }

    public final void unregisterVolumeChangeListener(int i10) {
        if (this.volumeChangeListeners.get(i10) != null) {
            VolumeChangeListener volumeChangeListener = this.volumeChangeListeners.get(i10);
            VolumeChange volumeChange = this.volumeChange;
            p.i(volumeChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            volumeChange.unregisterListener(volumeChangeListener);
            this.volumeChangeListeners.remove(i10);
        }
    }
}
