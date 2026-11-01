package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;

/* JADX INFO: loaded from: classes7.dex */
public final class vi0 implements DivTypefaceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj.g f83925b;

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface typeface;
        yw0 yw0Var = (yw0) this.f83925b.getValue();
        return (yw0Var == null || (typeface = yw0Var.f85133d) == null) ? Typeface.DEFAULT_BOLD : typeface;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        yw0 yw0Var = (yw0) this.f83925b.getValue();
        if (yw0Var != null) {
            return yw0Var.f85130a;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        yw0 yw0Var = (yw0) this.f83925b.getValue();
        if (yw0Var != null) {
            return yw0Var.f85132c;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        yw0 yw0Var = (yw0) this.f83925b.getValue();
        if (yw0Var != null) {
            return yw0Var.f85131b;
        }
        return null;
    }

    public vi0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f83924a = applicationContext != null ? applicationContext : context;
        this.f83925b = kotlin.b.a(new ui0(this));
    }
}
