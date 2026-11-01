package sg.bigo.ads.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CustomTabsClient f67275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CustomTabsServiceConnection f67276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0647a f67277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CustomTabsCallback f67278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CustomTabsSession f67279e;

    /* JADX INFO: renamed from: sg.bigo.ads.a.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0647a {
        void c();

        void d();
    }

    public interface b {
        void a(Context context, sg.bigo.ads.a.a.b.a aVar);

        void a(sg.bigo.ads.a.a.b.a aVar);
    }

    public final CustomTabsSession a() {
        CustomTabsSession customTabsSessionNewSession;
        CustomTabsClient customTabsClient = this.f67275a;
        if (customTabsClient != null) {
            customTabsSessionNewSession = this.f67279e == null ? customTabsClient.newSession(new CustomTabsCallback() { // from class: sg.bigo.ads.a.a.a.1
                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void extraCallback(String str, Bundle bundle) {
                    super.extraCallback(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onMessageChannelReady(Bundle bundle) {
                    super.onMessageChannelReady(bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onNavigationEvent(int i10, @Nullable Bundle bundle) {
                    super.onNavigationEvent(i10, bundle);
                    CustomTabsCallback customTabsCallback = a.this.f67278d;
                    if (customTabsCallback != null) {
                        customTabsCallback.onNavigationEvent(i10, bundle);
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onPostMessage(String str, Bundle bundle) {
                    super.onPostMessage(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
                    super.onRelationshipValidationResult(i10, uri, z10, bundle);
                }
            }) : null;
            return this.f67279e;
        }
        this.f67279e = customTabsSessionNewSession;
        return this.f67279e;
    }

    @Override // sg.bigo.ads.a.a.d
    public final void a(CustomTabsClient customTabsClient) {
        this.f67275a = customTabsClient;
        customTabsClient.warmup(0L);
        InterfaceC0647a interfaceC0647a = this.f67277c;
        if (interfaceC0647a != null) {
            interfaceC0647a.c();
        }
    }

    @Override // sg.bigo.ads.a.a.d
    public final void b() {
        this.f67275a = null;
        this.f67279e = null;
        InterfaceC0647a interfaceC0647a = this.f67277c;
        if (interfaceC0647a != null) {
            interfaceC0647a.d();
        }
    }
}
