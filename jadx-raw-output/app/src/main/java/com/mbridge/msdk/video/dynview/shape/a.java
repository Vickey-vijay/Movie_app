package com.mbridge.msdk.video.dynview.shape;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: compiled from: BackgroundDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends ShapeDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f38680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f38681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f38683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Matrix f38684j;

    /* JADX INFO: compiled from: BackgroundDrawable.java */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RectShape f38685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f38686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f38687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f38688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f38689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f38690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f38691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f38692h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f38693i;

        private b() {
            this.f38690f = 100;
            this.f38691g = 10;
            this.f38685a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(Bitmap bitmap) {
            this.f38687c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c b(Bitmap bitmap) {
            this.f38686b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public a build() {
            return new a(this);
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c orientation(int i10) {
            this.f38689e = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(boolean z10) {
            this.f38688d = z10;
            return this;
        }

        public c b(float f10) {
            this.f38692h = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(float f10) {
            this.f38693i = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(int i10) {
            this.f38691g = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: BackgroundDrawable.java */
    public interface c {
        c a(float f10);

        c a(int i10);

        c a(Bitmap bitmap);

        c a(boolean z10);

        c b(Bitmap bitmap);

        a build();

        c orientation(int i10);
    }

    private void a(Canvas canvas) {
        float f10 = this.f38676b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f38677c);
        path.lineTo((f10 - this.f38678d) - this.f38679e, this.f38677c);
        path.lineTo((this.f38678d + f10) - this.f38679e, 0.0f);
        if (this.f38682h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f38680f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f38680f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f38678d + f10 + this.f38679e, 0.0f);
        path2.lineTo(this.f38676b, 0.0f);
        path2.lineTo(this.f38676b, this.f38677c);
        path2.lineTo((f10 - this.f38678d) + this.f38679e, this.f38677c);
        if (this.f38682h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f38681g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f38681g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private a(b bVar) {
        super(bVar.f38685a);
        this.f38682h = false;
        this.f38680f = bVar.f38686b;
        this.f38681g = bVar.f38687c;
        this.f38682h = bVar.f38688d;
        this.f38675a = bVar.f38689e;
        this.f38678d = bVar.f38690f;
        this.f38679e = bVar.f38691g;
        this.f38676b = bVar.f38692h;
        this.f38677c = bVar.f38693i;
        Paint paint = new Paint();
        this.f38683i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f38683i.setAntiAlias(true);
        this.f38684j = new Matrix();
    }

    private void b(Canvas canvas) {
        float f10 = this.f38677c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f38678d + f10) - this.f38679e);
        path.lineTo(this.f38676b, (f10 - this.f38678d) - this.f38679e);
        path.lineTo(this.f38676b, 0.0f);
        if (this.f38682h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f38680f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f38680f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f38678d + f10 + this.f38679e);
        path2.lineTo(0.0f, this.f38677c);
        path2.lineTo(this.f38676b, this.f38677c);
        path2.lineTo(this.f38676b, (f10 - this.f38678d) + this.f38679e);
        if (this.f38682h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f38681g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f38681g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f38675a == 1) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float fMax = Math.max(this.f38676b / bitmap.getWidth(), this.f38677c / bitmap.getHeight());
            if (this.f38684j == null) {
                this.f38684j = new Matrix();
            }
            this.f38684j.reset();
            this.f38684j.preScale(fMax, fMax);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f38684j);
        this.f38683i.setShader(bitmapShader);
        canvas.drawPath(path, this.f38683i);
    }

    private void a(Canvas canvas, Path path) {
        this.f38683i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f38683i);
    }

    public static b a() {
        return new b();
    }
}
