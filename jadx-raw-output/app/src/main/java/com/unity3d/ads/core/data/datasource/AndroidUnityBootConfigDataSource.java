package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import bk.l;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import lk.c;
import lk.x;
import mj.r;
import yj.b;
import yj.k;

/* JADX INFO: compiled from: AndroidUnityBootConfigDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {
    private final Context context;

    public AndroidUnityBootConfigDataSource(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    public String getValue(String str) {
        Object objM3458constructorimpl;
        p.j(str, C3426d4.i.W);
        try {
            Result.a aVar = Result.Companion;
            final String str2 = str + G5.T;
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            InputStream inputStreamOpen = this.context.getAssets().open("bin/Data/boot.config");
            try {
                p.i(inputStreamOpen, "stream");
                Reader inputStreamReader = new InputStreamReader(inputStreamOpen, c.f63591b);
                k.c(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192), new l<String, r>() { // from class: com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource$getValue$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(String str3) {
                        invoke2(str3);
                        return r.f64562a;
                    }

                    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, java.lang.String] */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str3) {
                        p.j(str3, "line");
                        if (x.R(str3, str2, false, 2, null)) {
                            Ref$ObjectRef<String> ref$ObjectRef2 = ref$ObjectRef;
                            ?? Substring = str3.substring(str2.length());
                            p.i(Substring, "this as java.lang.String).substring(startIndex)");
                            ref$ObjectRef2.element = Substring;
                        }
                    }
                });
                r rVar = r.f64562a;
                b.a(inputStreamOpen, null);
                objM3458constructorimpl = Result.m3458constructorimpl((String) ref$ObjectRef.element);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(inputStreamOpen, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th4));
        }
        return (String) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }
}
