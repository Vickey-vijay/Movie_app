package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0017"}, d2 = {"Lio/bidmachine/analytics/internal/z;", "Lio/bidmachine/analytics/internal/d;", "Landroid/content/Context;", "applicationContext", "Lmj/r;", "d", "(Landroid/content/Context;)V", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "rule", "Ljava/io/File;", "a", "(Lio/bidmachine/analytics/ReaderConfig$Rule;)Ljava/io/File;", "g", "Ljava/io/File;", "appDir", "", "h", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "<init>", "(Ljava/io/File;)V", "i", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C4755z extends AbstractC4734d {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final File appDir;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String name = "aints";

    @Override // io.bidmachine.analytics.internal.AbstractC4734d
    public File a(ReaderConfig.Rule rule) {
        return new File(this.appDir, s0.b(rule.getPath()));
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void d(Context applicationContext) {
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getName() {
        return this.name;
    }

    public C4755z(File file) {
        this.appDir = file;
    }
}
