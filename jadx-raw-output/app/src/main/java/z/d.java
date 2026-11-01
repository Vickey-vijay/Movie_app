package z;

import android.content.Context;
import android.media.AudioManager;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: AudioRenderController.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.fourthline.cling.model.types.d f85867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager f85868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public org.fourthline.cling.model.types.d f85869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v.b f85870d;

    public d(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.f85867a = new org.fourthline.cling.model.types.d(0L);
        Object systemService = context.getSystemService("audio");
        p.h(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.f85868b = audioManager;
        this.f85869c = new org.fourthline.cling.model.types.d((((long) audioManager.getStreamVolume(3)) * 100) / ((long) audioManager.getStreamMaxVolume(3)));
        this.f85870d = v.b.f73000b.a("AudioRenderController");
    }

    @Override // z.c
    public org.fourthline.cling.model.types.d a(String str) {
        p.j(str, "channelName");
        return new org.fourthline.cling.model.types.d((((long) this.f85868b.getStreamVolume(3)) * 100) / ((long) this.f85868b.getStreamMaxVolume(3)));
    }

    @Override // z.c
    public boolean b(String str) {
        p.j(str, "channelName");
        Long lC = a(str).c();
        return lC != null && lC.longValue() == 0;
    }
}
