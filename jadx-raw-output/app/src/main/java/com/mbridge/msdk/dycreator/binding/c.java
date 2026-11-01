package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.strategy.d;
import com.mbridge.msdk.dycreator.binding.strategy.e;
import com.mbridge.msdk.dycreator.binding.strategy.f;
import com.mbridge.msdk.dycreator.binding.strategy.g;
import com.vungle.ads.internal.presenter.NativeAdPresenter;

/* JADX INFO: compiled from: ViewDataFactory.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f34322a;

    private c() {
    }

    public static c a() {
        if (f34322a == null) {
            synchronized (c.class) {
                if (f34322a == null) {
                    f34322a = new c();
                }
            }
        }
        return f34322a;
    }

    public <T extends BaseStrategy> T a(String str) {
        T aVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("close")) {
            aVar = new com.mbridge.msdk.dycreator.binding.strategy.c();
        } else if (str.equals(NativeAdPresenter.DOWNLOAD)) {
            aVar = new com.mbridge.msdk.dycreator.binding.strategy.b();
        } else if (!str.equals("deeplink") && str.equals(ActivityChooserModel.ATTRIBUTE_ACTIVITY)) {
            aVar = new com.mbridge.msdk.dycreator.binding.strategy.a();
        }
        if (str.equals("feedback")) {
            aVar = new d();
        }
        if (str.equals("notice")) {
            aVar = new e();
        }
        if (str.equals("permissionInfo")) {
            aVar = new f();
        }
        return str.equals("privateAddress") ? new g() : aVar;
    }
}
