package io.bidmachine.analytics.internal;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001aO\u0010\u0004\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001a\u0010\u000f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"", "", "", "predicate", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/util/List;)[Ljava/lang/String;", "T", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "size", "Lkotlin/Function1;", "Lmj/r;", "action", "(Ljava/util/List;Landroid/database/sqlite/SQLiteDatabase;ILbk/l;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 2, mv = {1, 7, 1})
public final class C4747q {

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q$a */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements bk.l<Object, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f59034a = new a();

        public a() {
            super(1);
        }

        @Override // bk.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return "?";
        }
    }

    public static final <T> void a(List<? extends T> list, SQLiteDatabase sQLiteDatabase, int i10, bk.l<? super List<? extends T>, mj.r> lVar) {
        if (list == null) {
            lVar.invoke(null);
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            Iterator<T> it = nj.b0.T(list, i10).iterator();
            while (it.hasNext()) {
                lVar.invoke((List) it.next());
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static /* synthetic */ void a(List list, SQLiteDatabase sQLiteDatabase, int i10, bk.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        a(list, sQLiteDatabase, i10, lVar);
    }

    public static final String[] a(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final String a(List<? extends Object> list, String str) {
        if (list == null) {
            return null;
        }
        return str + " (" + nj.b0.p0(list, StringUtils.COMMA, null, null, 0, null, a.f59034a, 30, null) + ')';
    }
}
