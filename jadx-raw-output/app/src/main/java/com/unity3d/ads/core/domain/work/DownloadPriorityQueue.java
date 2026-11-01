package com.unity3d.ads.core.domain.work;

import bk.p;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import qj.b;
import qk.e;
import qk.l;
import qk.v;
import rj.c;
import tj.d;
import wk.a;
import wk.g;

/* JADX INFO: compiled from: DownloadPriorityQueue.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DownloadPriorityQueue {
    private final a mutex = g.a(false);
    private final l<PriorityItem> nextTurn = v.a(null);
    private final PriorityQueue<PriorityItem> queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return b.d(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t10).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t11).getPriority()));
        }
    });

    /* JADX INFO: compiled from: DownloadPriorityQueue.kt */
    public static final class PriorityItem {
        private final int priority;

        public final int getPriority() {
            return this.priority;
        }

        public PriorityItem(int i10) {
            this.priority = i10;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: DownloadPriorityQueue.kt */
    @d(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue", f = "DownloadPriorityQueue.kt", l = {47, 28, 31, 57}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadPriorityQueue.this.invoke(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: DownloadPriorityQueue.kt */
    @d(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", f = "DownloadPriorityQueue.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<PriorityItem, c<? super Boolean>, Object> {
        public final /* synthetic */ PriorityItem $priorityItem;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PriorityItem priorityItem, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$priorityItem = priorityItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$priorityItem, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(PriorityItem priorityItem, c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(priorityItem, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10;
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                if (((PriorityItem) this.L$0) == this.$priorityItem) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return tj.a.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(int i10, bk.l<? super c<? super r>, ? extends Object> lVar, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        DownloadPriorityQueue downloadPriorityQueue;
        bk.l<? super c<? super r>, ? extends Object> lVar2;
        a aVar;
        PriorityItem priorityItem;
        bk.l<? super c<? super r>, ? extends Object> lVar3;
        DownloadPriorityQueue downloadPriorityQueue2;
        PriorityItem priorityItem2;
        a aVar2;
        DownloadPriorityQueue downloadPriorityQueue3;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i12 = anonymousClass1.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    a aVar3 = (a) anonymousClass1.L$3;
                    PriorityItem priorityItem3 = (PriorityItem) anonymousClass1.L$2;
                    lVar2 = (bk.l) anonymousClass1.L$1;
                    downloadPriorityQueue = (DownloadPriorityQueue) anonymousClass1.L$0;
                    kotlin.c.b(obj);
                    aVar = aVar3;
                    priorityItem = priorityItem3;
                } else if (i12 == 2) {
                    priorityItem = (PriorityItem) anonymousClass1.L$2;
                    lVar3 = (bk.l) anonymousClass1.L$1;
                    downloadPriorityQueue2 = (DownloadPriorityQueue) anonymousClass1.L$0;
                    kotlin.c.b(obj);
                    anonymousClass1.L$0 = downloadPriorityQueue2;
                    anonymousClass1.L$1 = priorityItem;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.label = 3;
                    if (lVar3.invoke(anonymousClass1) == objF) {
                        return objF;
                    }
                    priorityItem2 = priorityItem;
                    aVar2 = downloadPriorityQueue2.mutex;
                    anonymousClass1.L$0 = downloadPriorityQueue2;
                    anonymousClass1.L$1 = priorityItem2;
                    anonymousClass1.L$2 = aVar2;
                    anonymousClass1.label = 4;
                    if (aVar2.a(null, anonymousClass1) == objF) {
                        return objF;
                    }
                    downloadPriorityQueue3 = downloadPriorityQueue2;
                } else if (i12 == 3) {
                    priorityItem = (PriorityItem) anonymousClass1.L$1;
                    DownloadPriorityQueue downloadPriorityQueue4 = (DownloadPriorityQueue) anonymousClass1.L$0;
                    kotlin.c.b(obj);
                    downloadPriorityQueue2 = downloadPriorityQueue4;
                    priorityItem2 = priorityItem;
                    aVar2 = downloadPriorityQueue2.mutex;
                    anonymousClass1.L$0 = downloadPriorityQueue2;
                    anonymousClass1.L$1 = priorityItem2;
                    anonymousClass1.L$2 = aVar2;
                    anonymousClass1.label = 4;
                    if (aVar2.a(null, anonymousClass1) == objF) {
                        return objF;
                    }
                    downloadPriorityQueue3 = downloadPriorityQueue2;
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (a) anonymousClass1.L$2;
                    priorityItem2 = (PriorityItem) anonymousClass1.L$1;
                    downloadPriorityQueue3 = (DownloadPriorityQueue) anonymousClass1.L$0;
                    kotlin.c.b(obj);
                }
                try {
                    downloadPriorityQueue3.queue.remove(priorityItem2);
                    downloadPriorityQueue3.nextTurn.setValue(downloadPriorityQueue3.queue.peek());
                    r rVar = r.f64562a;
                    return r.f64562a;
                } finally {
                    aVar2.b(null);
                }
            }
            kotlin.c.b(obj);
            PriorityItem priorityItem4 = new PriorityItem(i10);
            a aVar4 = this.mutex;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = lVar;
            anonymousClass1.L$2 = priorityItem4;
            anonymousClass1.L$3 = aVar4;
            anonymousClass1.label = 1;
            if (aVar4.a(null, anonymousClass1) == objF) {
                return objF;
            }
            downloadPriorityQueue = this;
            lVar2 = lVar;
            aVar = aVar4;
            priorityItem = priorityItem4;
            downloadPriorityQueue.queue.offer(priorityItem);
            downloadPriorityQueue.nextTurn.setValue(downloadPriorityQueue.queue.peek());
            r rVar2 = r.f64562a;
            aVar.b(null);
            l<PriorityItem> lVar4 = downloadPriorityQueue.nextTurn;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(priorityItem, null);
            anonymousClass1.L$0 = downloadPriorityQueue;
            anonymousClass1.L$1 = lVar2;
            anonymousClass1.L$2 = priorityItem;
            anonymousClass1.L$3 = null;
            anonymousClass1.label = 2;
            if (e.q(lVar4, anonymousClass3, anonymousClass1) == objF) {
                return objF;
            }
            lVar3 = lVar2;
            downloadPriorityQueue2 = downloadPriorityQueue;
            anonymousClass1.L$0 = downloadPriorityQueue2;
            anonymousClass1.L$1 = priorityItem;
            anonymousClass1.L$2 = null;
            anonymousClass1.label = 3;
            if (lVar3.invoke(anonymousClass1) == objF) {
                return objF;
            }
            priorityItem2 = priorityItem;
            aVar2 = downloadPriorityQueue2.mutex;
            anonymousClass1.L$0 = downloadPriorityQueue2;
            anonymousClass1.L$1 = priorityItem2;
            anonymousClass1.L$2 = aVar2;
            anonymousClass1.label = 4;
            if (aVar2.a(null, anonymousClass1) == objF) {
                return objF;
            }
            downloadPriorityQueue3 = downloadPriorityQueue2;
            downloadPriorityQueue3.queue.remove(priorityItem2);
            downloadPriorityQueue3.nextTurn.setValue(downloadPriorityQueue3.queue.peek());
            r rVar3 = r.f64562a;
            return r.f64562a;
        } catch (Throwable th2) {
            aVar.b(null);
            throw th2;
        }
    }
}
