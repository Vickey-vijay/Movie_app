package io.bidmachine.analytics.internal;

import com.ironsource.C3426d4;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0003B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lio/bidmachine/analytics/internal/J;", "", "Lio/bidmachine/analytics/internal/L;", "a", "()Lio/bidmachine/analytics/internal/L;", "", C3426d4.i.W, "Ljava/io/InputStream;", "(Ljava/lang/String;)Ljava/io/InputStream;", "b", "(Ljava/lang/String;)Ljava/lang/String;", "line", "Lmj/r;", "(Ljava/lang/String;Ljava/lang/String;)V", "", "I", "maxBufferSize", "", "Ljava/util/Map;", "dataStore", "c", "Ljava/lang/Object;", "lock", "<init>", "(I)V", "d", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f58704d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxBufferSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, L> dataStore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    public J() {
        this(0, 1, null);
    }

    private final L a() {
        int i10 = this.maxBufferSize;
        return new L(i10 / 2, i10);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lio/bidmachine/analytics/internal/J$a;", "", "", "MAX_BUFFER_SIZE", "I", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public J(int i10) {
        this.maxBufferSize = i10;
        this.dataStore = new LinkedHashMap();
        this.lock = new Object();
    }

    public final InputStream a(String key) {
        Object objM3458constructorimpl;
        synchronized (this.lock) {
            try {
                Result.a aVar = Result.Companion;
                L lRemove = this.dataStore.remove(key);
                objM3458constructorimpl = Result.m3458constructorimpl(new ByteArrayInputStream(lRemove != null ? M.a(lRemove) : null));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
        }
        return (InputStream) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    public final String b(String key) {
        Object objM3458constructorimpl;
        Long lastAddedTimestamp;
        synchronized (this.lock) {
            try {
                Result.a aVar = Result.Companion;
                L l10 = this.dataStore.get(key);
                objM3458constructorimpl = Result.m3458constructorimpl((l10 == null || (lastAddedTimestamp = l10.getLastAddedTimestamp()) == null) ? null : lastAddedTimestamp.toString());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
        }
        return (String) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    public /* synthetic */ J(int i10, int i11, ck.i iVar) {
        this((i11 & 1) != 0 ? 2097152 : i10);
    }

    public final void a(String key, String line) {
        synchronized (this.lock) {
            try {
                Result.a aVar = Result.Companion;
                Map<String, L> map = this.dataStore;
                L lA = map.get(key);
                if (lA == null) {
                    lA = a();
                    map.put(key, lA);
                }
                lA.a(line);
                Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th2));
            }
        }
    }
}
