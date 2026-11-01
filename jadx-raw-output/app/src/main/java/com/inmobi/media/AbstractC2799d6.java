package com.inmobi.media;

import com.inmobi.media.AbstractC2799d6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2799d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2879g9 f24221b;

    public final Object a(ContinuationImpl continuationImpl) {
        String str = "SELECT COUNT(*) FROM " + this.f24220a;
        C2879g9 c2879g9 = this.f24221b;
        c2879g9.getClass();
        return c2879g9.a(new Y8(c2879g9, str, null), continuationImpl);
    }

    public abstract Object b(int i10, ContinuationImpl continuationImpl);

    public AbstractC2799d6(String str, C2879g9 c2879g9) {
        ck.p.j(str, "tableName");
        ck.p.j(c2879g9, "databaseHelper");
        this.f24220a = str;
        this.f24221b = c2879g9;
    }

    public final Object a(ArrayList arrayList, SuspendLambda suspendLambda) {
        if (arrayList.isEmpty()) {
            return mj.r.f64562a;
        }
        String strP0 = nj.b0.p0(arrayList, StringUtils.COMMA, null, null, 0, null, new bk.l() { // from class: b7.o6
            @Override // bk.l
            public final Object invoke(Object obj) {
                return AbstractC2799d6.a(((Integer) obj).intValue());
            }
        }, 30, null);
        Object objA = C2879g9.a(this.f24221b, this.f24220a, "id IN (" + strP0 + ")", suspendLambda, 4);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    public static final CharSequence a(int i10) {
        return String.valueOf(i10);
    }

    public final Object a(long j10, ContinuationImpl continuationImpl) {
        Object objA = C2879g9.a(this.f24221b, this.f24220a, "ts < " + j10, continuationImpl, 4);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    public final Object a(int i10, ContinuationImpl continuationImpl) throws Throwable {
        String str = this.f24220a;
        Object objA = this.f24221b.a("DELETE FROM " + str + " WHERE id IN (SELECT id FROM " + str + " ORDER BY ts ASC LIMIT " + i10 + ")", continuationImpl);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }
}
