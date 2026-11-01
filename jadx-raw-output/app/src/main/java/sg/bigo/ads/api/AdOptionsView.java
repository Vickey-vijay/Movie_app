package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class AdOptionsView extends a<sg.bigo.ads.core.adview.b> {
    public AdOptionsView(@NonNull Context context) {
        super(context);
    }

    public AdOptionsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdOptionsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new sg.bigo.ads.core.adview.b(this);
    }

    public final void a(sg.bigo.ads.api.core.b bVar, String str) {
        getViewImpl().a(bVar, str);
    }
}
