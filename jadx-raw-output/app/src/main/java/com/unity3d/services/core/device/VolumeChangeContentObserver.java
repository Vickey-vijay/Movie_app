package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import ck.p;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: VolumeChangeContentObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class VolumeChangeContentObserver implements VolumeChange {
    private ContentObserver contentObserver;
    private List<VolumeChangeListener> listeners = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void triggerListeners() {
        for (VolumeChangeListener volumeChangeListener : this.listeners) {
            volumeChangeListener.onVolumeChanged(Device.getStreamVolume(volumeChangeListener.getStreamType()));
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void clearAllListeners() {
        this.listeners.clear();
        stopObserving();
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void registerListener(VolumeChangeListener volumeChangeListener) {
        p.j(volumeChangeListener, "volumeChangeListener");
        if (!this.listeners.contains(volumeChangeListener)) {
            startObserving();
            this.listeners.add(volumeChangeListener);
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void startObserving() {
        ContentResolver contentResolver;
        if (this.contentObserver != null) {
            return;
        }
        this.contentObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.unity3d.services.core.device.VolumeChangeContentObserver.startObserving.1
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return false;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10, Uri uri) {
                VolumeChangeContentObserver.this.triggerListeners();
            }
        };
        Context applicationContext = ClientProperties.getApplicationContext();
        if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
            Uri uri = Settings.System.CONTENT_URI;
            ContentObserver contentObserver = this.contentObserver;
            p.h(contentObserver, "null cannot be cast to non-null type android.database.ContentObserver");
            contentResolver.registerContentObserver(uri, true, contentObserver);
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void stopObserving() {
        ContentResolver contentResolver;
        if (this.contentObserver == null) {
            return;
        }
        Context applicationContext = ClientProperties.getApplicationContext();
        if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
            ContentObserver contentObserver = this.contentObserver;
            p.g(contentObserver);
            contentResolver.unregisterContentObserver(contentObserver);
        }
        this.contentObserver = null;
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void unregisterListener(VolumeChangeListener volumeChangeListener) {
        p.j(volumeChangeListener, "volumeChangeListener");
        this.listeners.remove(volumeChangeListener);
        if (this.listeners.isEmpty()) {
            stopObserving();
        }
    }
}
