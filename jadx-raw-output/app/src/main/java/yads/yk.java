package yads;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes11.dex */
public final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f85012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk f85013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xk f85014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pk f85015d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85017f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f85019h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f85018g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85016e = 0;

    public final void a() {
        if (this.f85016e == 0) {
            return;
        }
        if (ib3.f78556a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f85019h;
            if (audioFocusRequest != null) {
                this.f85012a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f85012a.abandonAudioFocus(this.f85013b);
        }
        b(0);
    }

    public final void b() {
        if (ib3.a(this.f85015d, (Object) null)) {
            return;
        }
        this.f85015d = null;
        this.f85017f = 0;
    }

    public yk(Context context, Handler handler, wn0 wn0Var) {
        this.f85012a = (AudioManager) ni.a(context.getApplicationContext().getSystemService("audio"));
        this.f85014c = wn0Var;
        this.f85013b = new wk(this, handler);
    }

    public final void b(int i10) {
        if (this.f85016e == i10) {
            return;
        }
        this.f85016e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f85018g == f10) {
            return;
        }
        this.f85018g = f10;
        xk xkVar = this.f85014c;
        if (xkVar != null) {
            zn0 zn0Var = ((wn0) xkVar).f84275a;
            zn0Var.a(1, 2, Float.valueOf(zn0Var.T * zn0Var.f85539v.f85018g));
        }
    }

    public final void a(int i10) {
        xk xkVar = this.f85014c;
        if (xkVar != null) {
            wn0 wn0Var = (wn0) xkVar;
            zn0 zn0Var = wn0Var.f84275a;
            zn0Var.r();
            boolean z10 = zn0Var.Z.f76260l;
            zn0 zn0Var2 = wn0Var.f84275a;
            int i11 = 1;
            if (z10 && i10 != 1) {
                i11 = 2;
            }
            zn0Var2.a(i10, i11, z10);
        }
    }

    public final int a(boolean z10, int i10) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builder;
        if (i10 == 1 || this.f85017f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (!z10) {
            return -1;
        }
        if (this.f85016e != 1) {
            if (ib3.f78556a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f85019h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        builder = new AudioFocusRequest.Builder(this.f85017f);
                    } else {
                        builder = new AudioFocusRequest.Builder(this.f85019h);
                    }
                    pk pkVar = this.f85015d;
                    boolean z11 = pkVar != null && pkVar.f81432b == 1;
                    pkVar.getClass();
                    if (pkVar.f81437g == null) {
                        pkVar.f81437g = new ok(pkVar);
                    }
                    this.f85019h = builder.setAudioAttributes(pkVar.f81437g.f81061a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(this.f85013b).build();
                }
                iRequestAudioFocus = this.f85012a.requestAudioFocus(this.f85019h);
            } else {
                AudioManager audioManager = this.f85012a;
                wk wkVar = this.f85013b;
                pk pkVar2 = this.f85015d;
                pkVar2.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(wkVar, ib3.c(pkVar2.f81434d), this.f85017f);
            }
            if (iRequestAudioFocus == 1) {
                b(1);
            } else {
                b(0);
                return -1;
            }
        }
        return 1;
    }
}
