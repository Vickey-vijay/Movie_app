package io.bidmachine.analytics.internal;

import android.database.sqlite.SQLiteOpenHelper;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"J4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\nJ4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u000eJ<\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0011J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0013J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0013J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0013J4\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0018J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001b\u0010 \u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u0006\u0010\u001f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lio/bidmachine/analytics/internal/W;", "Lio/bidmachine/analytics/internal/V;", "Lkotlin/Result;", "", "Lio/bidmachine/analytics/internal/T;", "Lio/bidmachine/analytics/internal/Q;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "monitorRecord", "Lmj/r;", "(Lio/bidmachine/analytics/internal/Q;)Ljava/lang/Object;", "", "monitorName", JsonStorageKeyNames.SESSION_ID_KEY, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", "limit", "(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Object;", "monitorRecordList", "(Ljava/util/List;)Ljava/lang/Object;", "c", "b", "excludeSessionId", "excludeMonitorNameList", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "()Ljava/lang/Object;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "sqLiteOpenHelper", "Lio/bidmachine/analytics/internal/S;", "Lmj/g;", "()Lio/bidmachine/analytics/internal/S;", "monitorRecordDao", "<init>", "(Landroid/database/sqlite/SQLiteOpenHelper;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class W implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SQLiteOpenHelper sqLiteOpenHelper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mj.g monitorRecordDao = kotlin.b.a(new a());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/bidmachine/analytics/internal/S;", "a", "()Lio/bidmachine/analytics/internal/S;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements bk.a<S> {
        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke() {
            return new S(W.this.sqLiteOpenHelper);
        }
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object b(List<MonitorRecord> monitorRecordList) {
        S sA = a();
        ArrayList arrayList = new ArrayList(nj.t.v(monitorRecordList, 10));
        Iterator<T> it = monitorRecordList.iterator();
        while (it.hasNext()) {
            arrayList.add(U.a((MonitorRecord) it.next()));
        }
        return sA.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(String excludeSessionId, List<String> excludeMonitorNameList) {
        return a().a(excludeSessionId, excludeMonitorNameList);
    }

    public final Object b() {
        return a().a();
    }

    public W(SQLiteOpenHelper sQLiteOpenHelper) {
        this.sqLiteOpenHelper = sQLiteOpenHelper;
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(String monitorName, String sessionId) {
        return a(a().a(monitorName, sessionId));
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object c(List<MonitorRecord> monitorRecordList) {
        S sA = a();
        ArrayList arrayList = new ArrayList(nj.t.v(monitorRecordList, 10));
        Iterator<T> it = monitorRecordList.iterator();
        while (it.hasNext()) {
            arrayList.add(U.a((MonitorRecord) it.next()));
        }
        return sA.b(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(String monitorName, String sessionId, int limit) {
        return a(a().a(monitorName, sessionId, Integer.valueOf(limit)));
    }

    private final S a() {
        return (S) this.monitorRecordDao.getValue();
    }

    private final Object a(Object obj) {
        try {
            Result.a aVar = Result.Companion;
            kotlin.c.b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(nj.t.v(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(U.a((T) it.next()));
            }
            return Result.m3458constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(List<MonitorRecord> monitorRecordList) {
        S sA = a();
        ArrayList arrayList = new ArrayList(nj.t.v(monitorRecordList, 10));
        Iterator<T> it = monitorRecordList.iterator();
        while (it.hasNext()) {
            arrayList.add(U.a((MonitorRecord) it.next()));
        }
        return sA.c(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.V
    public Object a(MonitorRecord monitorRecord) {
        return a().a(U.a(monitorRecord));
    }
}
