package io.bidmachine.analytics.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0006\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001b\u0010\n\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lio/bidmachine/analytics/internal/l;", "", "Lio/bidmachine/analytics/internal/J;", "a", "Lmj/g;", "()Lio/bidmachine/analytics/internal/J;", "logCatStorage", "Lio/bidmachine/analytics/internal/e0;", "b", "()Lio/bidmachine/analytics/internal/e0;", "purchaseStorage", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C4742l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mj.g logCatStorage = kotlin.b.a(a.f58894a);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mj.g purchaseStorage = kotlin.b.a(b.f58895a);

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/bidmachine/analytics/internal/J;", "a", "()Lio/bidmachine/analytics/internal/J;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements bk.a<J> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58894a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            return new J(0, 1, null);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/bidmachine/analytics/internal/e0;", "a", "()Lio/bidmachine/analytics/internal/e0;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements bk.a<e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f58895a = new b();

        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return new e0();
        }
    }

    public final J a() {
        return (J) this.logCatStorage.getValue();
    }

    public final e0 b() {
        return (e0) this.purchaseStorage.getValue();
    }
}
