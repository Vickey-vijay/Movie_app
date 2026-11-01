package io.bidmachine.analytics.internal;

import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u000bJ0\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0010J,\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0012J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0014J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0014J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0014J4\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0017J:\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u001aJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\u0006\u0010!\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lio/bidmachine/analytics/internal/m0;", "Lio/bidmachine/analytics/internal/l0;", "Lkotlin/Result;", "", "Lio/bidmachine/analytics/internal/j0;", "Lio/bidmachine/analytics/internal/h0;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "readerRecord", "Lmj/r;", "b", "(Lio/bidmachine/analytics/internal/h0;)Ljava/lang/Object;", "", "name", "Lio/bidmachine/analytics/internal/h0$a;", "readerRecordRule", "(Ljava/lang/String;Lio/bidmachine/analytics/internal/h0$a;)Ljava/lang/Object;", "readerName", "(Ljava/lang/String;)Ljava/lang/Object;", "readerRecordList", "(Ljava/util/List;)Ljava/lang/Object;", "c", "readerRecordRuleList", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "excludeReadeNameList", "excludeReaderRuleList", "(Ljava/util/List;Ljava/util/List;)Ljava/lang/Object;", "()Ljava/lang/Object;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "sqLiteOpenHelper", "Lio/bidmachine/analytics/internal/i0;", "Lmj/g;", "()Lio/bidmachine/analytics/internal/i0;", "readerRecordDao", "<init>", "(Landroid/database/sqlite/SQLiteOpenHelper;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class m0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SQLiteOpenHelper sqLiteOpenHelper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mj.g readerRecordDao = kotlin.b.a(new a());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/bidmachine/analytics/internal/i0;", "a", "()Lio/bidmachine/analytics/internal/i0;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements bk.a<i0> {
        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke() {
            return new i0(m0.this.sqLiteOpenHelper);
        }
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object b(List<ReaderRecord> readerRecordList) {
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(nj.t.v(readerRecordList, 10));
        Iterator<T> it = readerRecordList.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((ReaderRecord) it.next()));
        }
        return i0VarA.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(List<String> excludeReadeNameList, List<ReaderRecord.Rule> excludeReaderRuleList) {
        a().b(excludeReadeNameList);
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(nj.t.v(excludeReaderRuleList, 10));
        Iterator<T> it = excludeReaderRuleList.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((ReaderRecord.Rule) it.next()).toString());
        }
        i0VarA.c(arrayList);
        Result.a aVar = Result.Companion;
        return Result.m3458constructorimpl(mj.r.f64562a);
    }

    public final Object b() {
        return a().b();
    }

    public m0(SQLiteOpenHelper sQLiteOpenHelper) {
        this.sqLiteOpenHelper = sQLiteOpenHelper;
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(String readerName) {
        return a(a().a(readerName));
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object b(ReaderRecord readerRecord) {
        return a().a(k0.a(readerRecord));
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object c(List<ReaderRecord> readerRecordList) {
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(nj.t.v(readerRecordList, 10));
        Iterator<T> it = readerRecordList.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((ReaderRecord) it.next()));
        }
        return i0VarA.d(arrayList);
    }

    private final i0 a() {
        return (i0) this.readerRecordDao.getValue();
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(String name, ReaderRecord.Rule readerRecordRule) {
        Object objA = a().a(name, k0.a(readerRecordRule).toString());
        try {
            Result.a aVar = Result.Companion;
            kotlin.c.b(objA);
            j0 j0Var = (j0) objA;
            return Result.m3458constructorimpl(j0Var != null ? k0.a(j0Var) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    private final Object a(Object obj) {
        try {
            Result.a aVar = Result.Companion;
            kotlin.c.b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(nj.t.v(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(k0.a((j0) it.next()));
            }
            return Result.m3458constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(String name, List<ReaderRecord.Rule> readerRecordRuleList) {
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(nj.t.v(readerRecordRuleList, 10));
        Iterator<T> it = readerRecordRuleList.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((ReaderRecord.Rule) it.next()).toString());
        }
        return i0VarA.a(name, arrayList);
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(List<ReaderRecord> readerRecordList) {
        i0 i0VarA = a();
        ArrayList arrayList = new ArrayList(nj.t.v(readerRecordList, 10));
        Iterator<T> it = readerRecordList.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.a((ReaderRecord) it.next()));
        }
        return i0VarA.e(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.l0
    public Object a(ReaderRecord readerRecord) {
        return a().c(k0.a(readerRecord));
    }
}
