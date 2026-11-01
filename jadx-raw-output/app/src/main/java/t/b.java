package t;

import android.app.Activity;
import android.media.AudioManager;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import chuangyuan.ycj.videolibrary.R$color;
import g5.k0;
import java.lang.ref.WeakReference;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import k3.u0;
import q.f;
import q.g;
import q.h;
import q.i;
import q.j;

/* JADX INFO: compiled from: GestureModule.java */
/* JADX INFO: loaded from: classes8.dex */
public class b implements q.a, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f72052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72053b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioManager f72059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GestureDetector f72060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f72061j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Formatter f72063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f72064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f72065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f72066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f72067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t.a f72068q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f72054c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72055d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f72056e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f72057f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f72058g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public StringBuilder f72062k = new StringBuilder();

    /* JADX INFO: renamed from: t.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GestureModule.java */
    public class C0748b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f72069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f72070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f72071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WeakReference<b> f72072e;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f72069b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            long j10;
            if (!b.this.f72058g) {
                WeakReference<b> weakReference = this.f72072e;
                if (weakReference == null || weakReference.get() == null) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY() - motionEvent2.getY();
                float x11 = x10 - motionEvent2.getX();
                if (this.f72069b) {
                    this.f72071d = Math.abs(f10) >= Math.abs(f11);
                    this.f72070c = x10 > ((float) b.this.f72061j) * 0.5f;
                    this.f72069b = false;
                }
                if (this.f72071d) {
                    boolean z10 = motionEvent.getX() <= motionEvent2.getX();
                    long jZ = b.this.f72068q.z();
                    long jA = b.this.f72068q.A();
                    long j11 = (int) (jZ + ((((-x11) / 5.0f) * jA) / b.this.f72061j));
                    if (j11 > jA) {
                        j10 = jA;
                    } else {
                        j10 = j11 <= 0 ? 0L : j11;
                    }
                    b bVar = b.this;
                    bVar.Q(z10, j10, jA, k0.V(bVar.f72062k, b.this.f72063l, j10), k0.V(b.this.f72062k, b.this.f72063l, jA));
                } else {
                    float fD = y10 / s.e.d(b.this.f72052a);
                    if (this.f72070c) {
                        b.this.R(fD);
                    } else {
                        b.this.O(fD);
                    }
                }
            }
            return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }

        public C0748b(b bVar) {
            this.f72072e = new WeakReference<>(bVar);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (b.this.f72068q != null && b.this.f72068q.H()) {
                b.this.f72058g = true;
                b bVar = b.this;
                bVar.f72057f = bVar.f72068q.D().P().f62209a;
                b.this.P();
            }
        }
    }

    public final void I() {
        this.f72055d = -1;
        this.f72054c = -1.0f;
        this.f72058g = false;
        long j10 = this.f72056e;
        if (j10 >= 0) {
            i iVar = this.f72064m;
            if (iVar != null) {
                iVar.b(j10);
                this.f72056e = -1L;
            } else {
                this.f72068q.V(j10);
                this.f72056e = -1L;
            }
        }
        if (this.f72067p != null) {
            float f10 = this.f72057f;
            if (f10 > 0.0f) {
                this.f72068q.a0(f10, 1.0f);
                this.f72057f = 0.0f;
            }
        }
        Iterator<q.d> it = this.f72068q.E().iterator();
        while (it.hasNext()) {
            it.next().l(8);
        }
    }

    public final synchronized void O(float f10) {
        if (this.f72054c < 0.0f) {
            float f11 = this.f72052a.getWindow().getAttributes().screenBrightness;
            this.f72054c = f11;
            if (f11 <= 0.0f) {
                this.f72054c = 0.5f;
            } else if (f11 < 0.01f) {
                this.f72054c = 0.01f;
            }
        }
        WindowManager.LayoutParams attributes = this.f72052a.getWindow().getAttributes();
        float f12 = this.f72054c + f10;
        attributes.screenBrightness = f12;
        if (f12 > 1.0d) {
            attributes.screenBrightness = 1.0f;
        } else if (f12 < 0.01f) {
            attributes.screenBrightness = 0.01f;
        }
        this.f72052a.getWindow().setAttributes(attributes);
        g gVar = this.f72065n;
        if (gVar != null) {
            gVar.b(100, (int) (attributes.screenBrightness * 100.0f));
        } else {
            Iterator<q.d> it = this.f72068q.E().iterator();
            while (it.hasNext()) {
                it.next().b(100, (int) (attributes.screenBrightness * 100.0f));
            }
        }
    }

    @Override // q.a
    public void h(u0 u0Var) {
    }

    @Override // q.a
    public void onDestroy() {
        this.f72059h = null;
        this.f72062k = null;
        Formatter formatter = this.f72063l;
        if (formatter != null) {
            formatter.close();
        }
        this.f72063l = null;
        this.f72065n = null;
        this.f72064m = null;
        this.f72066o = null;
        this.f72067p = null;
    }

    public void J(g gVar) {
        this.f72065n = gVar;
    }

    public void K(h hVar) {
        this.f72067p = hVar;
    }

    public void L(i iVar) {
        this.f72064m = iVar;
    }

    public void M(j jVar) {
        this.f72066o = jVar;
    }

    public final void P() {
        h hVar = this.f72067p;
        if (hVar != null) {
            hVar.a(2);
            return;
        }
        Iterator<q.d> it = this.f72068q.E().iterator();
        while (it.hasNext()) {
            it.next().j(2);
        }
    }

    public final void Q(boolean z10, long j10, long j11, String str, String str2) {
        this.f72056e = j10;
        i iVar = this.f72064m;
        if (iVar != null) {
            iVar.a(j10, j11, str, str2);
            return;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(this.f72052a, R$color.simple_exo_style_color));
        SpannableString spannableString = new SpannableString(str + "/" + str2);
        spannableString.setSpan(foregroundColorSpan, 0, str.length(), 33);
        Iterator<q.d> it = this.f72068q.E().iterator();
        while (it.hasNext()) {
            it.next().p(z10, spannableString);
        }
    }

    public final void R(float f10) {
        int i10 = 0;
        if (this.f72055d == -1) {
            int streamVolume = this.f72059h.getStreamVolume(3);
            this.f72055d = streamVolume;
            if (streamVolume < 0) {
                this.f72055d = 0;
            }
        }
        int i11 = this.f72053b;
        int i12 = ((int) (f10 * i11 * 6.0f)) + (this.f72055d * 6);
        if (i12 > i11 * 6) {
            i10 = i11 * 6;
        } else if (i12 >= 0) {
            i10 = i12;
        }
        this.f72059h.setStreamVolume(3, i10 / 6, 4);
        j jVar = this.f72066o;
        if (jVar != null) {
            jVar.a(this.f72053b * 6, i10);
            return;
        }
        Iterator<q.d> it = this.f72068q.E().iterator();
        while (it.hasNext()) {
            it.next().a(this.f72053b * 6, i10);
        }
    }

    @Override // q.f
    public void onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f72060i;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
    }

    public b(@NonNull Activity activity, @NonNull t.a aVar) {
        this.f72068q = aVar;
        this.f72052a = activity;
        N(activity, -1);
        this.f72063l = new Formatter(this.f72062k, Locale.getDefault());
        AudioManager audioManager = (AudioManager) activity.getSystemService("audio");
        this.f72059h = audioManager;
        this.f72053b = audioManager.getStreamMaxVolume(3);
        this.f72061j = activity.getResources().getDisplayMetrics().heightPixels;
        this.f72060i = new GestureDetector(activity, new C0748b(this));
    }

    public static void N(Activity activity, int i10) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if (i10 == -1) {
            attributes.screenBrightness = -1.0f;
        } else {
            if (i10 < 10) {
                i10 = 10;
            }
            attributes.screenBrightness = Float.valueOf(i10 / 255.0f).floatValue();
            Settings.System.putInt(activity.getContentResolver(), "screen_brightness", i10);
        }
        activity.getWindow().setAttributes(attributes);
    }

    @Override // q.f
    public void r() {
        I();
    }
}
