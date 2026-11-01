package yads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class df0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spatializer f76660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f76662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cf0 f76663d;

    public final boolean a(mx0 mx0Var, pk pkVar) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(ib3.a(("audio/eac3-joc".equals(mx0Var.f80429m) && mx0Var.f80442z == 16) ? 12 : mx0Var.f80442z));
        int i10 = mx0Var.A;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        Spatializer spatializer = this.f76660a;
        if (pkVar.f81437g == null) {
            pkVar.f81437g = new ok(pkVar);
        }
        return spatializer.canBeSpatialized(pkVar.f81437g.f81061a, channelMask.build());
    }

    public final boolean b() {
        return this.f76660a.isEnabled();
    }

    public final void c() {
        cf0 cf0Var = this.f76663d;
        if (cf0Var == null || this.f76662c == null) {
            return;
        }
        this.f76660a.removeOnSpatializerStateChangedListener(cf0Var);
        Handler handler = this.f76662c;
        int i10 = ib3.f78556a;
        handler.removeCallbacksAndMessages(null);
        this.f76662c = null;
        this.f76663d = null;
    }

    public df0(Spatializer spatializer) {
        boolean z10;
        this.f76660a = spatializer;
        if (spatializer.getImmersiveAudioLevel() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f76661b = z10;
    }

    public final void a(if0 if0Var, Looper looper) {
        if (this.f76663d == null && this.f76662c == null) {
            this.f76663d = new cf0(if0Var);
            Handler handler = new Handler(looper);
            this.f76662c = handler;
            this.f76660a.addOnSpatializerStateChangedListener(new androidx.emoji2.text.b(handler), this.f76663d);
        }
    }

    public final boolean a() {
        return this.f76660a.isAvailable();
    }

    public static df0 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new df0(audioManager.getSpatializer());
    }
}
