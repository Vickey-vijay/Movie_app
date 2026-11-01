package com.unity3d.services.ads.token;

import ck.p;
import ck.s;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import mj.g;
import mj.r;
import org.json.JSONArray;
import org.json.JSONException;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: InMemoryTokenStorage.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {
    private final g asyncTokenStorage$delegate;
    private final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    private final l<Integer> accessCounter = v.a(-1);
    private final l<String> initToken = v.a(null);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage) this.asyncTokenStorage$delegate.getValue();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void deleteTokens() {
        Integer value;
        this.queue.clear();
        l<Integer> lVar = this.accessCounter;
        do {
            value = lVar.getValue();
            value.intValue();
        } while (!lVar.a(value, -1));
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public r getNativeGeneratedToken() {
        new NativeTokenGenerator(this.executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), null).generateToken(new INativeTokenGeneratorListener() { // from class: com.unity3d.services.ads.token.a
            @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
            public final void onReady(String str) {
                InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
            }
        });
        return r.f64562a;
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public String getToken() {
        Integer value;
        Integer num;
        if (this.accessCounter.getValue().intValue() == -1) {
            return this.initToken.getValue();
        }
        if (this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        l<Integer> lVar = this.accessCounter;
        do {
            value = lVar.getValue();
            num = value;
        } while (!lVar.a(value, Integer.valueOf(num.intValue() + 1)));
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, Integer.valueOf(num.intValue()));
        return this.queue.poll();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void setInitToken(String str) {
        if (str == null) {
            return;
        }
        l<String> lVar = this.initToken;
        while (!lVar.a(lVar.getValue(), str)) {
        }
        triggerTokenAvailable(true);
        getAsyncTokenStorage().onTokenAvailable();
    }

    public InMemoryTokenStorage() {
        final String str = "";
        this.asyncTokenStorage$delegate = b.b(LazyThreadSafetyMode.NONE, new bk.a<AsyncTokenStorage>() { // from class: com.unity3d.services.ads.token.InMemoryTokenStorage$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.ads.token.AsyncTokenStorage, java.lang.Object] */
            @Override // bk.a
            public final AsyncTokenStorage invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, s.b(AsyncTokenStorage.class));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_nativeGeneratedToken_$lambda$2(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    private final void triggerTokenAvailable(boolean z10) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z10);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void appendTokens(JSONArray jSONArray) throws JSONException {
        p.j(jSONArray, "tokens");
        this.accessCounter.a(-1, 0);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.queue.add(jSONArray.getString(i10));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void createTokens(JSONArray jSONArray) throws JSONException {
        p.j(jSONArray, "tokens");
        deleteTokens();
        appendTokens(jSONArray);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }
}
