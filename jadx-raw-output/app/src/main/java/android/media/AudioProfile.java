package android.media;

import android.annotation.NonNull;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class AudioProfile implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ int[] getChannelMasks();

    public native /* synthetic */ int getEncapsulationType();

    public native /* synthetic */ int getFormat();
}
