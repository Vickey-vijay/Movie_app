package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: compiled from: CustomTabPrefetchHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper;", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroidx/browser/customtabs/CustomTabsClient;", "newClient", "Lmj/r;", "onCustomTabsServiceConnected", "componentName", "onServiceDisconnected", "<init>", "()V", "b", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTabPrefetchHelper extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static CustomTabsClient f14538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static CustomTabsSession f14539d;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f14540e = new ReentrantLock();

    /* JADX INFO: renamed from: com.facebook.login.CustomTabPrefetchHelper$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CustomTabPrefetchHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0002R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper$a;", "", "Landroid/net/Uri;", "url", "Lmj/r;", "c", "Landroidx/browser/customtabs/CustomTabsSession;", "b", "d", "Landroidx/browser/customtabs/CustomTabsClient;", "client", "Landroidx/browser/customtabs/CustomTabsClient;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "session", "Landroidx/browser/customtabs/CustomTabsSession;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final void c(Uri uri) {
            ck.p.j(uri, "url");
            d();
            CustomTabPrefetchHelper.f14540e.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.f14539d;
            if (customTabsSession != null) {
                customTabsSession.mayLaunchUrl(uri, null, null);
            }
            CustomTabPrefetchHelper.f14540e.unlock();
        }

        public final CustomTabsSession b() {
            CustomTabPrefetchHelper.f14540e.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.f14539d;
            CustomTabPrefetchHelper.f14539d = null;
            CustomTabPrefetchHelper.f14540e.unlock();
            return customTabsSession;
        }

        public final void d() {
            CustomTabsClient customTabsClient;
            CustomTabPrefetchHelper.f14540e.lock();
            if (CustomTabPrefetchHelper.f14539d == null && (customTabsClient = CustomTabPrefetchHelper.f14538c) != null) {
                CustomTabPrefetchHelper.f14539d = customTabsClient.newSession(null);
            }
            CustomTabPrefetchHelper.f14540e.unlock();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ck.p.j(componentName, "componentName");
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        ck.p.j(componentName, "name");
        ck.p.j(customTabsClient, "newClient");
        customTabsClient.warmup(0L);
        f14538c = customTabsClient;
        INSTANCE.d();
    }
}
