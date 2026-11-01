package jd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;

/* JADX INFO: compiled from: BitmapLoadTask.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f61757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f61758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f61759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gd.b f61762f;

    @Override // android.os.AsyncTask
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) {
        Context context = this.f61757a.get();
        if (context == null) {
            return new a(new NullPointerException("context is null"));
        }
        if (this.f61758b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            d();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeStream(context.getContentResolver().openInputStream(this.f61758b), null, options);
                options.inSampleSize = kd.a.d(options.outWidth, options.outHeight);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            boolean z10 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeStream = null;
            while (!z10) {
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.f61758b);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            a aVar = new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f61758b + C3426d4.j.f28588e));
                            kd.a.c(inputStreamOpenInputStream);
                            return aVar;
                        }
                        kd.a.c(inputStreamOpenInputStream);
                        if (!kd.a.b(bitmapDecodeStream, options)) {
                            z10 = true;
                        }
                    } catch (Throwable th2) {
                        kd.a.c(inputStreamOpenInputStream);
                        throw th2;
                    }
                } catch (IOException e11) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e11);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f61758b + C3426d4.j.f28588e, e11));
                } catch (OutOfMemoryError e12) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e12);
                    options.inSampleSize *= 2;
                }
            }
            if (bitmapDecodeStream == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f61758b + C3426d4.j.f28588e));
            }
            int iH = kd.a.h(context, this.f61758b);
            int iF = kd.a.f(iH);
            int iG = kd.a.g(iH);
            hd.b bVar = new hd.b(iH, iF, iG);
            Matrix matrix = new Matrix();
            if (iF != 0) {
                matrix.preRotate(iF);
            }
            if (iG != 1) {
                matrix.postScale(iG, 1.0f);
            }
            return !matrix.isIdentity() ? new a(kd.a.l(bitmapDecodeStream, matrix), bVar) : new a(bitmapDecodeStream, bVar);
        } catch (IOException | NullPointerException e13) {
            return new a(e13);
        }
    }

    public final void b(@NonNull Uri uri, @Nullable Uri uri2) throws Throwable {
        Closeable closeable;
        Response response;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = this.f61757a.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        OkHttpClient okHttpClientA = fd.a.f52942b.a();
        BufferedSource bufferedSource = null;
        try {
            Response responseExecute = okHttpClientA.newCall(new Request.Builder().url(uri.toString()).build()).execute();
            try {
                BufferedSource bufferedSourceSource = responseExecute.body().source();
                try {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    Sink sink = Okio.sink(outputStreamOpenOutputStream);
                    bufferedSourceSource.readAll(sink);
                    kd.a.c(bufferedSourceSource);
                    kd.a.c(sink);
                    kd.a.c(responseExecute.body());
                    okHttpClientA.dispatcher().cancelAll();
                    this.f61758b = this.f61759c;
                } catch (Throwable th2) {
                    th = th2;
                    response = responseExecute;
                    closeable = null;
                    bufferedSource = bufferedSourceSource;
                    kd.a.c(bufferedSource);
                    kd.a.c(closeable);
                    if (response != null) {
                        kd.a.c(response.body());
                    }
                    okHttpClientA.dispatcher().cancelAll();
                    this.f61758b = this.f61759c;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                response = responseExecute;
                closeable = null;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            response = null;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(@NonNull a aVar) {
        Exception exc = aVar.f61765c;
        if (exc == null) {
            this.f61762f.a(aVar.f61763a, aVar.f61764b, this.f61758b, this.f61759c);
        } else {
            this.f61762f.onFailure(exc);
        }
    }

    public final void d() throws IOException, NullPointerException {
        String scheme = this.f61758b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                b(this.f61758b, this.f61759c);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e("BitmapWorkerTask", "Downloading failed", e10);
                throw e10;
            }
        }
        if (C3426d4.i.f28530b.equals(scheme) || "content".equals(scheme)) {
            return;
        }
        Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }

    /* JADX INFO: compiled from: BitmapLoadTask.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f61763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public hd.b f61764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Exception f61765c;

        public a(@NonNull Bitmap bitmap, @NonNull hd.b bVar) {
            this.f61763a = bitmap;
            this.f61764b = bVar;
        }

        public a(@NonNull Exception exc) {
            this.f61765c = exc;
        }
    }

    public b(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i10, int i11, gd.b bVar) {
        this.f61757a = new WeakReference<>(context);
        this.f61758b = uri;
        this.f61759c = uri2;
        this.f61760d = i10;
        this.f61761e = i11;
        this.f61762f = bVar;
    }
}
