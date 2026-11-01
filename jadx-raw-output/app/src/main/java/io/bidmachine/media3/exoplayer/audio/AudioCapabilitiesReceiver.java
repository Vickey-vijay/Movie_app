package io.bidmachine.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public final class AudioCapabilitiesReceiver {
    private AudioAttributes audioAttributes;

    @Nullable
    private AudioCapabilities audioCapabilities;

    @Nullable
    private final c audioDeviceCallback;
    private final Context context;

    @Nullable
    private final d externalSurroundSoundSettingObserver;
    private final Handler handler;

    @Nullable
    private final BroadcastReceiver hdmiAudioPlugBroadcastReceiver;
    private final Listener listener;
    private boolean registered;

    @Nullable
    private eg.a routedDevice;

    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    @RequiresApi(23)
    public static final class b {
        private b() {
        }

        @DoNotInline
        public static void registerAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) Assertions.checkNotNull((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        @DoNotInline
        public static void unregisterAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) Assertions.checkNotNull((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    @RequiresApi(23)
    public final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(audioCapabilitiesReceiver.context, AudioCapabilitiesReceiver.this.audioAttributes, AudioCapabilitiesReceiver.this.routedDevice));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (Util.contains(audioDeviceInfoArr, AudioCapabilitiesReceiver.this.routedDevice)) {
                AudioCapabilitiesReceiver.this.routedDevice = null;
            }
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(audioCapabilitiesReceiver.context, AudioCapabilitiesReceiver.this.audioAttributes, AudioCapabilitiesReceiver.this.routedDevice));
        }
    }

    public final class d extends ContentObserver {
        private final ContentResolver resolver;
        private final Uri settingUri;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.resolver = contentResolver;
            this.settingUri = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(audioCapabilitiesReceiver.context, AudioCapabilitiesReceiver.this.audioAttributes, AudioCapabilitiesReceiver.this.routedDevice));
        }

        public void register() {
            this.resolver.registerContentObserver(this.settingUri, false, this);
        }

        public void unregister() {
            this.resolver.unregisterContentObserver(this);
        }
    }

    @Deprecated
    public AudioCapabilitiesReceiver(Context context, Listener listener) {
        this(context, listener, AudioAttributes.DEFAULT, (AudioDeviceInfo) null);
    }

    public final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
                audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(context, intent, audioCapabilitiesReceiver.audioAttributes, AudioCapabilitiesReceiver.this.routedDevice));
            }
        }
    }

    public AudioCapabilitiesReceiver(Context context, Listener listener, AudioAttributes audioAttributes, @Nullable AudioDeviceInfo audioDeviceInfo) {
        this(context, listener, audioAttributes, (Util.SDK_INT < 23 || audioDeviceInfo == null) ? null : new eg.a(audioDeviceInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(AudioCapabilities audioCapabilities) {
        if (!this.registered || audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        this.listener.onAudioCapabilitiesChanged(audioCapabilities);
    }

    public AudioCapabilities register() {
        c cVar;
        if (this.registered) {
            return (AudioCapabilities) Assertions.checkNotNull(this.audioCapabilities);
        }
        this.registered = true;
        d dVar = this.externalSurroundSoundSettingObserver;
        if (dVar != null) {
            dVar.register();
        }
        if (Util.SDK_INT >= 23 && (cVar = this.audioDeviceCallback) != null) {
            b.registerAudioDeviceCallback(this.context, cVar, this.handler);
        }
        AudioCapabilities capabilitiesInternal = AudioCapabilities.getCapabilitiesInternal(this.context, this.hdmiAudioPlugBroadcastReceiver != null ? this.context.registerReceiver(this.hdmiAudioPlugBroadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.handler) : null, this.audioAttributes, this.routedDevice);
        this.audioCapabilities = capabilitiesInternal;
        return capabilitiesInternal;
    }

    public void setAudioAttributes(AudioAttributes audioAttributes) {
        this.audioAttributes = audioAttributes;
        onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(this.context, audioAttributes, this.routedDevice));
    }

    @RequiresApi(23)
    public void setRoutedDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        eg.a aVar = this.routedDevice;
        if (Util.areEqual(audioDeviceInfo, aVar == null ? null : aVar.audioDeviceInfo)) {
            return;
        }
        eg.a aVar2 = audioDeviceInfo != null ? new eg.a(audioDeviceInfo) : null;
        this.routedDevice = aVar2;
        onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(this.context, this.audioAttributes, aVar2));
    }

    public void unregister() {
        c cVar;
        if (this.registered) {
            this.audioCapabilities = null;
            if (Util.SDK_INT >= 23 && (cVar = this.audioDeviceCallback) != null) {
                b.unregisterAudioDeviceCallback(this.context, cVar);
            }
            BroadcastReceiver broadcastReceiver = this.hdmiAudioPlugBroadcastReceiver;
            if (broadcastReceiver != null) {
                this.context.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.externalSurroundSoundSettingObserver;
            if (dVar != null) {
                dVar.unregister();
            }
            this.registered = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(Context context, Listener listener, AudioAttributes audioAttributes, @Nullable eg.a aVar) {
        e eVar;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.listener = (Listener) Assertions.checkNotNull(listener);
        this.audioAttributes = audioAttributes;
        this.routedDevice = aVar;
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.handler = handlerCreateHandlerForCurrentOrMainLooper;
        int i10 = Util.SDK_INT;
        Object[] objArr = 0;
        this.audioDeviceCallback = i10 >= 23 ? new c() : null;
        if (i10 >= 21) {
            eVar = new e();
        } else {
            eVar = null;
        }
        this.hdmiAudioPlugBroadcastReceiver = eVar;
        Uri externalSurroundSoundGlobalSettingUri = AudioCapabilities.getExternalSurroundSoundGlobalSettingUri();
        this.externalSurroundSoundSettingObserver = externalSurroundSoundGlobalSettingUri != null ? new d(handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), externalSurroundSoundGlobalSettingUri) : null;
    }
}
