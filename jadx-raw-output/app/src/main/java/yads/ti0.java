package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class ti0 implements DivTypefaceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw0 f83058a;

    public /* synthetic */ ti0(Context context) {
        this(new rw0(context.getApplicationContext()));
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface typefaceA = this.f83058a.f82446b.a(sw0.f82780b);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getBold() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        Typeface typefaceA = this.f83058a.f82446b.a(sw0.f82781c);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getLight() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        Typeface typefaceA = this.f83058a.f82446b.a(sw0.f82782d);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getMedium() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        Typeface typefaceA = this.f83058a.f82446b.a(sw0.f82783e);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getRegular() : typefaceA;
    }

    public ti0(rw0 rw0Var) {
        this.f83058a = rw0Var;
    }
}
