package com.unity3d.services.core.extensions;

import bk.l;
import ck.n;
import ck.p;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.l0;
import nk.p0;
import rj.c;
import tj.d;
import wk.a;
import wk.g;

/* JADX INFO: compiled from: CoroutineExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, p0<?>> deferreds = new LinkedHashMap<Object, p0<?>>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof p0) {
                return containsValue((p0<?>) obj);
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof p0)) {
                return remove(obj, (p0<?>) obj2);
            }
            return false;
        }

        public /* bridge */ boolean containsValue(p0<?> p0Var) {
            return super.containsValue((Object) p0Var);
        }

        public /* bridge */ boolean remove(Object obj, p0<?> p0Var) {
            return super.remove(obj, (Object) p0Var);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Object, p0<?>> entry) {
            p.j(entry, "eldest");
            return size() > 100;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, p0<?>>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, p0<?>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<p0<?>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<p0<?>> values() {
            return getValues();
        }
    };
    private static final a mutex = g.b(false, 1, null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineExtensions.kt */
    @d(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
    public static final class AnonymousClass2<T> extends SuspendLambda implements bk.p<l0, c<? super T>, Object> {
        public final /* synthetic */ l<c<? super T>, Object> $action;
        public final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Object obj, l<? super c<? super T>, ? extends Object> lVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$key = obj;
            this.$action = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$action, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super T> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            l0 l0Var = (l0) this.L$0;
            a mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            l<c<? super T>, Object> lVar = this.$action;
            n.c(0);
            mutex.a(null, this);
            n.c(1);
            try {
                LinkedHashMap<Object, p0<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
                p0<?> p0VarB = deferreds.get(obj2);
                if (p0VarB == null) {
                    p0VarB = j.b(l0Var, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, p0VarB);
                }
                p0<?> p0Var = p0VarB;
                mutex.b(null);
                n.c(0);
                Object objY = p0Var.y(this);
                n.c(1);
                return objY;
            } catch (Throwable th2) {
                mutex.b(null);
                throw th2;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            l0 l0Var;
            a mutex;
            l<c<? super T>, Object> lVar;
            Object obj2;
            Object objF = sj.a.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            kotlin.c.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        lVar = (l) this.L$3;
                        obj2 = this.L$2;
                        mutex = (a) this.L$1;
                        l0Var = (l0) this.L$0;
                        kotlin.c.b(obj);
                    }
                    return obj;
                }
                kotlin.c.b(obj);
                l0Var = (l0) this.L$0;
                mutex = CoroutineExtensionsKt.getMutex();
                Object obj3 = this.$key;
                lVar = this.$action;
                this.L$0 = l0Var;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = lVar;
                this.label = 1;
                if (mutex.a(null, this) == objF) {
                    return objF;
                }
                obj2 = obj3;
                LinkedHashMap<Object, p0<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
                p0<?> p0VarB = deferreds.get(obj2);
                if (p0VarB == null) {
                    p0VarB = j.b(l0Var, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, p0VarB);
                }
                p0<?> p0Var = p0VarB;
                mutex.b(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = p0Var.y(this);
                if (obj == objF) {
                    return objF;
                }
                return obj;
            } catch (Throwable th2) {
                mutex.b(null);
                throw th2;
            }
        }
    }

    public static final LinkedHashMap<Object, p0<?>> getDeferreds() {
        return deferreds;
    }

    public static final a getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, l<? super c<? super T>, ? extends Object> lVar, c<? super T> cVar) {
        return kotlinx.coroutines.d.e(new AnonymousClass2(obj, lVar, null), cVar);
    }

    private static final <T> Object memoize$$forInline(Object obj, l<? super c<? super T>, ? extends Object> lVar, c<? super T> cVar) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(obj, lVar, null);
        n.c(0);
        Object objE = kotlinx.coroutines.d.e(anonymousClass2, cVar);
        n.c(1);
        return objE;
    }

    public static final <R> Object runReturnSuspendCatching(bk.a<? extends R> aVar) {
        Object objM3458constructorimpl;
        p.j(aVar, "block");
        try {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(aVar.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            return Result.m3458constructorimpl(objM3458constructorimpl);
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        return thM3461exceptionOrNullimpl != null ? Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl)) : objM3458constructorimpl;
    }

    public static final <R> Object runSuspendCatching(bk.a<? extends R> aVar) {
        p.j(aVar, "block");
        try {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(aVar.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }
}
