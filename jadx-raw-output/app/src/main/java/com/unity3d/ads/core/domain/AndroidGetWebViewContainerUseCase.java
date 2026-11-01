package com.unity3d.ads.core.domain;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import ck.p;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import nk.h;
import nk.h0;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetWebViewContainerUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    private final AndroidWebViewClient androidWebViewClient;
    private final Context context;
    private final h0 defaultDispatcher;
    private final h0 mainDispatcher;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetWebViewContainerUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase", f = "AndroidGetWebViewContainerUseCase.kt", l = {24}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetWebViewContainerUseCase.this.invoke(null, this);
        }
    }

    public AndroidGetWebViewContainerUseCase(Context context, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, h0 h0Var, h0 h0Var2) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(androidWebViewClient, "androidWebViewClient");
        p.j(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        p.j(h0Var, "mainDispatcher");
        p.j(h0Var2, "defaultDispatcher");
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = h0Var;
        this.defaultDispatcher = h0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    @SuppressLint({"SetJavaScriptEnabled"})
    public Object invoke(l0 l0Var, c<? super AndroidWebViewContainer> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase;
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
        Object objG = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.mainDispatcher;
            AndroidGetWebViewContainerUseCase$invoke$webview$1 androidGetWebViewContainerUseCase$invoke$webview$1 = new AndroidGetWebViewContainerUseCase$invoke$webview$1(this, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = l0Var;
            anonymousClass1.label = 1;
            objG = h.g(h0Var, androidGetWebViewContainerUseCase$invoke$webview$1, anonymousClass1);
            if (objG == objF) {
                return objF;
            }
            androidGetWebViewContainerUseCase = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0Var = (l0) anonymousClass1.L$1;
            androidGetWebViewContainerUseCase = (AndroidGetWebViewContainerUseCase) anonymousClass1.L$0;
            kotlin.c.b(objG);
        }
        return new AndroidWebViewContainer((WebView) objG, androidGetWebViewContainerUseCase.androidWebViewClient, androidGetWebViewContainerUseCase.sendWebViewClientErrorDiagnostics, androidGetWebViewContainerUseCase.mainDispatcher, androidGetWebViewContainerUseCase.defaultDispatcher, l0Var, androidGetWebViewContainerUseCase.context);
    }
}
