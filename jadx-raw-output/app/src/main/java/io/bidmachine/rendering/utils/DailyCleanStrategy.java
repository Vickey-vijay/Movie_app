package io.bidmachine.rendering.utils;

import java.io.File;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class DailyCleanStrategy extends CleanStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f60908a;

    public DailyCleanStrategy() {
        this(3);
    }

    @Override // io.bidmachine.rendering.utils.CleanStrategy
    public boolean a(File file) {
        return FileUtils.isFileOlderThanDate(file, this.f60908a);
    }

    public DailyCleanStrategy(int i10) {
        this.f60908a = Utils.getDate(i10);
    }
}
