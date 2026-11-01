package com.unity3d.ads.core.domain;

import android.content.Intent;
import bk.p;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.l0;
import qk.k;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidHandleOpenUrl.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1", f = "AndroidHandleOpenUrl.kt", l = {}, m = "invokeSuspend")
public final class AndroidHandleOpenUrl$invoke$result$1 extends SuspendLambda implements p<qk.d<? super DisplayMessage>, c<? super r>, Object> {
    public final /* synthetic */ AdObject $adObject;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ boolean $useActivityForResult;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleOpenUrl$invoke$result$1(AdObject adObject, Intent intent, boolean z10, c<? super AndroidHandleOpenUrl$invoke$result$1> cVar) {
        super(2, cVar);
        this.$adObject = adObject;
        this.$intent = intent;
        this.$useActivityForResult = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new AndroidHandleOpenUrl$invoke$result$1(this.$adObject, this.$intent, this.$useActivityForResult, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(qk.d<? super DisplayMessage> dVar, c<? super r> cVar) {
        return ((AndroidHandleOpenUrl$invoke$result$1) create(dVar, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleOpenUrl.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1", f = "AndroidHandleOpenUrl.kt", l = {42}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ Intent $intent;
        public final /* synthetic */ boolean $useActivityForResult;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, Intent intent, boolean z10, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$adObject = adObject;
            this.$intent = intent;
            this.$useActivityForResult = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
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
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                String string = ProtobufExtensionsKt.toUUID(this.$adObject.getOpportunityId()).toString();
                ck.p.i(string, "adObject.opportunityId.toUUID().toString()");
                DisplayMessage.OpenUrl openUrl = new DisplayMessage.OpenUrl(string, this.$intent, this.$useActivityForResult);
                this.label = 1;
                if (displayMessages.emit(openUrl, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            j.d(kotlinx.coroutines.d.a(getContext()), null, null, new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, null), 3, null);
            return r.f64562a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
