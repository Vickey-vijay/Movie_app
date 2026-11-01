package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.lazy.LazyCachedValue;
import io.bidmachine.utils.lazy.LazyValue;

/* JADX INFO: loaded from: classes11.dex */
public final class BuildInfo {

    @Nullable
    private static volatile BuildInfo instance;

    @NonNull
    private final LazyCachedValue<Boolean> isDebuggable;

    @Nullable
    private volatile String sha1Signature = null;

    @Nullable
    private volatile String sha256Signature = null;

    @NonNull
    public static BuildInfo obtain(@NonNull Context context) {
        BuildInfo buildInfo = instance;
        if (buildInfo == null) {
            synchronized (BuildInfo.class) {
                buildInfo = instance;
                if (buildInfo == null) {
                    buildInfo = new BuildInfo(context.getApplicationContext());
                    instance = buildInfo;
                }
            }
        }
        return buildInfo;
    }

    @Nullable
    public String getSha1Signature(@NonNull Context context) {
        String str = this.sha1Signature;
        if (str != null) {
            return str;
        }
        String sha1Signature = DeviceUtils.getSha1Signature(context);
        this.sha1Signature = sha1Signature;
        return sha1Signature;
    }

    @Nullable
    public String getSha256Signature(@NonNull Context context) {
        String str = this.sha256Signature;
        if (str != null) {
            return str;
        }
        String sha256Signature = DeviceUtils.getSha256Signature(context);
        this.sha256Signature = sha256Signature;
        return sha256Signature;
    }

    public boolean isDebuggable() {
        return this.isDebuggable.get().booleanValue();
    }

    private BuildInfo(@NonNull final Context context) {
        this.isDebuggable = new LazyCachedValue<>(new LazyValue() { // from class: io.bidmachine.w2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return BuildInfo.lambda$new$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$new$0(Context context) {
        boolean z10;
        if ((context.getApplicationInfo().flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
