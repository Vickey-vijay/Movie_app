package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class SVGImageView extends ImageView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f13895d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SVG f13896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.caverock.androidsvg.a f13897c;

    public class b extends AsyncTask<Integer, Integer, SVG> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f13898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13899b;

        public b(Context context, int i10) {
            this.f13898a = context;
            this.f13899b = i10;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SVG doInBackground(Integer... numArr) {
            try {
                return SVG.m(this.f13898a, this.f13899b);
            } catch (SVGParseException e10) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(this.f13899b), e10.getMessage()));
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(SVG svg) {
            SVGImageView.this.f13896b = svg;
            SVGImageView.this.c();
        }
    }

    public class c extends AsyncTask<InputStream, Integer, SVG> {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SVG doInBackground(InputStream... inputStreamArr) {
            try {
                return SVG.l(inputStreamArr[0]);
            } catch (SVGParseException e10) {
                Log.e("SVGImageView", "Parse error loading URI: " + e10.getMessage());
                try {
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            } finally {
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(SVG svg) {
            SVGImageView.this.f13896b = svg;
            SVGImageView.this.c();
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f13896b = null;
        this.f13897c = new com.caverock.androidsvg.a();
        d(attributeSet, 0);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.caverock.androidsvg", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final boolean e(String str) {
        try {
            new c().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean f(Uri uri) {
        try {
            new c().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    static {
        try {
            f13895d = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public final void c() {
        SVG svg = this.f13896b;
        if (svg == null) {
            return;
        }
        Picture pictureT = svg.t(this.f13897c);
        g();
        setImageDrawable(new PictureDrawable(pictureT));
    }

    public final void g() {
        if (f13895d == null) {
            return;
        }
        try {
            f13895d.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
        } catch (Exception e10) {
            Log.w("SVGImageView", "Unexpected failure calling setLayerType", e10);
        }
    }

    public void setCSS(String str) {
        this.f13897c.a(str);
        c();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        new b(getContext(), i10).execute(new Integer[0]);
    }

    public void setSVG(SVG svg) {
        if (svg == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.f13896b = svg;
        c();
    }

    private void setFromString(String str) {
        try {
            this.f13896b = SVG.o(str);
            c();
        } catch (SVGParseException unused) {
            Log.e("SVGImageView", "Could not find SVG at: " + str);
        }
    }

    public final void d(AttributeSet attributeSet, int i10) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.SVGImageView, i10, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.SVGImageView_css);
            if (string != null) {
                this.f13897c.a(string);
            }
            int i11 = R$styleable.SVGImageView_svg;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                return;
            }
            String string2 = typedArrayObtainStyledAttributes.getString(i11);
            if (string2 != null) {
                if (f(Uri.parse(string2))) {
                    return;
                }
                if (e(string2)) {
                } else {
                    setFromString(string2);
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setImageAsset(String str) {
        if (!e(str)) {
            Log.e("SVGImageView", "File not found: " + str);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (!f(uri)) {
            Log.e("SVGImageView", "File not found: " + uri);
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13896b = null;
        this.f13897c = new com.caverock.androidsvg.a();
        d(attributeSet, i10);
    }
}
