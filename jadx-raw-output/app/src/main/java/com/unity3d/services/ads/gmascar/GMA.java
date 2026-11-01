package com.unity3d.services.ads.gmascar;

import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeFactory;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class GMA {
    private static GMA instance;
    private final GMAScarAdapterBridge _gmaScarAdapterBridge;

    public static GMA getInstance() {
        return getInstance(new GMAEventSender());
    }

    public void getSCARBiddingSignals(boolean z10, IBiddingSignalsListener iBiddingSignalsListener) {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(z10, new BiddingSignalsHandler(z10, iBiddingSignalsListener));
    }

    public static GMA getInstance(GMAEventSender gMAEventSender) {
        if (instance == null) {
            instance = new GMA(gMAEventSender);
        }
        return instance;
    }

    public GMAScarAdapterBridge getBridge() {
        return this._gmaScarAdapterBridge;
    }

    public void getSCARBiddingSignals(List<UnityAdFormat> list, IBiddingSignalsListener iBiddingSignalsListener) {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(list, new BiddingSignalsHandler(list.contains(UnityAdFormat.BANNER), iBiddingSignalsListener));
    }

    public boolean hasSCARBiddingSupport() {
        return this._gmaScarAdapterBridge.hasSCARBiddingSupport();
    }

    private GMA(GMAEventSender gMAEventSender) {
        this._gmaScarAdapterBridge = new GMAScarAdapterBridge(new MobileAdsBridgeFactory().createMobileAdsBridge(), new InitializeListenerBridge(), new InitializationStatusBridge(), new AdapterStatusBridge(), new WebViewErrorHandler(gMAEventSender), new ScarAdapterFactory(), gMAEventSender);
    }
}
