package androidx.datastore.core;

import bk.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import rj.c;
import wk.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J7\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"androidx/datastore/core/SingleProcessDataStore$readAndInit$api$1", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/Function2;", "Lrj/c;", "", "transform", "updateData", "(Lbk/p;Lrj/c;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class SingleProcessDataStore$readAndInit$api$1<T> implements InitializerApi<T> {
    public final /* synthetic */ Ref$ObjectRef<T> $initData;
    public final /* synthetic */ Ref$BooleanRef $initializationComplete;
    public final /* synthetic */ a $updateLock;
    public final /* synthetic */ SingleProcessDataStore<T> this$0;

    public SingleProcessDataStore$readAndInit$api$1(a aVar, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<T> ref$ObjectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.$updateLock = aVar;
        this.$initializationComplete = ref$BooleanRef;
        this.$initData = ref$ObjectRef;
        this.this$0 = singleProcessDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    public Object updateData(p<? super T, ? super c<? super T>, ? extends Object> pVar, c<? super T> cVar) throws Throwable {
        SingleProcessDataStore$readAndInit$api$1$updateData$1 singleProcessDataStore$readAndInit$api$1$updateData$1;
        a aVar;
        SingleProcessDataStore singleProcessDataStore;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef<T> ref$ObjectRef;
        a aVar2;
        a aVar3;
        SingleProcessDataStore singleProcessDataStore2;
        T t10;
        Ref$ObjectRef<T> ref$ObjectRef2;
        if (cVar instanceof SingleProcessDataStore$readAndInit$api$1$updateData$1) {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = (SingleProcessDataStore$readAndInit$api$1$updateData$1) cVar;
            int i10 = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, cVar);
            }
        } else {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, cVar);
        }
        Object obj = singleProcessDataStore$readAndInit$api$1$updateData$1.result;
        Object objF = sj.a.f();
        int i11 = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                aVar = this.$updateLock;
                Ref$BooleanRef ref$BooleanRef2 = this.$initializationComplete;
                Ref$ObjectRef<T> ref$ObjectRef3 = this.$initData;
                singleProcessDataStore = this.this$0;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = pVar;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = aVar;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = ref$BooleanRef2;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = ref$ObjectRef3;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = singleProcessDataStore;
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = 1;
                if (aVar.a(null, singleProcessDataStore$readAndInit$api$1$updateData$1) == objF) {
                    return objF;
                }
                ref$BooleanRef = ref$BooleanRef2;
                ref$ObjectRef = ref$ObjectRef3;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t10 = (T) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                        ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                        aVar2 = (a) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                        try {
                            kotlin.c.b(obj);
                            ref$ObjectRef2.element = t10;
                            ref$ObjectRef = ref$ObjectRef2;
                            T t11 = ref$ObjectRef.element;
                            aVar2.b(null);
                            return t11;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.b(null);
                            throw th;
                        }
                    }
                    SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                    ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                    aVar3 = (a) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                    try {
                        kotlin.c.b(obj);
                        singleProcessDataStore2 = singleProcessDataStore3;
                        if (ck.p.e(obj, ref$ObjectRef.element)) {
                            aVar2 = aVar3;
                        } else {
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = aVar3;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                            if (singleProcessDataStore2.writeData$datastore_core(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) == objF) {
                                return objF;
                            }
                            t10 = (T) obj;
                            ref$ObjectRef2 = ref$ObjectRef;
                            aVar2 = aVar3;
                            ref$ObjectRef2.element = t10;
                            ref$ObjectRef = ref$ObjectRef2;
                        }
                        T t12 = ref$ObjectRef.element;
                        aVar2.b(null);
                        return t12;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar3;
                        aVar2.b(null);
                        throw th;
                    }
                }
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$4;
                ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$3;
                ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                a aVar4 = (a) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                p<? super T, ? super c<? super T>, ? extends Object> pVar2 = (p) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                kotlin.c.b(obj);
                aVar = aVar4;
                singleProcessDataStore = singleProcessDataStore4;
                pVar = pVar2;
            }
            if (ref$BooleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            T t13 = ref$ObjectRef.element;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = aVar;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = singleProcessDataStore;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.label = 2;
            Object objMo1invoke = pVar.mo1invoke(t13, singleProcessDataStore$readAndInit$api$1$updateData$1);
            if (objMo1invoke == objF) {
                return objF;
            }
            aVar3 = aVar;
            obj = objMo1invoke;
            singleProcessDataStore2 = singleProcessDataStore;
            if (ck.p.e(obj, ref$ObjectRef.element)) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = aVar3;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj;
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                if (singleProcessDataStore2.writeData$datastore_core(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) == objF) {
                    return objF;
                }
                t10 = (T) obj;
                ref$ObjectRef2 = ref$ObjectRef;
                aVar2 = aVar3;
                ref$ObjectRef2.element = t10;
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                aVar2 = aVar3;
            }
            T t14 = ref$ObjectRef.element;
            aVar2.b(null);
            return t14;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.b(null);
            throw th;
        }
    }
}
