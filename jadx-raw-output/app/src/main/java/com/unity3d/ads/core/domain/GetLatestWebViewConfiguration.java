package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: GetLatestWebViewConfiguration.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GetLatestWebViewConfiguration {
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetLatestWebViewConfiguration.kt */
    @d(c = "com.unity3d.ads.core.domain.GetLatestWebViewConfiguration", f = "GetLatestWebViewConfiguration.kt", l = {17, 33}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetLatestWebViewConfiguration.this.invoke(null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(String str, Integer num, List<String> list, String str2, c<? super WebViewConfiguration> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        GetLatestWebViewConfiguration getLatestWebViewConfiguration;
        WebViewConfiguration webViewConfiguration;
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
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = (String) anonymousClass1.L$4;
                list = (List) anonymousClass1.L$3;
                num = (Integer) anonymousClass1.L$2;
                str = (String) anonymousClass1.L$1;
                getLatestWebViewConfiguration = (GetLatestWebViewConfiguration) anonymousClass1.L$0;
                kotlin.c.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webViewConfiguration = (WebViewConfiguration) anonymousClass1.L$0;
                kotlin.c.b(obj);
            }
            return webViewConfiguration;
        }
        kotlin.c.b(obj);
        WebviewConfigurationDataSource webviewConfigurationDataSource = this.webviewConfigurationDataSource;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = str;
        anonymousClass1.L$2 = num;
        anonymousClass1.L$3 = list;
        anonymousClass1.L$4 = str2;
        anonymousClass1.label = 1;
        obj = webviewConfigurationDataSource.get(anonymousClass1);
        if (obj == objF) {
            return objF;
        }
        getLatestWebViewConfiguration = this;
        WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore = (WebviewConfigurationStore.WebViewConfigurationStore) obj;
        int version = webViewConfigurationStore.getVersion();
        String entryPoint = webViewConfigurationStore.getEntryPoint();
        p.i(entryPoint, "it.entryPoint");
        List<String> additionalFilesList = webViewConfigurationStore.getAdditionalFilesList();
        p.i(additionalFilesList, "it.additionalFilesList");
        String type = webViewConfigurationStore.getType();
        p.i(type, "it.type");
        WebViewConfiguration webViewConfiguration2 = new WebViewConfiguration(version, entryPoint, additionalFilesList, type);
        if (str == null && num == null && list == null && str2 == null) {
            return webViewConfiguration2;
        }
        int iIntValue = num != null ? num.intValue() : webViewConfiguration2.getVersion();
        if (str == null) {
            str = webViewConfiguration2.getEntryPoint();
        }
        if (list == null) {
            list = webViewConfiguration2.getAdditionalFiles();
        }
        if (str2 == null) {
            str2 = webViewConfiguration2.getType();
        }
        WebViewConfiguration webViewConfiguration3 = new WebViewConfiguration(iIntValue, str, list, str2);
        if (p.e(webViewConfiguration3, webViewConfiguration2)) {
            return webViewConfiguration3;
        }
        WebviewConfigurationDataSource webviewConfigurationDataSource2 = getLatestWebViewConfiguration.webviewConfigurationDataSource;
        WebviewConfigurationStore.WebViewConfigurationStore.Builder builderNewBuilder = WebviewConfigurationStore.WebViewConfigurationStore.newBuilder();
        builderNewBuilder.setVersion(webViewConfiguration3.getVersion());
        builderNewBuilder.setEntryPoint(webViewConfiguration3.getEntryPoint());
        builderNewBuilder.addAllAdditionalFiles(webViewConfiguration3.getAdditionalFiles());
        builderNewBuilder.setType(webViewConfiguration3.getType());
        WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStoreBuild = builderNewBuilder.build();
        p.i(webViewConfigurationStoreBuild, "newBuilder().apply {\n   …                }.build()");
        anonymousClass1.L$0 = webViewConfiguration3;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 2;
        if (webviewConfigurationDataSource2.set(webViewConfigurationStoreBuild, anonymousClass1) == objF) {
            return objF;
        }
        webViewConfiguration = webViewConfiguration3;
        return webViewConfiguration;
    }

    public GetLatestWebViewConfiguration(WebviewConfigurationDataSource webviewConfigurationDataSource) {
        p.j(webviewConfigurationDataSource, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }
}
