package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3714t8 {

    /* JADX INFO: renamed from: com.ironsource.t8$a */
    public enum a {
        None,
        Device,
        Controller
    }

    /* JADX INFO: renamed from: com.ironsource.t8$b */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* JADX INFO: renamed from: com.ironsource.t8$c */
    public enum c {
        Web,
        Native,
        None
    }

    /* JADX INFO: renamed from: com.ironsource.t8$d */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f31299a;

        public int b() {
            return this.f31299a;
        }

        d(int i10) {
            this.f31299a = i10;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t8$e */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
