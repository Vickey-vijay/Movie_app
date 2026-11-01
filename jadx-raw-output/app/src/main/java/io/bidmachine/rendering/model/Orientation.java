package io.bidmachine.rendering.model;

import ck.i;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.util.KeyHolder;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lio/bidmachine/rendering/model/Orientation;", "", "Lio/bidmachine/util/KeyHolder;", "", "getKey", "a", "Ljava/lang/String;", C3426d4.i.W, "", "b", "I", "getActivityOrientation", "()I", "activityOrientation", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", VastTagName.COMPANION, "Portrait", "Landscape", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public enum Orientation implements KeyHolder {
    Portrait(C3426d4.i.D, 7),
    Landscape(C3426d4.i.C, 6);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int activityOrientation;

    Orientation(String str, int i10) {
        this.key = str;
        this.activityOrientation = i10;
    }

    public static final Orientation get(String str) {
        return INSTANCE.get(str);
    }

    public final int getActivityOrientation() {
        return this.activityOrientation;
    }

    @Override // io.bidmachine.util.KeyHolder
    public String getKey() {
        return this.key;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/bidmachine/rendering/model/Orientation$Companion;", "", "()V", "get", "Lio/bidmachine/rendering/model/Orientation;", C3426d4.i.W, "", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Orientation get(String key) {
            return (Orientation) UtilsKt.find(Orientation.values(), key);
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }
}
