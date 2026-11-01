package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Node f71436a;

    public i(@NonNull Node node) {
        this.f71436a = node;
    }

    public final String a() {
        return sg.bigo.ads.core.f.a.e(this.f71436a, "type");
    }

    public final String b() {
        return sg.bigo.ads.core.f.a.b(this.f71436a);
    }

    public final int c() {
        return sg.bigo.ads.core.f.a.d(this.f71436a, "fileSize").intValue();
    }

    public final int d() {
        return sg.bigo.ads.core.f.a.d(this.f71436a, VastAttributes.BITRATE).intValue();
    }

    public final String e() {
        return sg.bigo.ads.core.f.a.e(this.f71436a, "md5");
    }
}
