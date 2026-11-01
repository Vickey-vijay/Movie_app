package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import bk.q;
import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidByteStringDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AndroidByteStringDataSource implements ByteStringDataSource {
    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidByteStringDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", l = {18}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<qk.d<? super ByteStringStoreOuterClass.ByteStringStore>, Throwable, c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // bk.q
        public final Object invoke(qk.d<? super ByteStringStoreOuterClass.ByteStringStore> dVar, Throwable th2, c<? super r> cVar) {
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
                    ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
                    ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
                    p.i(builderNewBuilder, "newBuilder()");
                    ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    ByteString byteString = ByteString.EMPTY;
                    p.i(byteString, "EMPTY");
                    dsl_create.setData(byteString);
                    ByteStringStoreOuterClass.ByteStringStore byteStringStore_build = dsl_create._build();
                    this.L$0 = null;
                    this.label = 1;
                    if (dVar.emit(byteStringStore_build, this) == objF) {
                        return objF;
                    }
                } else {
                    throw th2;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidByteStringDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", f = "AndroidByteStringDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C38562 extends SuspendLambda implements bk.p<ByteStringStoreOuterClass.ByteStringStore, c<? super ByteStringStoreOuterClass.ByteStringStore>, Object> {
        public final /* synthetic */ ByteString $data;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38562(ByteString byteString, c<? super C38562> cVar) {
            super(2, cVar);
            this.$data = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            C38562 c38562 = new C38562(this.$data, cVar);
            c38562.L$0 = obj;
            return c38562;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, c<? super ByteStringStoreOuterClass.ByteStringStore> cVar) {
            return ((C38562) create(byteStringStore, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().setData(this.$data).build();
                p.i(byteStringStoreBuild, "currentData.toBuilder()\n…\n                .build()");
                return byteStringStoreBuild;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AndroidByteStringDataSource(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(c<? super ByteStringStoreOuterClass.ByteStringStore> cVar) {
        return e.r(e.f(this.dataStore.getData(), new AnonymousClass2(null)), cVar);
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, c<? super r> cVar) {
        Object objUpdateData = this.dataStore.updateData(new C38562(byteString, null), cVar);
        return objUpdateData == sj.a.f() ? objUpdateData : r.f64562a;
    }
}
