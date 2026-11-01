package ue;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.DecodeHintType;
import com.yzq.zxinglibrary.android.CaptureActivity;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import y5.k;

/* JADX INFO: compiled from: DecodeThread.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptureActivity f72845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hashtable<DecodeHintType, Object> f72846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f72847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f72848e = new CountDownLatch(1);

    public Handler a() {
        try {
            this.f72848e.await();
        } catch (InterruptedException unused) {
        }
        return this.f72847d;
    }

    public f(CaptureActivity captureActivity, k kVar) {
        this.f72845b = captureActivity;
        Hashtable<DecodeHintType, Object> hashtable = new Hashtable<>();
        this.f72846c = hashtable;
        Vector vector = new Vector();
        if (captureActivity.config.isDecodeBarCode()) {
            vector.addAll(b.f72833d);
        }
        vector.addAll(b.f72835f);
        vector.addAll(b.f72834e);
        hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        hashtable.put(DecodeHintType.CHARACTER_SET, "UTF-8");
        hashtable.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, kVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f72847d = new c(this.f72845b, this.f72846c);
        this.f72848e.countDown();
        Looper.loop();
    }
}
