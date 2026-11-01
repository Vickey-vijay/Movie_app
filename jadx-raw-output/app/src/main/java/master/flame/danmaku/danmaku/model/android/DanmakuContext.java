package master.flame.danmaku.danmaku.model.android;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kl.b;
import kl.i;
import ll.c;
import ll.d;

/* JADX INFO: loaded from: classes5.dex */
public class DanmakuContext implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<WeakReference<a>> f64330q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f64334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f64335v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Typeface f64315b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64316c = b.f62888a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f64317d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64318e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64319f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64320g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f64321h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f64322i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f64323j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<Integer> f64324k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f64325l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f64326m = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<Integer> f64327n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<Integer> f64328o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<String> f64329p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f64331r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f64332s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f64333t = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public kl.a f64336w = new ll.a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f64337x = new i();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public jl.b f64338y = new jl.b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f64339z = d.a();
    public c A = c.f63676j;
    public byte B = 0;

    public enum DanmakuConfigTag {
        FT_DANMAKU_VISIBILITY,
        FB_DANMAKU_VISIBILITY,
        L2R_DANMAKU_VISIBILITY,
        R2L_DANMAKU_VISIBILIY,
        SPECIAL_DANMAKU_VISIBILITY,
        TYPEFACE,
        TRANSPARENCY,
        SCALE_TEXTSIZE,
        MAXIMUM_NUMS_IN_SCREEN,
        DANMAKU_STYLE,
        DANMAKU_BOLD,
        COLOR_VALUE_WHITE_LIST,
        USER_ID_BLACK_LIST,
        USER_HASH_BLACK_LIST,
        SCROLL_SPEED_FACTOR,
        BLOCK_GUEST_DANMAKU,
        DUPLICATE_MERGING_ENABLED,
        MAXIMUN_LINES,
        OVERLAPPING_ENABLE,
        ALIGN_BOTTOM,
        DANMAKU_MARGIN,
        DANMAKU_SYNC;

        public boolean isVisibilityRelatedTag() {
            return equals(FT_DANMAKU_VISIBILITY) || equals(FB_DANMAKU_VISIBILITY) || equals(L2R_DANMAKU_VISIBILITY) || equals(R2L_DANMAKU_VISIBILIY) || equals(SPECIAL_DANMAKU_VISIBILITY) || equals(COLOR_VALUE_WHITE_LIST) || equals(USER_ID_BLACK_LIST);
        }
    }

    public interface a {
        boolean a(DanmakuContext danmakuContext, DanmakuConfigTag danmakuConfigTag, Object... objArr);
    }

    public DanmakuContext i(Map<Integer, Boolean> map) {
        this.f64335v = map != null;
        if (map == null) {
            this.f64338y.i("1019_Filter", false);
        } else {
            n("1019_Filter", map, false);
        }
        this.f64337x.b();
        h(DanmakuConfigTag.OVERLAPPING_ENABLE, map);
        return this;
    }

    public DanmakuContext o(Map<Integer, Integer> map) {
        this.f64334u = map != null;
        if (map == null) {
            this.f64338y.i("1018_Filter", false);
        } else {
            n("1018_Filter", map, false);
        }
        this.f64337x.b();
        h(DanmakuConfigTag.MAXIMUN_LINES, map);
        return this;
    }

    public static DanmakuContext a() {
        return new DanmakuContext();
    }

    public kl.a b() {
        return this.f64336w;
    }

    public boolean c() {
        return this.f64333t;
    }

    public boolean e() {
        return this.f64332s;
    }

    public boolean f() {
        return this.f64334u;
    }

    public boolean g() {
        return this.f64335v;
    }

    public final void h(DanmakuConfigTag danmakuConfigTag, Object... objArr) {
        List<WeakReference<a>> list = this.f64330q;
        if (list != null) {
            Iterator<WeakReference<a>> it = list.iterator();
            while (it.hasNext()) {
                a aVar = it.next().get();
                if (aVar != null) {
                    aVar.a(this, danmakuConfigTag, objArr);
                }
            }
        }
    }

    public void j(a aVar) {
        if (aVar == null || this.f64330q == null) {
            this.f64330q = Collections.synchronizedList(new ArrayList());
        }
        Iterator<WeakReference<a>> it = this.f64330q.iterator();
        while (it.hasNext()) {
            if (aVar.equals(it.next().get())) {
                return;
            }
        }
        this.f64330q.add(new WeakReference<>(aVar));
    }

    public DanmakuContext k(int i10) {
        if (this.f64318e != i10) {
            this.f64318e = i10;
            this.f64336w.g(i10);
            this.f64337x.b();
            this.f64337x.g();
            h(DanmakuConfigTag.DANMAKU_MARGIN, Integer.valueOf(i10));
        }
        return this;
    }

    public DanmakuContext l(int i10, float... fArr) {
        this.f64336w.b(i10, fArr);
        h(DanmakuConfigTag.DANMAKU_STYLE, Integer.valueOf(i10), fArr);
        return this;
    }

    public DanmakuContext m(boolean z10) {
        if (this.f64332s != z10) {
            this.f64332s = z10;
            this.f64337x.b();
            h(DanmakuConfigTag.DUPLICATE_MERGING_ENABLED, Boolean.valueOf(z10));
        }
        return this;
    }

    public final <T> void n(String str, T t10, boolean z10) {
        this.f64338y.d(str, z10).a(t10);
    }

    public DanmakuContext p(float f10) {
        if (this.f64317d != f10) {
            this.f64317d = f10;
            this.f64336w.r();
            this.f64336w.w(f10);
            this.f64337x.d();
            this.f64337x.g();
            h(DanmakuConfigTag.SCALE_TEXTSIZE, Float.valueOf(f10));
        }
        return this;
    }

    public DanmakuContext q(float f10) {
        if (this.f64326m != f10) {
            this.f64326m = f10;
            this.f64339z.h(f10);
            this.f64337x.d();
            this.f64337x.g();
            h(DanmakuConfigTag.SCROLL_SPEED_FACTOR, Float.valueOf(f10));
        }
        return this;
    }

    public void r() {
        List<WeakReference<a>> list = this.f64330q;
        if (list != null) {
            list.clear();
            this.f64330q = null;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
