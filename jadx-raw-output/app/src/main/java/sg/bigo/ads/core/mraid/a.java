package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes11.dex */
final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f71577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f71578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0739a f71579c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a$a, reason: collision with other inner class name */
    public interface InterfaceC0739a {
        void a(float f10);
    }

    public a(Handler handler, Context context, InterfaceC0739a interfaceC0739a) {
        super(handler);
        this.f71577a = -1.0f;
        this.f71578b = context.getApplicationContext();
        this.f71579c = interfaceC0739a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        AudioManager audioManager = (AudioManager) this.f71578b.getSystemService("audio");
        float streamVolume = audioManager != null ? 100.0f * (audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) : 100.0f;
        if (streamVolume != this.f71577a) {
            this.f71577a = streamVolume;
            sg.bigo.ads.common.t.a.a(0, 3, "AudioVolumeContentObserver", String.format("Volume change, current value: %s", Float.valueOf(streamVolume)));
            InterfaceC0739a interfaceC0739a = this.f71579c;
            if (interfaceC0739a != null) {
                interfaceC0739a.a(this.f71577a);
            }
        }
    }
}
