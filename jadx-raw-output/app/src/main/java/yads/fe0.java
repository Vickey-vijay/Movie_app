package yads;

import com.monetization.ads.exo.source.dash.DashMediaSource$Factory;
import java.util.HashMap;
import java.util.HashSet;
import yads.fe0;
import yads.ge0;

/* JADX INFO: loaded from: classes9.dex */
public final class fe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq0 f77363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f77364b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f77365c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f77366d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o30 f77367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hd0 f77368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ae0 f77369g;

    public static xm1 a(Class cls) {
        try {
            return (xm1) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final void b(o30 o30Var) {
        if (o30Var != this.f77367e) {
            this.f77367e = o30Var;
            this.f77364b.clear();
            this.f77366d.clear();
        }
    }

    public fe0(od0 od0Var) {
        this.f77363a = od0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    public final y43 a(int i10) {
        y43 y43Var;
        if (this.f77364b.containsKey(Integer.valueOf(i10))) {
            return (y43) this.f77364b.get(Integer.valueOf(i10));
        }
        y43 y43Var2 = null;
        final o30 o30Var = this.f77367e;
        o30Var.getClass();
        try {
            if (i10 == 0) {
                final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(xm1.class);
                y43Var = new y43() { // from class: cp.y1
                    @Override // yads.y43
                    public final Object get() {
                        return ge0.a(clsAsSubclass, o30Var);
                    }
                };
            } else if (i10 == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("com.monetization.ads.exo.source.smoothstreaming.SsMediaSource$Factory").asSubclass(xm1.class);
                y43Var = new y43() { // from class: cp.x1
                    @Override // yads.y43
                    public final Object get() {
                        return ge0.a(clsAsSubclass2, o30Var);
                    }
                };
            } else {
                if (i10 == 2) {
                    final Class<? extends U> clsAsSubclass3 = Class.forName("com.monetization.ads.exo.source.hls.HlsMediaSource$Factory").asSubclass(xm1.class);
                    y43Var = new y43() { // from class: cp.w1
                        @Override // yads.y43
                        public final Object get() {
                            return ge0.a(clsAsSubclass3, o30Var);
                        }
                    };
                } else if (i10 == 3) {
                    final Class<? extends U> clsAsSubclass4 = Class.forName("com.monetization.ads.exo.source.rtsp.RtspMediaSource$Factory").asSubclass(xm1.class);
                    y43Var2 = new y43() { // from class: cp.v1
                        @Override // yads.y43
                        public final Object get() {
                            return fe0.a(clsAsSubclass4);
                        }
                    };
                } else if (i10 == 4) {
                    y43Var2 = new y43() { // from class: cp.u1
                        @Override // yads.y43
                        public final Object get() {
                            return this.f51607b.a(o30Var);
                        }
                    };
                }
                this.f77364b.put(Integer.valueOf(i10), y43Var2);
                if (y43Var2 != null) {
                    this.f77365c.add(Integer.valueOf(i10));
                }
                return y43Var2;
            }
            y43Var2 = y43Var;
        } catch (ClassNotFoundException unused) {
        }
        this.f77364b.put(Integer.valueOf(i10), y43Var2);
        if (y43Var2 != null) {
            this.f77365c.add(Integer.valueOf(i10));
        }
        return y43Var2;
    }

    public final /* synthetic */ xm1 a(o30 o30Var) {
        return new gk2(o30Var, this.f77363a);
    }
}
