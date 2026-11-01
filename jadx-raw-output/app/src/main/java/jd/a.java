package jd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import hd.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import kd.f;
import kd.j;

/* JADX INFO: compiled from: BitmapCropTask.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f61737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f61738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f61739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f61740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f61741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f61742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f61743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f61744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bitmap.CompressFormat f61745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f61746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f61747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f61748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f61749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f61750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hd.b f61751o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gd.a f61752p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f61753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f61754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f61755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f61756t;

    public final void a() {
        if (this.f61755s < 0) {
            this.f61755s = 0;
            this.f61753q = this.f61738b.getWidth();
        }
        if (this.f61756t < 0) {
            this.f61756t = 0;
            this.f61754r = this.f61738b.getHeight();
        }
    }

    public final void b(Context context) throws Throwable {
        boolean zK = kd.a.k(this.f61749m);
        boolean zK2 = kd.a.k(this.f61750n);
        if (zK && zK2) {
            f.b(context, this.f61753q, this.f61754r, this.f61749m, this.f61750n);
            return;
        }
        if (zK) {
            f.c(context, this.f61753q, this.f61754r, this.f61749m, this.f61748l);
        } else if (zK2) {
            f.d(context, new ExifInterface(this.f61747k), this.f61753q, this.f61754r, this.f61750n);
        } else {
            f.e(new ExifInterface(this.f61747k), this.f61753q, this.f61754r, this.f61748l);
        }
    }

    public final boolean c() throws Throwable {
        Context context = this.f61737a.get();
        if (context == null) {
            return false;
        }
        if (this.f61743g > 0 && this.f61744h > 0) {
            float fWidth = this.f61739c.width() / this.f61741e;
            float fHeight = this.f61739c.height() / this.f61741e;
            int i10 = this.f61743g;
            if (fWidth > i10 || fHeight > this.f61744h) {
                float fMin = Math.min(i10 / fWidth, this.f61744h / fHeight);
                Bitmap bitmap = this.f61738b;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * fMin), Math.round(this.f61738b.getHeight() * fMin), false);
                Bitmap bitmap2 = this.f61738b;
                if (bitmap2 != bitmapCreateScaledBitmap) {
                    bitmap2.recycle();
                }
                this.f61738b = bitmapCreateScaledBitmap;
                this.f61741e /= fMin;
            }
        }
        if (this.f61742f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f61742f, this.f61738b.getWidth() / 2, this.f61738b.getHeight() / 2);
            Bitmap bitmap3 = this.f61738b;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.f61738b.getHeight(), matrix, true);
            Bitmap bitmap4 = this.f61738b;
            if (bitmap4 != bitmapCreateBitmap) {
                bitmap4.recycle();
            }
            this.f61738b = bitmapCreateBitmap;
        }
        this.f61755s = Math.round((this.f61739c.left - this.f61740d.left) / this.f61741e);
        this.f61756t = Math.round((this.f61739c.top - this.f61740d.top) / this.f61741e);
        this.f61753q = Math.round(this.f61739c.width() / this.f61741e);
        int iRound = Math.round(this.f61739c.height() / this.f61741e);
        this.f61754r = iRound;
        boolean zG = g(this.f61753q, iRound);
        Log.i("BitmapCropTask", "Should crop: " + zG);
        if (!zG) {
            if (Build.VERSION.SDK_INT < 29 || !j.j(this.f61747k)) {
                j.a(this.f61747k, this.f61748l);
            } else {
                j.v(context.getContentResolver().openInputStream(Uri.parse(this.f61747k)), new FileOutputStream(this.f61748l));
            }
            return false;
        }
        a();
        f(Bitmap.createBitmap(this.f61738b, this.f61755s, this.f61756t, this.f61753q, this.f61754r));
        if (!this.f61745i.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        b(context);
        return true;
    }

    @Override // android.os.AsyncTask
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f61738b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f61740d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.f61750n == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            c();
            this.f61738b = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(@Nullable Throwable th2) {
        gd.a aVar = this.f61752p;
        if (aVar != null) {
            if (th2 != null) {
                aVar.b(th2);
            } else {
                this.f61752p.a(kd.a.k(this.f61750n) ? this.f61750n : Uri.fromFile(new File(this.f61748l)), this.f61755s, this.f61756t, this.f61753q, this.f61754r);
            }
        }
    }

    public final void f(@NonNull Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Context context = this.f61737a.get();
        if (context == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(this.f61750n);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(this.f61745i, this.f61746j, byteArrayOutputStream);
                    outputStreamOpenOutputStream.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    kd.a.c(outputStreamOpenOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    outputStream = outputStreamOpenOutputStream;
                    try {
                        Log.e("BitmapCropTask", e.getLocalizedMessage());
                        kd.a.c(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        kd.a.c(outputStream);
                        kd.a.c(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = outputStreamOpenOutputStream;
                    kd.a.c(outputStream);
                    kd.a.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            byteArrayOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
        }
        kd.a.c(byteArrayOutputStream);
    }

    public a(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull c cVar, @NonNull hd.a aVar, @Nullable gd.a aVar2) {
        this.f61737a = new WeakReference<>(context);
        this.f61738b = bitmap;
        this.f61739c = cVar.a();
        this.f61740d = cVar.c();
        this.f61741e = cVar.d();
        this.f61742f = cVar.b();
        this.f61743g = aVar.h();
        this.f61744h = aVar.i();
        this.f61745i = aVar.a();
        this.f61746j = aVar.b();
        this.f61747k = aVar.f();
        this.f61748l = aVar.g();
        this.f61749m = aVar.c();
        this.f61750n = aVar.d();
        this.f61751o = aVar.e();
        this.f61752p = aVar2;
    }

    public final boolean g(int i10, int i11) {
        int iRound = Math.round(Math.max(i10, i11) / 1000.0f) + 1;
        if (this.f61743g > 0 && this.f61744h > 0) {
            return true;
        }
        float f10 = iRound;
        if (Math.abs(this.f61739c.left - this.f61740d.left) > f10 || Math.abs(this.f61739c.top - this.f61740d.top) > f10 || Math.abs(this.f61739c.bottom - this.f61740d.bottom) > f10 || Math.abs(this.f61739c.right - this.f61740d.right) > f10 || this.f61742f != 0.0f) {
            return true;
        }
        return false;
    }
}
