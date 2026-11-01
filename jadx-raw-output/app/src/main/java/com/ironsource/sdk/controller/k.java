package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC3475g;
import com.ironsource.InterfaceC3493h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes11.dex */
public interface k {

    public static final class a implements InterfaceC3475g {
        @Override // com.ironsource.InterfaceC3475g
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public static final class b implements InterfaceC3493h {
        @Override // com.ironsource.InterfaceC3493h
        public Intent a(Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    public static final class c implements InterfaceC3493h {
        @Override // com.ironsource.InterfaceC3493h
        public Intent a(Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
