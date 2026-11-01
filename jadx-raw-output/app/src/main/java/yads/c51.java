package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import yads.c51;

/* JADX INFO: loaded from: classes9.dex */
public final class c51 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w31 f76172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y41 f76173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j13 f76174e;

    public c51(ImageView imageView, w31 w31Var, y41 y41Var, j13 j13Var) {
        super(imageView);
        this.f76172c = w31Var;
        this.f76173d = y41Var;
        this.f76174e = j13Var;
    }

    @Override // yads.hk3
    public final void a(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(null);
        this.f76174e.a(imageView);
        imageView.setVisibility(8);
        imageView.setOnClickListener(null);
        imageView.setOnTouchListener(null);
        imageView.setSelected(false);
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        a((u41) obj);
    }

    public /* synthetic */ c51(ImageView imageView, mi2 mi2Var, v9 v9Var) {
        this(imageView, new w31(imageView.getContext(), new s32(v9Var), mi2Var), new y41(mi2Var), new j13());
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        eq wj0Var;
        u41 u41Var = (u41) obj;
        y41 y41Var = this.f76173d;
        Drawable drawable = ((ImageView) view).getDrawable();
        Bitmap bitmapA = y41Var.f84814a.a(u41Var);
        if (bitmapA == null) {
            mi2 mi2Var = y41Var.f84814a;
            mi2Var.getClass();
            String str = u41Var.f83372g;
            li2 li2Var = str != null ? new li2(str, new yz2(u41Var.f83366a, u41Var.f83367b)) : null;
            bitmapA = li2Var != null ? (Bitmap) mi2Var.f80184c.get(li2Var) : null;
        }
        if (drawable == null || bitmapA == null) {
            return false;
        }
        y41Var.f84815b.getClass();
        if (drawable instanceof BitmapDrawable) {
            wj0Var = new gq();
        } else {
            wj0Var = new wj0(new os2(), new iq());
        }
        return wj0Var.a(drawable, bitmapA);
    }

    public final void a(final u41 u41Var) {
        this.f76172c.a(u41Var, new t31() { // from class: cp.t
            @Override // yads.t31
            public final void a(Drawable drawable) {
                c51.a(this.f51589a, u41Var, drawable);
            }
        });
    }

    public static final void a(c51 c51Var, u41 u41Var, Drawable drawable) {
        ImageView imageView;
        if (drawable == null || (imageView = (ImageView) c51Var.b()) == null) {
            return;
        }
        if (u41Var.f83370e != null) {
            c51Var.f76174e.a(drawable, imageView, u41Var);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }
}
