package com.unity3d.ads.adplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import bk.p;
import ck.i;
import com.safedk.android.internal.partials.UnityAdsNetworkBridge;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lk.q;
import lk.t;
import mj.r;
import nk.h;
import nk.h0;
import nk.j;
import nk.k0;
import nk.l0;
import nk.p0;
import org.json.JSONArray;
import qk.e;
import qk.l;
import qk.u;
import qk.v;
import tj.d;

/* JADX INFO: compiled from: AndroidWebViewContainer.kt */
/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ClickableViewAccessibility"})
public final class AndroidWebViewContainer implements WebViewContainer {
    private static final String JS_CLOSING_PARENTHESES = ")";
    private static final String JS_INSTRUCTION = "javascript:window.nativebridge.";
    private static final String JS_OPENING_PARENTHESES = "(";
    private static final String JS_SEMICOLON = ";";
    private final l<InputEvent> _lastInputEvent;
    private final Context context;
    private final u<InputEvent> lastInputEvent;
    private final l0 scope;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final WebView webView;
    private final AndroidWebViewClient webViewClient;
    public static final Companion Companion = new Companion(null);
    private static final StringBuilder SHARED_STRING_BUILDER = new StringBuilder(4096);

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {134}, m = "addJavascriptInterface")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(rj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.addJavascriptInterface(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {152}, m = "destroy")
    public static final class C38271 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C38271(rj.c<? super C38271> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {99}, m = "evaluateJavascript")
    public static final class C38291 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C38291(rj.c<? super C38291> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.evaluateJavascript(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {85, 89, 91}, m = "loadUrl")
    public static final class C38311 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C38311(rj.c<? super C38311> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.loadUrl(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {73}, m = "onRenderProcessGone")
    public static final class C38331 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C38331(rj.c<? super C38331> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.onRenderProcessGone(this);
        }
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i10, float f10) {
        return (int) (i10 / f10);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {53}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<Boolean, rj.c<? super r>, Object> {
        public int label;

        public AnonymousClass2(rj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return AndroidWebViewContainer.this.new AnonymousClass2(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Boolean bool, rj.c<? super r> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        public final Object invoke(boolean z10, rj.c<? super r> cVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), cVar)).invokeSuspend(r.f64562a);
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
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                if (androidWebViewContainer.onRenderProcessGone(this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getSHARED_STRING_BUILDER$annotations() {
        }

        public final StringBuilder getSHARED_STRING_BUILDER() {
            return AndroidWebViewContainer.SHARED_STRING_BUILDER;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C38262 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ String $name;
        public final /* synthetic */ WebViewBridge $webViewBridgeInterface;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38262(String str, WebViewBridge webViewBridge, rj.c<? super C38262> cVar) {
            super(2, cVar);
            this.$name = str;
            this.$webViewBridgeInterface = webViewBridge;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return AndroidWebViewContainer.this.new C38262(this.$name, this.$webViewBridgeInterface, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((C38262) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                final WebViewBridge webViewBridge = this.$webViewBridgeInterface;
                UnityAdsNetworkBridge.onAddedJavascriptInterface(AndroidWebViewContainer.this.getWebView(), new WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
                    @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                    @JavascriptInterface
                    public void handleCallback(String str, String str2, String str3) {
                        ck.p.j(str, "callbackId");
                        ck.p.j(str2, "callbackStatus");
                        ck.p.j(str3, "rawParameters");
                        webViewBridge.handleCallback(str, str2, str3);
                    }

                    @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                    @JavascriptInterface
                    public void handleInvocation(String str) {
                        ck.p.j(str, "message");
                        webViewBridge.handleInvocation(str);
                    }
                }, this.$name);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C38282 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public int label;

        public C38282(rj.c<? super C38282> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return AndroidWebViewContainer.this.new C38282(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((C38282) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ViewGroup viewGroup;
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                ViewParent parent = AndroidWebViewContainer.this.getWebView().getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(AndroidWebViewContainer.this.getWebView());
                }
                AndroidWebViewContainer.this.getWebView().destroy();
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C38302 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ JSONArray $arguments;
        public final /* synthetic */ HandlerType $handlerType;
        public int label;
        public final /* synthetic */ AndroidWebViewContainer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38302(JSONArray jSONArray, HandlerType handlerType, AndroidWebViewContainer androidWebViewContainer, rj.c<? super C38302> cVar) {
            super(2, cVar);
            this.$arguments = jSONArray;
            this.$handlerType = handlerType;
            this.this$0 = androidWebViewContainer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return new C38302(this.$arguments, this.$handlerType, this.this$0, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((C38302) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            StringBuilder shared_string_builder;
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                String string = this.$arguments.toString();
                ck.p.i(string, "arguments.toString()");
                int length = this.$handlerType.getJsPath().length() + 31 + 1 + string.length() + 1 + 1;
                Companion companion = AndroidWebViewContainer.Companion;
                if (length > companion.getSHARED_STRING_BUILDER().capacity()) {
                    shared_string_builder = new StringBuilder(length);
                } else {
                    shared_string_builder = companion.getSHARED_STRING_BUILDER();
                    t.m(shared_string_builder);
                }
                HandlerType handlerType = this.$handlerType;
                shared_string_builder.append(AndroidWebViewContainer.JS_INSTRUCTION);
                shared_string_builder.append(handlerType.getJsPath());
                shared_string_builder.append(AndroidWebViewContainer.JS_OPENING_PARENTHESES);
                shared_string_builder.append(string);
                shared_string_builder.append(AndroidWebViewContainer.JS_CLOSING_PARENTHESES);
                shared_string_builder.append(AndroidWebViewContainer.JS_SEMICOLON);
                this.this$0.getWebView().evaluateJavascript(shared_string_builder.toString(), null);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C38322 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38322(String str, rj.c<? super C38322> cVar) {
            super(2, cVar);
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return AndroidWebViewContainer.this.new C38322(this.$url, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((C38322) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                UnityAdsNetworkBridge.webviewLoadUrl(AndroidWebViewContainer.this.getWebView(), this.$url);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void applySafeAreaInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(this.webView, new OnApplyWindowInsetsListener() { // from class: com.unity3d.ads.adplayer.b
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AndroidWebViewContainer.applySafeAreaInsets$lambda$3(this.f45220a, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onRenderProcessGone(rj.c<? super r> cVar) throws Throwable {
        C38331 c38331;
        AndroidWebViewContainer androidWebViewContainer;
        if (cVar instanceof C38331) {
            c38331 = (C38331) cVar;
            int i10 = c38331.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38331.label = i10 - Integer.MIN_VALUE;
            } else {
                c38331 = new C38331(cVar);
            }
        } else {
            c38331 = new C38331(cVar);
        }
        Object obj = c38331.result;
        Object objF = sj.a.f();
        int i11 = c38331.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            c38331.L$0 = this;
            c38331.label = 1;
            if (destroy(c38331) == objF) {
                return objF;
            }
            androidWebViewContainer = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidWebViewContainer = (AndroidWebViewContainer) c38331.L$0;
            kotlin.c.b(obj);
        }
        androidWebViewContainer.sendWebViewClientErrorDiagnostics.invoke(nj.r.e(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)));
        return r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object addJavascriptInterface(WebViewBridge webViewBridge, String str, rj.c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                kotlin.coroutines.d coroutineContext = this.scope.getCoroutineContext();
                C38262 c38262 = new C38262(str, webViewBridge, null);
                anonymousClass1.label = 1;
                if (h.g(coroutineContext, c38262, anonymousClass1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
        } catch (CancellationException unused) {
        }
        return r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object destroy(rj.c<? super r> cVar) throws Throwable {
        C38271 c38271;
        AndroidWebViewContainer androidWebViewContainer;
        if (cVar instanceof C38271) {
            c38271 = (C38271) cVar;
            int i10 = c38271.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38271.label = i10 - Integer.MIN_VALUE;
            } else {
                c38271 = new C38271(cVar);
            }
        } else {
            c38271 = new C38271(cVar);
        }
        Object obj = c38271.result;
        Object objF = sj.a.f();
        int i11 = c38271.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            kotlin.coroutines.d dVarPlus = this.scope.getCoroutineContext().plus(kotlinx.coroutines.h.f63171b);
            C38282 c38282 = new C38282(null);
            c38271.L$0 = this;
            c38271.label = 1;
            if (h.g(dVarPlus, c38282, c38271) == objF) {
                return objF;
            }
            androidWebViewContainer = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidWebViewContainer = (AndroidWebViewContainer) c38271.L$0;
            kotlin.c.b(obj);
        }
        kotlinx.coroutines.d.d(androidWebViewContainer.scope, null, 1, null);
        return r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object evaluateJavascript(HandlerType handlerType, JSONArray jSONArray, rj.c<? super r> cVar) throws Throwable {
        C38291 c38291;
        if (cVar instanceof C38291) {
            c38291 = (C38291) cVar;
            int i10 = c38291.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38291.label = i10 - Integer.MIN_VALUE;
            } else {
                c38291 = new C38291(cVar);
            }
        } else {
            c38291 = new C38291(cVar);
        }
        Object obj = c38291.result;
        Object objF = sj.a.f();
        int i11 = c38291.label;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                kotlin.coroutines.d coroutineContext = this.scope.getCoroutineContext();
                C38302 c38302 = new C38302(jSONArray, handlerType, this, null);
                c38291.label = 1;
                if (h.g(coroutineContext, c38302, c38291) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
        } catch (CancellationException unused) {
        }
        return r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public u<InputEvent> getLastInputEvent() {
        return this.lastInputEvent;
    }

    public final l0 getScope() {
        return this.scope;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final l<InputEvent> get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object loadUrl(String str, rj.c<? super r> cVar) throws Throwable {
        C38311 c38311;
        AndroidWebViewContainer androidWebViewContainer;
        List<WebViewClientError> list;
        AndroidWebViewContainer androidWebViewContainer2;
        List<WebViewClientError> list2;
        if (cVar instanceof C38311) {
            c38311 = (C38311) cVar;
            int i10 = c38311.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38311.label = i10 - Integer.MIN_VALUE;
            } else {
                c38311 = new C38311(cVar);
            }
        } else {
            c38311 = new C38311(cVar);
        }
        Object objY = c38311.result;
        Object objF = sj.a.f();
        int i11 = c38311.label;
        if (i11 != 0) {
            if (i11 == 1) {
                androidWebViewContainer = (AndroidWebViewContainer) c38311.L$0;
                kotlin.c.b(objY);
            } else if (i11 == 2) {
                androidWebViewContainer = (AndroidWebViewContainer) c38311.L$0;
                kotlin.c.b(objY);
                list = (List) objY;
                if (!list.isEmpty()) {
                    return r.f64562a;
                }
                c38311.L$0 = androidWebViewContainer;
                c38311.L$1 = list;
                c38311.label = 3;
                if (androidWebViewContainer.destroy(c38311) == objF) {
                    return objF;
                }
                androidWebViewContainer2 = androidWebViewContainer;
                list2 = list;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) c38311.L$1;
                androidWebViewContainer2 = (AndroidWebViewContainer) c38311.L$0;
                kotlin.c.b(objY);
            }
            androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
            throw new LoadWebViewError(list2);
        }
        kotlin.c.b(objY);
        kotlin.coroutines.d coroutineContext = this.scope.getCoroutineContext();
        C38322 c38322 = new C38322(str, null);
        c38311.L$0 = this;
        c38311.label = 1;
        if (h.g(coroutineContext, c38322, c38311) == objF) {
            return objF;
        }
        androidWebViewContainer = this;
        p0<List<WebViewClientError>> onLoadFinished = androidWebViewContainer.webViewClient.getOnLoadFinished();
        c38311.L$0 = androidWebViewContainer;
        c38311.label = 2;
        objY = onLoadFinished.y(c38311);
        if (objY == objF) {
            return objF;
        }
        list = (List) objY;
        if (!list.isEmpty()) {
            return r.f64562a;
        }
        c38311.L$0 = androidWebViewContainer;
        c38311.L$1 = list;
        c38311.label = 3;
        if (androidWebViewContainer.destroy(c38311) == objF) {
            return objF;
        }
        androidWebViewContainer2 = androidWebViewContainer;
        list2 = list;
        androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
        throw new LoadWebViewError(list2);
    }

    public AndroidWebViewContainer(WebView webView, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, h0 h0Var, h0 h0Var2, l0 l0Var, Context context) {
        ck.p.j(webView, "webView");
        ck.p.j(androidWebViewClient, "webViewClient");
        ck.p.j(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        ck.p.j(h0Var, "mainDispatcher");
        ck.p.j(h0Var2, "defaultDispatcher");
        ck.p.j(l0Var, "adPlayerScope");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.webView = webView;
        this.webViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        l0 l0VarH = kotlinx.coroutines.d.h(kotlinx.coroutines.d.h(l0Var, h0Var), new k0("AndroidWebViewContainer"));
        this.scope = l0VarH;
        l<InputEvent> lVarA = v.a(null);
        this._lastInputEvent = lVarA;
        this.lastInputEvent = e.b(lVarA);
        final u<Boolean> uVarIsRenderProcessGone = androidWebViewClient.isRenderProcessGone();
        e.x(e.A(new qk.c<Boolean>() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(rj.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(qk.d dVar) {
                    this.$this_unsafeFlow = dVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // qk.d
                public final Object emit(Object obj, rj.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objF = sj.a.f();
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        kotlin.c.b(obj2);
                        qk.d dVar = this.$this_unsafeFlow;
                        if (((Boolean) obj).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (dVar.emit(obj, anonymousClass1) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj2);
                    }
                    return r.f64562a;
                }
            }

            @Override // qk.c
            public Object collect(qk.d<? super Boolean> dVar, rj.c cVar) {
                Object objCollect = uVarIsRenderProcessGone.collect(new AnonymousClass2(dVar), cVar);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        }, new AnonymousClass2(null)), kotlinx.coroutines.d.h(l0VarH, h0Var2));
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.unity3d.ads.adplayer.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AndroidWebViewContainer._init_$lambda$1(this.f45219b, view, motionEvent);
            }
        });
        applySafeAreaInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(AndroidWebViewContainer androidWebViewContainer, View view, MotionEvent motionEvent) {
        ck.p.j(androidWebViewContainer, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 5 || actionMasked == 6) {
            androidWebViewContainer._lastInputEvent.setValue(motionEvent);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat applySafeAreaInsets$lambda$3(AndroidWebViewContainer androidWebViewContainer, View view, WindowInsetsCompat windowInsetsCompat) {
        Object objM3458constructorimpl;
        ck.p.j(androidWebViewContainer, "this$0");
        ck.p.j(view, "v");
        ck.p.j(windowInsetsCompat, "insets");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        ck.p.i(insets, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
        ck.p.i(insets2, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Float.valueOf(androidWebViewContainer.context.getResources().getDisplayMetrics().density));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Float fValueOf = Float.valueOf(1.0f);
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = fValueOf;
        }
        float fFloatValue = ((Number) objM3458constructorimpl).floatValue();
        int iApplySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(insets.left, insets2.left), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets.f3822top, insets2.f3822top), fFloatValue);
        j.d(androidWebViewContainer.scope, null, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(androidWebViewContainer, q.j("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '" + iApplySafeAreaInsets$lambda$3$toPx + "px');\n                    root.style.setProperty('--safe-area-inset-right', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(insets.right, insets2.right), fFloatValue) + "px');\n                    root.style.setProperty('--safe-area-inset-top', '" + iApplySafeAreaInsets$lambda$3$toPx2 + "px');\n                    root.style.setProperty('--safe-area-inset-bottom', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(insets.bottom, insets2.bottom), fFloatValue) + "px');\n                })();\n            "), null), 3, null);
        return windowInsetsCompat;
    }
}
