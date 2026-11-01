package android.app;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.os.Parcelable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ApplicationExitInfo implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ int getDefiningUid();

    @Nullable
    public native /* synthetic */ String getDescription();

    public native /* synthetic */ int getImportance();

    public native /* synthetic */ int getPackageUid();

    public native /* synthetic */ int getPid();

    @NonNull
    public native /* synthetic */ String getProcessName();

    public native /* synthetic */ long getPss();

    public native /* synthetic */ int getRealUid();

    public native /* synthetic */ int getReason();

    public native /* synthetic */ long getRss();

    public native /* synthetic */ int getStatus();

    public native /* synthetic */ long getTimestamp();

    @Nullable
    public native /* synthetic */ InputStream getTraceInputStream() throws IOException;
}
