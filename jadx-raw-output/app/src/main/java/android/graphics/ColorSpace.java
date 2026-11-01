package android.graphics;

import android.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class ColorSpace {

    /* JADX INFO: loaded from: classes4.dex */
    public final /* synthetic */ class Named extends Enum {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ ColorSpace get(@NonNull Named named);

    public native /* synthetic */ boolean equals(Object obj);

    public abstract /* synthetic */ boolean isWideGamut();
}
