package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import bk.q;
import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: UniversalRequestDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class UniversalRequestDataSource {
    private final UniversalRequestDataStoreProvider universalRequestStoreProvider;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<qk.d<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Throwable, c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // bk.q
        public final Object invoke(qk.d<? super UniversalRequestStoreOuterClass.UniversalRequestStore> dVar, Throwable th2, c<? super r> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = dVar;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                qk.d dVar = (qk.d) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                if (th2 instanceof CorruptionException) {
                    UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
                    p.i(defaultInstance, "getDefaultInstance()");
                    this.L$0 = null;
                    this.label = 1;
                    if (dVar.emit(defaultInstance, this) == objF) {
                        return objF;
                    }
                } else {
                    throw th2;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C38582 extends SuspendLambda implements bk.p<UniversalRequestStoreOuterClass.UniversalRequestStore, c<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Object> {
        public final /* synthetic */ String $key;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38582(String str, c<? super C38582> cVar) {
            super(2, cVar);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            C38582 c38582 = new C38582(this.$key, cVar);
            c38582.L$0 = obj;
            return c38582;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, c<? super UniversalRequestStoreOuterClass.UniversalRequestStore> cVar) {
            return ((C38582) create(universalRequestStore, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
                builder.removeUniversalRequestMap(this.$key);
                UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
                p.i(universalRequestStoreBuild, "dataBuilder.build()");
                return universalRequestStoreBuild;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C38592 extends SuspendLambda implements bk.p<UniversalRequestStoreOuterClass.UniversalRequestStore, c<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Object> {
        public final /* synthetic */ ByteString $data;
        public final /* synthetic */ String $key;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38592(String str, ByteString byteString, c<? super C38592> cVar) {
            super(2, cVar);
            this.$key = str;
            this.$data = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            C38592 c38592 = new C38592(this.$key, this.$data, cVar);
            c38592.L$0 = obj;
            return c38592;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, c<? super UniversalRequestStoreOuterClass.UniversalRequestStore> cVar) {
            return ((C38592) create(universalRequestStore, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
                builder.putUniversalRequestMap(this.$key, this.$data);
                UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
                p.i(universalRequestStoreBuild, "dataBuilder.build()");
                return universalRequestStoreBuild;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object get(c<? super UniversalRequestStoreOuterClass.UniversalRequestStore> cVar) {
        return e.r(e.f(this.universalRequestStoreProvider.invoke().getData(), new AnonymousClass2(null)), cVar);
    }

    public final Object remove(String str, c<? super r> cVar) {
        Object objUpdateData = this.universalRequestStoreProvider.invoke().updateData(new C38582(str, null), cVar);
        return objUpdateData == sj.a.f() ? objUpdateData : r.f64562a;
    }

    public final Object set(String str, ByteString byteString, c<? super r> cVar) {
        Object objUpdateData = this.universalRequestStoreProvider.invoke().updateData(new C38592(str, byteString, null), cVar);
        return objUpdateData == sj.a.f() ? objUpdateData : r.f64562a;
    }

    public UniversalRequestDataSource(UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        p.j(universalRequestDataStoreProvider, "universalRequestStoreProvider");
        this.universalRequestStoreProvider = universalRequestDataStoreProvider;
    }
}
