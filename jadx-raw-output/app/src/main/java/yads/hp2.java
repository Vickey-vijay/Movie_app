package yads;

import com.yandex.mobile.ads.common.AdTheme;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class hp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f78296a;

    static {
        int[] iArr = new int[AdTheme.values().length];
        try {
            iArr[AdTheme.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdTheme.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f78296a = iArr;
    }
}
