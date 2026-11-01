package dj;

import dj.a;
import io.reactivex.internal.util.VolatileSizeArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: BaseTestConsumer.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a<T, U extends a<T, U>> implements mi.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f52117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f52118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f52120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f52121i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<T> f52115c = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Throwable> f52116d = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f52114b = new CountDownLatch(1);
}
