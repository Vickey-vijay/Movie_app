package androidx.datastore.core;

import bk.p;
import kotlin.Metadata;
import qk.c;

/* JADX INFO: compiled from: DataStore.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J7\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/datastore/core/DataStore;", "T", "", "Lkotlin/Function2;", "Lrj/c;", "transform", "updateData", "(Lbk/p;Lrj/c;)Ljava/lang/Object;", "Lqk/c;", "getData", "()Lqk/c;", "data", "datastore-core"}, k = 1, mv = {1, 5, 1})
public interface DataStore<T> {
    c<T> getData();

    Object updateData(p<? super T, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar);
}
