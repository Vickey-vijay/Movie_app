package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.h;
import nk.h0;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateReset.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1", f = "InitializeStateReset.kt", l = {42}, m = "invokeSuspend")
public final class InitializeStateReset$doWork$2$1$success$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ WebViewApp $currentApp;
    public int label;
    public final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2$1$success$1(InitializeStateReset initializeStateReset, WebViewApp webViewApp, c<? super InitializeStateReset$doWork$2$1$success$1> cVar) {
        super(2, cVar);
        this.this$0 = initializeStateReset;
        this.$currentApp = webViewApp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new InitializeStateReset$doWork$2$1$success$1(this.this$0, this.$currentApp, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((InitializeStateReset$doWork$2$1$success$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: InitializeStateReset.kt */
    @d(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1", f = "InitializeStateReset.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ WebViewApp $currentApp;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebViewApp webViewApp, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$currentApp = webViewApp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$currentApp, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                WebView webView = this.$currentApp.getWebView();
                if (webView != null) {
                    webView.destroy();
                }
                this.$currentApp.setWebView(null);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            h0 main = this.this$0.dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentApp, null);
            this.label = 1;
            if (h.g(main, anonymousClass1, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
