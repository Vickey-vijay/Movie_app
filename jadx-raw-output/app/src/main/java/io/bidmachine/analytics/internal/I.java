package io.bidmachine.analytics.internal;

import com.ironsource.C3426d4;
import io.bidmachine.analytics.ReaderConfig;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import nk.l1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R$\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lio/bidmachine/analytics/internal/I;", "", "Lio/bidmachine/analytics/internal/i$a;", com.safedk.android.utils.i.f44984c, "Lmj/r;", "a", "(Lio/bidmachine/analytics/internal/i$a;)V", "b", "()V", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "rule", "", "(Lio/bidmachine/analytics/ReaderConfig$Rule;)Ljava/lang/String;", "Lio/bidmachine/analytics/internal/J;", "Lio/bidmachine/analytics/internal/J;", C3426d4.a.f28418k, "Lio/bidmachine/analytics/internal/G$a;", "Lio/bidmachine/analytics/internal/G$a;", "readerFactory", "", "Lio/bidmachine/analytics/internal/G;", "c", "Ljava/util/Map;", "readers", "<init>", "(Lio/bidmachine/analytics/internal/J;Lio/bidmachine/analytics/internal/G$a;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final J storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final G.a readerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Map<String, G> readers;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\n"}, d2 = {"Lio/bidmachine/analytics/internal/I$a;", "Lio/bidmachine/analytics/internal/G$a;", "Lio/bidmachine/analytics/internal/G;", "a", "()Lio/bidmachine/analytics/internal/G;", "Lio/bidmachine/analytics/internal/J;", "Lio/bidmachine/analytics/internal/J;", C3426d4.a.f28418k, "<init>", "(Lio/bidmachine/analytics/internal/J;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class a implements G.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final J storage;

        @Override // io.bidmachine.analytics.internal.G.a
        public G a() {
            return new G(this.storage, new K(), kotlinx.coroutines.d.a(l1.c(Executors.newSingleThreadExecutor())));
        }

        public a(J j10) {
            this.storage = j10;
        }
    }

    public I(J j10, G.a aVar) {
        this.storage = j10;
        this.readerFactory = aVar;
    }

    public final void a(AbstractC4739i.a configuration) {
        List<ReaderConfig.Rule> listC = configuration.c();
        ArrayList arrayList = new ArrayList(nj.t.v(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReaderConfig.Rule) it.next()).getPath());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, this.readerFactory.a());
        }
        this.readers = kotlin.collections.a.B(linkedHashMap);
    }

    public /* synthetic */ I(J j10, G.a aVar, int i10, ck.i iVar) {
        this(j10, (i10 & 2) != 0 ? new a(j10) : aVar);
    }

    public final String a(ReaderConfig.Rule rule) throws FileNotFoundException {
        String strB = this.storage.b(rule.getPath());
        if (strB != null) {
            return strB;
        }
        throw new FileNotFoundException();
    }

    public final void b() {
        Map<String, G> map = this.readers;
        if (map != null) {
            for (Map.Entry<String, G> entry : map.entrySet()) {
                entry.getValue().a(entry.getKey());
            }
        }
    }

    public final void a() {
        Map<String, G> map = this.readers;
        if (map != null) {
            Iterator<Map.Entry<String, G>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
        }
    }
}
