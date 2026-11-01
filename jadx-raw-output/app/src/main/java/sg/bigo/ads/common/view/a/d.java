package sg.bigo.ads.common.view.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Set;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T extends View> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f70230a = r.f70030a.a(1) / 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f70231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f70232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.common.view.a.a f70233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f70235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f70236g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.common.c.a f70238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Canvas f70239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f70240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f70241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f70242m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f70237h = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.common.view.a.d.1
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - d.this.f70242m) < d.f70230a) {
                return true;
            }
            d.b(d.this);
            d.this.f70242m = jElapsedRealtime;
            return true;
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f70243n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final WeakHashMap<TextureView, Object> f70244o = new WeakHashMap<>();

    public static class a extends BitmapDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f70247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Paint f70248b;

        private a(d dVar, Bitmap bitmap) {
            super(dVar.f70231b.getResources(), bitmap);
            this.f70247a = dVar;
            this.f70248b = new Paint();
        }

        public /* synthetic */ a(d dVar, Bitmap bitmap, byte b10) {
            this(dVar, bitmap);
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            b bVar = this.f70247a.f70233d.f70218b;
            if (bVar != null) {
                this.f70248b.setColor(bVar.b());
                canvas.drawRect(getBounds(), this.f70248b);
            }
        }
    }

    public d(T t10) {
        this.f70231b = t10;
        Context context = t10.getContext();
        this.f70232c = context;
        this.f70238i = new sg.bigo.ads.common.c.b(context);
        this.f70233d = new sg.bigo.ads.common.view.a.a();
    }

    public static /* synthetic */ void b(d dVar) {
        b bVar;
        Bitmap bitmap;
        if (dVar.f70234e) {
            return;
        }
        sg.bigo.ads.common.view.a.a aVar = dVar.f70233d;
        Drawable drawable = aVar.f69741a;
        byte b10 = 0;
        if ((drawable == null || (drawable instanceof a)) && (bVar = aVar.f70218b) != null && bVar.c() > 0.0f && u.c(dVar.f70231b) && sg.bigo.ads.common.ab.a.a(dVar.f70231b, new Rect())) {
            b bVar2 = dVar.f70233d.f70218b;
            if (bVar2 == null) {
                dVar.b();
                return;
            }
            View view = dVar.f70235f;
            if (view == null || !dVar.f70231b.isShown()) {
                dVar.b();
                return;
            }
            Rect rect = new Rect();
            bVar2.a(rect);
            if (dVar.f70239j == null || dVar.f70241l == null || dVar.f70240k == null) {
                dVar.b();
                int measuredWidth = (dVar.f70231b.getMeasuredWidth() - rect.left) - rect.right;
                int measuredHeight = (dVar.f70231b.getMeasuredHeight() - rect.top) - rect.bottom;
                int iMax = Math.max(1, (int) (measuredWidth / bVar2.d()));
                int iMax2 = Math.max(1, (int) (measuredHeight / bVar2.d()));
                dVar.f70240k = sg.bigo.ads.common.utils.d.a(iMax, iMax2, Bitmap.Config.ARGB_8888);
                dVar.f70241l = new a(dVar, sg.bigo.ads.common.utils.d.a(iMax, iMax2, Bitmap.Config.ARGB_8888), b10);
                if (dVar.f70240k == null) {
                    return;
                }
                dVar.f70239j = new Canvas(dVar.f70240k);
                dVar.f70233d.a(dVar.f70241l);
                if (!dVar.f70238i.a(dVar.f70240k, bVar2.c())) {
                    return;
                }
            }
            Point pointA = u.a(view, dVar.f70231b);
            dVar.f70240k.eraseColor(bVar2.b() & (-1));
            float alpha = dVar.f70231b.getAlpha();
            dVar.f70231b.setAlpha(0.0f);
            dVar.f70234e = true;
            float fD = 1.0f / bVar2.d();
            int iSave = dVar.f70239j.save();
            try {
                dVar.f70239j.scale(fD, fD);
                dVar.f70239j.translate((-pointA.x) - rect.left, (-pointA.y) - rect.top);
                if (view.getBackground() != null) {
                    view.getBackground().draw(dVar.f70239j);
                }
                view.draw(dVar.f70239j);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                dVar.f70239j.restoreToCount(iSave);
                throw th2;
            }
            dVar.f70239j.restoreToCount(iSave);
            dVar.a();
            Set<TextureView> setKeySet = dVar.f70244o.keySet();
            if (!k.a(setKeySet)) {
                int i10 = pointA.x;
                Rect rect2 = new Rect(rect.left + i10, pointA.y + rect.top, (i10 + dVar.f70231b.getMeasuredWidth()) - rect.right, (pointA.y + dVar.f70231b.getMeasuredHeight()) - rect.bottom);
                for (TextureView textureView : setKeySet) {
                    if (textureView != null && textureView.isOpaque() && u.d(textureView)) {
                        Point pointA2 = u.a(view, textureView);
                        int i11 = pointA2.x;
                        Rect rect3 = new Rect(i11, pointA2.y, textureView.getMeasuredWidth() + i11, pointA2.y + textureView.getMeasuredHeight());
                        Rect rect4 = new Rect(rect3);
                        if (rect4.intersect(rect2) && (bitmap = textureView.getBitmap()) != null) {
                            int i12 = rect4.left - rect3.left;
                            int i13 = rect4.top - rect3.top;
                            Rect rect5 = new Rect(i12, i13, rect4.width() + i12, rect4.height() + i13);
                            int i14 = rect4.left - rect2.left;
                            int i15 = rect4.top - rect2.top;
                            Rect rect6 = new Rect(i14, i15, rect4.width() + i14, rect4.height() + i15);
                            int iSave2 = dVar.f70239j.save();
                            try {
                                dVar.f70239j.scale(fD, fD);
                                dVar.f70239j.drawBitmap(bitmap, rect5, rect6, new Paint());
                            } catch (Exception unused2) {
                            } finally {
                                dVar.f70239j.restoreToCount(iSave2);
                            }
                            break;
                        }
                    }
                }
            }
            dVar.f70234e = false;
            dVar.f70231b.setAlpha(alpha);
            dVar.f70238i.a(dVar.f70240k, dVar.f70241l.getBitmap());
            dVar.f70233d.invalidateSelf();
        }
    }

    public static /* synthetic */ int d(d dVar) {
        int i10 = dVar.f70243n;
        dVar.f70243n = i10 + 1;
        return i10;
    }

    public final void a() {
        if (!(this.f70235f instanceof ViewGroup) || this.f70243n == this.f70244o.size()) {
            return;
        }
        this.f70243n = 0;
        this.f70244o.clear();
        u.a((ViewGroup) this.f70235f, new sg.bigo.ads.common.d<View>() { // from class: sg.bigo.ads.common.view.a.d.2
            @Override // sg.bigo.ads.common.d
            public final /* synthetic */ void a(View view) {
                View view2 = view;
                if (view2 instanceof TextureView) {
                    d.this.f70244o.put((TextureView) view2, d.this);
                    d.d(d.this);
                }
            }
        });
    }

    public final void b() {
        Bitmap bitmap = this.f70240k;
        if (bitmap != null) {
            bitmap.recycle();
            this.f70240k = null;
        }
        if (this.f70241l != null) {
            this.f70241l = null;
        }
        this.f70238i.a();
    }

    @Override // sg.bigo.ads.common.view.a.c
    public final void setBlurStyle(b bVar) {
        sg.bigo.ads.common.view.a.a aVar = this.f70233d;
        boolean z10 = false;
        if ((bVar != null || aVar.f70218b != null) && bVar != aVar.f70218b) {
            aVar.f70218b = bVar;
            aVar.invalidateSelf();
            z10 = true;
        }
        if (z10) {
            this.f70242m = 0L;
            b();
        }
    }
}
