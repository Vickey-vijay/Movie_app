package yads;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class dk3 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f76712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bk3 f76713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v62 f76714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ak3 f76715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h62 f76716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zj3 f76717h;

    public dk3(lu2 lu2Var, e72 e72Var, ai3 ai3Var, d4 d4Var, v9 v9Var, x51 x51Var, d62 d62Var, h32 h32Var, fz1 fz1Var, mi2 mi2Var, my2 my2Var, bk3 bk3Var) {
        super(e72Var);
        this.f76712c = v9Var;
        this.f76713d = bk3Var;
        this.f76714e = new v62(e72Var.getContext(), this, ai3Var, d4Var, lu2Var, v9Var, x51Var, d62Var, h32Var, mi2Var, my2Var);
        this.f76715f = new ak3(((iu3) lu2Var).f());
        this.f76716g = fz1Var.a();
        x51Var.a(bk3Var);
    }

    @Override // yads.hk3
    public final void a(View view) {
        e72 e72Var = (e72) view;
        v62 v62Var = this.f76714e;
        s62 s62Var = v62Var.f83787e;
        if (s62Var != null) {
            ae2 ae2Var = s62Var.f82544l;
            if (ae2Var != null) {
                ae2Var.f75493b.stop();
                n52 n52Var = e72Var.f76956c;
                g72 g72Var = ae2Var.f75494c;
                gl1 gl1Var = n52Var.f80564b;
                g72Var.getClass();
                if (gl1Var != null) {
                    CheckBox muteControl = gl1Var.getMuteControl();
                    if (muteControl != null) {
                        muteControl.setOnClickListener(null);
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = gl1Var.getVideoProgress();
                    if (videoProgress != null) {
                        videoProgress.setProgress(0);
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = gl1Var.getCountDownProgress();
                    if (countDownProgress != null) {
                        countDownProgress.setText("");
                        countDownProgress.setVisibility(8);
                    }
                }
            }
            s62Var.f82538f.b(e72Var);
        }
        g32 g32Var = v62Var.f83788f;
        if (g32Var != null) {
            v62Var.f83783a.f78050a.remove(g32Var);
            v62Var.f83788f = null;
        }
        e72Var.setOnAttachStateChangeListener(null);
        e72Var.setVisibility(8);
        e72Var.setOnClickListener(null);
        e72Var.setOnTouchListener(null);
        e72Var.setSelected(false);
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        e72 e72Var = (e72) view;
        sd3 sd3Var = (sd3) obj;
        je3 je3Var = (je3) nj.b0.f0(sd3Var.f82619a);
        zj3 zj3VarA = this.f76715f.a(e72Var.getContext(), je3Var, mf3.f80169e);
        this.f76717h = zj3VarA;
        this.f76713d.f75858a = zj3VarA;
        h62 h62Var = this.f76716g;
        Context context = e72Var.getContext();
        v9 v9Var = this.f76712c;
        h62Var.getClass();
        String str = je3Var.f79019g;
        boolean zA = pr0.a(context, or0.f81130c);
        p62[] p62VarArr = p62.f81264b;
        if (ck.p.e("first_video_preloading_strategy", v9Var.f83830v) && zA) {
            hv0 hv0Var = h62Var.f78079c;
            synchronized (hv0Var.f78394d) {
                z52 z52Var = hv0Var.f78392b;
                mj0 mj0Var = z52Var.f85224a;
                if (mj0Var != null) {
                    mj0Var.f80189c++;
                    mj0Var.f80187a.obtainMessage(7, str).sendToTarget();
                }
                z52Var.f85225b.remove(str);
                mj.r rVar = mj.r.f64562a;
            }
        } else {
            h62Var.f78078b.a(str);
        }
        this.f76714e.a(e72Var, sd3Var, zj3VarA);
    }

    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        e72 e72Var;
        sd3 sd3Var = (sd3) obj;
        e72 e72Var2 = (e72) b();
        if (e72Var2 != null) {
            kk3Var.a(e72Var2, oiVar);
            if (sd3Var == null || this.f76717h == null) {
                return;
            }
            je3 je3Var = (je3) nj.b0.f0(sd3Var.f82619a);
            kk3Var.a(oiVar, new bh3(e72Var2, je3Var.f79013a));
            v62 v62Var = this.f76714e;
            v62Var.f83785c.getClass();
            n62 n62Var = (n62) je3Var.f79016d;
            int i10 = n62Var.f80574c;
            e72Var2.setAspectRatio(i10 != 0 ? n62Var.f80573b / i10 : 1.7777778f);
            s62 s62Var = v62Var.f83787e;
            if (s62Var == null || (e72Var = (e72) s62Var.f82533a.b()) == null) {
                return;
            }
            e72Var.setClickable(false);
        }
    }

    @Override // yads.hk3
    public final void a() {
        zj3 zj3Var = this.f76717h;
        if (zj3Var != null) {
            zj3Var.k();
        }
        this.f76713d.f75858a = null;
    }

    @Override // yads.hk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
