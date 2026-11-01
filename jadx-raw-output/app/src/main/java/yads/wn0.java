package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;
import yads.me2;

/* JADX INFO: loaded from: classes10.dex */
public final class wn0 implements dj3, dl, z53, xs1, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, h23, xk, rk, a43, qn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zn0 f84275a;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public wn0(zn0 zn0Var) {
        this.f84275a = zn0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f84275a.a(surfaceTexture);
        this.f84275a.a(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f84275a.a((Surface) null);
        this.f84275a.a(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f84275a.a(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f84275a.a(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        zn0 zn0Var = this.f84275a;
        if (zn0Var.M) {
            zn0Var.a(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zn0 zn0Var = this.f84275a;
        if (zn0Var.M) {
            zn0Var.a((Surface) null);
        }
        this.f84275a.a(0, 0);
    }

    public final /* synthetic */ void a(me2 me2Var) {
        me2Var.a(this.f84275a.G);
    }

    public final void a(final List list) {
        pf1 pf1Var = this.f84275a.f85527j;
        pf1Var.a(27, new mf1() { // from class: cp.yb
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).onCues(list);
            }
        });
        pf1Var.a();
    }

    public final void a(final q20 q20Var) {
        this.f84275a.getClass();
        pf1 pf1Var = this.f84275a.f85527j;
        pf1Var.a(27, new mf1() { // from class: cp.ac
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).a(q20Var);
            }
        });
        pf1Var.a();
    }

    public final void a(final ts1 ts1Var) {
        zn0 zn0Var = this.f84275a;
        jm1 jm1Var = zn0Var.Y;
        jm1Var.getClass();
        im1 im1Var = new im1(jm1Var);
        int i10 = 0;
        while (true) {
            ss1[] ss1VarArr = ts1Var.f83163b;
            if (i10 >= ss1VarArr.length) {
                break;
            }
            ss1VarArr[i10].a(im1Var);
            i10++;
        }
        zn0Var.Y = new jm1(im1Var);
        jm1 jm1VarA = this.f84275a.a();
        if (!jm1VarA.equals(this.f84275a.G)) {
            zn0 zn0Var2 = this.f84275a;
            zn0Var2.G = jm1VarA;
            zn0Var2.f85527j.a(14, new mf1() { // from class: cp.bc
                @Override // yads.mf1
                public final void invoke(Object obj) {
                    this.f51252a.a((me2) obj);
                }
            });
        }
        this.f84275a.f85527j.a(28, new mf1() { // from class: cp.cc
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).a(ts1Var);
            }
        });
        this.f84275a.f85527j.a();
    }

    public final void a(Object obj, long j10) {
        ((kb0) this.f84275a.f85532o).a(obj, j10);
        zn0 zn0Var = this.f84275a;
        if (zn0Var.I == obj) {
            pf1 pf1Var = zn0Var.f85527j;
            pf1Var.a(26, new mf1() { // from class: cp.fc
                @Override // yads.mf1
                public final void invoke(Object obj2) {
                    ((me2) obj2).onRenderedFirstFrame();
                }
            });
            pf1Var.a();
        }
    }

    public final void a(final boolean z10) {
        zn0 zn0Var = this.f84275a;
        if (zn0Var.U == z10) {
            return;
        }
        zn0Var.U = z10;
        pf1 pf1Var = zn0Var.f85527j;
        pf1Var.a(23, new mf1() { // from class: cp.gc
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).onSkipSilenceEnabledChanged(z10);
            }
        });
        pf1Var.a();
    }

    public final void a() {
        final ig0 ig0VarA = zn0.a(this.f84275a.f85540w);
        if (ig0VarA.equals(this.f84275a.X)) {
            return;
        }
        zn0 zn0Var = this.f84275a;
        zn0Var.X = ig0VarA;
        pf1 pf1Var = zn0Var.f85527j;
        pf1Var.a(29, new mf1() { // from class: cp.dc
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).a(ig0VarA);
            }
        });
        pf1Var.a();
    }

    public final void a(final boolean z10, final int i10) {
        pf1 pf1Var = this.f84275a.f85527j;
        pf1Var.a(30, new mf1() { // from class: cp.zb
            @Override // yads.mf1
            public final void invoke(Object obj) {
                me2 me2Var = (me2) obj;
                me2Var.a(z10, i10);
            }
        });
        pf1Var.a();
    }

    public final void a(final oj3 oj3Var) {
        this.f84275a.getClass();
        pf1 pf1Var = this.f84275a.f85527j;
        pf1Var.a(25, new mf1() { // from class: cp.ec
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).a(oj3Var);
            }
        });
        pf1Var.a();
    }
}
