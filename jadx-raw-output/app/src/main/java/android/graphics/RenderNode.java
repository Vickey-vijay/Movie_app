package android.graphics;

import android.annotation.NonNull;
import android.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RenderNode {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ RenderNode(@Nullable String str) {
    }

    @NonNull
    public native /* synthetic */ RecordingCanvas beginRecording();

    public native /* synthetic */ void discardDisplayList();

    public native /* synthetic */ void endRecording();

    public native /* synthetic */ boolean setPosition(int i10, int i11, int i12, int i13);
}
