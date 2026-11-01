package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import mj.h;
import mj.r;
import nj.q0;
import nj.r0;
import nk.h0;
import nk.j;
import nk.k0;
import nk.l0;
import nk.p0;
import nk.u;
import nk.w;
import org.json.JSONArray;
import org.json.JSONException;
import qk.e;
import qk.k;
import qk.l;
import qk.p;
import qk.q;
import qk.v;
import tj.d;

/* JADX INFO: compiled from: CommonWebViewBridge.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final k<Invocation> _onInvocation;
    private final l<Set<Pair<String, u<Object[]>>>> callbacks;
    private final Logger logger;
    private final p<Invocation> onInvocation;
    private final l0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7, reason: invalid class name */
    /* JADX INFO: compiled from: CommonWebViewBridge.kt */
    @d(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {134, 136, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 138, 139, 148}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends SuspendLambda implements bk.p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ String $callback;
        public final /* synthetic */ String $location;
        public final /* synthetic */ String $message;
        public final /* synthetic */ JSONArray $parameters;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ CommonWebViewBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, String str3, rj.c<? super AnonymousClass7> cVar) {
            super(2, cVar);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
            this.$message = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$location, this.$parameters, this.this$0, this.$callback, this.$message, cVar);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass7) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1, reason: invalid class name */
        /* JADX INFO: compiled from: CommonWebViewBridge.kt */
        @d(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", f = "CommonWebViewBridge.kt", l = {136}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements bk.p<l0, rj.c<? super r>, Object> {
            public final /* synthetic */ Invocation $invocation;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Invocation invocation, rj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$invocation = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c<r> create(Object obj, rj.c<?> cVar) {
                return new AnonymousClass1(this.$invocation, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                    p0<r> p0VarIsHandled = this.$invocation.isHandled();
                    this.label = 1;
                    if (p0VarIsHandled.y(this) == objF) {
                        return objF;
                    }
                }
                return r.f64562a;
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x009c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00a1 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:11:0x0023, B:15:0x0031, B:33:0x009d, B:35:0x00a1, B:38:0x00b1, B:18:0x0040, B:30:0x008f, B:27:0x007d), top: B:63:0x000c, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:11:0x0023, B:15:0x0031, B:33:0x009d, B:35:0x00a1, B:38:0x00b1, B:18:0x0040, B:30:0x008f, B:27:0x007d), top: B:63:0x000c, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM3458constructorimpl;
            String simpleName;
            l0 l0Var;
            Invocation invocation;
            AnonymousClass1 anonymousClass1;
            Object result;
            CommonWebViewBridge commonWebViewBridge;
            String str;
            Object[] objArr;
            Object objF = sj.a.f();
            try {
                try {
                    switch (this.label) {
                        case 0:
                            kotlin.c.b(obj);
                            l0Var = (l0) this.L$0;
                            invocation = new Invocation(this.$location, JSONArrayExtensionsKt.toTypedArray(this.$parameters));
                            k kVar = this.this$0._onInvocation;
                            this.L$0 = l0Var;
                            this.L$1 = invocation;
                            this.label = 1;
                            if (kVar.emit(invocation, this) == objF) {
                                return objF;
                            }
                            anonymousClass1 = new AnonymousClass1(invocation, null);
                            this.L$0 = l0Var;
                            this.L$1 = invocation;
                            this.label = 2;
                            if (TimeoutKt.c(5000L, anonymousClass1, this) == objF) {
                                return objF;
                            }
                            this.L$0 = l0Var;
                            this.L$1 = null;
                            this.label = 3;
                            result = invocation.getResult(this);
                            if (result == objF) {
                                return objF;
                            }
                            if (result instanceof WebViewEvent) {
                                this.L$0 = l0Var;
                                this.label = 4;
                                if (this.this$0.sendEvent((WebViewEvent) result, this) == objF) {
                                    return objF;
                                }
                            } else {
                                commonWebViewBridge = this.this$0;
                                str = this.$callback;
                                objArr = new Object[]{result};
                                this.L$0 = l0Var;
                                this.label = 5;
                                if (commonWebViewBridge.respond(str, "OK", objArr, this) == objF) {
                                    return objF;
                                }
                            }
                            return r.f64562a;
                        case 1:
                            invocation = (Invocation) this.L$1;
                            l0Var = (l0) this.L$0;
                            kotlin.c.b(obj);
                            anonymousClass1 = new AnonymousClass1(invocation, null);
                            this.L$0 = l0Var;
                            this.L$1 = invocation;
                            this.label = 2;
                            if (TimeoutKt.c(5000L, anonymousClass1, this) == objF) {
                                return objF;
                            }
                            this.L$0 = l0Var;
                            this.L$1 = null;
                            this.label = 3;
                            result = invocation.getResult(this);
                            if (result == objF) {
                                return objF;
                            }
                            if (result instanceof WebViewEvent) {
                                this.L$0 = l0Var;
                                this.label = 4;
                                if (this.this$0.sendEvent((WebViewEvent) result, this) == objF) {
                                    return objF;
                                }
                            } else {
                                commonWebViewBridge = this.this$0;
                                str = this.$callback;
                                objArr = new Object[]{result};
                                this.L$0 = l0Var;
                                this.label = 5;
                                if (commonWebViewBridge.respond(str, "OK", objArr, this) == objF) {
                                    return objF;
                                }
                            }
                            return r.f64562a;
                        case 2:
                            invocation = (Invocation) this.L$1;
                            l0Var = (l0) this.L$0;
                            kotlin.c.b(obj);
                            this.L$0 = l0Var;
                            this.L$1 = null;
                            this.label = 3;
                            result = invocation.getResult(this);
                            if (result == objF) {
                                return objF;
                            }
                            if (result instanceof WebViewEvent) {
                                this.L$0 = l0Var;
                                this.label = 4;
                                if (this.this$0.sendEvent((WebViewEvent) result, this) == objF) {
                                    return objF;
                                }
                            } else {
                                commonWebViewBridge = this.this$0;
                                str = this.$callback;
                                objArr = new Object[]{result};
                                this.L$0 = l0Var;
                                this.label = 5;
                                if (commonWebViewBridge.respond(str, "OK", objArr, this) == objF) {
                                    return objF;
                                }
                            }
                            return r.f64562a;
                        case 3:
                            l0 l0Var2 = (l0) this.L$0;
                            kotlin.c.b(obj);
                            l0Var = l0Var2;
                            result = obj;
                            if (result instanceof WebViewEvent) {
                                this.L$0 = l0Var;
                                this.label = 4;
                                if (this.this$0.sendEvent((WebViewEvent) result, this) == objF) {
                                    return objF;
                                }
                            } else {
                                commonWebViewBridge = this.this$0;
                                str = this.$callback;
                                objArr = new Object[]{result};
                                this.L$0 = l0Var;
                                this.label = 5;
                                if (commonWebViewBridge.respond(str, "OK", objArr, this) == objF) {
                                    return objF;
                                }
                            }
                            return r.f64562a;
                        case 4:
                            kotlin.c.b(obj);
                            return r.f64562a;
                        case 5:
                            kotlin.c.b(obj);
                            return r.f64562a;
                        case 6:
                            kotlin.c.b(obj);
                            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                            CommonWebViewBridge commonWebViewBridge2 = this.this$0;
                            String str2 = this.$message;
                            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                            if (thM3461exceptionOrNullimpl != null) {
                                SendDiagnosticEvent sendDiagnosticEvent = commonWebViewBridge2.sendDiagnosticEvent;
                                Pair[] pairArr = new Pair[2];
                                String message = thM3461exceptionOrNullimpl.getMessage();
                                if (message == null) {
                                    message = thM3461exceptionOrNullimpl.getClass().getSimpleName();
                                }
                                pairArr[0] = h.a("reason_debug", message);
                                pairArr[1] = h.a("webview_invocation", str2);
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, kotlin.collections.a.m(pairArr), null, null, null, 58, null);
                            }
                            return r.f64562a;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th2) {
                    if (th2 instanceof TimeoutCancellationException) {
                        simpleName = "Invocation(" + this.$location + ") is not handled";
                    } else {
                        String message2 = th2.getMessage();
                        simpleName = message2 == null ? th2.getClass().getSimpleName() : message2;
                    }
                    CommonWebViewBridge commonWebViewBridge3 = this.this$0;
                    String str3 = this.$callback;
                    Result.a aVar = Result.Companion;
                    ck.p.i(simpleName, "reason");
                    Object[] objArr2 = {simpleName};
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 6;
                    if (commonWebViewBridge3.respond(str3, "ERROR", objArr2, this) == objF) {
                        return objF;
                    }
                }
            } catch (Throwable th3) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th3));
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonWebViewBridge.kt */
    @d(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {77, 79}, m = AdActivity.REQUEST_KEY_EXTRA)
    public static final class C38341 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C38341(rj.c<? super C38341> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonWebViewBridge.kt */
    @d(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {44}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements bk.p<l0, rj.c<? super r>, Object> {
        public int label;

        public AnonymousClass1(rj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return CommonWebViewBridge.this.new AnonymousClass1(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public CommonWebViewBridge(h0 h0Var, WebViewContainer webViewContainer, l0 l0Var, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        ck.p.j(h0Var, "dispatcher");
        ck.p.j(webViewContainer, "webViewContainer");
        ck.p.j(l0Var, "adPlayerScope");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        ck.p.j(logger, "logger");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        l0 l0VarH = kotlinx.coroutines.d.h(kotlinx.coroutines.d.h(l0Var, h0Var), new k0("CommonWebViewBridge"));
        this.scope = l0VarH;
        this.callbacks = v.a(q0.f());
        k<Invocation> kVarB = q.b(0, 64, null, 5, null);
        this._onInvocation = kVarB;
        this.onInvocation = e.a(kVarB);
        j.d(l0VarH, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, rj.c<? super r> cVar) {
        Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, cVar);
        return objEvaluateJavascript == sj.a.f() ? objEvaluateJavascript : r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, rj.c<? super r> cVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object objExecute = execute(HandlerType.CALLBACK, new JSONArray((Collection) nj.r.e(jSONArray)), cVar);
        return objExecute == sj.a.f() ? objExecute : r.f64562a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public p<Invocation> getOnInvocation() {
        return this.onInvocation;
    }

    public final l0 getScope() {
        return this.scope;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleCallback(String str, String str2, String str3) {
        Object next;
        Set<Pair<String, u<Object[]>>> value;
        ck.p.j(str, "callbackId");
        ck.p.j(str2, "callbackStatus");
        ck.p.j(str3, "rawParameters");
        Object[] typedArray = JSONArrayExtensionsKt.toTypedArray(new JSONArray(str3));
        Iterator<T> it = this.callbacks.getValue().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ck.p.e((String) ((Pair) next).component1(), str));
        Pair pair = (Pair) next;
        if (pair == null) {
            return;
        }
        u uVar = (u) pair.component2();
        int iHashCode = str2.hashCode();
        if (iHashCode != -1867169789) {
            if (iHashCode != 2524) {
                if (iHashCode == 66247144 ? str2.equals("ERROR") : iHashCode == 96784904 && str2.equals("error")) {
                    Object obj = typedArray[0];
                    ck.p.h(obj, "null cannot be cast to non-null type kotlin.String");
                    uVar.g(new Exception((String) obj));
                }
            } else if (str2.equals("OK")) {
                uVar.i(typedArray);
            }
        } else if (str2.equals("success")) {
            uVar.i(typedArray);
        }
        l<Set<Pair<String, u<Object[]>>>> lVar = this.callbacks;
        do {
            value = lVar.getValue();
        } while (!lVar.a(value, r0.l(value, pair)));
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String str) {
        ck.p.j(str, "message");
        try {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = jSONArray.get(i10);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + str).toString());
                    }
                    if (!(jSONArray2.length() == 4)) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + str).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str3 = obj3 instanceof String ? (String) obj3 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + str).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + str).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str4 = obj5 instanceof String ? (String) obj5 : null;
                    if (str4 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + str).toString());
                    }
                    String str5 = str2 + '.' + str3;
                    this.logger.debug("Unity Ads WebView calling for: " + str5 + '(' + jSONArray3 + ')');
                    j.d(this.scope, null, null, new AnonymousClass7(str5, jSONArray3, this, str4, str, null), 3, null);
                }
            } catch (JSONException e10) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: " + str, e10);
            }
        } catch (Throwable th2) {
            this.logger.error("Error handling invocation from webview (" + str + ')', th2);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            Pair[] pairArr = new Pair[2];
            String message = th2.getMessage();
            if (message == null) {
                message = th2.getClass().getSimpleName();
            }
            pairArr[0] = h.a("reason_debug", message);
            pairArr[1] = h.a("webview_invocation", str);
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, kotlin.collections.a.m(pairArr), null, null, null, 58, null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: " + str, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object request(String str, String str2, Object[] objArr, rj.c<? super Object[]> cVar) throws Throwable {
        C38341 c38341;
        Set<Pair<String, u<Object[]>>> value;
        u uVar;
        if (cVar instanceof C38341) {
            c38341 = (C38341) cVar;
            int i10 = c38341.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38341.label = i10 - Integer.MIN_VALUE;
            } else {
                c38341 = new C38341(cVar);
            }
        } else {
            c38341 = new C38341(cVar);
        }
        Object objY = c38341.result;
        Object objF = sj.a.f();
        int i11 = c38341.label;
        if (i11 != 0) {
            if (i11 == 1) {
                uVar = (u) c38341.L$0;
                kotlin.c.b(objY);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objY);
            }
        }
        kotlin.c.b(objY);
        u uVarC = w.c(null, 1, null);
        Object objValueOf = String.valueOf(uVarC.hashCode());
        l<Set<Pair<String, u<Object[]>>>> lVar = this.callbacks;
        do {
            value = lVar.getValue();
        } while (!lVar.a(value, r0.n(value, h.a(objValueOf, uVarC))));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(objValueOf);
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        HandlerType handlerType = HandlerType.INVOCATION;
        c38341.L$0 = uVarC;
        c38341.label = 1;
        if (execute(handlerType, jSONArray, c38341) == objF) {
            return objF;
        }
        uVar = uVarC;
        c38341.L$0 = null;
        c38341.label = 2;
        objY = uVar.y(c38341);
        return objY == objF ? objF : objY;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, rj.c<? super r> cVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object objExecute = execute(HandlerType.EVENT, jSONArray, cVar);
        return objExecute == sj.a.f() ? objExecute : r.f64562a;
    }
}
