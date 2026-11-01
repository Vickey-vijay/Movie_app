package t2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: InMobiMemoryCache.java */
/* JADX INFO: loaded from: classes10.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Drawable> f72181a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public long f72182b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f72183c = 1000000;

    public Drawable b(String str) {
        try {
            if (this.f72181a.containsKey(str)) {
                return this.f72181a.get(str);
            }
            return null;
        } catch (NullPointerException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final void a() {
        Log.i("MemoryCache", "cache size=" + this.f72182b + " length=" + this.f72181a.size());
        if (this.f72182b > this.f72183c) {
            Iterator<Map.Entry<String, Drawable>> it = this.f72181a.entrySet().iterator();
            while (it.hasNext()) {
                this.f72182b -= c(((BitmapDrawable) it.next().getValue()).getBitmap());
                it.remove();
                if (this.f72182b <= this.f72183c) {
                    break;
                }
            }
            Log.i("MemoryCache", "Clean cache. New size " + this.f72181a.size());
        }
    }

    public final long c(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public void d(String str, Drawable drawable) {
        try {
            if (this.f72181a.containsKey(str)) {
                this.f72182b -= c(((BitmapDrawable) this.f72181a.get(str)).getBitmap());
            }
            this.f72181a.put(str, drawable);
            this.f72182b += c(((BitmapDrawable) drawable).getBitmap());
            a();
            Log.d("MemoryCache", "Drawable used from cache");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void e(long j10) {
        this.f72183c = j10;
        Log.i("MemoryCache", "MemoryCache will use up to " + ((this.f72183c / 1024.0d) / 1024.0d) + "MB");
    }

    public k() {
        e(Runtime.getRuntime().maxMemory() / 4);
    }
}
