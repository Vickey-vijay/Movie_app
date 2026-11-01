package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import bk.q;
import ck.p;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: WebviewConfigurationDataSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WebviewConfigurationDataSource {
    private final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: WebviewConfigurationDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<qk.d<? super WebviewConfigurationStore.WebViewConfigurationStore>, Throwable, c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // bk.q
        public final Object invoke(qk.d<? super WebviewConfigurationStore.WebViewConfigurationStore> dVar, Throwable th2, c<? super r> cVar) {
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
                    WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: WebviewConfigurationDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C38602 extends SuspendLambda implements bk.p<WebviewConfigurationStore.WebViewConfigurationStore, c<? super WebviewConfigurationStore.WebViewConfigurationStore>, Object> {
        public final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38602(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, c<? super C38602> cVar) {
            super(2, cVar);
            this.$data = webViewConfigurationStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new C38602(this.$data, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, c<? super WebviewConfigurationStore.WebViewConfigurationStore> cVar) {
            return ((C38602) create(webViewConfigurationStore, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                return this.$data;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object get(c<? super WebviewConfigurationStore.WebViewConfigurationStore> cVar) {
        return e.r(e.f(this.webviewConfigurationStore.getData(), new AnonymousClass2(null)), cVar);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, c<? super r> cVar) {
        Object objUpdateData = this.webviewConfigurationStore.updateData(new C38602(webViewConfigurationStore, null), cVar);
        return objUpdateData == sj.a.f() ? objUpdateData : r.f64562a;
    }

    public WebviewConfigurationDataSource(DataStore<WebviewConfigurationStore.WebViewConfigurationStore> dataStore) {
        p.j(dataStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = dataStore;
    }
}
