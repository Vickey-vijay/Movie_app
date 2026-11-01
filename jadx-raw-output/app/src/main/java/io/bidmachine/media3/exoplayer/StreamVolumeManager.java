package io.bidmachine.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.StreamVolumeManager;

/* JADX INFO: loaded from: classes8.dex */
public final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private final AudioManager audioManager;
    private final Handler eventHandler;
    private final Listener listener;
    private boolean muted;

    @Nullable
    private b receiver;
    private int streamType;
    private int volume;

    public interface Listener {
        void onStreamTypeChanged(int i10);

        void onStreamVolumeChanged(int i10, boolean z10);
    }

    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = StreamVolumeManager.this.eventHandler;
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            handler.post(new Runnable() { // from class: cg.h2
                @Override // java.lang.Runnable
                public final void run() {
                    StreamVolumeManager.access$200(streamVolumeManager);
                }
            });
        }
    }

    private static boolean getMutedFromManager(AudioManager audioManager, int i10) {
        if (Util.SDK_INT >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return getVolumeFromManager(audioManager, i10) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVolumeAndNotifyIfChanged() {
        int volumeFromManager = getVolumeFromManager(this.audioManager, this.streamType);
        boolean mutedFromManager = getMutedFromManager(this.audioManager, this.streamType);
        if (this.volume == volumeFromManager && this.muted == mutedFromManager) {
            return;
        }
        this.volume = volumeFromManager;
        this.muted = mutedFromManager;
        this.listener.onStreamVolumeChanged(volumeFromManager, mutedFromManager);
    }

    public void decreaseVolume(int i10) {
        if (this.volume <= getMinVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, -1, i10);
        updateVolumeAndNotifyIfChanged();
    }

    public int getMaxVolume() {
        return this.audioManager.getStreamMaxVolume(this.streamType);
    }

    public int getMinVolume() {
        if (Util.SDK_INT >= 28) {
            return this.audioManager.getStreamMinVolume(this.streamType);
        }
        return 0;
    }

    public int getVolume() {
        return this.volume;
    }

    public void increaseVolume(int i10) {
        if (this.volume >= getMaxVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, 1, i10);
        updateVolumeAndNotifyIfChanged();
    }

    public boolean isMuted() {
        return this.muted;
    }

    public void release() {
        b bVar = this.receiver;
        if (bVar != null) {
            try {
                this.applicationContext.unregisterReceiver(bVar);
            } catch (RuntimeException e10) {
                Log.w(TAG, "Error unregistering stream volume receiver", e10);
            }
            this.receiver = null;
        }
    }

    public void setMuted(boolean z10, int i10) {
        if (Util.SDK_INT >= 23) {
            this.audioManager.adjustStreamVolume(this.streamType, z10 ? -100 : 100, i10);
        } else {
            this.audioManager.setStreamMute(this.streamType, z10);
        }
        updateVolumeAndNotifyIfChanged();
    }

    public void setStreamType(int i10) {
        if (this.streamType == i10) {
            return;
        }
        this.streamType = i10;
        updateVolumeAndNotifyIfChanged();
        this.listener.onStreamTypeChanged(i10);
    }

    public StreamVolumeManager(Context context, Handler handler, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.eventHandler = handler;
        this.listener = listener;
        AudioManager audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.audioManager = audioManager;
        this.streamType = 3;
        this.volume = getVolumeFromManager(audioManager, 3);
        this.muted = getMutedFromManager(audioManager, this.streamType);
        b bVar = new b();
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = bVar;
        } catch (RuntimeException e10) {
            Log.w(TAG, "Error registering stream volume receiver", e10);
        }
    }

    public static /* synthetic */ void access$200(StreamVolumeManager streamVolumeManager) {
        streamVolumeManager.updateVolumeAndNotifyIfChanged();
    }

    private static int getVolumeFromManager(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            Log.w(TAG, "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public void setVolume(int i10, int i11) {
        if (i10 >= getMinVolume() && i10 <= getMaxVolume()) {
            this.audioManager.setStreamVolume(this.streamType, i10, i11);
            updateVolumeAndNotifyIfChanged();
        }
    }
}
