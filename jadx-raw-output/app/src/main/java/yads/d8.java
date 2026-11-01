package yads;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;

/* JADX INFO: loaded from: classes2.dex */
public final class d8 {
    public static AdQualityVerifiableNetwork a(e8 e8Var) {
        switch (e8Var == null ? -1 : c8.f76206a[e8Var.ordinal()]) {
            case 1:
                return AdQualityVerifiableNetwork.ADMOB;
            case 2:
                return AdQualityVerifiableNetwork.APPLOVIN;
            case 3:
                return AdQualityVerifiableNetwork.APPLOVINMAX;
            case 4:
                return AdQualityVerifiableNetwork.BIGOADS;
            case 5:
                return AdQualityVerifiableNetwork.CHARTBOOST;
            case 6:
                return AdQualityVerifiableNetwork.DIGITALTURBINE;
            case 7:
                return AdQualityVerifiableNetwork.GOOGLE;
            case 8:
                return AdQualityVerifiableNetwork.INMOBI;
            case 9:
                return AdQualityVerifiableNetwork.IRONSOURCE;
            case 10:
                return AdQualityVerifiableNetwork.MINTEGRAL;
            case 11:
                return AdQualityVerifiableNetwork.MYTARGET;
            case 12:
                return AdQualityVerifiableNetwork.PANGLE;
            case 13:
                return AdQualityVerifiableNetwork.TAPJOY;
            case 14:
                return AdQualityVerifiableNetwork.UNITYADS;
            case 15:
                return AdQualityVerifiableNetwork.VUNGLE;
            case 16:
                return AdQualityVerifiableNetwork.YANDEX;
            default:
                return null;
        }
    }
}
